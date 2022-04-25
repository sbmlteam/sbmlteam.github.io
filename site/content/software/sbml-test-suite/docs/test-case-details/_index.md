+++
#=====================================================================
active     = true
title      = "Test case organization and formats"
date       = "2020-10-02"
layout     = "single"
toc        = true
#=====================================================================
+++

The test cases in the SBML Test Suite are organized into three top-level folders named `syntactic`, `semantic`, and `stochastic`.  Within each of them, there are subfolders whose names have one of two possible forms: either just a five digit number (i.e., "<code><i>NNNNN</i></code>"), for tests related to SBML Core, or a label followed by a number (i.e., "<nobr><code>package-<i>NNNNN</i></code></nobr>"), for tests related to SBML Level&nbsp;3 packages.  Each of the subfolders contains the files that comprise a given test case.  The contents differ depending on the type of test involved.


## Files in syntactic test cases

Syntactic test cases are conceptually simple: a test consists of an XML file whose content either is, or is not, valid according to the validation rules defined in the SBML specifications.  A software tool should reject invalid SBML files and accept valid files.  A given test case may contain multiple variations to test different ways that a failure may manifest itself, as well as different SBML Level/Version combinations.

| File                     | Meaning |
|--------------------------|---------|
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-fail-<i style="background-color: #ccff99">FF</i>-<i style="background-color: #bbccff">DD</i>-sev<i style="background-color: #ffbbcc">E</i>-l<i style="background-color: #aaccaa">X</i>v<i style="background-color: yellow">Y</i>.xml</code></nobr> | A file whose content is expected to **fail** validation according to SBML validation rule <code><i style="background-color: #ffcc99">NNNNN</i></code>.  Sometimes, a test may cause additional failures; the total number of failures is indicated by <code><i style="background-color: #ccff99">FF</i></code>. Different variations on the test are distinguished by two-digit numbers <code><i style="background-color: #bbccff">DD</i></code>.  The severity of the failure is indicated by <code><i style="background-color: #ffbbcc">E</i></code>, where `sev1` indicates a warning and `sev2` indicates an error. The applicable SBML Level and Version for a given XML file are identified by the numbers <code><i style="background-color: #aaccaa">X</i></code> and <code><i style="background-color: yellow">Y</i></code>. |
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-fail-<i style="background-color: #ccff99">FF</i>-<i style="background-color: #bbccff">DD</i>-sev<i style="background-color: #ffbbcc">E</i>-l<i style="background-color: #aaccaa">X</i>v<i style="background-color: yellow">Y</i>.txt</code></nobr> | A structured description of the test case, including the warning or error messages produced by [libSBML](/software/libsbml/). |
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-pass-00-<i style="background-color: #bbccff">DD</i>-l<i style="background-color: #aaccaa">X</i>v<i style="background-color: yellow">Y</i>.xml</code></nobr> | A file whose content is expected to **pass** validation according to SBML validation rule <code><i style="background-color: #ffcc99">NNNNN</i></code>.  Different variations on the test are distinguished by two-digit numbers <code><i style="background-color: #bbccff">DD</i></code>. The applicable SBML Level and Version for a given XML file are identified by the numbers <code><i style="background-color: #aaccaa">X</i></code> and <code><i style="background-color: yellow">Y</i></code>. |
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-pass-00-<i style="background-color: #bbccff">DD</i>-sev1-l<i style="background-color: #aaccaa">X</i>v<i style="background-color: yellow">Y</i>.xml</code></nobr> | Like above, except that the test should produce a warning.
| <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-pass-00-<i style="background-color: #bbccff">DD</i>-sev1-l<i style="background-color: #aaccaa">X</i>v<i style="background-color: yellow">Y</i>.txt</code></nobr> | A structured description of the test case, including the warning or error messages produced by [libSBML](/software/libsbml/). |

Note that the XML files may not contain complete SBML models, depending on the nature of the test.


## Files in semantic and stochastic test cases

The semantic and stochastic tests both involve models that are meant to be simulated, with the numerical results of the simulations compared against expected values.  There are two main folders, `semantic` and `stochastic`, and within them, there are subfolders whose names are either a five digit number (i.e., "<code><i style="background-color: #ccffcc">NNNNN</i></code>"), for tests of SBML Core constructs, or a label followed by a number (i.e., "<nobr><code>package-<i style="background-color: #ccffcc">NNNNN</i></code></nobr>"), for tests of SBML Level&nbsp;3 package constructs.  However, unlike the syntactic tests, the numbering is consecutive and only distinguishes individual tests &mdash; **the numbers are not related to SBML validation rule numbers**.

Each subfolder contains at least the following files.


| File                     | Meaning |
|--------------------------|---------|
| <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-sbml-l<i style="background-color: #aaccaa">X</i>v<i style="background-color: yellow">Y</i>.xml</code></nobr>  | These are the SBML files defining the model that constitutes a particular test. All the files define the same model, but in different SBML Level/Version formats, with the specific Level and Version identified by the numbers <code><i style="background-color: #aaccaa">X</i></code> and <code><i style="background-color: yellow">Y</i></code>.  Note that some tests apply to features that do not exist in all SBML Levels or Versions and therefore not all test cases come in all formats. |
| <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-model.html</code></nobr> | A brief, nicely-formatted, human-readable description of the purpose of this specific test. |
| <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-model.m</code></nobr> | A description of the test model.  It includes text used to create the HTML file.  (For some test cases, it also contains commands used to generate the SBML file.)  The format of this file is explained in more detail below. |
| <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code></nobr> | This is a text file listing the general simulation control values that should be used when running the given model.  The format of this file is explained in more detail below. |
| <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-plot.jpg</code></nobr> | A plot of the expected time-course simulation results in [JPEG](http://en.wikipedia.org/wiki/Jpeg) format. |
| <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-results.csv</code></nobr> | The numerical results expected from simulating the model.  The file format is simple [comma-separated values](http://en.wikipedia.org/wiki/Comma-separated_values).  Approximately 1/5 of SBML Test Suite cases have results generated from an analytical solution to the model; the rest come from numerical solutions produced and agreed upon by at least two different SBML-compatible tools. |
| <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-sbml-l<i style="background-color: #aaccaa">X</i>v<i style="background-color: yellow">Y</i>-sedml.xml</code></nobr>  | Files in [SED-ML](http://sed-ml.org/) format for running the test case in software systems that can automate their execution using SED-ML. |
| <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-antimony.txt</code></nobr> |  (Some models only.) A description of the test model in [Antimony](http://antimony.sourceforge.net/) format used to generate the SBML file. |
| <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-results.xlsx</code></nobr> | (Some models only.) The results of using an analytical function in Microsoft Excel to produce the results for the model.  This is in turn used to produce the `NNNNN-results.csv` file for those models. |


### The model description file

The following is an example test case <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-model.m</code></nobr> file from the SBML Test Suite.

<pre>
(*

category:        Test
synopsis:        Basic single forward reaction with two species in one compartment
componentTags:   Compartment, Species, Reaction, Parameter 
testTags:        InitialAmount
testType:        TimeCourse
levels:          1.2, 2.1, 2.2, 2.3, 2.4, 2.5, 3.1
generatedBy:     Analytic
packagesPresent:

The model contains one compartment called "compartment". There are two species called S1 and S2
and one parameter called k1. The model contains one reaction:

[{width: 30em, margin: 1em auto}|  *Reaction*  |  *Rate*  |
| S1 -> S2 | $k1 * S1 * compartment$ |]

The model does not contain any rules.

The initial conditions are as follows:

[{width: 30em, margin: 1em auto}|    |*Value*          |*Units*        |
|Initial amount of S1                |$1.5 \x 10^-15$  |mole           |
|Initial amount of S2                |$0$              |mole           |
|Value of parameter k1               |$1$              |second^-1^     |
|Volume of compartment "compartment" |$1$              |litre          |]

The species' initial quantities are given in terms of substance units to make it easier to use
the model in a discrete stochastic simulator, but (as per usual SBML principles) their 
symbols represent their values in concentration units where they appear in expressions.

Note: The test data for this model was generated from an analytical solution of the 
system of equations.

*)
</pre>

In the example above, note how the field-value pairs such as `category`, `testType`, and others are at the very beginning of the file; these are followed by a description of the test.  The format of the <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-model.m</code></nobr> file is purposefully simple enough that the field values can be extracted using basic text processing tools (even command-line tools such as `grep`).  Here's an explanation of the lines that are at the beginning of the <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-model.m</code></nobr> file:

| Field       | Explanation             |
|-------------|-------------------------|
| `category` | Many of the models used in the test suite are not biologically meaningful.  This field determines whether this case refers to a test model or a more realistic model. In the current (mid-2011) version of the test suite, the only value present for this tag is `Test`. |
| `synopsis` | Brief textual description of the model, in English.  The value of this field may span over more than one line. |
| `componentTags` | These tags describe the SBML components that are present in this model.  The tags are described on a separate page. |
| `testTags` | These tags describe the aspects of SBML interpretation that are being tested in this model. The tags are described on a separate page. |
| `testType` | Since it is possible to simulate data from models in different ways, this tag indicates the type of test to perform on the given model.  Currently (2013), there are two tags:  `TimeCourse`, for the majority of tests in the suite, and `FluxBalanceSteadyState`, for tests that involve the Flux Balance Analysis (FBC) package.|
| `levels` | Not all SBML components and attributes exist in every level and version of SBML.  This tag indicates the relevant SBML Levels+Version combinations permissible for this particular case.   The format of the tag is two integers separated by a dot; e.g., `2.4` signifies Level&nbsp;2 Version&nbsp;4. |
| `generatedBy` | This tag indicates whether the results data for this case has been generated analytically (tag value `Analytic`) or numerically (tag value `Numeric`). |
| `packagesPresent` | This tag indicates whether any SBML Level 3 packages are present in the model.  Possible tag values are (at present) `comp`, if elements from the Hierarchical Model Composition package are present, and `fbc`, if elements from the Flux Balance Constraints package are present. |

_Historical note_: in the early days ofthe SBML Test Suite, the `.m` files were Mathematica files used as input to [MathSBML](https://academic.oup.com/bioinformatics/article/20/16/2829/236238), a tool developed by the SBML Team.  The `(*` and `*)` characters are comment delimiters in Mathematica syntax; the field-value pairs and text description were put inside comments, and the rest of the file was MathSBML code to produce the test models and simulation results. The test cases have long stopped being generated using MathSBML, but we continued to use the same format for the `.m` files to maintain backward compatibility.  The structured description inside the `(*` and `*)` is in a simple wiki-style format called [Wiky](https://goessner.net/articles/wiky/). It describes the model in human-readable terms.  When producing releases of the SBML Test Suite, the descriptions are converted from Wiky format to HTML format to produce the<nobr><code><i style="background-color: #ccffcc">NNNNN</i>-model.html</code></nobr> files that are also included in each test case subfolder.


### The test settings file

The information about run parameters is stored in a file named <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code></nobr>.  The format of the file is very simple.  Here's an example:

<pre>
start: 0
duration: 5.0
steps: 50
variables: S1, S2
absolute: 1e-12
relative: 0.0001
amount: S1, S2
concentration:
</pre>

Depending on the type of test requested (`TimeCourse` or `FluxBalanceSteadyState`) this data will have slightly different meanings, as described in the subsections below.

| Field       | Explanation             |
|-------------|-------------------------|
| `start`       | The start time of the simulation time-series data in the output (CSV) file.  Often this is `0`, but not necessarily. |
| `duration`    | The duration of the simulation run, in the model's units of time. |
| `steps`       | The number of steps at which the output is sampled.  The samples are evenly spaced.  When a simulation system calculates the data points to record, it will typically divide the duration by the number of time steps.  Thus, for _X_ steps, the data file will have _X + 1_ data rows. |
| `variables`   | The variables (in addition to _time_) whose values are tabulated in the CSV file.  These are SBML model id's separated by commas.  Order is significant, as results files without headers will be assumed to be output in the order present on this line.<br/>  _Note #1_: if a symbol in this list refers to a species in the model, then that symbol will _also_ be listed in either the `amount` or `concentration` lists below.  <br/> _Note #2_: If a listed variable has two underscores in it (`__`), that variable is actually present only in a submodel of the main model, from the [Hierarchical Model Composition](/documents/specifications/level-3/version-1/comp) package, in the format `submodelID__variableID`.  If the model is flattened, the variable will appear automatically. |
| `absolute`    | A float-point number representing the _absolute_ difference permitted for this test case when evaluating a software tool. The formula used to calculate data point differences is discussed below. |
| `relative`    | A float-point number representing the _relative_ difference permitted for this test case when evaluating a software tool.  The value of 0.0001 was the tolerance agreed upon by the SBML community during discussions at SBML Hackathons in 2008. The formula used to calculate data point differences is discussed below. |
| `amount`      | A list of the variable whose output in the results file is in amount (not concentration) units.  This list of variables must be a subset of the names listed in `variables`. |
| `concentration` | A list of the variable whose output in the results file is in concentration (not amount) units.  This list of variables must be a subset of the names listed in `variables`. |

A noteworthy point about the <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code></nobr> files is that each is generated automatically.  The SBML Test Suite project folder contains a script for use by test case authors to read the expected results data file and summarize the actual test run.  This approach reduces the chances of human errors introducing a mismatch between the claimed simulation settings and the actual settings used to generate the reference data.


#### Interpreting the settings file for `FluxBalanceSteadyState` tests

For tests with the `testType` tag value `FluxBalanceSteadyState`, the settings file is the same format as for time course tests, but more lines are left blank, as they have no meaning. Here's an example:

<pre>
start:
duration:
steps:
variables: J0, J1, OBJF
absolute: 0.001
relative: 0.001
amount:
concentration:
</pre>

The `variables` line still indicates which variable values are to be output after steady state is reached, and the `relative` and `absolute` lines indicate the relative and absolute error allowed for each data point.

The other lines are irrelevant to a flux balance steady state simulation: because the system is being analyzed at steady state, there is no `start`, `duration`, or `steps` to be taken. And because only fluxes and objective functions are being analyzed, species values cannot be requested as output, and therefore, there is no ambiguity with regards to `concentration` versus `amount`.
