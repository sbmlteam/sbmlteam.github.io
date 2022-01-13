+++
#=====================================================================
title      = "JSBML"
layout     = "single"
icon       = "/img/jsbml-logo.png"
icon_width = "18%"
#=====================================================================
+++

JSBML is a community-driven project to create a free, open-source (under [LGPL](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html)), pure Java™ library for reading, writing, and manipulating SBML files and data streams. It is an alternative to the mixed Java/native code-based interface provided in [libSBML](/software/libsbml).

The JSBML project's aim is to provide an SBML parser and library that maps all SBML elements to a flexible and extended type hierarchy. Where possible, JSBML strives to attain 100% API compatibility with the [libSBML](/software/libsbml) Java API, to facilitate a switch from one library to the other. Currently, JSBML supports all constructs for SBML up to the latest Level 3 Version 2 Release 2 specification, including an API to add support for SBML Level 3 packages. JSBML reimplements even complex functions of libSBML such as consistency-checking and SBML validation. In addition, validation can also be accessed via web services.

{{< software-links download="https://github.com/sbmlteam/jsbml/releases" changes="https://github.com/sbmlteam/jsbml/blob/jsbml-1.5/NEWS.md" tracker="https://github.com/sbmlteam/jsbml/issues/" docs="jsbml-docs" repo="https://github.com/sbmlteam/jsbml" forum="https://groups.google.com/forum/#!forum/jsbml-development">}}


## Please cite the papers if you use JSBML

Article citations are crucial to our ability to justify continued development of JSBML, as well as our academic careers. If you use JSBML, we ask that you **please cite one of the following papers**:

{{< reference highlight="true" title="JSBML 1.0: providing a smorgasbord of options to encode systems biology models" authors="Nicolas Rodriguez, Alex Thomas, Leandro Watanabe, Ibrahim Y. Vazirabad, Victor Kofia, Harold F. Gómez, Florian Mittag, Jakob Matthes, Jan Rudolph, Finja Wrzodek, Eugen Netz, Alexander Diamantikos, Johannes Eichner, Roland Keller, Clemens Wrzodek, Sebastian Fröhlich, Nathan E. Lewis, Chris J. Myers, Nicolas Le Novère, Bernhard Ø. Palsson, Michael Hucka, and Andreas Dräger." pub="_Bioinformatics_, 31(20): 3383–3386, 2015" link="https://doi.org/10.1093/bioinformatics/btv341" bibtex="jsbml2015.bib" endnote="jsbml2015.ris" >}}

{{< reference highlight="true" title="JSBML: a flexible Java library for working with SBML" authors="Andreas Dräger, Nicholas Rodriguez, Marine Dumousseau, Alexander Dörr, Clemens Wrzodek, Nicholas Le Novère, Andreas Zell, and Michael Hucka." pub="_Bioinformatics_, 27(15):2167–2168, 2011" link="https://doi.org/10.1093/bioinformatics/btr361" bibtex="jsbml2011.bib" endnote="jsbml2011.ris" >}}


## Software releases

We provide Zenodo DOIs for specific releases, so that you can cite the exact version of the software that you use:

* JSBML release 1.6.1 &rArr; [10.5281/zenodo.5833365](https://doi.org/10.5281/zenodo.5833365)
* JSBML release 1.6   &rArr; [10.5281/zenodo.5789493](https://doi.org/10.5281/zenodo.5789493)
* JSBML release 1.5   &rArr; [10.5281/zenodo.3751775](https://doi.org/10.5281/zenodo.3751775)
* JSBML release 1.4   &rArr; [10.5281/zenodo.1346189](https://doi.org/10.5281/zenodo.1346189)
* JSBML release 1.3.1 &rArr; [10.5281/zenodo.1118387](https://doi.org/10.5281/zenodo.1118387)
* JSBML release 1.2   &rArr; [10.5281/zenodo.200544](http://doi.org/10.5281/zenodo.200544)
* JSBML release 1.1   &rArr; [10.5281/zenodo.55323](http://dx.doi.org/10.5281/zenodo.55323)
* JSBML release 1.0   &rArr; [10.5281/zenodo.55635](http://dx.doi.org/10.5281/zenodo.55635)
* JSBML release 0.8   &rArr; [10.5281/zenodo.55636](http://dx.doi.org/10.5281/zenodo.55636)

## License

JSBML is licensed under the [LGPL v. 2.1](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html) and Copyright (C) 2009-2022 jointly by the following organizations:

1. The University of Tuebingen, Germany
2. EMBL European Bioinformatics Institute (EMBL-EBI), Hinxton, UK
3. The California Institute of Technology, Pasadena, CA, USA
4. The University of California, San Diego, La Jolla, CA, USA
5. The Babraham Institute, Cambridge, UK

JSBML also uses third-party software libraries; these software libraries have their own copyright statements and distribution terms.  Please see the files [COPYING.txt](https://github.com/sbmlteam/jsbml/blob/master/COPYING.txt) and [LICENSE](https://github.com/sbmlteam/jsbml/blob/master/LICENSE) in the JSBML software distributions for more information.


## Community and help

There is a mailing list and web forum, [jsbml-development@googlegroups.com](https://groups.google.com/forum/#!forum/jsbml-development), devoted to discussions about JSBML.  If you're using JSBML or interested in learning more, feel free to join the group!  You can also reach the main developers directly via email at [jsbml-team@googlegroups.com](jsbml-team@googlegroups.com).

The separate [documentation](jsbml-docs) pages for JSBML include sections aimed at developers.


## JSBML contributors

JSBML is the result of hard work by many people, including numerous (Ph.D.) students. We thank the following contributors especially (in alphabetical order):

### Developers

Meike Aichele<span style="font-size: 5pt"> </span><sup>1</sup>,
[Piero Dalle Pezze](https://uk.linkedin.com/in/pdallepezze)<span style="font-size: 5pt"> </span><sup>2</sup>
Alexander Diamantikos<span style="font-size: 5pt"> </span><sup>1</sup>,
[Alexander D&ouml;rr](http://www.cogsys.cs.uni-tuebingen.de/mitarb/doerr/)<span style="font-size: 5pt"> </span><sup>1</sup>,
[Andreas Dr&auml;ger](https://uni-tuebingen.de/en/134053)<span style="font-size: 5pt"> </span><sup>1</sup>,
[Marine Dumousseau](http://www.ebi.ac.uk/about/people/marine-dumousseau/)<span style="font-size: 5pt"> </span><sup>2</sup>,
[Johannes Eichner](http://www.cogsys.cs.uni-tuebingen.de/mitarb/eichner/)<span style="font-size: 5pt"> </span><sup>1</sup>,
Lisa Falk,
[Sebastian Fr&ouml;hlich](https://www.linkedin.com/in/sebastian-fröhlich-74b34b92/)<span style="font-size: 5pt"> </span><sup>4</sup>,
[Harold F. G&oacute;mez](http://www.bu.edu/computationalimmunology/people/harold-gomez/)<span style="font-size: 5pt"> </span><sup>5</sup>
[Thomas M. Hamm](https://uni-tuebingen.de/en/134068)<span style="font-size: 5pt"> </span><sup>1</sup>
[Michael Hucka](http://www.cds.caltech.edu/~mhucka/)<span style="font-size: 5pt"> </span><sup>6</sup>,
[Roland Keller](http://www.cogsys.cs.uni-tuebingen.de/mitarb/keller/)<span style="font-size: 5pt"> </span><sup>1</sup>,
[Victor Kofia](http://kofiav.blogspot.ca)<span style="font-size: 5pt"> </span><sup>7</sup>,
Jakob Matthes<span style="font-size: 5pt"> </span><sup>1</sup>,
[Florian Mittag](http://www.cogsys.cs.uni-tuebingen.de/mitarb/mittag/)<span style="font-size: 5pt"> </span><sup>1,2</sup>,
Sarah Rachel M&uuml;ller vom Hagen<span style="font-size: 5pt"> </span><sup>1</sup>,
Sebastian Nagel<span style="font-size: 5pt"> </span><sup>1</sup>,
Eugen Netz<span style="font-size: 5pt"> </span><sup>1</sup>,
[Tramy Nguyen](https://tramyn.github.io)<span style="font-size: 5pt"> </span><sup>8</sup>,
Alexander Peltzer<span style="font-size: 5pt"> </span><sup>1</sup>,
[Nicolas Rodriguez](https://uk.linkedin.com/in/nicolas-rodriguez-b1640a5)<span style="font-size: 5pt"> </span><sup>2,9</sup>,
Jan Rudolph<span style="font-size: 5pt"> </span><sup>1</sup>,
[Mahdi Sadeghi](https://uni-tuebingen.de/en/153135)<span style="font-size: 5pt"> </span><sup>1</sup>,
Simon Sch&auml;fer<span style="font-size: 5pt"> </span><sup>1</sup>,
[Alex Thomas](http://sbrg.ucsd.edu/researchers/thomas/)<span style="font-size: 5pt"> </span><sup>3</sup>,
[Thorsten Tiede](https://github.com/thortiede)<span style="font-size: 5pt"> </span><sup>1</sup>,
[Ibrahim Y. Vazirabad](http://jsbmlcelldesigner2014.blogspot.com)<span style="font-size: 5pt"> </span><sup>10</sup>,
[Leandro Watanabe](http://lhwatanabe.blogspot.com)<span style="font-size: 5pt"> </span><sup>8</sup>,
[Clemens Wrzodek](http://www.cogsys.cs.uni-tuebingen.de/mitarb/wrzodek/)<span style="font-size: 5pt"> </span><sup>1</sup>,
[Finja Wrzodek](http://www.cogsys.cs.uni-tuebingen.de/mitarb/buechel)<span style="font-size: 5pt"> </span><sup>1,2</sup>
[Thomas J. Zajac](https://github.com/mephenor/)<span style="font-size: 5pt"> </span><sup>1</sup>.


### JSBML principal investigators

[Michael Hucka](http://www.cds.caltech.edu/~mhucka/)<span style="font-size: 5pt"> </span><sup>5</sup>, [Nicolas Le Nov&egrave;re](https://scholar.google.com/citations?user=8zY7k_cAAAAJ)<span style="font-size: 5pt"> </span><sup>2,7</sup>, [Akira Funahashi](http://fun.bio.keio.ac.jp)<span style="font-size: 5pt"> </span><sup>11</sup>, [Chris J. Myers](https://async.ece.utah.edu/Myers/)<span style="font-size: 5pt"> </span><sup>10</sup>, [Nathan E. Lewis](http://lewislab.ucsd.edu/n/)<span style="font-size: 5pt"> </span><sup>2</sup>, [Bernhard &Oslash;. Palsson](https://sbrg.ucsd.edu/researchers/palsson/)<span style="font-size: 5pt"> </span><sup>2</sup>, [Andreas Zell](https://uni-tuebingen.de/en/138703)<span style="font-size: 5pt"> </span><sup>1</sup>.


### Institutes

<sup>1</sup> Institute for Bioinformatics and Medical Informatics T&uuml;bingen (IBMI), University of T&uuml;bingen, T&uuml;bingen, Germany,<br/>
<sup>2</sup> European Bioinformatics Institute (EBI), Hinxton, UK,<br/>
<sup>3</sup> University of California, San Diego, La Jolla, CA, USA<br/>
<sup>4</sup> Leibniz Institute of Plant Genetics and Crop Plant Research (IPK), Gatersleben, Germany<br/>
<sup>5</sup> Boston University, Boston, MA, USA<br/>
<sup>6</sup> The California Institute of Technology, Pasadena, CA, USA<br/>
<sup>7</sup> The University of Toronto, Toronto, ON, Canada<br/>
<sup>8</sup> The University of Utah, Salt Lake City, UT, USA<br/>
<sup>9</sup> Babraham Institute, Babraham Research Campus, Cambridge, UK<br/>
<sup>10</sup> Marquette University, Milwaukee, WI, USA<br/>
<sup>11</sup> Keio University, Hiyoshi, Kohoku-ku, Yokohama, Kanagawa, Japan<br/>


## Funding acknowledgments

Currently, the main developers come from the [Babraham Institute](https://www.babraham.ac.uk) and the [University of T&uuml;bingen, Germany](https://uni-tuebingen.de/en/127116).

The development of JSBML is funded in part by a grant from the [National Institute of General Medical Sciences](http://www.nigms.nih.gov) (NIGMS, USA, award number GM070923), as well as by funds from the [Babraham Institute](https://www.babraham.ac.uk) (UK), a Marie-Curie [International Outgoing Fellowship (IOF)](https://ec.europa.eu/research/mariecurieactions/about-mca/actions/iof/) within the European Commision's 7<sup>th</sup> Framework Programme for Research and Technological Development (project [AMBiCon](https://uni-tuebingen.de/en/134083) grant number 332020). [Google](https://www.google.com) has also supported this work as part of the [Google Summer of Code](https://summerofcode.withgoogle.com) program.

Further support comes from the [Federal Ministry of Education and Research (BMBF, Germany)](https://www.bmbf.de/bmbf/en/) in the [Virtual Liver Network](http://www.virtual-liver.de) and the MedSys project [Spher4Sys](http://www.cogsys.cs.uni-tuebingen.de/forschung/terminiert/spher4sys/) as well as the [University of T&uuml;bingen](https://uni-tuebingen.de/en/) (Germany).
