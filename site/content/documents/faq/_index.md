+++ # -*- mode: html -*-
#=====================================================================
title   = "Frequently Asked Questions (and Answers)"
aliases = ["/Documents/FAQ"]
date    = 2019-04-07
layout  = "single"
toc     = true
#=====================================================================
+++

This Frequently Asked Questions (FAQ) document answers to some frequent questions about the Systems Biology Markup Language (SBML).  This is a non-normative document that does not _define_ any aspect of SBML; rather, it is intended to provide additional information in an easily accessible and readable form.

## FAQ overview 

### What is this FAQ? 

This Frequently Asked Questions (FAQ) document is an attempt to answer common questions on the concepts, structure, and other matters of the Systems Biology Markup Language (SBML).  It is in addition to the official [SBML specifications](/documents/specifications).  This is not a normative document&mdash;it does not _define_ anything about SBML.

### Who maintains this FAQ? 

The [SBML Team](/about/core) and [SBML Editors](/about/core) do nearly all of the writing and maintaining of this FAQ.

### How can I report problems, questions, disagreements?

Please use the [issue tracker](https://github.com/sbmlteam/sbml-org-website/issues) or else [email the SBML Editors](mailto:sbml-editors@googlegroups.com) directly.


## General questions about SBML 

### What is SBML? 

The short answer is this: the Systems Biology Markup Language (SBML) is a machine-readable exchange format for computational models of biological processes.  Its strength is in representating phenomena at the scale of biochemical reactions, but it is not limited to that. By supporting SBML as an input and output format, different software tools can operate on the same representation of a model, removing chances for errors in translation and assuring a common starting point for analyses and simulations.

A slightly longer (but still relatively short) answer can be found in the separate [_What is SBML?_](/documents/what-is-sbml).

### Is SBML free?

Yes.  Totally.

### Is it open?

Yes, in the sense that there are no restrictions on its use, anyone may contribute proposals, anyone may participate in discussions, there's no secret handshake to get into the meetings, etc.

### How can I find out about the model in an SBML file?  It's too hard to read the XML 

As a first step, you can use the [SBML4Humans web service](https://sbml4humans.de) or [SBML2LaTeX web service](http://www.ra.cs.uni-tuebingen.de/software/SBML2LaTeX/) to generate a report summarizing the content of an SBML file. Both systems allow you to understand what an SBML model is about without having to look at the actual XML content and are good debugging tools.

[SBML2LaTeX](http://www.ra.cs.uni-tuebingen.de/software/SBML2LaTeX/) generates output in PDF, TeX and other formats, and provides a detailed, human-readable summary of every part of an SBML model (including the system of equations implied by the model).   There is a link to that system from the [SBML.org facilities page](/facilities).  SBML2LaTeX was developed by Andreas Dr&auml;ger, Hannes Planatscher, Dieudonn&eacute; M. Wouamba and Adrian Schr&ouml;der, and the web service is kindly provided by the University of T&uuml;bingen, Germany, as a service to the SBML community. 

[SBML4Humans](https://sbml4humans.de) provides an interactive and reactive report for SBML models which allows humans (experts as well as beginners) to easily comprehend the content of a model. SBML4Humans is part of the sbmlutils project and was developed by [Matthias K&ouml;nig](https://livermetabolism.com) and Sankha Das. 

### What kind of models can you represent in SBML? 

This question is difficult to answer directly. One way to get a sense for what _can_ be represented in SBML is to look at the kinds of models that _have been_ represented in SBML. A good starting place for that is [BioModels Database](http://www.ebi.ac.uk/biomodels/).

However, a lot depends on how a modeler chooses to express a model.  A common abstraction used when describing cellular phenomena is to describe the system as a set of chemical entities linked by processes (reactions) that can transform one entity into another or transport entities between compartments. A _compartment_ in SBML is a location having a defined size or extent (which may be in terms of volume, area, length, or a point). Every chemical species in an SBML model must be located in a compartment. It is worth noting that compartments do '_not_' have to map one-to-one to biological structures; compartments can be conceptual too. But SBML is by no mean limited to encoding biochemical reactions. One can encode any mathematical rule linking quantitative characteristics of the biological system, including, but not limited to, electrical behaviour, growth etc.  SBML can also describe discrete events that are triggered by state changes in the modeled system.

For developers working implementing SBML support, or modelers working directly with SBML, it is worth noting that while SBML's data structures are things called "species", "reaction", etc., and people often talk about SBML in those terms (even the specifications historically have done that), **_SBML is not limited to biochemical species and biochemical reactions_**. Ed Frank put it nicely in a [discussion in 2005](http://sbml.org/Forums/index.php?t=tree&th=553&mid=1786&rid=2&rev=&reveal=):

<blockquote>
"Most software systems do not have software entities that are one-to-one with the problem domain. Software doesn't work that way. It's almost like the problem domain and software domain are fourier transforms of each other. The problem domain has a bunch of things to be worked on or solved. The software domain has objects and object interrelations that focus on encapsulation, robustness, and extensibility. Not the same!"<br><br>

"Often systems start off with software entities that look a great deal like the problem domain, e.g., species, modifiers, etc. but in time you discover really they are a bit different and migration-cost pressures keep you from renaming them."
</blockquote>

### Does SBML have units? 

Absolutely, yes.  Every quantity in an SBML model can have units of measurement associated with it.

### How is SBML different from BioPAX? 

While [BioPAX](http://www.biopax.org/) is meant to facilitate the exchange of _biological pathways_, SBML has been designed to facilitate exchange and reuse of _quantitative models_, not necessarily limited to the biochemical events. SBML models contain information about sizes, amounts and kinetics, that cannot be expressed with BioPAX. Conversely, BioPAX being an ontology, one can define much more precisely the identity of the objects considered, whether physical entities or biochemical events. In SBML, this information may be encoded using annotation with terms from the [Systems Biology Ontology](http://www.ebi.ac.uk/sbo/) (SBO). Although SBML and BioPAX do not fulfill the same purpose, it is nevertheless possible to convert one into another. Examples of tools providing this service are [BiNoM](http://bioinfo.curie.fr/projects/binom/) and [BioModels Database](http://www.ebi.ac.uk/biomodels/).

### How is SBML different from CellML? 

[CellML](http://www.cellml.org/) is another format to encode quantitative models, based on [XML](http://www.w3.org/XML) like SBML. CellML is being developed by the [Bioengineering Institute](http://www.bioeng.auckland.ac.nz/home/home.php) at the [University of Auckland](http://www.auckland.ac.nz/) and collaborating groups.  The chief differences between CellML and SBML can be perhaps described in the following ways.   While a model encoded in SBML is based on the successive, hierachical, declarations of model constituents, a CellML model is built as a network of components. A component can contain variables, mathematical expressions, metadata etc. In CellML, the biological information is entirely stored in metadata rather than the language elements. In SBML, the language elements were more directly influenced by present-day biochemical network simulation software, and the mathematical expressions are more constrained than what is permitted in CellML's subset of MathML.

A variety of tools exist to translate between SBML and CellML, though not all SBML constructs can be translated to CellML (like events), and while the math remains, semantic information is lost.  Conversely, translators from CellML to SBML that do not use the Hierarchical Model Composition package lose the hierarchical information, and result in a 'flat' model. Examples of tools providing this service can be found at https://www.ebi.ac.uk/biomodels/tools/converters/.

### Is SBML just an XML format? 

Yes and no.  The primary encoding of SBML is indeed [XML](http://www.w3.org/XML), a popular text-based language for expressing structured data in a generic fashion.  However, a design goal of SBML has always been to define it in terms of a language-independent formalism (specifically, using [UML](http://en.wikipedia.org/wiki/Unified_Modeling_Language)) and then map _that_ to XML, so that mappings to other formats may be easier.

### Isn't SBML too complicated to write?

Don't write SBML by hand.  Instead, use software tools that provide higher-level interfaces to reading, writing, and manipulating SBML.  Some provide graphical user interfaces, while others provide textual interfaces where you can write models in terms of chemical reactions.

### Where is SBML defined? 

The Systems Biology Markup Language is formally defined in the
[SBML specification documents](/documents/specifications).

### Where can I find some already-written, working SBML models? 

[BioModels Database](http://www.ebi.ac.uk/biomodels/) provides a database of
hundreds of published models in SBML format.  The models in the database
have been checked by humans to correspond to the publication and have been
annotated with links to other data resources to make searching easier.

### I've developed a model and I'd like to make it public; where can I submit it? 

You can submit published models to [BioModels Database](http://www.ebi.ac.uk/biomodels/).  Please consult the [FAQ for BioModels Database](http://www.ebi.ac.uk/biomodels/faq) and then the [submission page for BioModels Database](http://www.ebi.ac.uk/biomodels/model/create).

### What is the MIME type for SBML? 

The [MIME](http://en.wikipedia.org/wiki/MIME) media subtype for SBML is `application/sbml+xml` and it is defined by [RFC 3823](http://www.faqs.org/rfcs/rfc3823.html) . The goal of defining a MIME type for SBML is to enable applications to recognize files and data streams as being in SBML format by virtue of being tagged with the SBML MIME type.

### Is there an official logo for SBML? 

Yes!  Please see [the SBML logos](/documents/logos) page.  These logos are ideal for putting in web pages, software documentation, and presentations to show your and your software's support of SBML.

### Why does the logo resemble the SBGN and SBO logos? Are the projects linked? 

Back in the earliest days of SBML and SBW, Hiroaki Kitano anticipated a series of standards for systems biology. He outsourced the creation of an "SB" logo to a designer at the Sony Corporation Design Center in Tokyo, with the intension of using the invariant "SB" part for a variety of efforts.  Initially, SBML and the [SBI](http://sbi.jp) webpages used this logo, and when [SBGN](http://www.sbgn.org) and [SBO](http://www.ebi.ac.uk/sbo) were started, these also ended up using the same logo beginning.

The different projects have some coordination (mainly by virtue of involving a lot of the same people), but there's no tight coupling or official mandate.  [SBO](http://www.ebi.ac.uk/sbo) and [SBGN](http://www.sbgn.org) are meant to be useful to everyone, not only the SBML community.

### What papers should I cite if I use SBML? 

The single best paper to cite at this time is the 2003 paper in _Bioinformatics_, even though it describes only Level&nbsp;1 and not the latest Levels/Versions of SBML:

* Hucka, M., Finney, A., Sauro, H. M., Bolouri, H., Doyle, J. C., Kitano, H., Arkin, A. P., Bornstein, B. J., Bray, D., Cornish-Bowden, A. , Cuellar, A. A., Dronov, S., Gilles, E. D., Ginkel, M., Gor, V., Goryanin, I. I., Hedley, W. J., Hodgman, T. C., Hofmeyr, J.-H., Hunter, P. J., Juty, N. S., Kasberger, J. L., Kremling, A., Kummer, U., Le Nov&egrave;re, N., Loew, L. M., Lucio, D., Mendes, P., Minch, E., Mjolsness, E. D., Nakayama, Y., Nelson, M. R., Nielsen, P. F., Sakurada, T., Schaff, J. C., Shapiro, B. E., Shimizu, T. S., Spence, H. D., Stelling, J., Takahashi, K., Tomita, M., Wagner, J., Wang, J.  (2003). The Systems Biology Markup Language (SBML): A medium for representation and exchange of biochemical network models.  <a href="https://academic.oup.com/bioinformatics/article/19/4/524/218599"><i>Bioinformatics</i>, vol. 19, no. 4, pp. 524&ndash;531</a>.

In addition, it would be appropriate to cite the following short paper, which discusses Level&nbsp;2:

* Finney, A., and Hucka, M.  (2003).  Systems Biology Markup Language: Level 2 and Beyond. <a href="http://www.cds.caltech.edu/~mhucka/publications/finney2003systems.pdf"><i>Biochemical Society Transactions</i>, vol. 31, part 6</a>.

There are other papers that would be appropriate to cite in other contexts, such as the use of [libSBML](/software/libsbml), [JSBML](/software/jsbml), or SBML packages.  The relevant pages on this site or in other people's project sites provide information about the publications that describe the work.  (These days, there are too many to keep a reliable up-to-date list here.)

### Isn't MATLAB a perfectly fine format for representing models? 

MATLAB is a fantastic system, but neither "MATLAB" or its scripting language is a model representation format.

A MATLAB file is simply a script written in a proprietary application language. This is similarly true of Mathematica format, custom C++ programs, etc. So in some deep sense, these formats are not like SBML, which aims to describe the semantic components of the model.

Equally important, the reality is that MATLAB and Mathematica scripts are really only _fully_ runnable in _only those applications_. Some other systems such as Octave will run some MATLAB programs, but for many purposes, a person really has to go to MATLAB. That limits scientists' ability to reproduce each others' results, because using MATLAB or Mathematica ties them to commercial, closed-source systems.

In addition, offering models in unstandardized formats is ultimately a disservice to the consumers of the models, because they will not be able to take advantage of the ecology of software tools that has evolved around SBML and that allows models to be used in many more creative ways than how MATLAB scripts can be.

MATLAB, Mathematica, C++, FORTRAN, etc., are _not standard model representation formats_.  Help improve science by using formats, such as SBML, that are.

### Isn't SBML's definition of 'compartment' wrong? A compartment is an amount of substance! 

The term _compartment_ is used in at least two ways in modeling of biological processes, sometimes leading to confusion when models from different communities are being discussed. 

The first meaning, used in modern multicompartment modeling of the sort that SBML users do, is in the sense of a _vessel or container_. This kind of compartment typically has the properties of location, size (usually but not always in three dimensions, and usually but not always fixed in size), and a name or identity; importantly, the compartment is not intrinsically associated with a single substance or chemical species, but instead, one or more substances are _located inside_ the compartment. Compartments in this sense are usually assumed to be homogeneous or well-mixed, and the concentration of each species is usually taken to be an individual state variable in the model. (Sometimes, the species are referred to as _pools_, and the compartments are thus groupings of pools.) 

By contrast, the second meaning of _compartment_ is a substance in a location. In this second meaning, there is no notion of a container; rather, each distinct kind of substance in a location (e.g., glucose in the liver) _is_ a compartment. This notion of compartment comes from the "bathtub models" and is still largely in use in ecological modeling or in phamacometrics modeling. For instance "glucose in the liver" and "glucose in blood" are different compartments, but "glucose in blood" and "drug in blood" are also different compartments. 

The former sense, used by SBML, is fairly common in systems biology and engineering models today.  An advantage of this approach is that it allows for the intuition of identifying compartments with biological structures, then talking about what happens within and between those structures.  For example, a model might have compartments corresponding to such things as cytoplasm, nucleus, nuclear membrane, etc., with many different kinds of chemical entities located inside each compartment.  This style of compartmental modeling is by no means new; one can find examples going back many decades. Some segments of pharmacometrics today also use compartments as vessels; this is the case for example in [Physiologically-based pharmacokinetic modeling](http://en.wikipedia.org/wiki/Physiologically_based_pharmacokinetic_modelling).

Finally, in this context, it is worth mentioning that in SBML, there is no requirement for compartment to correspond strictly to cellular structures.  Indeed, while SBML uses terms like "species", "reaction", "compartment", it is more of a historical artifact than a limitation of sticking to purely biochemical modeling.  SBML is used for more than biochemical models today.

## Questions about SBML development

### What are the SBML _Levels_?

_Levels_ in SBML are a way of managing complexity in the continued evolution and enhancement of the language.  SBML is being developed in a series of _levels_, where each level adds new features and fixes problems with the previous level.  The lowest-numbered levels provide fundamental features that are common to all biochemical network models.  Higher-numbered levels add more features that are specific to particular classes of tools.  Any level can be used as a standard for interchanging models.

### What are the SBML Levels/Versions/Releases/Revisions about?

As mentioned above in this FAQ, the _Levels_ of SBML represent different stratifications of functionality and complexity in the SBML language.  Major architectural changes are only made from level to level.

Real-world experiences with a language definition often lead to new realizations and the identification of problems. In SBML, we adopted a scheme of _Versions_ within levels.  Continued refinements and corrections to an SBML Level take place by issuing new _Versions_.  This is why there is an SBML Level&nbsp;2 _Version&nbsp;1_, an SBML Level&nbsp;2 _Version&nbsp;2_, etc.

Within versions, we needed a scheme for handling editorial corrections that do not affect the intended syntax and semantics of an SBML Level+Version specification.  This was initiated in SBML Level&nbsp;2 Version&nbsp;2 with the introduction of "Revisions".  Unfortunately, the term "Revision" caused too much confusion, so we changed the terminology to use the term "Releases" in SBML Level&nbsp;2 Version&nbsp;3.  The result is that specifications of SBML are now given in terms of a '_Level_', '_Version_', and '_Release_'.

SBML Levels are intended to coexist.  For example, SBML Level&nbsp;2 does not render Level&nbsp;1 obsolete, and Level&nbsp;1-compatible models and software tools still continue to be used.  However, the matter is different _within_ Versions.  _Changes between Versions within a Level represent important improvements (and in some cases, critical corrections)._ **_Consequently, we strongly encourage software developers and modelers to update software and models to conform to the latest Version within an SBML Level._**

### What are the differences between Levels 1 and 2?

The changes in SBML Level&nbsp;2 include: replacing SBML Level&nbsp;1's text-string based format for mathematical expressions with a subset of [MathML](http://www.w3.org/TR/2003/WD-MathML2-20030411/), introducing support for metadata, introducing support for named function definitions, introducing explicit modifier species such as catalysts in reactions, and introducing new constructs for discrete events and time delays.  In Version&nbsp;2 of Level&nbsp;2, additional major changes include new constructs for types of species, types of compartments, initial assignments, constraints, and a standard approach for annotating model components with cross-references to terms from ontologies and controlled vocabularies.  In Version&nbsp;3 of Level&nbsp;2, a number of small but important corrections were introduced, the consistency of the unit system was improved, and the UML notation in the specification document was much improved in clarity.  In Version&nbsp;4 of Level&nbsp;2, the requirement for unit consistency was removed to comply with a community vote held in 2007, and in addition, a few other restrictions were removed on component ordering in a model, and finally, a number of small corrections and changes were made to the RDF and SBO aspects.

### What is SBML Level 3?

SBML Level 3 is the next step up in capability from SBML Level&nbsp;2. It is designed as a modular language, with a defined core set of features (based largely on SBML Level&nbsp;2) and topic-specific packages layered on top of the core. This modular approach means that models can declare which feature-sets they use, and likewise, software tools can inform users which packages they support.

### What are the differences between Levels 2 and 3?

The major changes in SBML Level 3 include:

* The definition of a modular 'package' structure for extensibility.
* No defaults: all elements of an SBML Level 3 model are either explicitly defined or are undefined.
* The semantics of events were enriched.

Here is a table that summarizes the main changes in SBML across the different Levels:

| SBML Level 1                        | SBML&nbsp;Level&nbsp;2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| SBML&nbsp;Level&nbsp;3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|
|-------------------------------------|---------------------------------------------------|--------------|
| predefined math functions           | <font color="green">user-defined functions</font> | <font color="green">user-defined functions</font> | 
| text-string math notation           | <font color="green">MathML subset</font>          | <font color="green">MathML subset</font> | 
| reserved namespaces for annotations | <font color="green">no reserved namespaces <br>for annotations</font> | <font color="green">no reserved namespaces <br>for annotations</font> |
| no controlled annotation scheme     | <font color="green">RDF-based controlled <br>annotation scheme</font> | <font color="green">RDF-based controlled <br>annotation scheme</font> |
| no discrete events                  | <font color="green">discrete events</font>        | <font color="green">discrete events</font> |
| default values defined              | default values defined |<font color="green">no default values</font> |
| monolithic                          | monolithic                                        | <font color="green">modular</font> |

### Why are Level&nbsp;1 and Level&nbsp;2 still being kept around if Level&nbsp;3 exists?

There exist tools that either were developed before the creation of SBML Level&nbsp;3 or for which Level&nbsp;2 (or 1) is more appropriate.  SBML Level&nbsp;2 therefore continues to have relevance even with the existence of Level&nbsp;3.

Note that since all Level&nbsp;1 models can be translated to SBML Level&nbsp;2 and SBML Level&nbsp;3, and all Level&nbsp;2 models can be translated to SBML Level&nbsp;3, tools that read SBML Level&nbsp;2 can be made to support Level&nbsp;3 reasonably easily.  Moreover, the availability of [libSBML](/software/libsbml) and [JSBML](/software/jsbml) makes it much easier for application developers to support different SBML levels in software applications. Among other features, [libSBML](/software/libsbml) has a built-in translation facilities between the various levels and versions.

### What are SBML Level 3 'packages'?

An SBML Level 3 package is an extension of SBML, with its own namespace and specification.  Each package is designed to extend SBML (and the types of models it can encode) in a particular direction.  This allows software to support SBML packages appropriate to its own problem domain, while making it clear what models it will and will not be able to exchange.  The first package to be fully developed, implemented, and approved by the SBML community was the Hierarchical Model Composition package, in November of 2012.  This package allowed the hierarchical structuring of SBML models.  Other packages and their current statuses are listed below.

## Questions about software support of SBML

### Is there a list of software that supports SBML?

For a long time, we maintained a database of tools (the SBML "Showcase"/SBML Matrix). This failed to be updated regularly, and in 2021 we removed it from the site to avoid frustrating users with outdated and misleading information.

### Where can I find certified SBML software?

There is no certification process for software today.

The SBML Team has been developing a comprehensive [SBML Test Suite](/software/sbml-test-suite) that makes it possible to test SBML support objectively and helps assess the degree of SBML support in different software packages. There is now also a [database](/facilities/database/) of results for different software simulation packages running the SBML Test Suite.

However, it is unlikely there will ever be a full "certification" mechanism for SBML. The development and support of SBML is funded primarily by government grants, and we simply do not have the resources it would take to run a true certification process of the sort common in industry.

### Are software libraries available for programming with SBML?

Yes.  The SBML Team itself has developed several free and open-source packages that can be used to support SBML in different environments, including two libraries:

* [libSBML](/software/libsbml) is a portable, embeddable API library providing language interfaces for C, C#, C++, Java, MATLAB, Octave, Perl, Python, and Ruby.  It runs on Linux, MacOS and Windows.  There is  a recent [paper describing libSBML](https://www.ncbi.nlm.nih.gov/pmc/articles/PMC2517632/) too.

* [JSBML](/software/jsbml) is a new pure Java implementation that tries to provide a similar API to [libSBML](/software/libsbml).

Other libraries have been developed by other groups.

### Which "Level" of SBML should I use in my software?

As a default, we recommend supporting the highest SBML Level that your software can support, because higher levels tend to fix design problems in lower levels of SBML.  However, if your software cannot support some of the features of a higher Level of SBML, a lower SBML Level may be more suitable.  Note that within Levels of SBML, you should always support the highest Version of the specification for that Level.

Beyond the default, we do recommend that you make other levels and versions of SBML available for input and output.  This will let users of your software more readily exchange their models with older software that might not support the latest level and version.

### How many SBML Level 3 "packages" do I need to support in my software?

This can depend a great deal on what kind of software you are creating.  In general, supporting as many packages as possible, and supporting translation of those models to core constructs when possible provides the greatest amount of flexibility for your users.  Beyond that, preserving package information, even when your software does not understand the constructs it provides, can make your software more useful for a user who needs certain features of a package for one purpose, and to use your software for another purpose.

One of the SBML Team's goals for [libSBML](/software/libsbml) is to provide translators to and from package constructs to core constructs, so (for example) your simulator should be able to import a model with [Hierarchical Model Composition](/documents/specifications) constructs, and translate it to a model with only core constructs without changing the mathematics of the model.  As other packages emerge, different translation paths will also emerge.

### What if I can't encode some feature that my software has?

You can try storing the data in SBML's `<annotation>` elements.  These are described in some detail in the [SBML specification documents](/documents/specifications).  The `<annotation>` elements can be enclosed within any SBML element and can contain elements of any namespace.  Note that data stored in annotations should not contain data that could be or is encoded already in SBML.

### How should I structure annotations?

The annotation data enclosed in a specific SBML element is assumed by other
applications to be directly associated with that specific element.
Therefore, it is important to decompose and locate annotation data
appropriately in an SBML document.  Avoid encoding all your annotations in
a single top-level attribute.  The data associated with, for example, an
individual species in a model should be encoded in the
`<annotation>` element enclosed within the SBML
`<species>` element representing that species in the
SBML file.

The SBML Level&nbsp;2 and Level&nbsp;3 specifications are the most complete source of information about the syntax of annotations in SBML, but it is a complex topic, and certain questions are not addressed directly in the specifications.  We therefore provide a [separate page with further explanations](/documents/elaborations/miriam_annotation_syntax/) about annotations in SBML Level&nbsp;2 and&nbsp;3.

### How should I include database identifiers such as ChEBI identifiers?

Annotations involving database identifiers can be created using the scheme described in Section&nbsp;6 of the [SBML Level&nbsp;2 and Level&nbsp;3 specifications](/documents/specifications).  The approach involves using [RDF](http://www.w3.org/RDF) annotations and specific BioModel elements and qualifiers detailed in the SBML specification.  You can find examples of models using this approach in [BioModels Database](http://www.ebi.ac.uk/biomodels).

### What should my software do when it encounters incorrect SBML?

Although an application can't be expected to detect all possible errors in an SBML document, it should do as much as it can to detect errors of syntax and self-consistency.  Such errors indicate that something is clearly wrong and that whatever (or whoever) wrote the model made an error.  You may want to double-check the validity of the model by testing it with the online [SBML Validator](/facilities/validator).  If the SBML file fails, the model should be rejected because it cannot be used as-is.  (Incidentally, if you encounter consistent differences between an SBML specification and a software package that claims to be compliant with that specification, please report this to the [sbml-interoperability discussion group](https://groups.google.com/forum/#!forum/sbml-interoperability).)

Detecting and handling incorrect SBML is different from detecting and handling an invalid _model_ encoded in SBML.

### How can I test whether I've implemented SBML support as intended?

The [SBML Test Suite](/software/sbml-test-suite) provides a large set of input files and corresponding results, and allow you to test your software's implementation of SBML handling.  It contains models from every level and version of SBML, plus models that test some SBML Level&nbsp;3 packages.  At present, it can only test aspects of SBML that affect the numeric results of a simulation, so other constructs (such as Constraints) must be tested in some other way.

## Questions about SBML features and their use

### Why are non-biochemical features such as explicit equations included in SBML?

The aim of SBML is to enable the construction of quantitative models that describe both the activity of biochemical networks and interaction of biochemical networks and other phenomena.  SBML allows the declaration of variables (non-constant parameters) and associated ODEs and DAEs to describe these phenomena.  Examples of these phenomena include the mechanical force generated by muscle cells and the electrical potential across a synapse.

### Why use MathML?  It's much more complicated than text strings

Here is a partial list of motivations for why the switch to
MathML was made in SBML Level&nbsp;2, in no particular order:

* The list of operators available in the text-string formula notation of Level&nbsp;1 was judged to be limited.  People wanted to expand the mathematical vocabulary to include additional functions (both built-in and user-defined), mathematical constants, logical operators, relational operators and a special symbol to represent time.  Rather than growing the simple C-like syntax of Level&nbsp;1 into something more complicated and esoteric in order to support these features, and consequently having to manage two standards in two different formats (XML and text string formulas), we chose to leverage an existing standard for expressing mathematical formulas in Level&nbsp;2: the content portion of MathML.

* There is no standard text-string formula syntax to choose from.  The notation in Level&nbsp;1 was inspired by C, but as many people have pointed out repeatedly, there are differences, and these differences need to dealt with by software tools parsing the infix notation.  Thus, this particular problem exists no matter what notation/encoding you choose&mdash;the infix text-string notation didn't offer an advantage in this particular regard.  Now imagine if we had to grow the syntax to accommodate more operators, user-defined functions, etc.  Even more people would complain about differences due to a non-standard mathematical syntax.

* Related to the above: using MathML means we can avoid having to define reserved words for various language features, such as the time symbol and the delay function.  MathML has a mechanism for introducing special terms and operators without having to define new identifiers in the language.  Without MathML, we would have had to choose arbitrarily an identifier for each of those quantities, and every new one that was deemed important in the future.  Parsing and generating expressions using these identifiers would be problematic in tools that used different built-in symbol values (for example, if a tool uses 't' instead of 'time' for the time symbol).

* Using MathML allows us to extend SBML without introducing new non-XML syntax.  For example if we wanted to introduce some form of modularity we might want a '.' operator in expressions to reference components of submodel instances.  We could agree on the introduction of a MathML operator to do this which would be tool neutral rather than again creating an arbitrary syntax, that tools would have to parse, which may or may not be similar to that used within the tools.

* Whether you parse formulas written as text strings, or parse formulas written as MathML, your software still needs to build up expression trees.  Once that's done, there is in principle not much difference between the two.

* MathML is proper XML, which means that tools using XML parsers can work with it directly.  Authors do not have to write a different kind of parser for the text-string infix syntax; they can use a generic XML parser if they wish.  Further, libraries specialized for MathML could be used by software developers, possibly saving development time and effort.  (Of course, the use of [libSBML](/software/libsbml) isolates software tools from all this even further.)

* Making SBML all-XML means that SBML is more amenable to tools that can process, manipulate and store XML, such as (e.g.) XSLT, XQuery, XPath, and other XML technologies.  To give an example of the power of this, it has made it possible to write XSLT transformations to take CellML 1.1 to SBML Level&nbsp;2.  It would have been difficult to construct text-string formulas from CellML reaction definitions using XSLT transformations.

All that said, there are some disadvantages to using MathML in SBML.  One
is that by introducing MathML part-way through the evolution of SBML, we
have created a legacy support problem by having two formula representations
with which to contend and interconvert.  Another is that people
_perceive_ MathML to require greater effort to support, but whether
this is true in practice depends on the underlying system.  For some
applications, it is actually easier to parse and handle MathML than a
text-string representation of mathematical formulas, because the MathML
expression structure is already made explicit and can be read using
available XML software.

### The SBML notion of a species seems peculiar, doesn't it?

Well, no, or yes, depending on your definition of "peculiar".

The SBML construct called _species_ represents a _pool_, that is, a set of "things" that are treated as being indistinguishable from the standpoint of the processes (reactions) in which they participate.  When the "same" species (a chemical or other thing) is present in different compartments, each must be treated as a different pool.  The reason for this is because the concentrations or partial pressures being different in the various compartments means that the chemical activities are different as well.  Also, the pH of different compartments being different, the electrochemical properties of a given chemical entity could be different (think about an enzyme in the cytosol and a lysosome).  Analytical software will therefore have to construct different state variables for the different pools, even if the pools contain the same kind of "thing".  This is actually a common concept in biochemical simulation, dating back to some of the earliest simulation software.

If you need to express a link between species with different identifiers, you can use the _species type_ construct available in SBML Level&nbsp;2, or else use the SBML annotation mechanism.

### Can I have two species with the same `name` attribute value?

Yes, this is perfectly legal SBML.  Of course, you would only want to do that if the species are actually the same conceptual type of entity&mdash;you wouldn't want to give the same names to, say, glucose-6-phosphate and ATP in a model, because it wouldn't make any sense.

Species and compartment identifiers in SBML refer to "things" that can participate in dynamical behaviors, but each identifier does not have to refer to a single unique entity.  It is possible that the same conceptual entity appears in multiple contexts in a model.  Since a species must be given a unique identifier in each compartment in which it appears (see the answer to the previous question for an explanation of why), it is convenient to give the species definitions all the same names.  It will usually make more sense to humans that way, and software can track the separate amounts of species in the different compartments by their identifiers.

In SBML Level 2, there are additional explicit constructs for species types and compartment types.  If you are using names to convey the idea that different entities are the same conceptual "thing" despite having different identifiers, you may want to indicate the relationship more strongly by defining common species types or compartment types, and then declaring the species/compartments to be of the appropriate types.

### Why don't SBML Level 2 and Level 3 define a default compartment?

Software developers are sometimes bothered by the fact that SBML does not
specify a default compartment; all compartments in SBML must be defined
explicitly.  There are several reasons for this:

* Not all models use compartments.  If SBML defined a default compartment that would be present when no compartment was explicitly defined by a model, then there would be no way for models that did not need compartments to leave it out.

* The most likely default compartment definition would involve a 3-dimensional compartment of volume `1` in some default unit (e.g., mole).  Leaving this implicit (as was possible in Level&nbsp;1) turned out to be more prone to errors in the construction of models, because modelers would often forget to check the units on the size of the compartment.

* SBML would have to define a reserved identifier to refer to the default compartment.  This is a recipe for an eventual identifier collision when someone, somewhere, accidentally uses the same identifier.

* A default compartment would only save effort in developing the SBML _writing_ component of a software tool.  The writing component is the easy part; reading and interpreting is the harder part.  Defining a default compartment would not help readers much, if at all.

* A default compartment would be a special case which all SBML parsing programs would have to handle specially.

That said, if you wish to create an explicit SBML compartment and flag it as 'the default compartment', this is perfectly acceptable.  The SBO term [SBO:0000410](http://www.ebi.ac.uk/sbo/main/SBO:0000410) is commonly used for this purpose, for exchangeability.

### How do you represent models that don't define a compartment?

If the model uses species (in the SBML sense of _species_), then it will be necessary to create a compartment in the SBML representation of the model, because all species must be located somewhere. One approach is to locate all species in a single compartment with unit volume. When making changes like this to accommodate SBML requirements, it is a good idea to write a note (perhaps stored in a `<notes>` element inside the top-level `<model>` element) explaining what has been done. This will help future readers of the SBML file to understand why certain choices were made.

If the model does not use the SBML species construct, then in SBML Levels 2 and 3, no compartment needs to be defined anyway, so it should be no problem to leave out compartments.

### Why is there a distinction between "assignment" and "algebraic" rules? Aren't they equivalent?

Although it is typically easy to transform between assignment and algebraic
rules, SBML provides separate constructs for them, for the following reasons:

* Algebraic rules define the point in the model where there is a circular dependency between variables.  For instance, the equations _x = 2 * y_ and _y = x + 1_ have a circular dependency.  It is not possible to form such a dependency in scalar rules (see the SBML Level&nbsp;2 specification).  At least one of the example equations would have to be encoded as an algebraic rule in SBML.

* Many tools are not capable of supporting algebraic rules (DAEs).

* Those tools that _do_ support algebraic rules make the distinction between assignment rules and algebraic rules.

### If some tools don't support algebraic rules, why not just use assignment rules instead?

In a linear system, it will always be possible to write algebraic rules as assignment rules.  However, it will often be awkward to do so, particularly when the system involves any more than three dependent variables and equations, making the assignment rule form prone to mistakes, and hard to understand.

In non-linear systems, it may be impossible to write the equations in an assignment rule form.  As an example, for one model it might be true that _y = ln(x)_ and that _y = k &sdot; x_.  For some values of k, there will be no solution; for one value of k there will be a single solution; and for other values of k there will be two solutions.

Finally, it is the case that often in the literature, equations may be written as (essentially) algebraic rules.  The partial pressure of oxygen in arterial blood is one such example.

### Why can't user-defined functions be recursive in Level 2 or Level 3?

Functions definitions in SBML Levels&nbsp;2 and 3 are designed to allow them to be substituted in place of the function call operator; that is, they are deliberately defined so that software tools can treat them like macros rather than functions.  This would not be possible if functions were allowed to be recursive.

### Why doesn't SBML provide a way to define constants?

It does.  Use the SBML `parameter` construct and set the attribute `constant` to `true`.  See the next question.

### Are you saying that parameters may not be constant in SBML?  That's crazy talk!

Yes, that's what we're saying, but it's not crazy talk. There are at least two reasons for doing it this way:

* The object data structure defining a variable (other than species or compartment) and a constant would be nearly identical.  The only difference is that one would be called constant and the other allowed to vary.  SBML simply uses a more parsimonious representation involving the use of just one object, with a flag, `constant`, indicating whether the symbol value is constant during a simulation.

* Some modelers and software systems actually _do_ use the concept of time-varying parameters.  See, for example, this [FAQ item from SAAM II](http://depts.washington.edu/saam2/support/varying.html).  In SAAM II, "_any parameter could in fact be defined as time-varying_".

And you probably thought we were just making this stuff up!

### Why was the `constant` attribute on species and compartments introduced?

If a model does not contain algebraic rules, it is possible to infer which components (species, compartment and parameters) are meant to change in value by examining the set of scalar rules, rate rules, and reactions.  However, if a model contains algebraic rules, you need information about which symbols are meant to be variables and which constants, to solve the system of equations. The mere occurence of a symbol in an algebraic rule doesn't imply that the symbol is a variable.

OK, you ask, but why have a constant flag on _species_?  Why not define constant species as parameters instead? Well, if you define something as a parameter, you lose information about the nature of that symbol: a parameter has nothing on it that says whether it is meant to be the amount of a species, or a volume of a compartment, or a numeric constant of any other kind. However, such semantic information may be useful in a model&mdash;it may be useful for a model interpreter to be able to determine that a particular symbol is meant to be treated as a species amount or concentration. For example, graphical editors may be able to use this information.  Defining something as a species says to an SBML reader, "this is a species, not some numerical or physical constant that defines a characteristic of the system". More detailed semantic information can of course be added using SBO labels or other annotations, but these annotations are not widely supported, so SBML provides these very primitive facilities to help software get by.

### What is this "boundary condition" business?

The `boundaryCondition` attribute on `<species>` codifies the following notion: In some systems of reactions, certain chemical species are unchanged by the reactions in the system. For example, this might happen if there is a vast overabundance of the species compared to the other ones, or the particular species is maintained (buffered) by some external means. In models of such systems, it is important to be able to indicate that the model interpreter should '_not_' generate an ODE for that species. In SBML, this is indicated by setting the `boundaryCondition` attribute of that species to "`true`".

A critical point in the previous paragraph is the part that says the model interpreter should not _generate_ an ODE from the system of reactions for species that are labeled as boundary conditions. It does '_not_' mean that there '_cannot_' be an ODE or other constraint generated as a result of a '_rule_' in the model.  You can have `boundaryCondition="true"` for a species and that species can still appear on the left-hand side of an ODE if there is an SBML Rule for it.

Summary: `boundaryCondition="true"` means do not generate an ODE for this species from the stoichiometry matrix of the system of reactions.

### Why can't you assign different units of time to (e.g.) event delays?

SBML Level 2 Version 1 provided this capability.  It defined unit attributes on various SBML components such as kinetic laws and event delays, letting a model redefine units for individual quantities.  Unfortunately, this turned out to introduce serious practical problems.  First, one could construct models in which it was impossible, without additional information, to convert quantities to the same consistent units throughout the model (a necessary prerequisite to constructing a system of equations from the model definition).  Second, and in practice more important, the freedom to reassign units in so many different contexts may have been convenient for model _writers_, but it made it hugely more difficult for model _readers_ to interpret a model&mdash;it placed a large burden on the software interpreting a model.  And third, it was much more error prone, with modelers creating models where they did not realize they had made unintended errors in unit consistency.

SBML Level 2 Version 2 removed _most_ of the places where units could be redefined on individual components, but left some (notably, the time units on event delays).  SBML Level&nbsp;2 Version&nbsp;3 further removed these attributes.  These actions were taken based on the experiences of SBML users and developers.  (See, for example, [this discussion thread](http://sbml.org/Forums/index.php?t=tree&th=557&mid=1797&rid=0&rev=&reveal=) from 2005.)

### How can I achieve Level 2 semantics for events using the new event semantics in Level 3?

In SBML Level 2, once _fired_, all events were (eventually) _executed_.  This behavior is equivalent to setting the new `persistent` flag on the Trigger to `true`.

Similarly, in SBML Level 2, no event could fire at the beginning of the simulation (_time = 0_), as no transition of the Trigger's boolean state could take place at that time.  Now that the Trigger's boolean state is defined with the `initialValue` attribute, a transition from false to true is possible: the old behavior is equivalent to setting the `initialValue` to `true`.

Another change in SBML Level 3 is that when multiple events were to be _executed_ at the same time in SBML Level 2, the order in which those events were to fire was left undefined, and was in fact undefinable.  In fact, some read the specification to say that not only was the order undefined, the behavior of the simulator was undefined entirely.  A clarification was issued to say that it was only the order of event firing that was left undefined in the SBML Level 2 specification, but regardless, we have attempted to be much clearer in this specification as to what exactly is undefined when, and how the modeler may override the old "undefined" behavior with the new Priority object.  Level 2 behavior may be replicated by simply not including the new Priority object.

### What are the semantics of the new initialValue attribute on Level 3 event Triggers?

The `initialValue` attribute is a Boolean value added in L3 so that events could trigger at the start of the simulation (_time&nbsp;=&nbsp;0_).  It is considered to be the value of the trigger before the simulation begins; at the point at which the simulation starts, the value of the trigger changes to its normal value.  If this means that the `initialValue` attribute of the trigger was `false` but its boolean expression evaluates to `true` at _time = 0_, this counts as a false-to-true transition, and the event is triggered.

### If a parameter has no units declared, what units does it have?

SBML assumes that the parameter has the units appropriate for its use within a model.  In some cases it may be possible to derive these units from a mathematical expression using the parameter; assuming that the units of all other parts of the expression are known.

However, if parameters with undeclared units are used, it makes checking unit consistency difficult if not impossible.  It is therefore advisable, where possible, to include units for parameters within a model.

### I want to use fractional exponents on units, how can I do this?

The SBML `unit` construct restricts the attribute `exponent` to an integer value.  Thus, it is not possible to explicitly declare a unit with a fractional exponent.  There are also restrictions on the units of expressions to which power or root functions may be applied.  These restrictions are required to ensure that parameters and mathematical expressions used within SBML are physically sensible.

It is possible to overcome the restrictions by declaring additional parameters, with appropriate units, that can be used to normalise values within expressions. For example, consider an expression such as $[A]^\frac{1}{2} * [B]^\frac{1}{2}$ where `[`&nbsp;`]` denotes a concentration.  This would not be a valid expression within SBML since it produces intermediate units of concentration<sup>1/2</sup>.  To correctly encode this, declare a parameter p, with value 1 and units equal to the units of concentration.  Using this parameter and rewriting the expression as $[\frac{A}{p}]^\frac{1}{2} * [\frac{B}{p}]^\frac{1}{2} * p$ produces the same numeric result, while preserving physically sensible units at all stages of the calculation.

### Does the "_same units_" in assignments mean dimensionally or actually equivalent?

It means they must actually be the same!

There are several constructs in SBML where a mathematical expression can be used to assign value to a variable (`species`, `compartment` or `parameter`) within the model.  The specification states that the units of both sides of the equation should be the same.  This refers to the actual physical unit, not the dimensionality&mdash;`metre` is *_not_* the same as `foot` !

### Why does SBML Level 2 require an XML declaration?

Readers familiar with XML may note that [XML version 1.0](http://www.w3.org/TR/REC-xml/#sec-prolog-dtd) does not
require an XML declaration; the requirement was introduced in
[XML&nbsp;1.1](http://www.w3.org/TR/xml11/#sec-prolog-dtd).  Nonetheless, SBML Level&nbsp;2 requires the declaration.  The
motivation comes from the practical experiences of SBML software
developers, who have found that different XML parsers on different
operating systems make different default assumptions if the XML
declaration is omitted.  Requiring the declaration of the XML
version and encoding is an aid to greater compatibility between
different systems exchanging SBML.

### What is the `hasOnlySubstanceUnits` attribute for?

Broadly speaking, a value of `true` for `hasOnlySubstanceUnits` on a species declaration means that wherever the species' identifier appears in a mathematical formula, its units are to be interpreted as _substance_ units only, and not _substance_/_size_ (i.e., concentration or density) units.  Note that this is regardless of how the species' initial quantity is defined: no matter whether the species is given a concentration or a substance value, if it has  `hasOnlySubstanceUnits`=`true`, then the identifier of the species always stands for substance units.

This is an admittedly badly-named attribute.  A better name might have been "symbolMeansAmount" or "hasSubstanceValue". Despite the poor name, the consensus among SBML people is changing the name is not worth the cost and hassle of backward incompatibilities a name change would create.

### What is the symbol for time in SBML?

The way to access time (i.e., the current time in "simulation time") is using the MathML `<csymbol>` construct.  This is probably easiest to explain using an example:

```
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <apply>
    <plus/>
      <ci> x </ci>
      <csymbol encoding="text" definitionURL="http://www.sbml.org/sbml/symbols/time">
           t
      </csymbol>
   </apply>
</math>
```

The expression above encodes the formula <em>x + time</em>, where <em>time</em> signifies the current point in time during a simulation.

_Important_: there is frequent confusion around the purpose of the content of the `<csymbol>` element (i.e., the `t` in the example above).  It is _meaningless_ and inaccessible to simulations.  The `t` has no relationship (except perhaps accidental) to whatever symbol might represent time in a given software environment or model.  According to the MathML specification, software tools may display this content (again, the `t`) to users, so very often, the content of the `<csymbol>` is chosen to be something evocative.  But the actual entity representing time in an SBML model is the `<csymbol>` element itself, not the content of this element.  In summary, don't pay attention to `t`.

### Why doesn't SBML require consistent units?

SBML Level&nbsp;2 Version&nbsp;4 and SBML Level&nbsp;3 do not require models to have units declared or to have consistent units&mdash;correctness and consistency of units is not a condition for a valid SBML encoding of a model.  This may seem strange, so some words of explanation are warranted.  The decision to relax requirements of unit consistency was made via a [community vote in 2007](http://sbml.org/Forums/index.php?t=msg&th=1124&rid=0#msg_4249) and it represents a change from Level&nbsp;2 Version&nbsp;3.  The realization that this position had to be taken resulted from many people's long experience with encoding models.  There are multiple reasons for the decision, but probably the most convincing argument is the following. There exist models in the published literature that have inconsistent units.  Regardless of what one thinks about such models, if we want to allow SBML to encode them _as published_, SBML _cannot_ require consistency of units as a precondition of a valid SBML encoding.  If an inconsistency were treated as an error of SBML encoding, then it would be impossible for SBML to encode such models.

### Why can't I use the `<rem>` operator in SBML MathML?

When the decision came about to use MathML instead of infix strings, it was decided to keep the MathML subset allowed in SBML documents as small as possible. The allowed subset mirrors closely what was allowed in the infix format. This was done to ensure rapid adoption of MathML.

Because of these reasons some relatively straightforward MathML operators such as `<rem>` (remainder) were omitted. It should be noted however that it is relatively easy to implement the missing functions using user-defined functions (i.e., via the SBML `<functionDefintion>` construct). On the example of the remainder, we could rewrite the rem operator as: _a rem b = a - b*floor(a/b)_ which in SBML would look like this:

```
<functionDefinition id="rem" name="remainder">
  <math>
    <lambda>
      <bvar>
        <ci> a </ci>
      </bvar>
      <bvar>
        <ci> b </ci>
      </bvar>
      <apply>
        <minus/>
        <ci> a </ci>
        <apply>
          <times/>
          <ci> b </ci>
          <apply>
            <floor/>
            <apply>
              <divide/>
              <ci> a </ci>
              <ci> b </ci>
            </apply>
          </apply>
        </apply>
      </apply>
    </lambda>
  </math>
</functionDefinition>
```

in order to use this remainder then in another MathML expression, one would call it like any other user defined function:

```
<math>
  <apply>
    <ci> rem </ci>
    <ci> a </ci>
    <ci> b </ci>
  </apply>
</math>
```

Note: Strictly speaking the remainder operator is: _a rem b = a - b*truncate(a/b)_ where truncate always rounds toward zero. If that would matter for a model above one would replace the `<floor/>` expression by a piecewise expression: _piecewise(floor(a/b), gt(a/b, 0), ceil(a/b))_ to read:

```
<functionDefinition id="rem" name="remainder">
  <math>
    <lambda>
      <bvar>
        <ci> a </ci>
      </bvar>
      <bvar>
        <ci> b </ci>
      </bvar>
      <apply>
        <apply>
          <minus/>
          <ci> a </ci>
          <apply>
            <times/>
            <ci> b </ci>
            <piecewise>
              <piece>
                <apply>
                  <floor/>
                  <apply>
                    <divide/>
                    <ci> a </ci>
                    <ci> b </ci>
                  </apply>
                </apply>
                <apply>
                  <gt/>
                  <apply>
                    <divide/>
                    <ci> a </ci>
                    <ci> b </ci>
                  </apply>
                  <cn type="integer"> 0 </cn>
                </apply>
              </piece>
              <otherwise>
                <apply>
                  <ceiling/>
                  <apply>
                    <divide/>
                    <ci> a </ci>
                    <ci> b </ci>
                  </apply>
                </apply>
              </otherwise>
            </piecewise>
          </apply>
        </apply>
      </apply>
    </lambda>
  </math>
</functionDefinition>
```

### Why have SpeciesType and CompartmentType disappeared in Level&nbsp;3?

In reality, SpeciesType in SBML Level 2 was a construct intended to support the ability to define "generalized reactions", as well as multicompartment entities.  The idea of generalized reactions is to allow easy definition of reactions that take place in different compartments but otherwise are identical; this is essentially the concept of rule-based reactions of a sort found in systems such as [BioNetGen](http://bionetgen.org).  However, while SpeciesTypes and CompartmentTypes were accepted for introduction in SBML Level&nbsp;2, the SBML community rejected the introduction of generalized reactions.  Thus, the primary purpose of the SpeciesType construct was never realized.  Moreover, it also turned out that in the 4 years of the existence of SpeciesType and CompartmentType in Level&nbsp;2, very little software support was developed for them.  As a result of these considerations, during the development of SBML Level&nbsp;3, it was decided that these constructs did not belong in Level&nbsp;3 Core, and any such constructs should be moved instead to Level&nbsp;3 packages.

### I used SpeciesType to manage cross-references of similar entities&mdash;what do I do now?

Some software systems use SpeciesType as it is intended in SBML Level&nbsp;2, to represent the class or type of entities that may appear in multiple compartments in a model.  Some of those software systems also annotate those types with references to database entries.  It may appear that the _apparent_ loss of SpeciesType in Level&nbsp;3 is a going to be a problem for them.  However, consider the following:

1. SBML Level 2 is not dead.  Not only are SBML Levels supposed to co-exist (as mentioned elsewhere in this FAQ), but software supporting Level&nbsp;2 will continue for many years&mdash;after all, just because Level&nbsp;3 has been introduced does not mean that software will suddently _stop_ supporting Level&nbsp;2.  Software developers are much more likely to only _add_ support for Level&nbsp;3 while simultaneously maintaining support for Level&nbsp;2.  So models and tools can be fully expected to continue supporting Level&nbsp;2 for the foreseeable future.  If your modeling efforts need Level&nbsp;2's SpeciesType construct, by all means, continue to read and write Level&nbsp;2.
2. SpeciesType are part of the [Level&nbsp;3 "Multi" package](/documents/specifications).
3. Another upcoming Level&nbsp;3 package, [Groups](/documents/specifications), provides a generalized grouping mechanism that should serve for lumping annotations and other information about similar entities in a model.

### Do I have to put assignment rules in any particular order?

A question that arises in SBML Levels 2 and 3 is whether the list of _AssignmentRule_ constructs should be taken as-is or reordered.  While ordering doesn't matter mathematically, it does matter for numerical integrators.  It is therefore best practice to _reorder the list of rules_.  For example, if a model definition contained rules equivalent to the following:

```
b = a + 10 {seconds}
a = time
```

then to make the evaluation rules independent of the steps sizes used by numerical integrators, you will want to reorder the rules thus:

```
a = time
b = a + 10 {seconds}
```

Beginning with [libSBML](/software/libsbml) version 5.2.0, [libSBML](/software/libsbml) provides an API to reorder all the assignment rules in a model.  Here is a C++ example of calling this API:

```
ConversionProperties props;
props.addOption("sortRules", true, "sort rules");

SBMLConverter converter;
converter.setProperties(&props);
converter.setDocument(&doc);
converter.convert();
```

### Why doesn't SBML allow more than one assignment rule for the same symbol?

The set of _AssignmentRule_ constructs in a model can only have one occurrence of a given symbol in the left-hand side of the assignments. The reason is because SBML fundamentally cannot stipulate what algorithms may or may not be applied to a model.  Therefore, it cannot define such things as when or how often rules are evaluated.  (For instance, SBML doesn't define the order with respect to evaluating reactions.)  The implication of _that_ is that rules in SBML must not change the state of a model no matter when, or how often, they might be evaluated.  Such a situation might not hold true if SBML allowed more than one assignment rule for a given variable.

If SBML allowed the same symbol to appear in the left-hand side of multiple assignment rules, then it would have to also tell software developers when and how those left-hand sides (and reactions, and events, and etc.) must be evaluated.   Imagine the arguments people would have then!

Instead, SBML doesn't limit the solution methods applied to models; it just provides a way to represent the mathematical model.  This fact is considered to be a strength of SBML, and has allowed many more applications of SBML than only time-course simulation.

A related question that arises in this context is, "what about the model as the user defined it? What if you want to preserve how they wrote the model, including the ordering of assignments?"  This is often asked in reference to software environments that allow users to type models using a script-language interface.  The answer to the question is the following.  If the software wants to preserve and recreate what the user typed, it can write annotations into the SBML to describe what the user typed literally.  Then the software could do the restructuring required to fit the software's object model to SBML's object model, and still have a way to store and recover a view of what the user actually typed.

Some applications have their own native formats and read/write that; this feature allows them to reconstitute more precisely what the user typed.  Those applications then read/write SBML solely as an exchange format, with the understanding that it will not be as rich of a representation as the tool's native format.

## Questions about the SBML development process

### Where did the name "SBML" come from?

When SBML was first conceived, around the year 2000, [Hiroaki Kitano](http://en.wikipedia.org/wiki/Hiroaki_Kitano) suggested the name _Systems Biology Markup Language_.  The name stuck.

### What is the overall SBML development process?

SBML development has been and continues to be motivated and directed by the systems biology community.  The process is managed by the _SBML Editors_ (see next question), but they do so under the control of the community.  The editors collect proposals for changes to SBML from the SBML Working Groups and from other groups and individuals, and then seek to establish a consensus in the community about how to proceed with the proposals.  With this information, the editors assemble some of the proposals into a draft specification for a new edition of SBML.  After this draft has been reviewed by the community, it becomes a final specification for the new edition of SBML.  (_Edition_ in this context can be either a new SBML Level, or a new version of an existing level, or a new release of an existing version.)

### Who are the SBML Editors?

The SBML Editors are listed on [a separate page](/about/core) on the
sbml.org website.  There are always five editors, each serving three-year terms.

### What are the annual SBML Meetings?

For many years, there were SBML-specific meetings, formally entitled
_Workshops on Software Platforms for Systems Biology_.  They were often held as satellite workshops of the annual International Conference on Systems Biology (ICSB), usually in the fall or early winter of every year.  SBML Forum meetings allow for significant discussion of new SBML proposals and interoperability issues.

In 2010, the first [COMBINE](http://co.mbine.org/) meeting was held,
with the intention of including other, parallel standards development groups
in systems biology and beyond.  These meetings have continued annually since then.

In parallel since 2003, regular hackathons have been held: working meetings where the focus is on software interoperability and developing solutions to issues of SBML support.  In 2010, these hackathons were also opened up to the wider biological standards community, and renamed HARMONY (HAckathon on Resources for MOdeliNg in biologY).  These meetings have also continued annually since then.

Presentations and other materials from every meeting are archived in the
[events](/community/events) area of the SBML.org website.

### Why isn't SBML part of a standards process like OMG?

Some time ago, the SBML Editors at the time considered submitting SBML as a proposal to the [Object Management Group (OMG)](http://www.omg.org/) in response to a request for proposals (RFP) for pathways representations.  However, the SBML community decided at the 7th SBML Forum meeting that while it would be useful to have the endorsement of a standards body like the OMG, people's time and resources would be better spent working on SBML development rather conforming to all the standards requirements of the OMG process.

This does not rule out the possibility of seeking standards-body recognition sometime in the future.

Note that there is a standard MIME type for SBML; see the relevant separate entry elsewhere in this FAQ.

### How do I report errors and issues in the SBML specifications?

Please use the [issue tracking system](https://github.com/sbmlteam/sbml-specifications/issues) for the SBML specifications on GitHub.  To view reported issues for particular specifications, click the '[Labels](https://github.com/sbmlteam/sbml-specifications/labels)' button and select the label for the desired specification.)

### How do I propose changes or additions for SBML Level X?

There are several ways, with the first one below being preferred because it's the quickest and easiest:

1. Start a discussion on the [sbml-discuss](http://sbml.org/Forums/) list/forum.  This is sure to provoke a response :-).  Doing so also helps find out whether the capability is not already in SBML in some other form, because someone will point out if it is.
2. You can also attend an [SBML event](/community/events), in particular the annual COMBINE meetings, where proposed changes to SBML are always welcome.
3. Finally, if you are shy or just want to pose a question in advance of making public statements, you can [send email to the SBML Editors](mailto:sbml-editors@googlegroups.com).

### SBML development is too slow&mdash;can't it be faster?

This is a can't-win situation.  The archives of the [sbml-discuss mailing list](http://sbml.org/Forums) as well as anecdotes from SBML workshops show that for every person who complains about SBML development being too slow, there is another who complains SBML is changing too rapidly.  It seems impossible to please everyone.

### Where does the funding come from to keep SBML development going?

The initial development of SBML from its inception through the year 2003 was principally funded by the [Japan Science and Technology Agency](http://www.jst.go.jp/EN/) under the [ERATO Kitano Symbiotic Systems Project](http://www.symbio.jst.go.jp/symbio) headed by Hiroaki Kitano.  Many agencies and commercial organizations supported smaller parts of overall SBML development as well as workshops and travel expenses. Many more academic organizations supported people who spent considerable time working on SBML and related projects despite that it was not an official aspect of their research.  From 2003-2020, the primary source of stable funding has been the [National Institute for General Medical Sciences](http://www.nigms.nih.gov) under grant GM070923 to Michael Hucka (Chair of the SBML Editors).  Since that time, support has mostly come from volunteers, with particular projects receiving funding from various organizations and groups.  A more detailed list of funding acknowledgments is available on a [separate page](/about/funding).

## Miscellaneous questions

### I have some SBML that hasn't been formatted nicely.  Is there a way to clean it up?


[LibSBML](/software/libsbml) includes a demo program that simply echoes whatever SBML is given to it, and in the process of writing the output, it does a pretty reasonable job of pretty-printing the XML.  The reformatting facility is actually built into [libSBML](/software/libsbml) (it's what [libSBML](/software/libsbml) does automatically), not the demo program, which means any application you build with [libSBML](/software/libsbml) will do it too.

### Who runs sbml.org?

The [SBML Team](/about/core) maintains the server at the California Institute of Technology, in Pasadena, California, USA.

### What's the difference between all the SBML mailing lists?

The SBML community has a number of mailing lists implemented as Google Groups. Please see the [separate page list listing the groups](/community/forums).

Under no circumstances will we willingly divulge the memberships of the mailing lists to third parties.

### Does SBML have a Twitter feed?

Yes!  It's [@sbmlnews](http://twitter.com/sbmlnews).
