+++
#=====================================================================
active     = true
title      = "Configuring test wrappers"
date       = "2020-10-03"
layout     = "single"
toc        = true
#=====================================================================
+++

To test an SBML-compatible application using the SBML Test Runner, you will probably need to create an _application wrapper_: a small program that acts as an interface between the SBML Test Runner and the application to be tested.  The SBML Test Runner will invoke the wrapper with certain arguments for each test case, and the wrapper's job is to invoke the to-be-tested application in turn.  The wrapper is responsible for making the application read an SBML file for a given test case, simulate the SBML model with certain simulation settings, and write an output file containing the numerical results of the simulation in a comma-separated value (CSV) format.  A wrapper might be as simple as a shell script, or it might be a small program all on its own, depending on the application being tested.  (Some applications may not need a wrapper at all, if they can understand the necessary command line arguments directly and produce output in the format needed by the SBML Test Runner.) The SBML Test Runner does not supply the wrappers &ndash; **you will have to write a wrapper program** yourself or obtain one from the developer(s) of the software you want to test.


## How the wrapper is invoked by the SBML Test Runner

The SBML Test Runner provides you with the ability to specify a complete command line invoking the wrapper.  In the command-line arguments given to the wrapper, the following substitution codes can be used.  Their values will be substituted each time the wrapper is invoked:

* `%d` = the path to the directory containing all test cases
* `%n` = the current test case number (as a 5-digit number)
* `%o` = the directory where the CSV output file should be written
* `%l` = the SBML Level of the test case
* `%v` = the Version of SBML within the SBML Level of the test case

The specific values will be set by the SBML Test Runner itself; they are not under user control.  However, the _order_ in which the arguments are handed to the wrapper (and which ones are even used) is under your control when configuring the wrapper in the SBML Test Runner.

Each test case consists of an SBML file and a settings file. The files are located in the directory named `%d/%n`.  The directory indicated by `%d` will contain a large number of subdirectories named after the test case number (i.e., `00001`, `00002`, `00003`, etc. &ndash; these are the values that `%n` will taken on).  Inside each of these numbered directories, there will be multiple SBML files (for different SBML Level/Version combinations), a settings file (named `%n-settings.txt`), and other files.

For context, here is a screenshot of the wrapper configuration panel in the SBML Test Runner:

<figure>
<img class="screenshot center" src="wrapper-config.png">
</figure>


## Expected wrapper behavior

You will need to create a wrapper such that it performs the following steps:

1. Extracts the relevant simulation run settings from the file `%d/%n/%n-settings.txt`.  These settings include the starting time of the simulation, the duration of the simulation, the variables whose values should appear in the output, the number of output steps to record in the output, and the tolerances to use.

2. Tells the to-be-tested application to (i) read an SBML file named `%d/%n/%n-sbml-lXvY.xml`, where _X_ is the SBML Level and _Y_ is the Version within the Level, (ii) execute a simulation with the settings determined in step (1), and (iii) write the output as a file named `%o/%n.csv`.  The command line arguments to be handed to the application depend on the application itself.

You can define multiple wrappers in the SBML Test Runner, but only one will be executed during any given test run.  (You can choose the wrapper from a pull-down menu in the main window of the SBML Test Runner.)

When SBML Test Runner is doing a test run, it proceeds to go through every test in the test case directory and invoke the wrapper, once for each test case, substituting the values for the place holders `%d`, `%n`, `%o`, `%l`, and `%v`.  Each time the wrapper exits after running a particular test case, the Test Runner will look for a file named `%o/%n.csv` to read the application's output for that test case.  The Test Runner will then compare this output to the expected results for the test case, and indicate whether the output matches the expected results within specific tolerances.


## Additional notes

If your wrapper is written as a shell script, make sure that the script does not return before the application you're testing returns a result. In other words, do _not_ have the shell script start the application as a background process; make sure the script terminates only when the application itself terminates.

The SBML Test Runner can execute tasks in parallel, but it must be informed whether multiple instances of a wrapper or application can be invoked simultaneously.  When configuring a wrapper, pay special attention to the option controlling whether multiple copies of the wrapper can be started simultaneously.  Do _not_ enable the option if the wrapper (or application) writes to the same file (e.g., a single log file), locks a single resource, or does something else that would result in non-deterministic behavior if multiple copies of the wrapper or application are started simultaneously.  


###
