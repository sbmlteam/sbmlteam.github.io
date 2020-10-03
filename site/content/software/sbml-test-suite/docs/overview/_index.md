+++
#=====================================================================
active = true
title  = "General summary and overview of the SBML Test Suite"
date   = "2020-05-29"
layout = "single"
toc    = false
icon   = "/img/sbml-test-suite-logo.svg"
#=====================================================================
+++

The SBML Test Suite is a conformance testing system for [SBML](http://sbml.org). It can be used by developers to test their software's implementation of SBML support; it can also be used by modelers to assess the correctness and completeness of SBML support in a given software system.

## The test cases

The SBML Test Suite test cases are divided into 3 sets and distributed separately.  Each tests a different aspect of SBML understanding and compliance.

* **_Syntactic_**: The syntactic test suite consists of valid and invalid SBML models.  Each test is designed to check a particular SBML syntactic validation rule; there are no simulations involved in these tests.  The validation rules are defined in the SBML specification documents.  Each model in this part of the Test Suite is expected to be recognized by a software system as being _either_ valid or invalid.  Details about the error and the error message produced by [libSBML](/software/libsbml) are included with each test case description, as are incidental warnings that libSBML may also produce for a given model/test case.

* **_Semantic_**: The semantic test suite contains valid SBML models with known, deterministic simulation results.  Each test requires simulating the model once.  Where possible and practical, the expected numerical values have been produced using analytical solution methods.  These test cases can be used to test the ability of a software system to understand the meaning of different SBML constructs and properly simulate the models in a deterministic fashion.  An example of a deterministic simulator is one that uses a differential-algebraic equation solver with the ability to handle discontinuous events.  Each test consists of a model together with instructions on how to simulate that model, and the expected results.

* **_Stochastic_**: The stochastic test suite contains valid SBML models with known simulation results.  Each test requires simulating the model multiple times.  Some of the models are intended to test the accuracy of systems that employ discrete stochastic simulation algorithms; others test the implementation of the SBML Level&nbsp;3 [Distributions Package](/documents/specifications/level-3/version-1/distrib/).  Each test consists of a directory containing the model together with instructions on how to simulate that model, and the expected results.  Because the expected results are stochastic, each test case is designed to be performed multiple times, with summary statistics collected for each, which are then compared to the expected summary statistics using a formula derived from the number of times the test was repeated.

Test models in the semantic and stochastic test sets are provided in multiple SBML Level + Version combinations.  This allows the tests to be used by software tools that can only handle certain SBML Levels/Versions; it also allows the assessment of software tools' handling of different Levels and Versions.


## The SBML Test Runner

The SBML Test Runner can be used to run an application against the collection of semantic test cases in the Test Suite, and report successes and failures.  If you have downloaded a precompiled release of the SBML Test Runner, it will come complete with the test cases already included, and it can automatically check for updates to the test cases.  The image below shows an example run from the SBML Test Runner:

<figure>
    <img class="center screenshot" src="../../example-run.png"/>
</figure>

The SBML Test Runner currently only supports the semantic tests of the test suite; it does not yet support running applications through the stochastic or syntactic tests.

Note that the SBML Test Suite test cases can be used without the Test Runner &ndash; the runner is just a convenient automation framework for running multiple tests.  Software developers or interested users can develop their own methods and frameworks.


## The SBML Test Suite Database

The [SBML Test Suite Database](/facilities/database) publicizes software systems' support of SBML as determined by their performance on the SBML Test Suite. As a user of SBML and SBML software, you can use this SBML Test Suite Database to find the test results for different software systems. If you are a developer of SBML Software you can also submit results to this database and thereby make them known to the world.



<!-- Leave this hack to make the TOC show up -->
###
