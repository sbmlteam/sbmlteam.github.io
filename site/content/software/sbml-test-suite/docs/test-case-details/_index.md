+++
#=====================================================================
active     = true
title      = "Format of test case descriptions"
date       = "2020-10-02"
layout     = "single"
toc        = true
#=====================================================================
+++

As described in the section on the [basic principles of running a test](/software/sbml-test-suite/docs/basics-running-test/), the directory for each test case contains a number of files.  Below we provide details about the model description file and the test settings file.  Each test case directory will contain both files; they will be named <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-model.m</code></nobr> and <nobr><code><i style="background-color: #ffcc99">NNNNN</i>-settings.txt</code></nobr>, respectively, where <code style="background-color: #ffcc99"><i>NNNNN</i></code> is the test case number (which also matches the name of the directory in which they are located).


## The model description file

The following is an example test case `NNNNN-model.m` file from the SBML Test Suite.

<pre><code class="nohighlight">(*

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

*)</code>
</pre>

In the example above, note how the field-value pairs such as `category`, `testType`, and others are at the very beginning of the file; these are followed by a description of the test.  The meaning of the fields are explained in the next subsection.  The format of the `NNNNN-model.m` file is purposefully simple enough that the field values can be extracted using basic text processing tools (even command-line tools such as `grep`).


### The fields in the model description file

Here's an explanation of the lines that are at the beginning of the `NNNNN-model.m` file:

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


### Historical note about the syntax of `NNNNN-model.m` files

Note that the test case description in the `.m` file is inside the characters `(*` and `*)`, and some `.m` files have additional content after the `*)` sequence. Technically, the `(*` and `*)` are Mathematica comment delimiters, and any code after the closing `*)` is in Mathematica syntax.  This is because, originally, the test cases in the SBML Test Suite were generated using [MathSBML](https://academic.oup.com/bioinformatics/article/20/16/2829/236238). The test cases have long stopped being generated using MathSBML, but we have still continued to use the same format for the `.m` files to maintain backward compatibility.

The structured description that follows the field-value pairs inside the `(*` and `*)` is in [Wiky](https://goessner.net/articles/wiky/) format. It describes the model in human-readable terms.  When producing releases of the SBML Test Suite, the descriptions are converted from Wiky format to HTML format to produce the `NNNNN-model.html` files that are also included in each test case subdirectory.


## The test settings file

The information about run parameters is stored in a file named `NNNNN-settings.txt`.  The format of the file is very simple.  Here's an example:

<pre><code class="nohighlight">start: 0
duration: 5.0
steps: 50
variables: S1, S2
absolute: 1e-12
relative: 0.0001
amount: S1, S2
concentration:
</code></pre>

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

A noteworthy point about the `NNNNN-settings.txt` files is that each is generated automatically.  The SBML Test Suite project directory contains a script for use by test case authors to read the expected results data file and summarize the actual test run.  This approach reduces the chances of human errors introducing a mismatch between the claimed simulation settings and the actual settings used to generate the reference data.


### Tolerances and errors for `TimeCourse` tests

The absolute and relative tolerances are used in the following way. Let

<div style="width: 50%; margin-left: auto; margin-right: auto">

T<sub>a</sub> = the absolute tolerance for this test case

T<sub>r</sub> = the relative tolerance for this test case

C<sub>ij</sub> = the correct value for row _i_, column _j_, of the result data

U<sub>ij</sub> = the value actually obtained by the user
</div>

Then a data point U<sub>ij</sub> is considered to be <i>within tolerances</i> if and only if the following holds:

<div style="width: 50%; margin-left: auto; margin-right: auto"> 
<font size="+2"> | </font>C<sub>ij</sub> &minus; U<sub>ij</sub><font size="+2"> | </font> &nbsp;&le;&nbsp; <font size="+2">(</font> T<sub>a</sub> + T<sub>r</sub> &times;  <font size="+2">|</font> C<sub>ij</sub> <font size="+2">|</font> <font size="+2">)</font>
</div>


### Interpreting the settings file for `FluxBalanceSteadyState` tests

For tests with the `testType` tag value `FluxBalanceSteadyState`, the settings file is the same format as for time course tests, but more lines are left blank, as they have no meaning. Here's an example:

<pre><code class="nohighlight">start:
duration:
steps:
variables: J0, J1, OBJF
absolute: 0.001
relative: 0.001
amount:
concentration:</code></pre>

The `variables` line still indicates which variable values are to be output after steady state is reached, and the `relative` and `absolute` lines indicate the relative and absolute error allowed for each data point.

The other lines are irrelevant to a flux balance steady state simulation: because the system is being analyzed at steady state, there is no `start`, `duration`, or `steps` to be taken. And because only fluxes and objective functions are being analyzed, species values cannot be requested as output, and therefore, there is no ambiguity with regards to `concentration` versus `amount`.
