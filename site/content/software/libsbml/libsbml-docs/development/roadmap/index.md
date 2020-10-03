+++
#=====================================================================
title      = "LibSBML development roadmap"
date       = 2020-04-02
layout     = "single"
icon       = "/img/libsbml-logo-and-name.svg"
icon_width = "11em"
#=====================================================================
+++

This page provides a roadmap for [libSBML](/software/libsbml) development goals. The LibSBML Team attempts to update this page regularly as new plans are made and existing goals are achieved. This page focuses on high-level descriptions of plans; we also maintain finer-grained lists of tasks in a [Pivotal Tracker project page for libSBML](https://www.pivotaltracker.com/n/projects/248655). The previous roadmap page is available [on a separate page](previous-roadmap).

## Development goals for libSBML releases

Currently, libSBML-5 is the main target of development. The following table summarizes the additions and differences in features being planned for upcoming libSBML releases.

| Version                     | libSBML 5.17.0 | libSBML 5.17.2 | libSBML 5.18.0 |
|-----------------------------|----------------|----------------|----------------|
| Description                 | This version of libSBML adds 'render' support to the stable builds. | This is the latest experimental release. This version of libSBML optimises flattening of comp models and adds a new version of the distrib code to experimental builds.	| This is the latest release. This version of libSBML adds a new version of the distrib code to experimental builds. |
| Full release status         | 5.17.0 released on 21 May 2018 | | 5.18.0 released on 19 April 2019 |
| Experimental release status |                | 5.17.2 released on 6 December 2018 | |


## Status of SBML Level 3 package modules

Full details of the status of all SBML Level 3 packages are available from the Level 3 Packages Specifications page. Here we detail the status of libSBML support for packages and anticipated future development.


### Accepted packages

Code for accepted SBML packages is complete with full validation available. Code for these packages is included in all libSBML releases.

| Package  | Specification       | Development status |
|----------|---------------------|--------------------|
| _comp_   | Version 1 Release 3 |                    |
| _fbc_    | Version 2 Release 1 | Version 2 support released in libsbml-5.11.6-experimental |
| _groups_ | Version 2 Release 1 | Version 1 support released in stable libsbml-5.13.0 |
| _layout_ | Version 1 Release 1 |                    |
| _qual_   | Version 1 Release 1 |                    | 
| _multi_  | Version 1 Release 1 | Version 1 support released in stable libsbml-5.15.0 | 
| _render_ | Version 1 Release 1 | Version 1 support released in stable libsbml-5.17.0 |


### Packages under development

Code for packages under development is released when a package reaches a level of stability to encourage implementation. Implementation of reading/writing/creating and manipulating the features of the package is included. Validation is minimal and usually only applies to checking that mandatory attributes are present.

| Package   | Code Status              | LibSBML Release |
|-----------|--------------------------|-----------------|
| _arrays_  | Reflects latest proposal | 5.18.0          |
| _distrib_ | Reflects latest proposal | 5.18.0          |
| _dyn_     | Reflects latest proposal | 5.18.0          |
| _req_     | Reflects latest proposal | 5.18.0          |
| _spatial_ | Reflects latest proposal | 5.18.0          |
