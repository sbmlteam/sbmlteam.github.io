+++
#=====================================================================
active = true
title = "Basic installation guide for JSBML"
date = "2022-01-05"
layout = "single"
toc = true
#=====================================================================
+++

JSBML is written in Java.  To use it, you will need a Java Runtime Environment (JRE) 1.7 or higher installed on your computer.  To install JSBML, please follow one of the approaches described below.


## Using the JAR file

Before starting to use JSBML, you will need to configure your Java class path. JSBML provides you with two options:
* Using the JSBML `.jar` file with dependencies. In this case, you only need to include the file in your `CLASSPATH`.
* Using the JSBML `.jar` file without dependencies. In this case, you need to add all the JSBML dependencies.


### The JSBML JAR file with dependencies

The version of the JSBML `.jar` file that includes dependencies is a merged JAR file that contains all of JSBML’s required third-party libraries. You can download it from the [JSBML download area](https://github.com/sbmlteam/jsbml). Once you have installed the JAR file on your computer, it is sufficient to add it to your Java build and/or class path in order to use JSBML.


### The JSBML JAR file without dependencies

If you choose the version of the JSBML `.jar` file that does not include dependencies, you will need to add the following dependencies to your Java class path in some other way.  (More recent versions than the ones shown here may also work, but are untested.)

* biojava-ontology-6.0.4.jar
* hamcrest-core-1.3.jar
* jigsaw-dateParser.jar (a version of [jigsaw](http://jigsaw.w3.org) containing one class to manipulate dates)
* junit-4.13.1.jar
* log4j-1.2-api-2.17.1.jar
* log4j-api-2.17.1.jar
* log4j-core-2.17.1.jar
* log4j-slf4j-impl-2.17.1.jar
* mxparser-1.2.2.jar
* slf4j-api-1.7.30.jar
* spi-full-0.2.4.jar
* stax2-api-3.1.4.jar
* staxmate-2.3.0.jar
* woodstox-core-5.0.1.jar
* xpp3_min-1.1.4c.jar
* xstream-1.4.18.jar


## Using Maven

For Maven users, it is very convenient to import JSBML into their project. On this page we describe the most common ways of including JSBML as a dependency into Maven POM files and give concrete examples of how to do so.

### Including the latest stable version of JSBML

If you are already using Maven in your project, you can add JSBML as a dependency. As of December 2016, JSBML is deployed on maven central so there is no need to specify a repository. Add the following lines into your `pom.xml`:

    <dependencies>
      <dependency>
        <groupId>org.sbml.jsbml</groupId>
        <artifactId>jsbml</artifactId>
        <version>{{< value "jsbml" "latest_release" >}}</version>
      </dependency>
    </dependencies>

The `jsbml` artifact will include `jsbml-core` plus all SBML Level&nbsp;3 packages. Like this, there is not need to list all the packages by hand and when a new one is developed, you will get it without having to make too much change to your pom files.

### Including selected SBML Level 3 packages or JSBML modules

If you don't use the JSBML artifact and want to include only few Level&nbsp;3 packages (not recommended), below are the exact dependencies for everything:

    <properties>
      <jsbml.version>{{< value "jsbml" "latest_release" >}}</jsbml.version>
    </properties>
  
    <dependencies>
      <dependency>
        <groupId>org.sbml.jsbml</groupId>
        <artifactId>jsbml-core</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.ext</groupId>
        <artifactId>jsbml-arrays</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.ext</groupId>
        <artifactId>jsbml-comp</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.ext</groupId>
        <artifactId>jsbml-distrib</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.ext</groupId>
        <artifactId>jsbml-dyn</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.ext</groupId>
        <artifactId>jsbml-fbc</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.ext</groupId>
        <artifactId>jsbml-groups</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.ext</groupId>
        <artifactId>jsbml-layout</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.ext</groupId>
        <artifactId>jsbml-multi</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.ext</groupId>
        <artifactId>jsbml-qual</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.ext</groupId>
        <artifactId>jsbml-render</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.ext</groupId>
        <artifactId>jsbml-req</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.ext</groupId>
        <artifactId>jsbml-spatial</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
      <dependency>
        <groupId>org.sbml.jsbml.modules</groupId>
        <artifactId>jsbml-tidy</artifactId>
        <version>${jsbml.version}</version>
      </dependency>
    </dependencies> 
  
### Including the latest JSBML snapshot from the Maven repository

In order to import the latest snapshot from the JSBML repository rather than the latest stable version, you can do so by including the following into your POM file.

In your list of repositories just add the following:

    <repository>
      <id>JSBML-SNAPSHOT</id>
      <name>The JSBML Snapshot repository</name>
      <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
    </repository>
    
In your projects depending on JSBML, just add this dependency:

    <dependency> 
      <groupId>org.sbml.jsbml</groupId> 
      <artifactId>jsbml</artifactId> 
      <version>1.6.1-SNAPSHOT</version> 
    </dependency>

## Using the source distribution

You can obtain a copy of the JSBML source files from GitHub, using git or Subversion, and compile JSBML yourself.  To do that, you will need to have a [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) installed, the Apache [Ant](http://ant.apache.org/) build system, and [git](https://git-scm.com) or [subversion](http://subversion.apache.org/) (version control system).  You can get the JSBML source code using git as follows:

    git clone https://github.com/sbmlteam/jsbml.git jsbml
    cd jsbml

If you prefer to use SVN:

    svn co https://github.com/sbmlteam/jsbml.git/trunk jsbml
    cd jsbml

If you are only interested in working with the SBML core, i.e., neither SBML extensions, nor JSBML modules, you may want to do the following instead.  (Note: there are no easy ways to do a partial clone with git.  If you really want to use git and really want to do a partial checkout with it, see this question in Stack Overflow: [git sparse checkout](http://stackoverflow.com/a/13738951/278405).)

    svn co https://github.com/sbmlteam/jsbml.git/trunk/core jsbml-core
    cd jsbml-core

Then, to compile and create the JSBML `.jar` file:

    ant jar

Optionally, to run the tests:

    ant test


## Past releases of JSBML

In the [download area of the JSBML project on Github](https://github.com/sbmlteam/jsbml/releases), you can find past JSBML releases.
