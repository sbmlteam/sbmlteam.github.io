+++
#=====================================================================
title      = "JSBML"
layout     = "single"
icon       = "/img/jsbml-logo.png"
icon_width = "15%"
#=====================================================================
+++

JSBML is a community-driven project to create a free, open-source, pure Java library for reading, writing, and manipulating SBML files and data streams. It is an alternative to the mixed Java/native code-based interface provided in [libSBML](/software/libsbml).

The JSBML project's aim is to provide an SBML parser and library that maps all SBML elements to a flexible and extended type hierarchy. Where possible, JSBML strives to attain 100% API compatibility with the [libSBML](/software/libsbml) Java API, to facilitate a switch from one library to the other. Currently, JSBML supports all constructs for SBML up to the latest Level 3 Version 1 Release 1 specification, including an API to add support for SBML Level 3 packages. JSBML does not currently reimplement some of the more complex functions of libSBML such as consistency-checking and SBML validation; instead, these can be accessed via web services.

{{< software-links download="https://github.com/sbmlteam/jsbml/releases" changes="https://github.com/sbmlteam/jsbml/blob/jsbml-1.4/NEWS.md" tracker="https://github.com/sbmlteam/jsbml/issues/" docs="jsbml-docs" repo="https://github.com/sbmlteam/jsbml" forum="https://groups.google.com/forum/#!forum/jsbml-development">}}


## Please cite the papers if you use JSBML

Article citations are crucial to our ability to justify continued development of JSBML, as well as our academic careers. If you use JSBML, we ask that you **please cite one of the following papers**:

{{< reference highlight="true" title="JSBML 1.0: providing a smorgasbord of options to encode systems biology models" authors="Nicolas Rodriguez, Alex Thomas, Leandro Watanabe, Ibrahim Y. Vazirabad, Victor Kofia, Harold F. Gómez, Florian Mittag, Jakob Matthes, Jan Rudolph, Finja Wrzodek, Eugen Netz, Alexander Diamantikos, Johannes Eichner, Roland Keller, Clemens Wrzodek, Sebastian Fröhlich, Nathan E. Lewis, Chris J. Myers, Nicolas Le Novère, Bernhard Ø. Palsson, Michael Hucka, and Andreas Dräger." pub="_Bioinformatics_, 31(20): 3383–3386, 2015" link="https://doi.org/10.1093/bioinformatics/btv341" bibtex="jsbml2015.bib" endnote="jsbml2015.ris" >}}

{{< reference highlight="true" title="JSBML: a flexible Java library for working with SBML" authors="Andreas Dräger, Nicholas Rodriguez, Marine Dumousseau, Alexander Dörr, Clemens Wrzodek, Nicholas Le Novère, Andreas Zell, and Michael Hucka." pub="_Bioinformatics_, 27(15):2167–2168, 2011" link="https://doi.org/10.1093/bioinformatics/btr361" bibtex="jsbml2011.bib" endnote="jsbml2011.ris" >}}


## Software releases

We provide Zenodo DOIs for specific releases, so that you can cite the exact version of the software that you use:

* JSBML release 1.4   &rArr; [10.5281/zenodo.1346189](https://doi.org/10.5281/zenodo.1346189)
* JSBML release 1.3.1 &rArr; [10.5281/zenodo.1118387](https://doi.org/10.5281/zenodo.1118387)
* JSBML release 1.2   &rArr; [10.5281/zenodo.200544](http://doi.org/10.5281/zenodo.200544)
* JSBML release 1.1   &rArr; [10.5281/zenodo.55323](http://dx.doi.org/10.5281/zenodo.55323)
* JSBML release 1.0   &rArr; [10.5281/zenodo.55635](http://dx.doi.org/10.5281/zenodo.55635)
* JSBML release 0.8   &rArr; [10.5281/zenodo.55636](http://dx.doi.org/10.5281/zenodo.55636)

## Community and help

There is a mailing list and web forum, [jsbml-development@googlegroups.com](https://groups.google.com/forum/#!forum/jsbml-development), devoted to discussions about JSBML.  If you're using JSBML or interested in learning more, feel free to join the group!

You can also reach the main developers directly via email at [jsbml-team@googlegroups.com](jsbml-team@googlegroups.com).

## JSBML contributors

JSBML is the result of hard work by many people, including numerous (Ph.D.) students. We thank the following contributors especially (in alphabetical order):

### Developers

Meike Aichele<span style="font-size: 5pt"> </span><sup>1</sup>,
[Piero Dalle Pezze](https://uk.linkedin.com/in/pdallepezze)<span style="font-size: 5pt"> </span><sup>2</sup>
Alexander Diamantikos<span style="font-size: 5pt"> </span><sup>1</sup>,
[Alexander D&ouml;rr](http://www.cogsys.cs.uni-tuebingen.de/mitarb/doerr/)<span style="font-size: 5pt"> </span><sup>1</sup>,
[Andreas Dr&auml;ger](http://sbrg.ucsd.edu/researchers/draeger/)<span style="font-size: 5pt"> </span><sup>1</sup>,
[Marine Dumousseau](http://www.ebi.ac.uk/about/people/marine-dumousseau/)<span style="font-size: 5pt"> </span><sup>2</sup>,
[Johannes Eichner](http://www.cogsys.cs.uni-tuebingen.de/mitarb/eichner/)<span style="font-size: 5pt"> </span><sup>1</sup>,
Lisa Falk,
Sebastian Fr&ouml;hlich<span style="font-size: 5pt"> </span><sup>4</sup>,
[Harold F. G&oacute;mez](http://www.bu.edu/computationalimmunology/people/harold-gomez/)<span style="font-size: 5pt"> </span><sup>5</sup>
[Thomas M. Hamm](https://abi.inf.uni-tuebingen.de/People/hamm/)<span style="font-size: 5pt"> </span><sup>1</sup>
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
[Nicolas Rodriguez](http://lenoverelab.org/members/Nicolas_Rodriguez/)<span style="font-size: 5pt"> </span><sup>2,9</sup>,
Jan Rudolph<span style="font-size: 5pt"> </span><sup>1</sup>,
Simon Sch&auml;fer<span style="font-size: 5pt"> </span><sup>1</sup>,
[Alex Thomas](http://sbrg.ucsd.edu/researchers/thomas/)<span style="font-size: 5pt"> </span><sup>3</sup>,
[Ibrahim Y. Vazirabad](http://jsbmlcelldesigner2014.blogspot.com)<span style="font-size: 5pt"> </span><sup>10</sup>,
[Leandro Watanabe](http://lhwatanabe.blogspot.com)<span style="font-size: 5pt"> </span><sup>8</sup>,
[Clemens Wrzodek](http://www.cogsys.cs.uni-tuebingen.de/mitarb/wrzodek/)<span style="font-size: 5pt"> </span><sup>1</sup>,
[Finja Wrzodek](http://www.cogsys.cs.uni-tuebingen.de/mitarb/buechel)<span style="font-size: 5pt"> </span><sup>1,2</sup>
[Thomas J. Zajac](https://github.com/mephenor/)<span style="font-size: 5pt"> </span><sup>1</sup>.


### JSBML principal investigators

[Michael Hucka](http://www.cds.caltech.edu/~mhucka/)<span style="font-size: 5pt"> </span><sup>5</sup>, [Nicolas Le Nov&egrave;re](http://lenoverelab.org/perso/lenov/)<span style="font-size: 5pt"> </span><sup>2,7</sup>, [Akira Funahashi](http://fun.bio.keio.ac.jp)<span style="font-size: 5pt"> </span><sup>11</sup>, [Chris J. Myers](http://www.async.ece.utah.edu/)<span style="font-size: 5pt"> </span><sup>10</sup>, [Nathan E. Lewis](http://sbrg.ucsd.edu/researchers/lewis/)<span style="font-size: 5pt"> </span><sup>2</sup>, [Bernhard &Oslash;. Palsson](http://sbrg.ucsd.edu/researchers/palsson/)<span style="font-size: 5pt"> </span><sup>2</sup>, [Andreas Zell](http://www.cogsys.cs.uni-tuebingen.de/mitarb/zell/)<span style="font-size: 5pt"> </span><sup>1</sup>.


### Institutes

<sup>1</sup> Center for Bioinformatics Tuebingen (ZBIT), University of Tuebingen, Tübingen, Germany,<br/>
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

Currently, the main developers come from the [Babraham Institute](http://www.babraham.ac.uk) and the [University of Tuebingen, Germany](http://draeger-lab.org).

The development of JSBML is funded in part by a grant from the [National Institute of General Medical Sciences](http://www.nigms.nih.gov) (NIGMS, USA, award number GM070923), as well as by funds from the [Babraham Institute](http://www.babraham.ac.uk) (UK), a Marie-Curie [International Outgoing Fellowship (IOF)](http://ec.europa.eu/research/mariecurieactions/about-mca/actions/iof/) within the European Commision's 7<sup>th</sup> Framework Programme  for Research and Technological Development (project [AMBiCon](http://systemsbiology.ucsd.edu/projects/AMBiCon) grant number 332020). [Google](http://www.google.com) has also supported this work as part of the [Google Summer of Code](https://summerofcode.withgoogle.com) program.

Further support comes from the [Federal Ministry of Education and Research (BMBF, Germany)](http://www.bmbf.de/en/) in the [Virtual Liver Network](http://www.virtual-liver.de) and the MedSys project [Spher4Sys](http://www.cogsys.cs.uni-tuebingen.de/forschung/terminiert/spher4sys/) as well as the [University of T&uuml;bingen](http://www.uni-tuebingen.de/) (Germany).
