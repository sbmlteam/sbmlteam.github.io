+++
#=====================================================================
title  = "Essential publications about SBML"
date   = 2019-04-06
layout = "single"
#=====================================================================
+++

{{< insert-toc >}}

This page lists published papers and chapters describing SBML, SBML packages, and core SBML-supporting software such as API libraries.  Information about associated standards are not included here; please see the [COMBINE website](http://co.mbine.org) and [FAIRsharing](https://fairsharing.org) for information about related standards.


## About SBML and SBML packages

The papers and chapters in this section describe SBML and SBML packages in general terms.  It is worth noting that _none of these publications is normative in the sense of defining SBML_ &ndash; these papers and chapters only provide context and perspectives about SBML and its development.  (Only the [SBML specification documents](/documents/specifications) are normative.)

{{< cite title="Specifications of Standards in Systems and Synthetic Biology: Status and Developments in 2019" authors="Falk Schreiber, Björn Sommer, Gary D. Bader, Padraig Gleeson, Martin Golebiewski, Michael Hucka, Sarah M. Keating, Matthias König, Chris Myers, David Nickerson and Dagmar Waltemath." source="_Journal of Integrative Bioinformatics_ 16(2), 2019" link="https://doi.org/10.1515/jib-2019-0035" summary="Introduces a special issue of [COMBINE](https://co.mbine.org) standards, including SBML." >}}

{{< cite title="Specifications of Standards in Systems and Synthetic Biology: Status and Developments in 2017" authors="Falk Schreiber, Gary D. Bader, Padraig Gleeson, Martin Golebiewski, Michael Hucka, Sarah M. Keating, Nicolas Le Novère, Chris Myers, David Nickerson, Björn Sommer and Dagmar Waltemath." source="_Journal of Integrative Bioinformatics_ 15:1, 2018" link="https://doi.org/10.1515/jib-2018-0013" summary="Introduces a special issue of [COMBINE](https://co.mbine.org) standards, including SBML." >}}

{{< cite title="Specifications of Standards in Systems and Synthetic Biology: Status and Developments in 2016" authors="Falk Schreiber, Gary D. Bader, Padraig Gleeson, Martin Golebiewski, Michael Hucka, Nicolas Le Novère, Chris Myers, David Nickerson, Björn Sommer and Dagmar Waltemath." source="_Journal of Integrative Bioinformatics_ 13:3, 2017" link="https://doi.org/10.1515/jib-2016-289" summary="Introduces a special issue of [COMBINE](https://co.mbine.org) standards, including SBML." >}}

{{< cite title="Specifications of Standards in Systems and Synthetic Biology: Status and Developments" authors="Falk Schreiber, Gary D. Bader, Martin Golebiewski, Michael Hucka, Benjamin Kormeier, Nicolas Le Novère, Chris Myers, David Nickerson, Björn Sommer, Dagmar Waltemath and Stephan Weise." source="_Journal of Integrative Bioinformatics_ 12:2, 2016" link="https://doi.org/10.1515/jib-2015-258" summary="Introduces a special issue of [COMBINE](https://co.mbine.org) standards, including SBML." >}}

{{< cite title="SBML Qualitative Models: a model representation format and infrastructure to foster interactions between qualitative modelling formalisms and tools" authors="Chaouiya, C., Berenguier, D., Keating, S.&nbsp;M., Naldi, A., van Iersel, M. P., Rodriguez, N., Dräger, A., Büchel, F., Cokelaer, T., Kowal, B., Wicks, B., Gonçalves, E., Dorier, J., Page, M., Monteiro, P.&nbsp;T., von Kamp, A., Xenarios, I., de Jong, H., Hucka, M., Klamt, S., Thieffry, D., Le Novère, N., Saez-Rodriguez, J., and Helikar, T." source="_BMC Systems Biology_ 7:135, 2013" link="https://bmcsystbiol.biomedcentral.com/articles/10.1186/1752-0509-7-135" summary="Describes SBML 'qual', a format for storing qualitative models such as logical model or some Petri Net models." >}}

{{< cite title="Supporting SBML as a Model Exchange Format in Software Applications" authors="Keating, S.&nbsp;M., and Le Novère, N." source="Chapter in [In Silico Systems Biology &ndash; Methods in Molecular Biology](http://dx.doi.org/10.1007/978-1-62703-450-0_11), vol.&nbsp;1021, pp.&nbsp;201-225, Springer, 2013" link="Keating2013.pdf" summary="This chapter describes SBML from its origins, the rationale behind and importance of having a common language to represent models, the development of SBML and outlines the structure of an SBML model. It provides a section on libSBML and a description of the SBML Toolbox." >}}

{{< cite title="Software Infrastructure for Effective Communication and Reuse of Computational Models" authors="Finney, A., Hucka, M., Bornstein, B.&nbsp;J., Keating, S.&nbsp;M., Shapiro, B.&nbsp;M., Matthews, J., Kovitz, B.&nbsp;K., Schilstra, M.&nbsp;J., Funahashi, A., Doyle, J.&nbsp;C, and Kitano, H." source="Chapter in [System Modeling in Cell Biology: From Concepts to Nuts and Bolts](http://mitpress.mit.edu/catalog/item/default.asp?ttype=2&tid=10923), eds. Zoltan Szallasi, Jörg Stelling, and Vipul Periwal, MIT Press, 2006</em>" link="Hucka_2006.pdf" summary="This chapter overviews the SBML project and its general goals, and some of the motivations for approaches taken in the development of libSBML. (Note: this is a portion of the chapter; we highly recommend getting the whole book rather than only using this excerpt.)" >}}

{{< cite title="A model diagram layout extension for SBML" authors="Gauges, R., Rost, U., Sahle, S. and Wegner, K." source="_Bioinformatics_ 22(15):1879–1885, 2006" link="https://academic.oup.com/bioinformatics/article/22/15/1879/242661" summary="A paper describing a proposed format for storing diagrammatic representations of models directly in an SBML model file or data stream. In SBML Level 2, applications can use it by storing the data in SBML `<annotation>` elements, and for Level 3, it is expected to be turned into a full package, with the same constructs appearing at the top level instead of inside `<annotation>` elements." >}}

{{< cite title="Escalating model sizes and complexities call for standardized forms of representation" authors="Hucka, M., and Finney, A." source="_Molecular Systems Biology_, doi:10.1038/msb4100015, 2005" link="http://msb.embopress.org/content/1/1/2005.0011" summary="Comment paper about the increasingly larger and more complex models being developed by researchers, and the need to standardize representations at different levels for effective communication and sharing of those models." >}}

{{< cite title="Developing SBML beyond level 2: proposals for development" authors="Finney, A." source="Chapter in [Lecture Notes in Computer Science](http://www.springer.com/computer/mathematics/book/978-3-540-25375-4), Vol. 3082, eds. Vincent Danos and Vincent Schachter, Springer-Verlag, 2005" link="Finney_2005.pdf" summary="This conference paper was presented by Andrew Finney at the Computational Methods in Systems Biology 2004 conference held in Paris, May 2004. It discusses early efforts to develop SBML Level 3." >}}

  {{< cite title="Evolving a lingua franca and associated software infrastructure for computational systems biology: the Systems Biology Markup Language (SBML) project" authors="Hucka, M., Finney, A., Bornstein, B. J., Keating, S. M., Shapiro, B.&nbsp;E., Matthews, J., Kovitz, B.&nbsp;L., Schilstra, M.&nbsp;J., Funahashi, A, Doyle, J.&nbsp;C., and Kitano, H." source="_IEE Systems Biology_, 1(1):41–53, 2004" link="Hucka_2004.pdf" summary="This paper summarizes SBML and the characteristics of SBML-compatible software tools as of early 2004. The article includes a matrix of capabilities that was the inspiration for the SBML Software Matrix now used on this site to summarizes known SBML-compatible software tools." >}}

{{< cite title="Systems Biology Markup Language: Level 2 and Beyond" authors="Finney, A. M., and Hucka, M." source="_Biochemical Society Transactions_, 32:1472–1473, 2003 " link="Finney_2003.pdf" summary="Short paper from a conference in which Andrew Finney described the initial plans for SBML Level 2." >}}

{{< cite title="The Systems Biology Markup Language (SBML): A Medium for Representation and Exchange of Biochemical Network Models" authors="Hucka, Michael, Finney, Andrew, Sauro, Herbert M., Bolouri, Hamid, Doyle, John C., Kitano, Hiroaki, Arkin, Adam P., Bornstein, Benjamin J., Bray, Dennis, Cornish-Bowden, Athel, Cuellar, Autumn A., Dronov, Sergey, Gilles, Ernst Dieter, Ginkel, Martin, Gor, Victoria, Goryanin, Igor I., Hedley, Warren J., Hodgman, T. Charles, Hofmeyr, Jan-Hendrik S., Hunter, Peter J., Juty, Nick S., Kasberger, Jay L., Kremling, Andreas, Kummer, Ursula, Le Novère, Nicolas, Loew, Leslie M., Lucio, Daniel, Mendes, Pedro, Minch, Eric, Mjolsness, Eric D., Nakayama, Yoichi, Nelson, Melanie R., Nielsen, Poul F., Sakurada, Takeshi, Schaff, James C., Shapiro, Bruce E., Shimizu, Thomas S., Spence, Hugh D., Stelling, Jörg, Takahashi, Kouichi, Tomita, Masaru, Wagner, John M., Wang, Jian, and the rest of the SBML Forum." source="_Bioinformatics_, 9(4):524–531, 2003" link="https://academic.oup.com/bioinformatics/article/19/4/524/218599" summary="Original publication about SBML. It describes SBML Level&nbsp;1 Version&nbsp;2." >}}


## SBML specification documents

Many of the SBML specification documents do not have journal publications associated with them.  The following are the publications that do exist for the specifications that do have proper publications.

{{< cite title="The Systems Biology Markup Language (SBML): Language Specification for Level 3 Version 2 Core Release 2" authors="Hucka, M., Bergmann, F. T., Chaouiya, C., Dräger, A., Hoops, S., Keating, S. M., König, M., Novère, N., Myers, C. J., Olivier, B. G., Sahle, S., Schaff, J. C., Sheriff, R., Smith, L. P., Waltemath, D., Wilkinson, D. J., and Zhang, F." source="_Journal of Integrative Bioinformatics_, 16(2), 20190021, 2019" link="https://doi.org/10.1515/jib-2019-0021" >}}

{{< cite title="The Systems Biology Markup Language (SBML): Language Specification for Level 3 Version 1 Core" authors="Hucka, M., Bergmann, F. T., Dräger, A., Hoops, S., Keating, S. M., Le Novère, N., Myers, C. J., Olivier, B. G., Sahle, S., Schaff, J. C., Smith, L. P., Waltemath, D., & Wilkinson, D. J." source="_Journal of Integrative Bioinformatics_, 15(1), 20170080, 2017" link="https://doi.org/10.1515/jib-2017-0080" >}}

{{< cite title="SBML Level 3 package: Multistate, Multicomponent and Multicompartment Species, Version 1, Release 1" authors="Zhang, F. and Meier-Schellersheim, M." source="_Journal of Integrative Bioinformatics_, 15(1), 20170077, 2017" link="https://doi.org/10.1515/jib-2017-0077" >}}

{{< cite title="SBML Level 3 package: Render, Version 1, Release 1" authors="Bergmann, F. T., Keating, S. M., Gauges, R., Sahle, S., and Wengler, K." source="_Journal of Integrative Bioinformatics_, 15(1), 20170078, 2017" link="https://doi.org/10.1515/jib-2017-0078" >}}

{{< cite title="SBML Level 3 Package: Flux Balance Constraints version 2" authors="Olivier, B. G. and Bergmann, F. T." source="_Journal of Integrative Bioinformatics_, 15(1), 20170082, 2017" link="https://doi.org/10.1515/jib-2017-0082" >}}

{{< cite title="The Systems Biology Markup Language (SBML): Language Specification for Level 3 Version 2 Core" authors="Hucka, M., Bergmann, F. T., Dräger, A., Hoops, S., Keating, S. M., Le Novère, N., Myers, C. J., Olivier, B. G., Sahle, S., Schaff, J. C., Smith, L. P., Waltemath, D., and Wilkinson, D. J." source="_Journal of Integrative Bioinformatics_, 15(1), 20170081, 2017" link="https://doi.org/10.1515/jib-2017-0081" >}}

{{< cite title="SBML Level 3 package: Groups, Version 1 Release 1" authors="Hucka, M., and Smith, L. P." source="_Journal of Integrative Bioinformatics_, 13(3), 8-29, 2017" link="https://doi.org/10.1515/jib-2016-290" >}}

{{< cite title="SBML Level 3 package: Hierarchical Model Composition, Version 1 Release 3" authors="Smith, L. P., Hucka, M., Hoops, S., Finney, A., Ginkel, M., Myers, C. J., Moraru, I., and Liebermeister, W." source="_Journal of Integrative Bioinformatics_, 12(2), 603-659, 2016" link="https://doi.org/10.1515/jib-2015-268" >}}

{{< cite title="SBML Level 3 package: Qualitative Models, Version 1, Release 1" authors="Chaouiya, C., Keating, S. M., Berenguier, D., Naldi, A., Thieffry, D., Iersel, M., Le Novère, N., and Helikar, T." source="_Journal of Integrative Bioinformatics_, 12(2), 691-730, 2016" link="https://doi.org/10.1515/jib-2015-270" >}}

{{< cite title="The Systems Biology Markup Language (SBML): Language Specification for Level 3 Version 1 Core" authors="Hucka, M., Bergmann, F. T., Hoops, S., Keating, S. M., Sahle, S., Schaff, J. C., Smith, L. P., and Wilkinson, D. J." source="_Journal of Integrative Bioinformatics_, 12(2), 382-549, 2016" link="https://doi.org/10.1515/jib-2015-266" >}}

{{< cite title="Systems Biology Markup Language (SBML) Level 2 Version 5: Structures and Facilities for Model Definitions" authors="Hucka, M., Bergmann, F. T., Dräger, A., Hoops, S., Keating, S. M., Le Novère, N., Myers, C. J., Olivier, B. G., Sahle, S., Schaff, J. C., Smith, L. P., Waltemath, D., and Wilkinson, D. J." source="_Journal of Integrative Bioinformatics_, 12(2), 731-901, 2016" link="https://doi.org/10.1515/jib-2015-271" >}}

{{< cite title="The Systems Biology Markup Language (SBML) Level 3 Package: Flux Balance Constraints" authors="Olivier, B. G., and Bergmann, F. T." source="_Journal of Integrative Bioinformatics_, 12(2), 660-690, 2016" link="https://doi.org/10.1515/jib-2015-269" >}}

{{< cite title="The Systems Biology Markup Language (SBML) Level 3 Package: Layout, Version 1 Core" authors="Gauges, R., Rost, U., Sahle, S., Wengler, K., and Bergmann, F. T." source="_Journal of Integrative Bioinformatics_, 12(2), 550-602, 2016" link="https://doi.org/10.1515/jib-2015-267" >}}


## SBML software infrastructure

{{< cite title="MOCCASIN: converting MATLAB ODE models to SBML" authors="Gómez, H. F., Hucka, M. Keating, S. M., Nudelman G., Iber, D., and Sealfon, S. C.  " source="_Bioinformatics_, 32(12): 1905–1906, 2016" link="https://academic.oup.com/bioinformatics/article/32/12/1905/1743777" summary="Description of MOCCASIN, a Python-based converter of certain types of MATLAB programs.  Does not require MATLAB to run." >}}

{{< cite title="JSBML 1.0: providing a smorgasbord of options to encode systems biology models" authors="Nicolas Rodriguez, Alex Thomas, Leandro Watanabe, Ibrahim Y. Vazirabad, Victor Kofia, Harold F. Gómez, Florian Mittag, Jakob Matthes, Jan Rudolph, Finja Wrzodek, Eugen Netz, Alexander Diamantikos, Johannes Eichner, Roland Keller, Clemens Wrzodek, Sebastian Fröhlich, Nathan E. Lewis, Chris J. Myers, Nicolas Le Novère, Bernhard Ø. Palsson, Michael Hucka, and Andreas Dräger." source="_Bioinformatics_, 10.1093/bioinformatics/btv341, 2015" link="https://academic.oup.com/bioinformatics/article/31/20/3383/195580" summary="Description of the JSBML library, a tool to help support SBML in software tools written in the Java language." >}}

{{< cite title="A Methodology to Annotate Systems Biology Markup Language Models with the Synthetic Biology Open Language" authors="Roehner N., Myers C.J." source="_ACS Synthetic Biology_, 10.1021/sb400066m, 2013" link="Roehner2013.pdf" summary="Description of the JSBML library, a tool to help support SBML in software tools written in the Java language." >}}

{{< cite title="JSBML: a flexible Java library for working with SBML" authors="Dräger A., Rodriguez N., Dumousseau M., Dörr A., Wrzodek C., Le Novère N., Zell A., Hucka M." source="_Bioinformatics_, 27: 2167-2168, 2011" link="https://academic.oup.com/bioinformatics/article-lookup/doi/10.1093/bioinformatics/btr361" summary="Description of the JSBML library, a tool to help support SBML in software tools written in the Java language." >}}

{{< cite title="LibSBML: An API Library for SBML" authors="Bornstein, B. J., Keating, S. M., Jouraku, A., and Hucka M." source="_Bioinformatics_, 24: 880-881, 2008" link="https://dx.doi.org/10.1093%2Fbioinformatics%2Fbtn051" summary="Description of the libSBML, a C++ library to help support SBML in software tools written in a variety of languages." >}}

{{< cite title="SBMLToolbox: an SBML toolbox for MATLAB users" authors="Keating, S. M., Bornstein, B. J., Finney, A., and Hucka M." source="_Bioinformatics_, 22(10):1275–1277" link="https://doi.org/10.1093/bioinformatics/btl111" summary="Describes [SBMLToolbox](https://github.com/sbmlteam/sbmltoolbox), a MATLAB toolbox built on top of [libSBML](/software/libsbml). It provides a set of basic functions allowing SBML models to be used in both MATLAB and [Octave](https://www.gnu.org/software/octave/)." >}}


### <!-- Stupid hack needed to make TOC show up properly -->
