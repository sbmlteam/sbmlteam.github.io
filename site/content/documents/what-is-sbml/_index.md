+++ # -*- mode: html -*-
#=====================================================================
title  = "What is SBML?"
date   = 2019-04-07
layout = "single"
#=====================================================================
+++

<div class="rounded-corners" style="float: right; margin: 10px 5px 10px 15px; background-color: #e0e0e0">
<div class="sm-font" style="padding: 0 8px 0 8px; line-height: 180%">
Fru<sub>ex</sub> &rarr; Fru <br>
GLC<sub>ex</sub> &rarr; Glc <br>
ATP + Glc &rarr; ADP + HexP <br>
ATP + Fru &rarr; ADP + HexP <br>
2 HexP &rarr; Suc6P + UDP <br>
Suc6P &rarr; phos + Suc <br>
Fru + HexP &rarr; Suc + UDP <br>
Suc &rarr; Fru + Glc <br>
HexP &rarr; glycolysis <br>
Suc &rarr; Suc<sub>vac</sub>
</div>
<div class="sm-font" style="margin: 0 8px 0 8px; padding: 4px; background-color: #fff; width: 18em">
<em>Can you predict what a set of reactions like this will do when you start the system with different initial quantities? </em></div>
</div>

The starting point is an appreciation that **computational modeling** of biological systems is no longer a fringe activity&mdash;it's a _requirement_ for us to make sense of our vast and ever-expanding quantities of data.  This reality is acknowledged and reinforced by a vast increase over the past two decades in the number of journals, books and articles having computational and systems biology emphases.

At its most basic, computational modeling is no different from modeling as it's practiced by all scientists, whether in biology or elsewhere.  The extra but crucial step is casting the model into a formal, computable form that can be analyzed rigorously using simulation and other mathematical methods.

Different representations of models are useful for different purposes. [Graphical diagrams](http://sbgn.org) of biological processes are useful for visual presentation to humans, but at the level of software, a different format is needed for quantifying a model to the point where it can be simulated and analyzed.  That's where the Systems Biology Markup Language (SBML) comes in.

Simply put, **SBML is a machine-readable format for representing models**.
It's oriented towards describing systems where biological entities are involved in, and modified by, processes that occur over time.  An example of this is a network of biochemical reactions.  SBML's framework is suitable for representing models commonly found in research on a number of topics, including cell signaling pathways, metabolic pathways, biochemical reactions, gene regulation, and many others.


## SBML is for software 

SBML does _not_ represent an attempt to define a universal language for representing quantitative models.  It would be impossible to achieve a one-size-fits-all universal language. A more realistic alternative is to acknowledge the diversity of approaches and methods being explored in systems biology, and seek **a common intermediate format**&mdash;a _lingua franca_&mdash;enabling communication of the most essential aspects of the models.

SBML is neutral with respect to programming languages and software encoding; however, it's oriented towards allowing models to be encoded using [XML](http://www.w3.org/XML).  By supporting SBML as a format for reading and writing models, different software tools (including programs for building and editing models, simulation programs, databases, and other systems) can directly communicate and store the _same_ computable representation of those models.  This removes an impediment to sharing results and permits other researchers to start with an **unambiguous representation of the model**, examine it carefully, propose precise corrections and extensions, and apply new techniques and approaches&mdash;in short, _to do better science_.


## SBML is for people too

SBML enables research teams to use a single model description throughout a project's life cycle even when projects involve heterogeneous software tools.  An ecosystem of SBML-compatible software tools today allows researchers to use SBML in all aspects of a modeling project, including creation (manual or automated), annotation, comparison, merging, parametrization, simulation/analysis, results comparison, network motif discovery, system identification, omics data integration, visualization, and more.  Such use of a standardized format, along with standard annotation schemes and training in reproducible methods, improves research workflows and is generally recognized as promoting research reproducibility.

The adoption of SBML offers **many benefits**, including: (1) enabling the use of multiple tools without rewriting models for each tool, (2) enabling models to be shared and published in a form other researchers can use even in a different software environment, and (3) ensuring the survival of models (and the intellectual effort put into them) beyond the lifetime of the software used to create them.


## What can _you_ do with it? 

If you're a biologist interested in doing computational modeling, this may be all you need to know about SBML.  Today's modern software packages hide the details of SBML and provide you with interfaces that help you focus on your modeling and analysis tasks.

If you're a software developer or an advanced modeler, you probably want to learn just a little bit more about SBML.  Please go to the [SBML specification documents](/documents/specifications).


## Evolution and growth of SBML 

SBML development has not stopped&mdash;it's an active area of work today.  The [SBML Development_Process](/documents/process) defines the community-oriented development approach. We welcome you to get involved!

The development of SBML is stratified in order to organize architectural changes and versioning. Major editions of SBML are termed _Levels_ and represent substantial changes to the composition and structure of the language. Models defined in lower Levels of SBML can always be represented in higher Levels, though some translation may be necessary. The converse (from higher Level to lower Level) is sometimes also possible, though not guaranteed. The Levels remain distinct; a valid SBML Level&nbsp;1 document is not a valid SBML Level&nbsp;2 document. Minor revisions of SBML are termed _Versions_ and constitute changes within a level to correct, adjust, and refine language features. Finally, specification documents inevitably require minor editorial changes as its users discover errors and ambiguities. Such problems are corrected in new _Releases_ of a given SBML specification.

The latest generation of SBML, which is Level 3, is modular in the sense of having a defined core set of features and optional packages adding features on top of the core. This modular approach means that models can declare which feature-sets they use, and likewise, software tools can declare which packages they support. It also means that the development of SBML Level&nbsp;3 can proceed in a modular fashion. The development process for Level&nbsp;3 is designed around this concept. SBML Level&nbsp;3 package development is today ongoing activity, with packages being created to extend SBML in many areas that its core functionality does not directly support. Examples include models whose species have structure and/or state variables, models with spatially nonhomogeneous compartments and spatially dependent processes, and models in which species and processes refer to qualitative entities and processes rather than quantitative ones.
