+++
#=====================================================================
active     = true
title      = "SBML Test Suite Documentation"
date       = "2020-05-29"
layout     = "single"
toc        = true
#=====================================================================
+++

This page provides detailed information about the SBML Test Suite.


## General information

Whether you are a software developer, or a software user interested in testing someone else's software, the following general information should help get you oriented.

{{% blurb title="Overview of the SBML Test Suite" icon="sitemap" link="overview" %}}
If you are new to the Test Suite, start with this page.  It provides a general explanation of the various Test Suite components.
{{% /blurb %}}

{{% blurb title="Basic principles of running a test" icon="running" link="running-a-test" %}}
Testing a software package using the SBML Test Suite requires simulating specially-designed SBML models using the package, and then comparing the simulation output to expected results.
{{% /blurb %}}


## Running the SBML Test Suite

Whether you use the standalone SBML Test Runner to run tests, or whether you write your own test-running framework, the following information is crucial to understanding the test cases and testing principles.

{{% blurb title="Format of test case descriptions" icon="file-alt" link="running-a-test" %}}
This page explains in more detail the various files included with each SBML Test Suite test case, and how those files are intended to be used. 
{{% /blurb %}}

{{% blurb title="Evaluation of test outputs" icon="calculator" link="running-a-test" %}}
The information about test run parameters is stored in a file named `NNNNN-settings.txt` in each individual test case directory.  This page describes this file and how the values in it are used to assess whether the output of a software application are within acceptable tolerances for the test.
{{% /blurb %}}

{{% blurb title="Configuring an application test wrapper" icon="dolly-flatbed" link="running-a-test" %}}
To use an application with the SBML Test Runner, you need to write a small script or program &ndash; a _wrapper_ &ndash; to interface between the Test Runner and the application.  This page explains how.
{{% /blurb %}}


## Known issues

We try to inform users of potential interactions and known problems.  Please let us know of any we missed by reporting them using the tracker.

{{% blurb title="Issue tracker" icon="bug" link="https://github.com/sbmlteam/sbml-test-suite/issues" %}}
The bug and issue tracker for the SBML Test Suite lists pending issues and lets you report new ones.
{{% /blurb %}}


## Additional information for developers

The following are resources that may be relevant to developers.

{{% blurb title="SBML Test Suite Database" icon="database" link="running-a-test" %}}
The SBML Test Suite Database publicizes software systems' support of SBML as determined by their performance on the SBML Test Suite.  Software developers can upload their test results to the database, to make them known to the world.
{{% /blurb %}}

{{% blurb title="GitHub repository for the SBML Test Suite" icon="github" link="https://github.com/sbmlteam/sbml-test-suite" %}}
This link takes you to the repository for the SBML Test Suite in GitHub.
{{% /blurb %}}

{{% blurb title="Pivotal Tracker for the SBML Test Suite" image="/img/pivotaltracker-logo.svg" link="pivotal-tracker" %}}
The SBML Team uses [Pivotal Tracker](http://pivotaltracker.com) to plan and coordinate development.  This page provides information about the conventions used by the team.
{{% /blurb %}}





<!-- Leave this hack to make the TOC show up -->
###
