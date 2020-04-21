+++
#=====================================================================
title  = "Deviser"
date   = 2020-03-22
layout = "single"
icon   = "/img/deviser-logo.png"
#=====================================================================
+++

[_Deviser_](https://github.com/sbmlteam/deviser) stands for _"Design Explorer and Viewer for Iterative SBML Enhancement of Representations"_.  It facilitates the development of SBML Level&nbsp;3 packages by enabling the creation of basic specifications, UML diagrams and code for integration with [LibSBML](http://sbml.org/Software/libSBML).  Its principal authors are [Sarah M. Keating](https://github.com/skeating) and [Frank&nbsp;T. Bergmann](https://www.cos.uni-heidelberg.de/?l=_e), with contributions from [Brett Olivier](https://github.com/bgoli), [Lucian Smith](https://github.com/luciansmith), and [Mike Hucka](http://www.cds.caltech.edu/~mhucka/).

{{< software-links download="https://github.com/sbmlteam/deviser/releases" changes="https://github.com/sbmlteam/deviser/blob/master/NEWS.txt" tracker="https://github.com/sbmlteam/deviser/issues"
docs="https://github.com/sbmlteam/deviser/blob/master/docs/DEVISER_MANUAL.pdf"
repo="https://github.com/sbmlteam/deviser" >}}


## More about Deviser

[LibSBML](http://sbml.org/Software/libSBML) is a free, open-source programming library to help developers read, write, manipulate, translate, and validate SBML files and data streams in their software systems. It is written in C++ and provides language bindings for other programming languages.  Support for SBML Level&nbsp;3 packages can be added to [LibSBML](http://sbml.org/Software/libSBML) by integrating the package-specific code and building with the package enabled.

Deviser allows you to quickly define an SBML Level&nbsp;3 package using its graphical user interface (GUI), and then provides the following functionality:

* Create and view a UML diagram.
* Generate the necessary libSBML code for the package.
* Generate [<span class="latex">L<sup>a</sup>T<sub>e</sub>X</span>](https://www.latex-project.org) files and generate a PDF file of a basic specification document for the package.
* Integrate and test the package with [libSBML](/software/libsbml).

Deviser has two main components:

1. [Deviser Edit](https://github.com/sbmlteam/qtdeviser), a graphical user interface, written in C++ using the [Qt](https://www.qt.io) GUI widgets.
2. The [Deviser](https://github.com/sbmlteam/deviser) code generation tool, written in Python.

Both components run on Windows, Mac and Linux operating systems.  The Deviser system is freely distributed under the terms of the [LGPL v2.1](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html).


## Acknowledgments

The development of Deviser was supported in part by funding from the National Institute of General Medical Sciences (USA) under grant R01&nbsp;GM070923 (principal investigator: Michael Hucka).
