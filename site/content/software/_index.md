--- # -*- mode: markdown -*-
#=====================================================================
active: true
title: "SBML software and models"
date: 2020-03-12
layout: "single"
#=====================================================================
---

The SBML Team produces software libraries and some specific software tools for working with SBML. (Many more third-party packages also support SBML &ndash; visit the [Showcase](/showcase) to find out more about them!)

## Main programming libraries and tools

libsbml

jsbml

deviser


## Test suite

sbml test suite

test cases


## Format conversion

[libSBML](/software/libsbml) and [JSBML](/software/jsbml) include some format conversion capabilities, particularly between SBML Levels/Versions.  The SBML Project has also developed software for converting other formats to/from SBML.

{{% blurb title="MOCCASIN" image="/img/moccasin.svg" link="moccasin" %}}
Written in [Python](https://www.python.org) and made freely available under [LGPL](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html) terms, MOCCASIN can read certain forms of <nobr>ODE-based</nobr> models written in [MATLAB](https://www.mathworks.com/products/matlab.html) and translate them into SBML format. It does not use or need [MATLAB](https://www.mathworks.com/products/matlab.html) itself.  It offers both a GUI and a command-line interface.
{{% /blurb %}}

{{% blurb title="SBMLToolbox" image="" link="sbmltoolbox" %}}
SBMLToolbox is an open-source tool that provides a set of basic functions allowing SBML models to be used in both [MATLAB](https://www.mathworks.com/products/matlab.html) and [Octave](https://www.gnu.org/software/octave/).  It provides functions for creating and validating models; and manipulating and simulating these models using ordinary differential equation solvers.
{{% /blurb %}}

{{% blurb title="SBFC" image="/img/sbfc-logo.png" link="sbfc" %}}
The Systems Biology Format Converter (SBFC) is both a framework and an online service for converting between formats used in systems biology. The SBFC framework currently supports conversion from SBML to [BioPAX](http://www.biopax.org) Levels&nbsp;2 and&nbsp;3, [MATLAB](https://www.mathworks.com/products/matlab.html), [XPP](http://www.math.pitt.edu/~bard/xpp/xpp.html), [GraphViz](https://www.graphviz.org), and [APM](http://apmonitor.com).
{{% /blurb %}} 


## Format conversion tools from third parties


## SBML models

The SBML Project does not itself produce models; our efforts are more directed towards developing infrastructure for modeling. However, our alliances and related projects _do_ produce models.

{{% blurb title="BioModels Database" image="/img/biomodels.png" link="https://www.ebi.ac.uk/biomodels" %}}
  An open and free database of models curated by humans, [BioModels Database](https://www.ebi.ac.uk/biomodels/) allows biologists to store, search and retrieve published mathematical models of biological interests. Models are annotated and linked to relevant data resources, such as publications, databases of compounds and pathways, controlled vocabularies, and more.
{{% /blurb %}}
