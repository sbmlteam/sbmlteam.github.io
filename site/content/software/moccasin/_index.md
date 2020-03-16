--- # -*- mode: markdown -*-
#=====================================================================
active: true
title: "MOCCASIN"
date: 2020-03-12
layout: "single"
#=====================================================================
---

{{< software-icon file="/img/moccasin.svg" >}}

_MOCCASIN_ stands for _Model ODE Converter for Creating Automated SBML INteroperability_.  It can read certain forms of <nobr>ODE-based</nobr> models written in [MATLAB](https://www.mathworks.com/products/matlab.html) and translate them into SBML format. It is written in [Python](https://www.python.org) by [Sarah M. Keating](https://github.com/skeating),  [Harold F. Gómez](https://bsse.ethz.ch/cobi/group/people/person-detail.MjExMzQw.TGlzdC8yMjA0LC0xMDM3ODQxNDk3.html) and [Mike Hucka](http://www.cds.caltech.edu/~mhucka/), and made available under [LGPL](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html) terms. It does not use or need [MATLAB](https://www.mathworks.com/products/matlab.html) itself.  It offers both a GUI and a command-line interface.

{{< software-links download="https://github.com/sbmlteam/moccasin/releases" changes="https://github.com/sbmlteam/moccasin/blob/master/NEWS.md" tracker="https://github.com/sbmlteam/moccasin/issues" forum="https://groups.google.com/forum/#!forum/moccasin-dev" repo="https://github.com/sbmlteam/moccasin" >}}


## Please cite the paper if you use MOCCASIN

Citations are crucial to our ability to justify continued development of MOCCASIN, as well as our academic careers. If you use MOCCASIN and you publish papers about your software, we ask that you please cite the [paper](http://bioinformatics.oxfordjournals.org/content/32/12/1905):

{{% notice %}}
Harold F. Gómez, Michael Hucka, Sarah M. Keating, German Nudelman, Dagmar Iber and Stuart C. Sealfon. MOCCASIN: converting MATLAB ODE models to SBML. _Bioinformatics_ (2016), 32(12): 1905-1906. (Freely available [directly from Bioinformatics](http://bioinformatics.oxfordjournals.org/content/32/12/1905).)
{{% /notice %}}


## DOIs for MOCCASIN releases

We provide Zenodo DOIs for specific releases, so that you can cite the exact version of the software that you use:

* MOCCASIN release 1.1.0 ⇒ [10.5281/zenodo.56374](https://zenodo.org/record/56374)


## More about MOCCASIN

MOCCASIN's goal is to to use a combination of heuristics and user assistance to help researchers export models written as ordinary MATLAB and Octave scripts. It uses an algorithm developed by Fages, Gay and Soliman described in the paper titled [Inferring reaction systems from ordinary differential equations](http://www.sciencedirect.com/science/article/pii/S0304397514006197). A free technical report explaining the algorithm is [available from INRIA](https://hal.inria.fr/hal-01103692).

To parse MATLAB and produce input to the reaction-inference algorithm, MOCCASIN uses a custom MATLAB parser written using [PyParsing](https://github.com/pyparsing/pyparsing), combined with heuristics and a variety of post-processing operations to interpret the MATLAB contents.

Currently, MOCCASIN is limited to MATLAB inputs in which a model is contained in a single file. The file must set up a system of differential equations as a function defined in the file, and make a call to one of the MATLAB odeNN family of solvers (e.g., ode45, ode15s, etc.). While this may seem limiting, it is in fact a common form of MATLAB models used in systems biology.


## Current and future work

MOCCASIN can be significantly improved, in particular in its ability to translate more MATLAB constructs. We welcome your help! If you are interested, please get in touch with the developers so that we can coordinate better.


## Funding acknowledgements

This work is made possible thanks in part to funding from the Icahn School of Medicine at Mount Sinai, provided as part of the NIH-funded project Modeling Immunity for Biodefense (contract number HHSN266200500021C, principal Investigator: Stuart Sealfon), and in part to funding from the School of Medicine at Boston University, provided as part of the NIH-funded project Modeling Immunity for Biodefense (contract number HHSN272201000053C, principal Investigators: Thomas B. Kepler and Garnett H. Kelsoe).

We also acknowledge the contributions made by Dr. Dagmar Iber from the Department of Biosystems Science and Engineering (D-BSSE), and Dr. Bernd Rinn from the Scientific IT Services (SIS) division from ETH Zurich.
