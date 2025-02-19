+++
#=====================================================================
active     = true
title      = "Basics principles of running a test"
date       = "2020-05-29"
layout     = "single"
toc        = true
#=====================================================================
+++

Testing a software package using the SBML Test Suite requires making the software package read specially-designed SBML models, perform actions on the model, and compare the results of the actions to _expected_ results.  The following sections explain the basic principles.


## Syntactic test cases

As explained in the page describing the [test case organization and formats](/software/sbml-test-suite/docs/test-case-details), the syntactic test cases are organized into subfolders whose names have one of two possible forms: either just a five digit number (i.e., "<code><i style="background-color: #ffcc99">NNNNN</i></code>"), for tests of SBML Core validation rules, or a label followed by a number (i.e., "<nobr><code>package-<i style="background-color: #ffcc99">NNNNN</i></code></nobr>"), for tests of SBML Level&nbsp;3 package validation rules.  Each number <code><i style="background-color: #ffcc99">NNNNN</i></code> corresponds to the number of a validation rule given in the relevant specification document.  Each of the subfolders contains tests designed to check a particular SBML syntactic validation rule &ndash; there is no simulation involved in the syntactic tests.  Each syntactic test case model is expected to be recognized by a software system as being _either_ valid or invalid.  Passing or failing a given test case depends on whether the software system correctly reports validity.

The syntactic test suite is conceptually simple, so developers and users who wish to run an application through the syntactic test cases can do so using the following general approach:

<ol>
<li>For every test case folder <code><i style="background-color: #ffcc99">NNNNN</i></code> in the collection of syntactic test cases:
  <ol>
  <li>For every SBML <code>.xml</code> file having an SBML Level and Version that is understood by the software:
    <ol>
    <li>Assess whether the software reports the file as valid or invalid  
    <li>Compare the result to the file name.  If file has <code>fail</code> in the name and the software considers it invalid, or if the file has <code>pass</code> in the name and the software considers it valid, then the software passed the teste; otherwise, it failed the test.
    </ol>
  </ol>
<li>Tally up the failures and successes, and use that to assess the implications.
</ol>

The SBML Test Runner currently does not provide facilities to run the syntactic tests on a software tool.  In part, this is because many software applications embed one of the main SBML libraries ([libSBML](/software/libsbml) and [JSBML](/software/jsbml)) to handle their SBML input and output; thus, testing those applications amounts to retesting the underlying libraries.


## Semantic and stochastic test cases

In common with the syntactic test cases, and as explained in the page describing the [test case organization and formats](/software/sbml-test-suite/docs/test-case-details), the semantic and stochastic test cases are each organized into subfolders whose names have one of two possible forms: either just a five digit number (i.e., "<code><i style="background-color: #ccffcc">NNNNN</i></code>"), for tests of SBML Core constructs, or a label followed by a number (i.e., "<nobr><code>package-<i style="background-color: #ccffcc">NNNNN</i></code></nobr>"), for tests of SBML Level&nbsp;3 package constructs.  However, unlike the syntactic tests, the numbering is consecutive and only distinguishes individual tests &mdash; **the numbers are not related to SBML validation rule numbers**.  Each test requires simulating the model: once for the semantic test cases, and multiple times for the stochastic test cases.


### Running a single test case

First, examine the file <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-model.m</code></nobr>.  (The file format is described on [another page](/software/sbml-test-suite/docs/test-case-details/#the-model-description-file).)  The kind of test being requested will be described by the value of the field named `testType:` in that file.

#### If the type of test is `TimeCourse`

1. Examine the file [<code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code>](/software/sbml-test-suite/docs/test-case-details/#the-test-settings-file) to determine the simulation start time, duration, tolerances, number of output sampling steps, and variables to be sampled/plotted.
2. Instruct the software you are testing to read the SBML model definition file for this case (i.e., the file <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-sbml-l<i style="background-color: #aaccaa">X</i>v<i style="background-color: yellow">Y</i>.xml</code></nobr>, choosing Level <code><i style="background-color: #aaccaa">X</i></code> and Version <code><i style="background-color: yellow">Y</i></code> as appropriate for the software).  _Note:_ if constructs from the SBML Level&nbsp;3 Hierarchical Model Composition (_comp_) package are present, the model may need to be "flattened" first, depending on how the simulation software handles the _comp_ package.
3. Instruct the software to run a simulation of the model (using the settings determined by reading the file <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code></nobr> as described above) and save the output to a file whose name contains the case number (e.g., `myresultsNNNNN.csv` or even just `NNNNN.csv`).
4. (If necessary) Convert the output to [comma-separated value format](https://en.wikipedia.org/wiki/Comma-separated_values).
5. Use the SBML Test Suite to compare the output to the expected results, and use that to assess the implications.


#### If the type of test is `FluxBalanceSteadyState`

1. Examine the file [<code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code>](/software/sbml-test-suite/docs/test-case-details/#the-test-settings-file) to determine the variables to be sampled/plotted.
2. Instruct the software you are testing to read the SBML model definition file for this case, which in this case will be the file <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-sbml-l3v1.xml</code></nobr>  &mdash; all flux balance tests are SBML Level 3, because the test requires the use of the SBML Level&nbsp;3 Flux Balance Constraints (FBC) package.
3. Instruct the software to run a simulation of the model to steady state, following the restrictions given by the FBC package components in the model, and save the final values of the requested variables to a file whose name contains the case number (e.g., `myresultsNNNNN.csv` or even just `NNNNN.csv`).
4. (If necessary) Convert the output to comma-separated value format.
5. Use the SBML Test Suite to compare the output to the expected results, and use that to assess the implications.


#### If the type of test is `StochasticTimeCourse`

1. Examine the file [<code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code>](/software/sbml-test-suite/docs/test-case-details/#the-test-settings-file) to determine the variables to be sampled.
2. Determine how many times (_n_) to repeat the simulation.  This should be at least 1,000; will probably need to be 10,000+.
3. Instruct the software to run a stochastic simulation of the model (using the settings determined by reading the file <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code></nobr> as described above) _n_ times.
4. Collect any requested means and/or standard deviations for all output variables, and save the output.
5. Compare the simulated means and standard deviations to the expected values, using the formulas described in the DSMTS user guide, which includes the means, standard deviations, _n_, and the meanRange and sdRange values from <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code></nobr>.
6. Count the number of violations.  0 violations are great, 1-3 violations are probably fine; more may mean that the simulator contains an error, especially if repeated tests reveal the same violations for the same expected values.


#### If the type of test is `StatisticalDistribution`

1. Examine the file  [<code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code>](/software/sbml-test-suite/docs/test-case-details/#the-test-settings-file) to determine the variables to be sampled.
2. Determine how many times (_n_) to repeat the simulation.  This should be at least 1,000; will probably need to be 10,000+.
3. Instruct the software to run a simulation of the model (using the settings determined by reading the file <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code></nobr> as described above) _n_ times.  (Note that this does not have to be a so-called stochastic simulation, because no reactions are present in these models.  The stochasticity is solely due to assignments from distributions.)
4. Collect any requested means and/or standard deviations for all output variables, and save the output.
5. Compare the simulated means and standard deviations to the expected values, using the formulas described in the DSMTS user guide, which includes the means, standard deviations, _n_, and the meanRange and sdRange values from <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code></nobr>.
6. Count the number of violations.  0 violations are great, 1-3 violations are probably fine; more may mean that the simulator contains an error, especially if repeated tests reveal the same violations for the same expected values.


### Running multiple test cases

To run more than one test case, the process for a single test case as described above must be repeated for every test case in the suite that your software can handle.  _How_ this is accomplished depends very much on the particular software package being tested and which version of the SBML Test Suite you are using.  The standalone SBML Test Runner provides an automation framework which takes care of looping over all the <code><i style="background-color: #ccffcc">NNNNN</i></code> folders, and provides methods to include or exclude tests by tag or by package.  It only needs to be given an interface/adaptor program or shell script with which to control the software being tested.

Many software packages may not be designed to pass all the tests in the suite:  some particular test tag or component may not be supported, or the software might not even read some package information at all.  In those cases, the unsupported tests can be excluded by tag or by package, and marked as _unsupported_ instead of _failed_.

<!--
== Gathering the results of many tests for uploading to the Online SBML Test Suite ==

The format of the results accepted by the online system is very simple.  As mentioned above, the result of running each test model must be stored in a comma-separated value file, such that the file name contains the case number (e.g., <code>myresultsNNNNN.csv</code>).  Simply create a zip archive containing all of the output files:

: <code>myresults00001.csv</code>
: <code>myresults00002.csv</code>
: <code>myresults00003.csv</code>
: <code>myresults00004.csv</code>
: &hellip;
: <code>myresultsNNNNN.csv</code>

Gaps are allowed in the files put in the archive (for example, if you chose not to run some tests, or the software cannot simulate some test models). The final number (<code>NNNNN</code>) depends on the number of tests provided in the current release of the SBML Test Suite, as well as the tests you selected to run, and the capabilities of the software you are testing. 

<center style="margin: 1.5em">
{{#icon:Icon-red-right-arrow.jpg}} [http://sbml.org/test-suite/web/uploadresults.jsp After creating the archive, go to Step 3 (uploading the results).]
</center>
-->
