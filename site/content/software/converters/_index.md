+++
#=====================================================================
title  = "Converters"
date   = 2020-04-04
layout = "single"
active = true
#=====================================================================
+++

{{< toc >}}

SBML is a lingua franca in systems biology. In order to further facilitate exchange of models, many software tools have been developed to convert between SBML and other formats. For the benefit of the SBML-using community, this page provides a list of conversion tools of which we are aware. Please contact sbml-team@googlegroups.com if we have missed any. Note that most of these tools are third-party software, and not the product of the SBML Team.

Also, please note that the conversion tools listed here differ in their coverage of SBML—some may be more complete than others. In addition, different tools are in different states of development, maturity and maintenance status.

## To SBML

### From BioPAX

The [Biological Pathways Exchange format (BioPAX)](http://www.biopax.org) is a standard language that aims to enable integration, exchange and analysis of biological pathway data.

{{< pub title="Qualitative translation of relations from BioPAX to SBML" authors="Büchel F, Wrzodek C, Mittag F, Dräger A, Eichner J, Rodriguez N, Le Novère N, and Zell A." source="_Bioinformatics_, 28:2648-2653, 2012" link="Buechel2012.pdf" summary="Description of [BioPAX2SBML](http://www.cogsys.cs.uni-tuebingen.de/software/BioPAX2SBML/), a tool capable of translating BioPAX (Level&nbsp;2 and&nbsp;3) into SBML (Level&nbsp;3 Version&nbsp;1 with the SBML 'qual' package, including reactions and relations in a single model." >}}


### From CellML

[CellML](https://www.cellml.org) is a language being developed by the Auckland Bioengineering Institute to store and exchange computer-based mathematical models.

{{< pub title="SBML and CellML Translation in Antimony and JSim" authors="Smith L.P., Butterworth E., Bassingthwaighte J., Sauro H." source="_Bioinformatics_, 10.1093/bioinformatics/btt641, 2013." link="Smith2013.pdf" summary="Description of two tools that each convert CellML and SBML models, and the challenges discovered. Both [Antimony](http://antimony.sourceforge.net) and [JSim](https://www.physiome.org/jsim/) can be used to convert between SBML and CellML, in addition to each program's native model definition languages." >}}


### From KEGG

The [KEGG PATHWAY database](https://www.genome.jp/kegg/pathway.html) uses a format called [KGML](https://www.genome.jp/kegg/xml/).

{{< pub title="Precise generation of systems biology models from KEGG pathways" authors="Wrzodek C., Büchel F., Ruff M., Dräger A., Zell A." source="_BMC Systems Biology_, 7:15, 2013" link="Wrzodek2013.pdf" summary="Description of an updated version of KEGGtranslator." >}}

{{< pub title="KEGGtranslator: visualizing and converting the KEGG PATHWAY database to various formats" authors="Wrzodek C., Dräger A., Zell A." source="_Bioinformatics_, 27: 2314-2315, 2011" link="Wrzodek2011.pdf" summary="Description of a tool to convert KEGG Pathway files into SBML." >}}


### From MATLAB

[MATLAB<sup>&REG;</sup>](https://www.mathworks.com/products/matlab.html) is a popular interactive numerical computing environment with a [matrix-based language](https://www.mathworks.com/help/matlab/). MATLAB is used in all technical fields, including biology.

{{< pub title="MOCCASIN: converting MATLAB ODE models to SBML" authors="Harold F. Gómez, Michael Hucka, Sarah M. Keating, German Nudelman, Dagmar Iber and Stuart C. Sealfon" source="_Bioinformatics_ (2016), 32(12): 1905-1906" link="http://bioinformatics.oxfordjournals.org/content/32/12/1905" summary="Describes [MOCCASIN](https://github.com/sbmlteam/MOCCASIN) (_Model ODE Converter for Creating Automated SBML INteroperability_), a tool written in Python that can read certain forms of <nobr>ODE-based</nobr> models written in [MATLAB](https://www.mathworks.com/products/matlab.html) and translate them into SBML format." >}}

{{< pub title="SBMLToolbox: an SBML toolbox for MATLAB users" authors="Keating, S. M., Bornstein, B. J., Finney, A., and Hucka M." source="_Bioinformatics_, 22(10):1275–1277" link="https://academic.oup.com/bioinformatics/article/22/10/1275/237481" summary="Describes [SBMLToolbox](https://github.com/sbmlteam/sbmltoolbox), a MATLAB toolbox built on top of [libSBML](/software/libsbml). It provides a set of basic functions allowing SBML models to be used in both MATLAB and [Octave](https://www.gnu.org/software/octave/)." >}}


### From SBtab

[SBtab](https://www.sbtab.net) is a set of conventions for structured data tables in spreadsheets. The conventions include, for example, defined column names and a syntax for semantic annotations.

{{< pub title="SBtab: a flexible table format for data exchange in systems biology" authors="Timo Lubitz Jens Hahn, Frank T. Bergmann, Elad Noor, Edda Klipp, and Wolfram Liebermeister" source="_BMC Bioinformatics_, 16(32), 2016" link="Sbtab2016.pdf" summary="Paper introducing the format [SBtab](https://www.sbtab.net) and software to work with it, including a [validator](https://www.sbtab.net/sbtab/default/validator.html) and an [SBML converter](https://www.sbtab.net/sbtab/default/converter.html)." >}}


## From SBML

### To APM

The [APMonitor Modeling Language](http://apmonitor.com) is optimization software for mixed-integer and differential algebraic equations. It is coupled with large-scale solvers for linear, quadratic, nonlinear, and mixed integer programming. It is freely available through MATLAB, Python, or from a web browser interface.

{{< pub title="The System Biology Format Converter" authors="Gaël Jalowicki, Nicolas Rodriguez, Martina Kutmon, Jean-Baptiste Pettit, Lu Li, Arnaud Henry, Kedar Nath Natarajan, Camille Laibe, Chris T. Evelo, and Nicolas Le&nbsp;Novère" source="_Nature Precedings_, [https://doi.org/10.1038/npre.2011.6363.1](https://doi.org/10.1038/npre.2011.6363.1)" link="https://doi.org/10.1038/npre.2011.6363.1" summary="The Systems Biology Format Converter (SBFC) is written in Java and can be used as a standalone executable or as web service. The SBFC framework currently supports conversion from SBML to [BioPAX](http://www.biopax.org) Levels&nbsp;2 and&nbsp;3, [MATLAB](https://www.mathworks.com/products/matlab.html), [Octave](https://www.gnu.org/software/octave/), [XPP](http://www.math.pitt.edu/~bard/xpp/xpp.html), [Graphviz](https://www.graphviz.org), and [APM](http://apmonitor.com)." >}}


### To BioPAX

The [Biological Pathways Exchange format (BioPAX)](http://www.biopax.org) is a standard language that aims to enable integration, exchange and analysis of biological pathway data.

{{< pub title="The System Biology Format Converter" authors="Gaël Jalowicki, Nicolas Rodriguez, Martina Kutmon, Jean-Baptiste Pettit, Lu Li, Arnaud Henry, Kedar Nath Natarajan, Camille Laibe, Chris T. Evelo, and Nicolas Le&nbsp;Novère" source="_Nature Precedings_, [https://doi.org/10.1038/npre.2011.6363.1](https://doi.org/10.1038/npre.2011.6363.1)" link="https://doi.org/10.1038/npre.2011.6363.1" summary="The Systems Biology Format Converter (SBFC) is written in Java and can be used as a standalone executable or as web service. The SBFC framework currently supports conversion from SBML to [BioPAX](http://www.biopax.org) Levels&nbsp;2 and&nbsp;3, [MATLAB](https://www.mathworks.com/products/matlab.html), [Octave](https://www.gnu.org/software/octave/), [XPP](http://www.math.pitt.edu/~bard/xpp/xpp.html), [Graphviz](https://www.graphviz.org), and [APM](http://apmonitor.com)." >}}


### To GraphViz DOT language

The [DOT language](https://graphviz.gitlab.io/_pages/doc/info/lang.html) is the format used by the software [Graphviz](https://www.graphviz.org) to describe network diagrams.

{{< pub title="The System Biology Format Converter" authors="Gaël Jalowicki, Nicolas Rodriguez, Martina Kutmon, Jean-Baptiste Pettit, Lu Li, Arnaud Henry, Kedar Nath Natarajan, Camille Laibe, Chris T. Evelo, and Nicolas Le&nbsp;Novère" source="_Nature Precedings_, [https://doi.org/10.1038/npre.2011.6363.1](https://doi.org/10.1038/npre.2011.6363.1)" link="https://doi.org/10.1038/npre.2011.6363.1" summary="The Systems Biology Format Converter (SBFC) is written in Java and can be used as a standalone executable or as web service. The SBFC framework currently supports conversion from SBML to [BioPAX](http://www.biopax.org) Levels&nbsp;2 and&nbsp;3, [MATLAB](https://www.mathworks.com/products/matlab.html), [Octave](https://www.gnu.org/software/octave/), [XPP](http://www.math.pitt.edu/~bard/xpp/xpp.html), [GraphViz](https://www.graphviz.org), and [APM](http://apmonitor.com)." >}}


### To LaTeX

[<span class="latex">L<sup>a</sup>T<sub>e</sub>X</span>](https://www.latex-project.org) is a popular typesetting system designed for the production of technical and scientific documentation.

{{< pub title="SBML2<span class='latex'>L<sup>a</sup>T<sub>e</sub>X</span>: conversion of SBML files into human-readable reports" authors="Dräger A, Planatscher H, Motsou Wouamba D, Schröder A, Hucka M, Endler L, Golebiewski M, Müller W, Zell A." source="_Bioinformatics_, 25(11):1455-1456, 2009" link="https://academic.oup.com/bioinformatics/article/25/11/1455/331113" summary="Describes [SBML2<span class='latex'>L<sup>a</sup>T<sub>e</sub>X</span>](http://www.ra.cs.uni-tuebingen.de/software/SBML2LaTeX/), a GUI Java-based program as well as online service that can convert files in SBML format into <span class='latex'>L<sup>a</sup>T<sub>e</sub>X</span> files. It provides a way for humans to read the contents of XML-based SBML files, which helps error detection, proofreading, and model communication." >}}


### To MATLAB

[MATLAB<sup>&REG;</sup>](https://www.mathworks.com/products/matlab.html) is a popular interactive numerical computing environment with a [matrix-based language](https://www.mathworks.com/help/matlab/). MATLAB is used in all technical fields, including biology.

{{< pub title="The System Biology Format Converter" authors="Gaël Jalowicki, Nicolas Rodriguez, Martina Kutmon, Jean-Baptiste Pettit, Lu Li, Arnaud Henry, Kedar Nath Natarajan, Camille Laibe, Chris T. Evelo, and Nicolas Le&nbsp;Novère." source="_Nature Precedings_, [https://doi.org/10.1038/npre.2011.6363.1](https://doi.org/10.1038/npre.2011.6363.1)" link="https://doi.org/10.1038/npre.2011.6363.1" summary="The Systems Biology Format Converter (SBFC) is written in Java and can be used as a standalone executable or as web service. The SBFC framework currently supports conversion from SBML to [BioPAX](http://www.biopax.org) Levels&nbsp;2 and&nbsp;3, [MATLAB](https://www.mathworks.com/products/matlab.html), [Octave](https://www.gnu.org/software/octave/), [XPP](http://www.math.pitt.edu/~bard/xpp/xpp.html), [GraphViz](https://www.graphviz.org), and [APM](http://apmonitor.com)." >}}

{{< pub title="SBMLToolbox: an SBML toolbox for MATLAB users" authors="Keating, S. M., Bornstein, B. J., Finney, A., and Hucka M." source="_Bioinformatics_, 22(10):1275–1277" link="https://academic.oup.com/bioinformatics/article/22/10/1275/237481" summary="Describes [SBMLToolbox](https://github.com/sbmlteam/sbmltoolbox), a MATLAB toolbox built on top of [libSBML](/software/libsbml). It provides a set of basic functions allowing SBML models to be used in both MATLAB and [Octave](https://www.gnu.org/software/octave/)." >}}


### To Modelica

[Modelica](https://www.modelica.org) is an open standard featuring an object-oriented, declarative, multi-domain modeling language for component-oriented modeling of complex systems.

{{< pub title="SBML2Modelica: integrating biochemical models within open-standard simulation ecosystems" authors="F. Maggioli, T. Mancini and E. Tronci." source="_Bioinformatics_, btz860, 2019" link="https://doi.org/10.1093/bioinformatics/btz860" summary="SBML2Modelica is an open-source conversion tool that can generate SBML from Modelica code.  The [project code repository](https://bitbucket.org/mclab/sbml2modelica/src/master/) features a pre-compiled JAR archive, a tool for FMU generation, and an exhaustive set of test cases." >}}


### To Octave

[GNU Octave](https://www.gnu.org/software/octave/) is a high-level interpreted language, primarily intended for numerical computations.  It is drop-in compatible with many MATLAB programs.

{{< pub title="The System Biology Format Converter" authors="Gaël Jalowicki, Nicolas Rodriguez, Martina Kutmon, Jean-Baptiste Pettit, Lu Li, Arnaud Henry, Kedar Nath Natarajan, Camille Laibe, Chris T. Evelo, and Nicolas Le&nbsp;Novère." source="_Nature Precedings_, [https://doi.org/10.1038/npre.2011.6363.1](https://doi.org/10.1038/npre.2011.6363.1)" link="https://doi.org/10.1038/npre.2011.6363.1" summary="The Systems Biology Format Converter (SBFC) is written in Java and can be used as a standalone executable or as web service. The SBFC framework currently supports conversion from SBML to [BioPAX](http://www.biopax.org) Levels&nbsp;2 and&nbsp;3, [MATLAB](https://www.mathworks.com/products/matlab.html), [Octave](https://www.gnu.org/software/octave/), [XPP](http://www.math.pitt.edu/~bard/xpp/xpp.html), [GraphViz](https://www.graphviz.org), and [APM](http://apmonitor.com)." >}}

{{< pub title="SBMLToolbox: an SBML toolbox for MATLAB users" authors="Keating, S. M., Bornstein, B. J., Finney, A., and Hucka M." source="_Bioinformatics_, 22(10):1275–1277" link="https://academic.oup.com/bioinformatics/article/22/10/1275/237481" summary="Describes [SBMLToolbox](https://github.com/sbmlteam/sbmltoolbox), a MATLAB toolbox built on top of [libSBML](/software/libsbml). It provides a set of basic functions allowing SBML models to be used in both MATLAB and [Octave](https://www.gnu.org/software/octave/)." >}}


### To Python

[Python](https://www.python.org) is a popular, open-source, general-purpose programming language.  There exist many numerical computing modules for use in Python, including [SciPy](https://www.scipy.org) and [Numpy](https://numpy.org).

{{< pub title="Modelling cellular systems with PySCeS" authors="Brett G. Olivier, Johann M. Rohwer and Jan-Hendrik S. Hofmeyr." source="_Bioinformatics_, 21(4): 560–561, 2005" link="10.1093/bioinformatics/bti046" summary="PySCeS can read SBML files and generate models in a Python-based model description language. The models can be simulated using LSODA as well as analyzed in a variety of ways (e.g., Metabolic Control Analysis, structural analysis, bifurcation analysis). PySCeS can also export models in SBML format." >}}

{{< pub title="SBMLtoODEpy: A software program for converting SBML models into ODE models in Python" authors="Steve M. Ruggiero and Ashlee N. Ford Versypt" source="_Journal of Open Source Software_, 4(41), 2019" link="https://doi.org/10.21105/joss.01643" summary="SBMLtoODEpy can generate a Python object class implementing an SBML model, and a wrapper for the LSODA algorithm in SciPy and NumPy." >}}


### To SBGN-ML

[SBGN-ML](https://github.com/sbgn/sbgn/wiki/SBGN_ML) is an XML exchange format for [SBGN](https://sbgn.github.io), the Systems Biology Graphical Notation.

{{< pub title="The System Biology Format Converter" authors="Gaël Jalowicki, Nicolas Rodriguez, Martina Kutmon, Jean-Baptiste Pettit, Lu Li, Arnaud Henry, Kedar Nath Natarajan, Camille Laibe, Chris T. Evelo, and Nicolas Le&nbsp;Novère." source="_Nature Precedings_, [https://doi.org/10.1038/npre.2011.6363.1](https://doi.org/10.1038/npre.2011.6363.1)" link="https://doi.org/10.1038/npre.2011.6363.1" summary="The Systems Biology Format Converter (SBFC) is written in Java and can be used as a standalone executable or as web service. The SBFC framework currently supports conversion from SBML to [BioPAX](http://www.biopax.org) Levels&nbsp;2 and&nbsp;3, [MATLAB](https://www.mathworks.com/products/matlab.html), [Octave](https://www.gnu.org/software/octave/), [XPP](http://www.math.pitt.edu/~bard/xpp/xpp.html), [GraphViz](https://www.graphviz.org), and [APM](http://apmonitor.com)." >}}


### To SBTab

[SBtab](https://www.sbtab.net) is a set of conventions for structured data tables in spreadsheets. The conventions include, for example, defined column names and a syntax for semantic annotations.

{{< pub title="SBtab: a flexible table format for data exchange in systems biology" authors="Timo Lubitz Jens Hahn, Frank T. Bergmann, Elad Noor, Edda Klipp, and Wolfram Liebermeister" source="_BMC Bioinformatics_, 16(32), 2016" link="Sbtab2016.pdf" summary="Paper introducing the format [SBtab](https://www.sbtab.net) and software to work with it, including a [validator](https://www.sbtab.net/sbtab/default/validator.html) and an [SBML converter](https://www.sbtab.net/sbtab/default/converter.html)." >}}


### To XPP

[XPP](http://www.math.pitt.edu/~bard/xpp/xpp.html) is a tool for studying dynamical systems. Problems and procedures can be encoded in a scripting format.

{{< pub title="The System Biology Format Converter" authors="Gaël Jalowicki, Nicolas Rodriguez, Martina Kutmon, Jean-Baptiste Pettit, Lu Li, Arnaud Henry, Kedar Nath Natarajan, Camille Laibe, Chris T. Evelo, and Nicolas Le&nbsp;Novère." source="_Nature Precedings_, [https://doi.org/10.1038/npre.2011.6363.1](https://doi.org/10.1038/npre.2011.6363.1)" link="https://doi.org/10.1038/npre.2011.6363.1" summary="The Systems Biology Format Converter (SBFC) is written in Java and can be used as a standalone executable or as web service. The SBFC framework currently supports conversion from SBML to [BioPAX](http://www.biopax.org) Levels&nbsp;2 and&nbsp;3, [MATLAB](https://www.mathworks.com/products/matlab.html), [Octave](https://www.gnu.org/software/octave/), [XPP](http://www.math.pitt.edu/~bard/xpp/xpp.html), [GraphViz](https://www.graphviz.org), and [APM](http://apmonitor.com)." >}}
