--- # -*- mode: markdown -*-
#=====================================================================
active: true
title: "SBML Specifications"
date: 2019-10-21
layout: "single"
#=====================================================================
---

The SBML specification documents are the normative definitions for the SBML format.

The _Levels_ of SBML represent stratifications of functionality and complexity in SBML.  Major architectural changes are made from Level to Level.  Within a given SBML Level, minor revisions to SBML are termed _Versions_ and constitute changes within a Level to correct, adjust and refine features. Additionally, to cope with occasional minor editorial changes that may be needed, SBML specification come with _Release_ numbers within Versions.

Please notify the [SBML Editors](mailto:sbml-editors@googlegroups.com) of problems and other issues in the documents, or any topics, using the issue trackers for each specification.


## SBML Level 3

_SBML Level 3_ is the highest Level of SBML and constitutes the most comprehensive format for representing models.

### SBML Level 3 Version 2 Core

SBML Level 3 is a modular format.  There is a core comprising a complete format that can be used alone, and optional Level 3 _Packages_ that can be layered on top of the core to provide additional features and syntactic constructs.

{{< specification level="3" version="2" release="2" date="29 March 2019"
    spec_title="The Systems Biology Markup Language (SBML): Language Specification for Level 3 Version 2 Core"
    spec_authors="Michael Hucka, Frank T. Bergmann, Claudine Chaouiya, Andreas Dräger, Stefan Hoops, Sarah M. Keating, Matthias König, Nicolas Le Novère, Chris J. Myers, Brett G. Olivier, Sven Sahle, James C. Schaff, Rahuman Sheriff, Lucian P. Smith, Dagmar Waltemath, Darren J. Wilkinson, and Fengkai Zhang"
    pdf_url="/documents/specifications/sbml-level-3/version-2/core/release-2/sbml-level-3-version-2-release-2-core.pdf"
    errata_url=""
    issues_url=""
    schema_url=""
    schema_type="RNG"
>}}

Past releases of SBML Level 2 are available from a separate page. 


### SBML Level 3 Packages




## SBML Level 2

The current definition of SBML Level 1 is **Version 5**.  Unlike Level&nbsp;3, SBML Level 2 is monolithic and not a modular format.  Its structure is similar to SBML Level&nbsp;3 Core, but there are no packages extending Level 2.

Note that the separate Levels of SBML are intended to coexist &ndash; SBML Level&nbsp;3 does not render Level&nbsp;2 obsolete. Software tools that cannot support higher levels can go on using lower levels; tools that can read higher levels are assured of also being able to interpret models defined in the lower levels.  Level&nbsp;2-compatible models and software tools still continue to be used.

{{< specification level="2" version="5" release="1" date="3 August 2015"
    spec_title="Systems Biology Markup Language (SBML) Level 2: Structures and Facilities for Model Definitions"
    spec_authors="Michael Hucka, Frank T. Bergmann, Andreas Dräger, Stefan Hoops, Sarah M. Keating, Nicolas Le Novère, Chris J. Myers, Brett G. Olivier, Sven Sahle, James C. Schaff, Lucian P. Smith, Dagmar Waltemath, and Darren J. Wilkinson"
    pdf_url="/documents/specifications/sbml-level-2/version-5/sbml-level-2-version-5-rel-1.pdf"
    errata_url=""
    issues_url=""
    schema_url=""
    schema_type="XML"
>}}

Past releases of SBML Level 2 are available from a separate page. 


## SBML Level 1

The current definition of SBML Level 1 is **Version 2**.

{{< specification level="1" version="2" release="1" date="28 August 2003"
    spec_title="Systems Biology Markup Language (SBML) Level 1: Structures and Facilities for Basic Model Definitions"
    spec_authors="Michael Hucka, Andrew Finney, Herbert Sauro, and Hamid Bolouri"
    pdf_url="/documents/specifications/sbml-level-1/version-2/sbml-level-1-version-2.pdf"
    errata_url=""
    issues_url=""
    schema_url=""
    schema_type="XML"
>}}

Past releases of SBML Level 1 are available from a [separate page](all_versions_of_sbml_level_1).

