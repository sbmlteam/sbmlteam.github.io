+++
#=====================================================================
active = true
title = "JSBML Documentation"
date = 2020-03-19
layout = "single"
#=====================================================================
+++

{{< toc >}}

JSBML is a library that will help you to manipulate SBML files.  To use it, you must first install JSBML and configure your environment to use it.  Steps for doing this are described below.


## Obtaining and configuring JSBML 

JSBML is written in Java and to use it, you will need a Java Runtime Environment(JRE) 1.7 or higher.


### Using the JSBML JAR file

Before starting to use JSBML, you will need to configure your Java class path. JSBML provides you with two options:
* Using the JSBML `.jar` file with dependencies. In this case, you only need to include the file in your `CLASSPATH`.
* Using the JSBML `.jar` file without dependencies. In this case, you need to add all the JSBML dependencies.


#### Using the JSBML JAR with dependencies

The version of the JSBML `.jar` file that includes dependencies is a merged JAR file that contains all of JSBML’s required third-party libraries. You can download it from the [JSBML download area](https://github.com/sbmlteam/jsbml). Once you have installed the JAR file on your computer, it is sufficient to add it to your Java build and/or class path in order to use JSBML.


#### Using the JSBML JAR without dependencies

If you use the version of the JSBML `.jar` file that does not include dependencies, you need to add the dependencies to your Java class path in some other way.  The following are the dependencies (and version numbers) that JSBML was developed and tested with.  More recent versions may also work. When you have all of these dependencies in your `CLASSPATH` alongside the JSBML `.jar` file, you are ready to work with JSBML.

* biojava-ontology-4.0.0.jar
* jigsaw-dateParser.jar (a version of the [jigsaw](http://jigsaw.w3.org) library containing one class to manipulate dates)
* junit-4.8.jar
* log4j-1.2-api-2.3.jar 
* log4j-api-2.3.jar
* log4j-core-2.3.jar
* log4j-slf4j-impl-2.3.jar
* slf4j-api-1.7.21.jar
* stax2-api-3.1.4.jar
* staxmate-2.3.0.jar
* woodstox-core-5.0.1.jar
* xstream-1.3.1.jar


### Using Maven

For more information on using Maven, please see the [dedicated Maven page for JSBML](/software/jsbml/maven-configuration).


### Using the source distribution

You can obtain a copy of the JSBML source files from GitHub, using git or Subversion, and compile JSBML yourself.  To do that, you will need to have a [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) installed, the Apache [Ant](http://ant.apache.org/) build system, and [git](https://git-scm.com) or [subversion](http://subversion.apache.org/) (version control system).  You can get the JSBML source code using git as follows:

    git clone https://github.com/sbmlteam/jsbml.git jsbml

Using SVN:

    svn co https://github.com/sbmlteam/jsbml.git/trunk jsbml

If you are only interested in working with the SBML core, i.e., neither SBML extensions, nor JSBML modules, you may want to do the following instead:

    svn co https://github.com/sbmlteam/jsbml.git/trunk/core jsbml-core

Then, to compile and create the JSBML `.jar` file:

    ant jar

Optionally, to run the tests:

    ant test

(Note: there are no easy ways to do a partial clone with git.  If you really want to use git and really want to do a partial checkout with it, see this question in Stack Overflow: [git sparse checkout](http://stackoverflow.com/a/13738951/278405))


## Using JSBML

The use of JSBML presumes familiarity with SBML.  If you are not familiar with SBML, a good starting point would be to read the [SBML specifications](/documents/specifications). If you have questions about SBML, you may find answers in the [SBML FAQ](/documents/faq) or asking other people in the general forum [sbml-discuss](https://groups.google.com/d/forum/sbml-discuss).


### General documentation for JSBML

Several resources are available for learning to use JSBML:

* The [JSBML User's Guide](https://github.com/sbmlteam/jsbml/raw/master/doc/user_guide/User_Guide.pdf) is the best introduction to using JSBML.  This guide includes a general introduction to working with SBML using JSBML and the documentation on the differences between JSBML and [libSBML](/software/libsbml).

* The [diagram of the JSBML class hierarchy](https://github.com/sbmlteam/jsbml/raw/master/doc/common/img/FullTypeHierarchy.pdf) provides an overview of the object classes in JSBML.

* The [JSBML API documentation]() describes the objects and methods defined by JSBML.


### Papers about JSBML

The JSBML papers provide overviews of JSBML:

* Nicolas Rodriguez, Alex Thomas, Leandro Watanabe, Ibrahim Y. Vazirabad, Victor Kofia, Harold F. Gómez, Florian Mittag, Jakob Matthes, Jan Rudolph, Finja Wrzodek, Eugen Netz, Alexander Diamantikos, Johannes Eichner, Roland Keller, Clemens Wrzodek, Sebastian Fröhlich, Nathan E. Lewis, Chris J. Myers, Nicolas Le Novère, Bernhard Ø. Palsson, Michael Hucka, and Andreas Dräger. **JSBML 1.0: providing a smorgasbord of options to encode systems biology models**. _Bioinformatics_, 31(20): 3383–3386. (Freely available [directly from Bioinformatics](http://bioinformatics.oxfordjournals.org/content/31/20/3383).)

* Andreas Dräger, Nicholas Rodriguez, Marine Dumousseau, Alexander Dörr, Clemens Wrzodek, Nicholas Le Novère, Andreas Zell, and Michael Hucka. **JSBML: a flexible Java library for working with SBML**. _Bioinformatics_ (2011), 27(15):2167–2168. (Freely available [directly from Bioinformatics](http://bioinformatics.oxfordjournals.org/content/27/15/2167).)

### Posters about JSBML

* The [2011 poster about JSBML](https://github.com/sbmlteam/jsbml/raw/master/doc/posters/2011_COMBINE/JSBML.pdf), presented at ICSB 2011 in Heidelberg.


## Differences between JSBML versions

The following provides information about past versions of JSBML. These reports were generated using [JDiff](http://javadiff.sourceforge.net); they summarize the API differences between versions of JSBML.

