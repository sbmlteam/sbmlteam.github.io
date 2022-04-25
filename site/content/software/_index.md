+++
#============================================================================
aliases = ["/Software", "/Downloads"]
title  = "SBML software and models"
layout = "single"
toc    = true
#============================================================================
+++

The SBML Team produces software libraries and some specific software tools for working with SBML. (Many more third-party packages also support SBML &ndash; check the software documentation to find out.)

## Main programming libraries and tools
### <!-- Stupid hack needed to make TOC show up properly -->

{{% blurb title="libSBML" image="/img/libsbml-logo.svg" link="libsbml" %}}
LibSBML is a library for reading, writing, and manipulating files and
data streams in SBML format .  It is written in C++ and C and provides APIs for C, C++, C#, Java, JavaScript, MATLAB, Octave, Perl, PHP, Python, R, and Ruby.
{{% /blurb %}}

{{% blurb title="JSBML" image="/img/jsbml-logo.png" width="112pt" link="jsbml" %}}
JSBML is a pure Java library for reading, writing, and manipulating SBML.  It maps all SBML elements to a flexible and extended object hierarchy in Java.  JSBML is an alternative to the mixed Java/native code-based interface provided in [libSBML](/software/libsbml).
{{% /blurb %}}

{{% blurb title="Deviser" image="/img/deviser-logo.png" width="98pt" link="deviser" %}}
SBML Level&nbsp;3 is modular, with optional _packages_ that can add features to a core.  [Deviser](https://github.com/sbmlteam/deviser) helps development of SBML Level&nbsp;3 packages by automating the generation of basic specifications, UML diagrams, and [LibSBML](http://sbml.org/Software/libSBML) plug-ins.
{{% /blurb %}}


## Test suite

{{% blurb title="SBML Test Suite" image="/img/sbml-test-suite-logo.svg" link="sbml-test-suite" %}}
The SBML Test Suite is a conformance testing system for SBML.  It can be used software implementation of SBML support.  The Test Suite consists of a collection of test models and a framework for running software through the suite.
{{% /blurb %}}


## Format conversion tools

[libSBML](/software/libsbml) and [JSBML](/software/jsbml) include some built-in format conversion capabilities, particularly between SBML Levels/Versions. Converters for other formats also exist, and we list the ones we know about below.

{{% blurb title="All known converters" icon="exchange-alt" link="converters" %}}
In addition to the converters listed below, a number of other groups have written converters that can translate between SBML and other formats. We provide a list of those known to us.
{{% /blurb %}} 

{{% blurb title="MOCCASIN" image="/img/moccasin-logo.svg" link="moccasin" %}}
Written in [Python](https://www.python.org) and made freely available under [LGPL](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html) terms, MOCCASIN can read certain forms of <nobr>ODE-based</nobr> models written in [MATLAB](https://www.mathworks.com/products/matlab.html) and translate them into SBML format. It does not use or need [MATLAB](https://www.mathworks.com/products/matlab.html) itself.  It offers both a GUI and a command-line interface.
{{% /blurb %}}

{{% blurb title="SBFC" image="/img/sbfc-logo.png" link="sbfc" %}}
The Systems Biology Format Converter (SBFC) is both a framework and an online service for converting between formats used in systems biology. The SBFC framework currently supports conversion from SBML to [BioPAX](http://www.biopax.org) Levels&nbsp;2 and&nbsp;3, [MATLAB](https://www.mathworks.com/products/matlab.html), [XPP](http://www.math.pitt.edu/~bard/xpp/xpp.html), [GraphViz](https://www.graphviz.org), and [APM](http://apmonitor.com).
{{% /blurb %}} 

{{% blurb title="SBMLToolbox" image="/img/sbmltoolbox-logo.png" link="sbmltoolbox" %}}
SBMLToolbox is an open-source tool that provides a set of basic functions allowing SBML models to be used in both [MATLAB](https://www.mathworks.com/products/matlab.html) and [Octave](https://www.gnu.org/software/octave/).  It provides functions for creating and validating models; and manipulating and simulating these models using ordinary differential equation solvers.
{{% /blurb %}}


## SBML models

The SBML Project does not itself produce models; our efforts are more directed towards developing infrastructure for modeling. However, our alliances and related projects _do_ produce models.

{{% blurb title="BioModels Database" image="/img/biomodels-logo.svg" link="https://www.ebi.ac.uk/biomodels" %}}
  An open and free database of models curated by humans, [BioModels Database](https://www.ebi.ac.uk/biomodels/) allows biologists to store, search and retrieve published mathematical models of biological interests. Models are annotated and linked to relevant data resources, such as publications, databases of compounds and pathways, controlled vocabularies, and more.
{{% /blurb %}}
