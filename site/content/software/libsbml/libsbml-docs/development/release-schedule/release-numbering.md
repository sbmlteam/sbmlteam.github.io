+++
#=====================================================================
title      = "LibSBML release numbering"
date       = 2020-04-02
layout     = "single"
icon       = "/img/libsbml-logo-and-name.svg"
icon_width = "11em"
#=====================================================================
+++

Prior to libSBML version 4, there had been no formally-defined numbering scheme for libSBML releases.  This needed to change to facilitate modularization and SBML Level 3 packages. Therefore, the following system was introduced in libSBML 4 and subsequent releases:

## Release number principles

LibSBML releases are numbered _X.x.p_ where

&nbsp;&nbsp;&nbsp;_X_ denotes a major version number<br>
&nbsp;&nbsp;&nbsp;_x_ denotes a minor version number<br>
and<br>
&nbsp;&nbsp;&nbsp;_p_ denotes a patch version number.<br>

Notes about the numbers:

1. The major version number will only change when incompatible API changes have been made.
2. The minor version number will change when there have been additions to the API but no changes.
3. The patch version will change when there have been bug fixes within the code but no changes to the API interface.


## Experimental-only releases

In 2014 we introduced the concept of an _experimental-only_ release. Since this code will not have been subject to the rigorous testing that precedes a full release it should still be considered 'experimental', as it may change before the next full release. Consequently, _experimental-only_ releases will only ever update the patch version number.
