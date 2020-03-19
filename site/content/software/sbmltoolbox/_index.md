--- # -*- mode: markdown -*-
#=====================================================================
active: true
title: "SBMLToolbox"
date: 2020-03-13
layout: "single"
#=====================================================================
---

{{< software-icon file="/img/sbmltoolbox-logo.png" >}}

SBMLToolbox is built on top of [libSBML](/software/libsbml) and provides a set of basic functions allowing SBML models to be used in both [MATLAB](https://www.mathworks.com/products/matlab.html) and [Octave](https://www.gnu.org/software/octave/). SBMLToolbox provides functions for creating and validating models; and manipulating and simulating these models using ordinary differential equation solvers. It is written by [Sarah M. Keating](https://github.com/skeating) and made available under [LGPL](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html) terms.

{{< software-links download="https://sourceforge.net/projects/sbml/files/SBMLToolbox/" changes="https://sourceforge.net/p/sbml/code/HEAD/tree/trunk/SBMLToolbox/NEWS.txt" tracker="https://sourceforge.net/tracker/?group_id=71971&atid=1050048"
docs="api-docs"
repo="https://sourceforge.net/p/sbml/code/HEAD/tree/trunk/SBMLToolbox/" >}}


## Please cite the paper if you use SBMLToolbox

Citations are crucial to our ability to justify continued development of SBMLToolbox, as well as our academic careers. If you use SBMLToolbox and you publish papers about your software, we ask that you please cite the [paper](https://academic.oup.com/bioinformatics/article/22/10/1275/237481):

{{% notice %}}
Keating, S. M., Bornstein, B. J., Finney, A., and Hucka M. (2006) SBMLToolbox: an SBML toolbox for MATLAB users. _Bioinformatics_, 22(10):1275–1277.  (Freely available [directly from Bioinformatics](https://academic.oup.com/bioinformatics/article/22/10/1275/237481).)
{{% /notice %}}


## More about SBMLToolbox

SBMLToolbox works by translating SBML models to/from a MATLAB structure called `MATLAB_SBML`. It provides facilities for manipulating this and its substructures within either the MATLAB or Octave environments. The [libSBML](/software/libsbml) binding enables the import and export of these structures to and from SBML files.

The toolbox is not intended to be a complete systems biology toolbox for MATLAB, but rather a platform facilitating getting SBML in and out of MATLAB and serving as a starting point from which users can develop their own functionality.


## Compatibility note

A number of third-party MATLAB toolboxes use SBMLToolbox. **Beware that they may have restrictions on the version of SBMLToolbox with which they are compatible. For example, some are only compatible with version 2.0.2, not the current version 4 of SBMLToolbox.** Please make sure to check the third-party software's documentation to determine which version of SBMLToolbox it needs.
