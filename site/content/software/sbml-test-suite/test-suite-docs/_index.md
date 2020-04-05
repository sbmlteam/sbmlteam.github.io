+++
#=====================================================================
active = true
title = "SBML Test Suite Documentation"
date = "2020-03-21"
layout = "single"
#=====================================================================
+++

{{< insert-toc >}}

This page provides information on how to install the SBML Test Suite, how to use it, and other information.

## Overview

### The test cases

The SBML Test Suite test cases are divided into 3 sets and distributed separately.  Each tests a different aspect of SBML understanding and compliance.

* *Semantic*: The semantic test suite contains valid SBML models with known, deterministic simulation results.  These models can be used to test the ability of a software system to understand the meaning of different SBML constructs and properly simulate the models in a deterministic fashion.  An example of a deterministic simulator is a system using a numerical differential-algebraic solver that supports discontinuous events.  Each test consists of a directory containing the model (or models, if that model can be translated to other SBML Levels + Version combinations without semantic loss), together with instructions on how to simulate that model, and the expected results.

* *Stochastic*: The stochastic test suite contains valid SBML models with known, stochastic simulation results.  These tests exercise fewer features of SBML, and are instead intended to test the accuracy of systems that employ discrete stochastic simulation algorithms.  Each test consists of a directory containing the model (or models, if that model can be translated to other SBML Levels + Version combination without semantic loss), together with instructions on how to simulate that model, and the expected results.  Because the expected results are stochastic, each test case is designed to be performed multiple times, with summary statistics collected for each, which are then compared to the expected summary statistics using a formula derived from the number of times the test was repeated.

* *Syntactic*: The syntactic test suite consists of valid and invalid SBML models.  Each test is designed to check a particular SBML validation rule.  These rules are defined in the SBML specification documents.  Each case model in this part of the Test Suite is expected to be recognized by a software system as being either valid or invalid &ndash; nothing more.  The validity is indicated in the file name of a model.  (Example: `01002-fail-01-01-sev2-l2v1.txt` should fail.)  Details about the error and the error message produced by libSBML are included with each test case description, as are incidental warnings that libSBML may also produce for a given model/test case.


### The SBML Test Runner

The SBML Test Runner can be used to run an application against the collection of semantic test cases in the Test Suite, and report successes and failures.  If you have downloaded a release of the standalone version of the SBML Test Runner, your distribution will consist of a few files and a program named `SBML Test Runner`.  It comes complete with the test cases already included, and it can automatically check for updates to the test cases.  The image below shows an example run from the SBML Test Runner:

<img src="../example-run.png"/>

