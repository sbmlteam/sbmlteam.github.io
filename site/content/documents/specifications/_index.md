--- # -*- mode: markdown -*-
#=====================================================================
active: true
title: "SBML Specifications"
date: 2019-10-21
layout: "single"
#=====================================================================
---

{{< toc >}}

The _Levels_ of SBML represent stratifications of functionality and complexity in SBML.  Major architectural changes are made from Level to Level.  Within a given SBML Level, minor revisions to SBML are termed _Versions_ and constitute changes within a Level to correct, adjust and refine features. Additionally, to cope with occasional minor editorial changes that may be needed, SBML specification come with _Release_ numbers within Versions.

Please inform the [SBML Editors](mailto:sbml-editors@googlegroups.com) of problems and other issues in the documents, or any topics, using the issue trackers for each specification.


## SBML Level 3

_SBML Level 3_ is the highest Level of SBML and constitutes the most comprehensive format for representing models.

### SBML Level 3 Version 2 Core

SBML Level 3 is a modular format.  There is a core comprising a complete format that can be used alone, and optional Level 3 _Packages_ that can be layered on top of the core to provide additional features and syntactic constructs.

{{< sbml-spec-box package="core" level="3" version="2" release="2" >}}

Past releases of SBML Level 2 are available from a separate page. 


### SBML Level 3 Packages

SBML Level 3 Core is best at representing reaction-based models. SBML Level&nbsp;3 _Packages_ extend the Core with constructs suited to other model types including constraint-based models, reaction-diffusion models, logical network models, rule-based models, and more.  The following diagram illustrates the Level&nbsp;3 Packages that have been defined or are in development as of March 2020.

<img width="95%" src="sbml-level-3-packages.svg">

A Level&nbsp;3 Package can augment the Core by extending existing elements, adding new elements, and adjusting the meaning or scope of elements.  A model expressed in SBML Level&nbsp;3 format can declare which packages it uses in order to guide its interpretation by software applications.  If a software tool detects the presence of packages that it does not support, it may inform users if it cannot work with the model.

{{< sbml-packages-table >}}


## SBML Level 2

The current definition of SBML Level 1 is **Version 5**.  Unlike Level&nbsp;3, SBML Level 2 is monolithic and not a modular format.  Its structure is similar to SBML Level&nbsp;3 Core, but there are no packages extending Level 2.

Note that the separate Levels of SBML are intended to coexist &ndash; SBML Level&nbsp;3 does not render Level&nbsp;2 obsolete. Software tools that cannot support higher levels can go on using lower levels; tools that can read higher levels are assured of also being able to interpret models defined in the lower levels.  Level&nbsp;2-compatible models and software tools still continue to be used.

{{< sbml-spec-box package="core" level="2" version="5" release="1" >}}

Past releases of SBML Level 2 are available from a separate page. 


## SBML Level 1

The current definition of SBML Level 1 is **Version 2**.

{{< sbml-spec-box package="core" level="1" version="2" release="1" >}}

Past releases of SBML Level 1 are available from a [separate page](all_versions_of_sbml_level_1).

