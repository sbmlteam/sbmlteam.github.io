--- # -*- mode: markdown -*-
#=====================================================================
title: "SBML Specifications"
date: 2019-10-21
layout: "single"
#=====================================================================
---

{{< toc >}}

_Levels_ in SBML are used to manage complexity and evolution of the standard.  A _Level_ in SBML is an attempt to provide a given set of features for describing models, with higher Levels providing more powerful features.  Within a given SBML Level, minor revisions to SBML are termed _Versions_ and constitute changes within a Level to correct, adjust and refine features. Additionally, to cope with occasional minor editorial changes that may be needed, SBML specification come with _Release_ numbers within Versions.

Please inform the [SBML Editors](/about/core) of problems and questions. You can use [email](mailto:sbml-editors@googlegroups.com) or the issue trackers noted below.

{{% notice type="warning" %}}
Depending on the SBML Level, either [RELAX NG](https://en.wikipedia.org/wiki/RELAX_NG) schemas or [XML Schemas](https://en.wikipedia.org/wiki/XML_schema) are available.  However, the <strong>schemas only capture the basic syntax</strong> of the format.  Semantics and correct usage are <strong>not</strong> captured by the schemas and can only be understood by reading the specification documents.
{{% /notice %}}


## SBML Level 3

_SBML Level 3_ is currently the highest _Level_ of SBML.  It has an extensible modular architecture consisting of a central set of fixed features (named _SBML Level&nbsp;3 Core_) and optional _Packages_ that can augment the Core by extending existing elements, adding new elements, and adjusting the meaning or scope of elements.


### SBML Level 3 Version 2 Core

The most recent definition of SBML Level&nbsp;3 is Version&nbsp;2.

{{< sbml-spec-box package="core" level="3" version="2" release="2" >}}

Past releases of SBML Level 3 are available from a [separate page](sbml-level-3). 


### SBML Level 3 Packages

SBML Level 3 Core is best suited to representing reaction-based models. SBML Level&nbsp;3 _Packages_ extend the Core with constructs suited to other model types, including constraint-based models, reaction-diffusion models, logical network models, rule-based models, and more.  A model expressed using SBML Level&nbsp;3 can declare which packages it uses in order to guide interpretation by software applications.  If an application detects the presence of packages that it does not support, it may inform users if it cannot work with the model.

<img class="sbml-pkg-diagram" src="/img/sbml-level-3-packages.svg">

Packages are developed by separate groups apart from the SBML Editors. If you use an SBML Level&nbsp;3 Package in your software or your work, **please cite the publication associated with the package** to give credit to the package developers. Citation information is given in the package detail pages, linked below.

{{< sbml-packages-table >}}


## SBML Level 2

The current definition of SBML Level 2 is **Version 5**.  Unlike Level&nbsp;3, SBML Level 2 is monolithic and not a modular format.  Its structure is similar to SBML Level&nbsp;3 Core, but there are no packages extending Level 2.

The separate Levels of SBML are intended to coexist &ndash; SBML Level&nbsp;3 does not render Level&nbsp;2 obsolete. Software tools that cannot support higher levels can keep using lower levels.  Level&nbsp;2-compatible models and software tools still continue to be used today.

{{< sbml-spec-box package="core" level="2" version="5" release="1" >}}

Past releases of SBML Level 2 are available from a [separate page](sbml-level-2). 


## SBML Level 1

The current definition of SBML Level 1 is **Version 2**.

{{< sbml-spec-box package="core" level="1" version="2" >}}

Past releases of SBML Level 1 are available from a [separate page](sbml-level-1).

