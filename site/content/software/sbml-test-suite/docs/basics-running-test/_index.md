+++
#=====================================================================
active     = true
title      = "Basics principles of running a test"
date       = "2020-05-29"
layout     = "single"
toc        = true
#=====================================================================
+++

Testing a software package using the SBML Test Suite requires making the software package read specially-designed SBML models, perform actions on the model, and compare the results of the actions to _expected_ results.


The files comprising a test case
--------------------------------

Each test case in the [SBML Test Suite](/software/sbml-test-suite) is organized in a folder named with a five digit number (i.e., "<code style="background-color: #ffcc99"><i>NNNNN</i></code>").  The number is used to identify the test, but otherwise has no inherent meaning.  Each folder contains the following files:

| File                     | Meaning |
|--------------------------|---------|
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-sbml-l<i style="background-color: #aaccaa">X</i>v<i style="background-color: yellow">Y</i>.xml</code></nobr>  | These are the SBML files defining the model that constitutes a particular test. All the files define the same model, but in different SBML Level/Version formats, with the specific Level and Version identified by the numbers <i style="background-color: #aaccaa">X</i> and <i style="background-color: yellow">Y</i>.  Note that some tests apply to features that do not exist in all SBML Levels or Versions and therefore not all test cases come in all formats. |
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-settings.txt</code></nobr> | This is a text file listing the general simulation control values that should be used when running the given model.  The format of this file is described elsewhere. |
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-model.html</code></nobr> | A brief, nicely-formatted, human-readable description of the purpose of this specific test. |
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-model.m</code></nobr> | A description of the test model in a format used to generate the HTML file.  (In some models, it contains commands used to generate the SBML  file as well, but this is not available for all test case files.)  The format of this file is described elsewhere. |
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-plot.jpg</code></nobr> | A plot of the expected time-course simulation results in [JPEG](http://en.wikipedia.org/wiki/Jpeg) format. |
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-results.csv</code></nobr> | The results expected from simulating the model.  The file format is simple [comma-separated values](http://en.wikipedia.org/wiki/Comma-separated_values).  Approximately 1/5 of SBML Test Suite cases have results generated from an analytical solution to the model; the rest come from numerical solutions produced and agreed upon by at least two different SBML-compatible tools. |
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-sbml-l<i style="background-color: #aaccaa">X</i>v<i style="background-color: yellow">Y</i>-sedml.xml</code></nobr>  | Files in [SED-ML](http://sed-ml.org/) format for running the test case in software systems that can automate their execution using SED-ML. |
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-antimony.txt</code></nobr> |  (Some models only.) A description of the test model in [Antimony](http://antimony.sourceforge.net/) format used to generate the SBML file. |
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-results.xlsx</code></nobr> | (Some models only.) The results of using an analytical function in Microsoft Excel to produce the results for the model.  This is in turn used to produce the `NNNNN-results.csv` file for those models. |


Running a single test case
--------------------------

First, examine the file <code><i style="background-color: #ffcc99">NNNNN</i>-model.m</code>.  The kind being requested will described by the value of the field named `testType:` in that file.

### If the type of test is `TimeCourse`

1. Examine the file `NNNNN-settings.txt` to determine the simulation start time, duration, tolerances, number of output sampling steps, and variables to be sampled/plotted.  (The format of this file is described on a [separate page](../test-case-details).)
2. Instruct the software you are testing to read the SBML model definition file for this case (i.e., the file `NNNNN-sbml-lXvY.xml`, chosing Level `X` and Version `Y` as appropriate for the software).  _Note:_ if constructs from the SBML Level&nbsp;3 Hierarchical Model Composition (_comp_) package are present, the model may need to be "flattened" first, depending on how the simulation software handles the _comp_ package.
3. Instruct the software to run a simulation of the model (using the settings determined by reading the file `NNNNN-settings.txt` as described above) and save the output to a file whose name contains the case number (e.g., `myresultsNNNNN.csv` or even just `NNNNN.csv`).
4. (If necessary) Convert the output to [comma-separated value format](https://en.wikipedia.org/wiki/Comma-separated_values).
5. Use the SBML Test Suite to compare the output to the expected results, and use that to assess the implications.


### If the type of test is `FluxBalanceSteadyState`

1. Examine the file `NNNNN-settings.txt` to determine the variables to be sampled/plotted.  (The format of this file is described on a separate page.)
2. Instruct the software you are testing to read the SBML model definition file for this case, which in this case will be the file `NNNNN-sbml-l3v1.xml` &mdash; all flux balance tests are SBML Level 3, because the test requires the use of the SBML Level&nbsp;3 Flux Balance Constraints (FBC) package.
3. Instruct the software to run a simulation of the model to steady state, following the restrictions given by the FBC package components in the model, and save the final values of the requested variables to a file whose name contains the case number (e.g., `myresultsNNNNN.csv` or even just `NNNNN.csv`).
4. (If necessary) Convert the output to comma-separated value format.
5. Use the SBML Test Suite to compare the output to the expected results, and use that to assess the implications.


### If the type of test is `StochasticTimeCourse`

1. Examine `NNNNN-settings.txt` to determine the variables to be sampled.  (The format of this file is described on a separate page.)
2. Determine how many times (_n_) to repeat the simulation.  This should be at least 1,000; will probably need to be 10,000+.
3. Instruct the software to run a stochastic simulation of the model (using the settings determined by reading the file `NNNNN-settings.txt` as described above) _n_ times.
4. Collect any requested means and/or standard deviations for all output variables, and save the output.
5. Compare the simulated means and standard deviations to the expected values, using the formulas described in the DSMTS user guide, which includes the means, standard deviations, _n_, and the meanRange and sdRange values from `NNNNN-settings.txt`.
6. Count the number of violations.  0 violations are great, 1-3 violations are probably fine; more may mean that the simulator contains an error, especially if repeated tests reveal the same violations for the same expected values.


### If the type of test is `StatisticalDistribution`

1. Examine `NNNNN-settings.txt` to determine the variables to be sampled.  (The format of this file is described on a separate page.)
2. Determine how many times (_n_) to repeat the simulation.  This should be at least 1,000; will probably need to be 10,000+.
3. Instruct the software to run a simulation of the model (using the settings determined by reading the file `NNNNN-settings.txt` as described above) _n_ times.  (Note that this does not have to be a so-called stochastic simulation, because no reactions are present in these models.  The stochasticity is solely due to assignments from distributions.)
4. Collect any requested means and/or standard deviations for all output variables, and save the output.
5. Compare the simulated means and standard deviations to the expected values, using the formulas described in the DSMTS user guide, which includes the means, standard deviations, _n_, and the meanRange and sdRange values from `NNNNN-settings.txt`.
6. Count the number of violations.  0 violations are great, 1-3 violations are probably fine; more may mean that the simulator contains an error, especially if repeated tests reveal the same violations for the same expected values.


Running multiple test cases
---------------------------

To run more than one test case, the process for a single test case as described above must be repeated for every test case in the suite that your software can handle.  _How_ this is accomplished depends very much on the particular software package being tested and which version of the SBML Test Suite you are using.  The standalone SBML Test Runner provides an automation framework which takes care of looping over all the `NNNNN` folders, and provides methods to include or exclude tests by tag or by package.  It only needs to be given an interface/adaptor program or shell script with which to control the software being tested.

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
