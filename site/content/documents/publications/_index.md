+++ # -*- mode: html -*-
#=====================================================================
title = "Essential publications about SBML"
date  = 2019-04-06
#=====================================================================
+++

<!--
The following is a template for new additions of publications on this page. This could instead be implemented using Hugo widgets or partials, but I still don't understand how those work, and anyway this approach IMHO will be easier for future maintainers to figure out.  It's simple and obvious.  The only thing to watch out for is that you have to type the link to the publication twice -- look for the two href="" and see existing entries for examples.

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href=""><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href=""><strong></strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: </td>
  </tr><tr><td></td>
    <td><em>Publication</em>: </td>
  </tr><tr><td></td>
    <td><em>Summary</em>: </td>
  </tr><tr>
</table>
-->

This page lists published papers and chapters describing SBML, SBML packages, and core SBML-supporting software such as API libraries.  Information about associated standards are not included here; please see the [COMBINE website](http://co.mbine.org) and [FAIRsharing](https://fairsharing.org) for information about related standards.


## Publications describing SBML and SBML packages

The papers and chapters in this section describe SBML and SBML packages in general terms.  It is worth noting that _none of these publications is normative in the sense of defining SBML_ &ndash; these papers and chapters only provide context and perspectives about SBML and its development.  (Only the [SBML specification documents](/documents/specifications) are normative.)

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="https://bmcsystbiol.biomedcentral.com/articles/10.1186/1752-0509-7-135"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="https://bmcsystbiol.biomedcentral.com/articles/10.1186/1752-0509-7-135"><strong>SBML Qualitative Models: a model representation format and infrastructure to foster interactions between qualitative modelling formalisms and tools</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Chaouiya, C., Berenguier, D., Keating, S.&nbsp;M., Naldi, A., van Iersel, M. P., Rodriguez, N., Dräger, A., Büchel, F., Cokelaer, T., Kowal, B., Wicks, B., Gonçalves, E., Dorier, J., Page, M., Monteiro, P.&nbsp;T., von Kamp, A., Xenarios, I., de Jong, H., Hucka, M., Klamt, S., Thieffry, D., Le Novère, N., Saez-Rodriguez, J., and Helikar, T.</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: BMC Systems Biology 7:135, 2013.</td>
  </tr><tr><td></td>
    <td><em>Summary</em>: Describes SBML "qual", a format for storing qualitative models such as logical model or some Petri Net models.</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="Keating2013.pdf"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="Keating2013.pdf"><strong>Supporting SBML as a Model Exchange Format in Software Applications</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Keating, S.&nbsp;M., and Le Novère, N.</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Chapter in <a href="http://dx.doi.org/10.1007/978-1-62703-450-0_11">In Silico Systems Biology - Methods in Molecular Biology</a>, vol.&nbsp;1021, pp.&nbsp;201-225, Springer, 2013.</td>
  </tr><tr><td></td>
    <td><em>Summary</em>: This chapter describes SBML from its origins, the rationale behind and importance of having a common language to represent models, the development of SBML and outlines the structure of an SBML model. It provides a section on libSBML and a description of the SBML Toolbox.
</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="Hucka_2006.pdf"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="Hucka_2006.pdf"><strong>Software Infrastructure for Effective Communication and Reuse of Computational Models</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Finney, A., Hucka, M., Bornstein, B.&nbsp;J., Keating, S.&nbsp;M., Shapiro, B.&nbsp;M., Matthews, J., Kovitz, B.&nbsp;K., Schilstra, M.&nbsp;J., Funahashi, A., Doyle, J.&nbsp;C, and Kitano, H.</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Chapter in <a href="http://mitpress.mit.edu/catalog/item/default.asp?ttype=2&tid=10923">System Modeling in Cell Biology: From Concepts to Nuts and Bolts</a>, eds. Zoltan Szallasi, Jörg Stelling, and Vipul Periwal, MIT Press, 2006.</em></td>
  </tr><tr><td></td>
    <td><em>Summary</em>: This chapter overviews the SBML project and its general goals, and some of the motivations for approaches taken in the development of libSBML. (Note: this is a portion of the chapter; we highly recommend getting the whole book rather than only using this excerpt.)</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="https://academic.oup.com/bioinformatics/article/22/15/1879/242661"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="https://academic.oup.com/bioinformatics/article/22/15/1879/242661"><strong>A model diagram layout extension for SBML</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Gauges, R., Rost, U., Sahle, S. and Wegner, K.</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Paper in Bioinformatics 22(15):1879–1885, 2006.</td>
  </tr><tr><td></td>
    <td><em>Summary</em>: A paper describing a proposed format for storing diagrammatic representations of models directly in an SBML model file or data stream. In SBML Level 2, applications can use it by storing the data in SBML <annotation> elements, and for Level 3, it is expected to be turned into a full package, with the same constructs appearing at the top level instead of inside <annotation> elements.</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="http://msb.embopress.org/content/1/1/2005.0011"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="http://msb.embopress.org/content/1/1/2005.0011"><strong>Escalating model sizes and complexities call for standardized forms of representation</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Hucka, M., and Finney, A.</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Paper in Molecular Systems Biology, doi:10.1038/msb4100015, 2005.</td>
  </tr><tr><td></td>
    <td><em>Summary</em>: Comment paper about the increasingly larger and more complex models being developed by researchers, and the need to standardize representations at different levels for effective communication and sharing of those models.</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="Finney_2005.pdf"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="Finney_2005.pdf"><strong>Developing SBML beyond level 2: proposals for development</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Finney, A.</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Chapter in <a href="http://www.springer.com/computer/mathematics/book/978-3-540-25375-4">Lecture Notes in Computer Science</a>, Vol. 3082, eds. Vincent Danos and Vincent Schachter, Springer-Verlag, 2005.</td>
  </tr><tr><td></td>
    <td><em>Summary</em>: This conference paper was presented by Andrew Finney at the Computational Methods in Systems Biology 2004 conference held in Paris, May 2004. It discusses early efforts to develop SBML Level 3.</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="Hucka_2004.pdf"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="Hucka_2004.pdf"><strong>Evolving a lingua franca and associated software infrastructure for computational systems biology: the Systems Biology Markup Language (SBML) project</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Hucka, M., Finney, A., Bornstein, B. J., Keating, S. M., Shapiro, B.&nbsp;E., Matthews, J., Kovitz, B.&nbsp;L., Schilstra, M.&nbsp;J., Funahashi, A, Doyle, J.&nbsp;C., and Kitano, H.</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Paper in IEE Systems Biology, 1(1):41–53, 2004.</td>
  </tr><tr><td></td>
    <td><em>Summary</em>: This paper summarizes SBML and the characteristics of SBML-compatible software tools as of early 2004. The article includes a matrix of capabilities that was the inspiration for the SBML Software Matrix now used on this site to summarizes known SBML-compatible software tools.</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="Finney_2003.pdf"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="Finney_2003.pdf"><strong>Systems Biology Markup Language: Level 2 and Beyond</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Finney, A. M., and Hucka, M.</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Paper in Biochemical Society Transactions, 32:1472–1473, 2003. </td>
  </tr><tr><td></td>
    <td><em>Summary</em>: Short paper from a conference in which Andrew Finney described the initial plans for SBML Level 2.</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="https://academic.oup.com/bioinformatics/article/19/4/524/218599"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="https://academic.oup.com/bioinformatics/article/19/4/524/218599"><strong>The Systems Biology Markup Language (SBML): A Medium for Representation and Exchange of Biochemical Network Models</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Hucka, Michael, Finney, Andrew, Sauro, Herbert M., Bolouri, Hamid, Doyle, John C., Kitano, Hiroaki, Arkin, Adam P., Bornstein, Benjamin J., Bray, Dennis, Cornish-Bowden, Athel, Cuellar, Autumn A., Dronov, Sergey, Gilles, Ernst Dieter, Ginkel, Martin, Gor, Victoria, Goryanin, Igor I., Hedley, Warren J., Hodgman, T. Charles, Hofmeyr, Jan-Hendrik S., Hunter, Peter J., Juty, Nick S., Kasberger, Jay L., Kremling, Andreas, Kummer, Ursula, Le Novère, Nicolas, Loew, Leslie M., Lucio, Daniel, Mendes, Pedro, Minch, Eric, Mjolsness, Eric D., Nakayama, Yoichi, Nelson, Melanie R., Nielsen, Poul F., Sakurada, Takeshi, Schaff, James C., Shapiro, Bruce E., Shimizu, Thomas S., Spence, Hugh D., Stelling, Jörg, Takahashi, Kouichi, Tomita, Masaru, Wagner, John M., Wang, Jian, and the rest of the SBML Forum</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Paper in Bioinformatics, 9(4):524–531, 2003.</td>
  </tr><tr><td></td>
    <td><em>Summary</em>: Original publication about SBML. It describes SBML Level 1 Version 2.</td>
  </tr><tr>
</table>

## Software infrastructure supporting SBML

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="https://academic.oup.com/bioinformatics/article/32/12/1905/1743777"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="https://academic.oup.com/bioinformatics/article/32/12/1905/1743777"><strong>MOCCASIN: converting MATLAB ODE models to SBML</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Gómez, H. F., Hucka, M. Keating, S. M., Nudelman G., Iber, D., and Sealfon, S. C.  </td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Bioinformatics, 32(12): 1905–1906, 2016.</td>
  </tr><tr><td></td>
    <td><em>Summary</em>: Description of MOCCASIN, a Python-based converter of certain types of MATLAB programs.  Does not require MATLAB to run.</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="https://academic.oup.com/bioinformatics/article/31/20/3383/195580"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="https://academic.oup.com/bioinformatics/article/31/20/3383/195580"><strong>JSBML 1.0: providing a smorgasbord of options to encode systems biology models</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Nicolas Rodriguez, Alex Thomas, Leandro Watanabe, Ibrahim Y. Vazirabad, Victor Kofia, Harold F. Gómez, Florian Mittag, Jakob Matthes, Jan Rudolph, Finja Wrzodek, Eugen Netz, Alexander Diamantikos, Johannes Eichner, Roland Keller, Clemens Wrzodek, Sebastian Fröhlich, Nathan E. Lewis, Chris J. Myers, Nicolas Le Novère, Bernhard Ø. Palsson, Michael Hucka, and Andreas Dräger</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Paper in Bioinformatics, DOI: 10.1093/bioinformatics/btv341, 2015.</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="Roehner2013.pdf"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="Roehner2013.pdf"><strong>A Methodology to Annotate Systems Biology Markup Language Models with the Synthetic Biology Open Language</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Roehner N., Myers C.J.</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Paper in ACS Synthetic Biology, DOI: 10.1021/sb400066m, 2013.</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="https://academic.oup.com/bioinformatics/article-lookup/doi/10.1093/bioinformatics/btr361"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="https://academic.oup.com/bioinformatics/article-lookup/doi/10.1093/bioinformatics/btr361"><strong>JSBML: a flexible Java library for working with SBML</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Dräger A., Rodriguez N., Dumousseau M., Dörr A., Wrzodek C., Le Novère N., Zell A., Hucka M.</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Paper in Bioinformatics, 27: 2167-2168, 2011.</td>
  </tr><tr><td></td>
    <td><em>Summary</em>: Description of the JSBML library, a tool to help support SBML in software tools written in the Java language.</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="https://dx.doi.org/10.1093%2Fbioinformatics%2Fbtn051"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="https://dx.doi.org/10.1093%2Fbioinformatics%2Fbtn051"><strong>LibSBML: An API Library for SBML</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Bornstein, B. J., Keating, S. M., Jouraku, A., and Hucka M.</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Paper in Bioinformatics, 24: 880-881, 2008.</td>
  </tr><tr><td></td>
    <td><em>Summary</em>: Description of the libSBML, a C++ library to help support SBML in software tools written in a variety of languages.</td>
  </tr><tr>
</table>

<table class="no-borders no-striping middle-aligned tight-spacing">
  <tr>
    <td><a target="_blank" href="https://academic.oup.com/bioinformatics/article/22/10/1275/237481"><i class="fa-file-pdf fas fa-2x"></i></a></td>
    <td><a target="_blank" href="https://academic.oup.com/bioinformatics/article/22/10/1275/237481"><strong>SBMLToolbox: an SBML toolbox for MATLAB users</strong></a></td>
  </tr><tr><td></td>
    <td><em>Authors</em>: Keating, S. M., Bornstein, B. J., Finney, A., and Hucka M.</td>
  </tr><tr><td></td>
    <td><em>Publication</em>: Paper in Bioinformatics, 22: 1275-1277, 2006.</td>
  </tr><tr><td></td>
    <td width="100%"><em>Summary</em>: Description of the SBMLToolbox, a tool to help use SBML in MATLAB.</td>
  </tr><tr>
</table>
