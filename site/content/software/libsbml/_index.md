+++
#=====================================================================
title  = "libSBML"
date   = 2020-03-24
layout = "single"
#=====================================================================
+++

{{< software-icon width="25%" file="/img/libsbml-logo-and-name.svg" >}}

LibSBML is a programming library that helps you read, write, manipulate, translate, and validate SBML files and data streams.  The library supports all Levels and Versions of SBML.  LibSBML is written in ISO standard C++ and C and provides APIs for the languages C, C++, C#, Java, JavaScript, MATLAB, Perl, PHP, Python, R, and Ruby.  It works on Linux, Windows, and MacOS X, and has been known to work on FreeBSD and Solaris in the past.

{{< software-links download="libsbml-docs/download-and-install" changes="https://sourceforge.net/p/sbml/code/HEAD/tree/trunk/libsbml/NEWS.txt" tracker="https://sourceforge.net/p/sbml/libsbml/" docs="libsbml-docs" repo="https://sourceforge.net/p/sbml/code/HEAD/tree/trunk/libsbml/" forum="https://groups.google.com/forum/#!forum/libsbml-development">}}


## Please cite the paper if you use libSBML

Article citations are crucial to our ability to justify continued development of libSBML, as well as our academic careers.  If you use libSBML and you publish papers about your software, we ask that you **please cite the following paper**:

{{< reference highlight="true" title="LibSBML: An API Library for SBML" authors="Bornstein, B.&nbsp;J., Keating, S.&nbsp;M., Jouraku, A., and Hucka M." pub="_Bioinformatics_,  24(6):880&ndash;881, 2008" link="https://doi.org/10.1093/bioinformatics/btn051" bibtex="libsbml.bib" endnote="libsbml.ris" >}}


## Features of libSBML

There are many reasons to prefer libSBML over the direct use of an XML parser.  First, libSBML understands all Levels and Versions of SBML, and supports **extensions for SBML Level&nbsp;3 packages**.   Here are some additional benefits: 

* **API for many languages**.  LibSBML is written in ISO C and C++ but  can be used from many other languages.

* **Object model**.  LibSBML's object model and API are designed around SBML and the operations that are commonly needed when working with SBML.

* **Features**. LibSBML offers powerful features such as reading/writing compressed SBML files, detecting overconstrained models, checking units, an API for SBML `<annotation>` content, and support for the three most popular XML parser libraries: [Xerces](http://xml.apache.org/xerces-c), [Expat](http://expat.sourceforge.net/), and [libxml2](http://xmlsoft.org/).

* **Validation**. LibSBML implements all the validation rules defined in the SBML specifications, and performs additional validation of its own.  An API provides control over libSBML's validation behavior.

* **Portability**. The code is highly portable.  It's supported on Linux (multiple variants), Windows (native), MacOS&nbsp;X, and also runs on Solaris and FreeBSD.

LibSBML is available for free under the terms of the [LGPL version 2.1](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html) in both source-code form and precompiled binaries for a variety of systems.


## Software releases

A **stable release** includes support for SBML Level&nbsp;3 Core and all accepted SBML &nbsp;3 packages, as well as support for packages that are currently under development. An **experimental-only release** only updates code for the SBML Level&nbsp;3 packages under development. A full explanation of the libSBML release types and the release schedule can be found on the [libSBML release schedule page](libsbml-docs/release-schedule).

We provide Zenodo DOIs for specific releases, so that you can cite the exact version of the software that you use:

* libSBML-5.18.0 &rArr; [10.5281/zenodo.2645216](https://doi.org/10.5281/zenodo.2645216)
* libSBML-5.17.0 &rArr; [10.5281/zenodo.1250696](https://doi.org/10.5281/zenodo.)
* libSBML-5.16.0 &rArr; [10.5281/zenodo.1095483](https://doi.org/10.5281/zenodo.)
* libSBML-5.15.0 &rArr; [10.5281/zenodo.495344](https://doi.org/10.5281/zenodo.)


## LibSBML authors and contributors

LibSBML's main authors are [Sarah M. Keating](https://github.com/skeating), [Frank T. Bergmann](https://www.cos.uni-heidelberg.de/index.php/f.bergmann/?l=_e), [Lucian P. Smith](https://github.com/luciansmith), [Brett G. Olivier](http://www.bgoli.net), [Akiya Jouraku](https://www.researchgate.net/profile/Akiya_Jouraku), [Michael Hucka](http://www.cds.caltech.edu/~mhucka/), and [Ben Bornstein](http://ml.jpl.nasa.gov/people/bornstein.shtml), with contributions from many other people.  We especially thank the following (in alphabetical order):

* Gordon Ball
* Bill Denney
* Christoph Flamm
* Akira Funahashi
* Ralph Gauges
* Rainer Machn&eacute;
* Martin Ginkel
* Alex Gutteridge
* Stefan Hoops
* Totte Karlsson
* Moriyoshi Koizumi
* Ben Kovitz
* Thomas Pfau
* Nicolas Rodriguez
* Fengkai Zhang


## Community and help

There is a mailing list and web forum, [libsbml-development@googlegroups.com](https://groups.google.com/forum/#!forum/libsbml-development), devoted to discussions about LIBSBML.  If you're using LIBSBML or interested in learning more, feel free to join the group!

You can also reach the main developers directly via email at [libsbml-team@googlegroups.com](libsbml-team@googlegroups.com).

We welcome contributions from anyone interested. It is especially useful to receive patches to enable building libSBML on operating systems or compilers that our outside our test matrix.  The best way to submit a patch is via our [Sourceforge Tracker](https://sourceforge.net/p/sbml/libsbml/) as this provides a transparent record.  However, we are also happy to accept patches via [email](mailto:libsbml-team@googlegroups.com).


## Funding acknowledgments

We are immensely thankful to the funding agencies, particularly NIH and DARPA, that have supported the development of libSBML over the years.  Please visit our [funding acknowledgements page](/about/funding) for more information.
