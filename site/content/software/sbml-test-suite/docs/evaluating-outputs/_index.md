+++
#=====================================================================
active     = true
title      = "Evaluation of test outputs"
date       = "2020-05-29"
layout     = "single"
toc        = true
#=====================================================================
+++

The evaluation of semantic and stochastic test results is done by comparing the numerical output produced by a simulation system to expected outputs.

## Format of results data

The expected (or reference) results stored in the file <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-results.csv</code></nobr> for each test case <code><i style="background-color: #ccffcc">NNNNN</i></code>
 are simply organized as a table of values.  The values will be slightly different depending on whether a `TimeCourse` or `FluxBalanceSteadyState` test was requested.


### Results data format for `TimeCourse` tests

The expected (or reference) results stored in the file <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-results.csv</code></nobr> are  organized as a table of values.  The first column is simulation time, and the remaining columns are variables in the model (often species, but not necessarily&mdash;they could be compartments, parameters, or reaction rates too) in the same order as they are listed in the <code>variables</code>: line in the <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code></nobr> file.  An optional header line is permitted at the top of the file. Here is a short example: 

<pre>
time,S1,S2
0,1.5e-15,0
0.1,1.357256127053693e-15,1.427438729463058e-16
0.2,1.228096128602129e-15,2.719038713978695e-16
0.3,1.111227330205311e-15,3.887726697946884e-16
0.4,1.005480064513687e-15,4.945199354863119e-16
0.5,1.005480064513687e-15,4.945199354863119e-16
</pre>

The first line of the file lists the columns, and the rest are numerical data.  The total number of lines of data in the file is _X + 1_, where _X_ is the value of the `steps`: line in the <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code></nobr> file.

It is possible for some values to be _Not a Number_ (indicating the result is not mathematically defined, such as attempting to divide by zero or perform an operation involving infinity).  It is also possible for values to be +&infin; or -&infin;.  There does not appear to be an agreed-upon standard way of expressing these values in comma-separated files, so the SBML Test Suite uses the following convention:

| Value    | Symbol used |
|----------|-------------|
| NaN      | `NaN`       |
| +&infin; | `INF`       |
| -&infin; | `-INF`      | 

These symbols are treated in a case-insensitive manner by the SBML Test Suite.


### Results data format for `FluxBalanceSteadyState` tests

As for the 'TimeCourse' results, `FluxBalanceSteadyState` test results are stored in the file <nobr><code><i style="background-color: #ccffcc">NNNNN</i>-results.csv</code></nobr>, and organized as a table of values.  The first, header line indicates the expected variables, and the second line indicates the value of those variables at steady state:

<pre>
R01,R26,R10,R07,OBJF
1.0,1.0,0.5,0.5,1.0
</pre>

As for the `TimeCourse` results, it is also possible for `FluxBalanceSteadyState` results to contain _Not a Number_, +&infin; and -&infin;, reported as described in the table above.


## Interpreting tolerances and errors

The [<code><i style="background-color: #ccffcc">NNNNN</i>-settings.txt</code>](/software/sbml-test-suite/docs/test-case-details/#the-test-settings-file) file defines the tolerances allowed on the results of each test case.  There are two values: an absolute tolerance, and a relative tolerance.  The absolute and relative tolerances are used in the following way.

Let

<div style="width: 50%; margin-left: auto; margin-right: auto">

T<sub>a</sub> = the absolute tolerance for this test case

T<sub>r</sub> = the relative tolerance for this test case

C<sub>ij</sub> = the correct value for row _i_, column _j_, of the result data

U<sub>ij</sub> = the value actually obtained by the user
</div>

then a data point U<sub>ij</sub> is considered to be <i>within tolerances</i> if and only if the following holds:

<div style="width: 50%; margin-left: auto; margin-right: auto; text-align: center"> 
<font size="+2"> | </font>C<sub>ij</sub> &minus; U<sub>ij</sub><font size="+2"> | </font> &nbsp;&le;&nbsp; <font size="+2">(</font> T<sub>a</sub> + T<sub>r</sub> &times;  <font size="+2">|</font> C<sub>ij</sub> <font size="+2">|</font> <font size="+2">)</font>
</div>

