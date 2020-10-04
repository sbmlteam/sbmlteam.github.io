+++
#=====================================================================
title      = "LibSBML development schedule"
date       = 2020-04-02
layout     = "single"
icon       = "/img/libsbml-logo-and-name.svg"
icon_width = "11em"
#=====================================================================
+++

Historically, we have provided two types of releases of libSBML: _full_, and _experimental-only_. They are described below, along with principles followed in numbering the releases.


## Types of libSBML releases

There are two types of libSBML releases: _full_ and _experimental-only_.

### Full release

A _full release_ is a rigorously tested release of the latest code in both stable and experimental branches of libSBML. It includes prebuilt binaries and installers for all operating systems and language bindings supported in addition to archives of the source.

The stable and experimental code/builds (see below) are found in the correspondingly named subdirectories of the release directory. The directory will be named according to the release version number. For example part, of the 5.18.0 release directory looks like this:

    5.18.0
    ├── stable
    │   ├── Linux
    │   ├── Mac OS X
    │   └── Windows
    └── experimental

### Experimental only

An _experimental-only_ release is a release of the code in the latest experimental branch of libSBML; the code for all SBML Level 3 packages that are not yet fully developed. It includes prebuilt binaries and the latest source code archives.

The source and binaries are found in the corresponding subdirectories of the release directory. In the case of an experimental release, the release directory will be named according to the release version number with the word experimental appended.  For example, a typical experimental release directory will look like this:

    5.17.2-experimental
    ├── binaries
    │   ├── Linux
    │   ├── Mac OS X
    │   └── Windows
    └── source

Code in experimental releases is not as well tested as that in the stable release of libSBML. We introduced these mini releases to facilitate development of SBML Level&nbsp;3 packages that are changing and thus provide developers with more frequent updates of the code/prebuilt binaries.

{{% notice type="warning" %}}
An experimental release **may** contain additions to the code for core libSBML and/or approved packages. Since this code will not have been subject to the rigorous testing that precedes a full release it should still be considered experimental, as it may change before the next full release.
{{% /notice %}}


## Numbering the releases

Releases are numbered according to our [guidelines](release-numbering). However recently, to facilitate developers who use code directly from SVN, we have started to update the version number in SVN by a patch number (the number after the last dot) immediately following a release. Prior to an actual release the version number is again updated so that the release has a different version number from code that was in SVN in the elapsed time between releases.

Thus following the 5.9.0 release, the version number in SVN was updated to 5.9.1. The next release will update the version number. Thus it may appear in the libSBML release directory on Sourceforge that we are missing releases with numbers going from 5.9.0 to 5.9.2 without an official 5.9.1 release. The rule following the 5.9.0 release, allowing for SVN to have a different version number, is that official libSBML releases will have an even patch version number.

{{% notice type="warning" %}}
An experimental-only release facilitates developers of package code that is still changing. Thus code within an experimental release may change before a full release. Consequently, experimental-only releases will only ever update the patch version number.
{{% /notice %}}

### Retrieving the libSBML version number

LibSBML provides functions for retrieving the version number as either integer or string. Full details of these functions can be found in the libSBML API documentation.


## Stable vs experimental code

At present, libSBML code is organized into two main repositories:

1. [trunk/libsbml](https://svn.code.sf.net/p/sbml/code/trunk/libsbml/), which contains code for core plus accepted packages
2. [branches/libsbml-experimental](https://svn.code.sf.net/p/sbml/code/branches/libsbml-experimental/), which contains code for core plus both accepted and non-accepted packages

A full release includes code/binaries from both repositories in directories correspondingly names stable and experimental. It should be noted that the experimental repository and therefore released code does include all of the stable libSBML code.
