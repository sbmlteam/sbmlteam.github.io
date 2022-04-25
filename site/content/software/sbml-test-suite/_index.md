+++
#=====================================================================
title  = "SBML Test Suite"
aliases = ["/Facilities/SBML_Test_Suite", "/Software/SBML_Test_Suite"]
date   = 2020-03-22
layout = "single"
icon   = "/img/sbml-test-suite-logo.svg"
#=====================================================================
+++

The SBML Test Suite is a conformance testing system for [SBML](http://sbml.org). It can be used by developers to test their software's implementation of SBML support; it can also be used by modelers to assess the correctness and completeness of SBML support in a given software system.  The collection of test cases includes both syntactic and semantic tests.

{{< software-links download="https://github.com/sbmlteam/sbml-test-suite/releases" changes="https://github.com/sbmlteam/sbml-test-suite/blob/master/NEWS.md"
docs="docs" tracker="https://github.com/sbmlteam/sbml-test-suite/issues/" repo="https://github.com/sbmlteam/sbml-test-suite" >}}


## More about the SBML Test Suite

Computational modeling has become a crucial aspect of biological research, and SBML has become the de facto standard open format for exchanging models between software tools in systems biology. However, implementing full support for SBML (especially for numerical simulations of models described by SBML) is a complex undertaking.  The goal of the SBML Test Suite is to help developers implement correct SBML support, and help users evaluate the completeness of support in a given software tool.

The SBML Test Suite consists of several parts:
* A collection of SBML models, together with expected results, that can be used to test interpretation of SBML files.  The tests are grouped into three subsets: **semantic** (for deterministic simulation behavior), **stochastic** (for stochastic simulation behavior), and **syntactic** (for basic parsing).  Each suite of test cases can be downloaded separately as [complete archives](http://github.com/sbmlteam/sbml-test-suite/releases).
* The **SBML Test Runner**, a standalone application that can be used to run an application against the collection of semantic test cases, and report successes and failures.  The image below shows an example run from the SBML Test Runner:<br><br>
<img class="center screenshot" src="example-run.png"/><br>
* An [**online database**](http://raterule.caltech.edu/Facilities/Database) of test results provided by software authors for their SBML-compatible software packages.


## SBML Test Suite release DOIs

We provide Zenodo DOIs for specific releases, so that you can cite the exact version of the software that you use:

* SBML Test Suite 3.3.0 ⇒ [10.5281/zenodo.1112521 ](https://zenodo.org/record/1112521#.WjFlb7aZMUE)


## Getting started

Please visit the [SBML Test Suite documentation pages](docs) for information about how to get started with using the test suite.


## Acknowledgments

Funding for the development of the core of the SBML Test Suite came from [National Institute of General Medical Sciences](https://www.nigms.nih.gov) grants R01&nbsp;GM070923 and R01&nbsp;GM077671 (Principal Investigator: Michael Hucka) and BBSRC grants BEP&nbsp;17042, BBS/B/16550, and BBC0082001 (Principal Investigator: Darren J. Wilkinson). Additional support for this and other projects of the SBML Team have been provided by the following organizations since the year 2000: the International Joint Research Program of NEDO (Japan); the JST ERATO-SORST Program (Japan); the Japanese Ministry of Agriculture; the Japanese Ministry of Education, Culture, Sports, Science and Technology; the BBSRC e-Science Initiative (UK); the DARPA IPTO Bio-Computation Program (USA); the Army Research Office's Institute for Collaborative Biotechnologies (USA); the Air Force Office of Scientific Research (USA); the California Institute of Technology (USA); the University of Hertfordshire (UK); the Molecular Sciences Institute (USA); the Systems Biology Institute (Japan); and the University of Keio (Japan).

The SBML Test Suite has been in development for many years, and many people have contributed in various ways large and small.  The following are the primary authors of different parts:

* *Semantic test cases*:

  Sarah M. Keating<sup>a,b</sup>, Lucian P. Smith<sup>b,c</sup>, Bruce Shapiro <sup>b</sup>, Michael Hucka<sup>b</sup>, Frank T. Bergmann<sup>d</sup>, Brett Olivier<sup>g</sup>, Andrew Finney<sup>b</sup>

* *Stochastic test cases*:

  Thomas W. Evans<sup>e</sup>, Colin S. Gillespie<sup>f</sup>, Darren J. Wilkinson<sup>f</sup>, Lucian P. Smith<sup>b,c</sup>
   
* *Syntactic test cases*:

  Sarah M. Keating<sup>a,b</sup>, Lucian P. Smith<sup>b,c</sup>

* *SBML Test Runners*:

  Frank T. Bergmann<sup>d</sup>, Michael Hucka<sup>b</sup>, Kimberly Begley

* *Online SBML Test Suite Database*:

  Frank T. Bergmann<sup>d</sup>

Additional contributions are gratefully acknowledged from Ralph Gauges<sup>h</sup>, Chris Myers<sup>i</sup>, Akira Funahashi<sup>j</sup>, Andreas Dräger<sup>k</sup>, Roland Keller<sup>k</sup>, Fedor Kolpakov<sup>l</sup>, Stanley Gu<sup>c</sup>, Matthias König<sup>m</sup>, and others in the SBML community.

Institutions:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>a</sup> EMBL-EBI, Hinxton, Cambridgeshire, UK<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>b</sup> California Institute of Technology, Pasadena, CA, US<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>c</sup> University of Washington, Seattle, WA, US<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>d</sup> University of Heidelberg, Heidelberg, DE<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>e</sup> University of Liverpool, Liverpool, UK<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>f</sup> Newcastle University, Newcastle, UK<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>g</sup> Vrije Universiteit Amsterdam<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>h</sup> Heidelberg Institute for Theoretical Studies, Heidelberg, DE<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>i</sup> University of Utah, Salt Lake City, UT, US<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>j</sup> Systems Biology Institute, Tokyo, JP<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>k</sup> University of Tuebingen, Tübingen, DE<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>l</sup> Institute of Systems Biology, Novosibirsk, RU   <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<sup>m</sup> Institute for Theoretical Biology, Humboldt Universität zu Berlin, DE
