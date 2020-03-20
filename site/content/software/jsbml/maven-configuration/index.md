+++
#=====================================================================
title = "JSBML Maven configuration"
date = 2020-03-19
layout = "single"
#=====================================================================
+++

{{< toc >}}

For Maven users, it is very convenient to import JSBML into their project. On this page we describe the most common ways of including JSBML as a dependency into Maven POM files and give concrete examples of how to do so.

## Including the latest stable version of JSBML

If you are already using Maven in your project, you can add JSBML as a dependency. As of December 2016, JSBML is deployed on maven central so there is no need to specify a repository. Add the following lines into your `pom.xml`:

    <dependencies>
      <dependency>
        <groupId>org.sbml.jsbml</groupId>
        <artifactId>jsbml</artifactId>
        <version>{{< latest repo="sbmlteam/jsbml" >}}</version>
      </dependency>
    </dependencies>

The `jsbml` artifact will include `jsbml-core` plus all SBML Level&nbsp;3 packages. Like this, there is not need to list all the packages by hand and when a new one is developed, you will get it without having to make too much change to your pom files.

## Including selected SBML Level 3 packages or JSBML modules

If you don't use the JSBML artifact and want to include only few Level&nbsp;3 packages (not recommended), below are the exact dependencies for everything:

    <properties>
      <jsbml.version>{{< latest repo="sbmlteam/jsbml" >}}</jsbml.version>
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
  
## Including the latest JSBML snapshot from the repository

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
      <version>1.5-SNAPSHOT</version> 
    </dependency>



<!-- Leave following empty subsection; it works around a bug in the Hugo markdown processor -->
###
