+++
#=====================================================================
title  = "RELAX NG schemas and validation for SBML Level 3"
layout = "single"
toc    = true
#=====================================================================
+++

This page describes the use of [RELAX NG](http://relaxng.org) schemas for validating SBML Level&nbsp;3 files.  Similar to W3C XML Schema, RELAX&nbsp;NG (RNG) provides the ability to define the valid syntax of an XML document.  Importantly, RNG does not require the type of deterministic content that XML Schema requires; the latter requirement is what prevents us from writing a complete XML Schema for SBML Level&nbsp;3, because Level&nbsp;3 has certain features that violate the deterministic content restriction.  Consequently, RELAX&nbsp;NG can be used to do schema-based validation of SBML Level&nbsp;3 documents.

The use of SBML Level&nbsp;3 packages unfortunately complicates the use of RNG schemas with existing schema processors.  As discussed below, the Level&nbsp;3 package schemas are not independent of the schema for SBML Level&nbsp;3 Core, and they must be used together.  Thus, note the following: 

{{% notice type="warning" %}}
If you obtain an RNG schema for an SBML Level 3 package, you must **also** make sure to get the RNG schema for  SBML Level&nbsp;3 core.
{{% /notice %}}

We describe a process below for how to create a combined RNG schema that can be fed to an off-the-shelf RNG schema processor.  _Note as of 2012-12-08_: As discussed below, getting a working version of a C/C++ native-code processor has been difficult.  [Xerces](https://xerces.apache.org) and [Expat](https://libexpat.github.io) do not support RNG, and [libxml2](http://xmlsoft.org) has proven inconsistent.  The Java based RNG processors such as [Jing](https://relaxng.org/jclark/jing.html) have worked better in our tests.

## Directory structure in the source repository

The RNG schemas for SBML Level 3 are available from the following subdirectory within the SBML project on Github: 

<p align="center">
<a href="https://github.com/sbmlteam/sbml-specifications/tree/release/RelaxNG">sbml-specifications/RelaxNG/</a>
</p>

This directory contains two template files [sbml.rng](https://github.com/sbmlteam/sbml-specifications/tree/release/RelaxNG/sbml.rng) and [pkg-math.rng](https://github.com/sbmlteam/sbml-specifications/tree/release/RelaxNG/pkg-math.rng), along with many subdirectories (one subdirectory per SBML Level&nbsp;3 package). The file [sbml.rng](https://github.com/sbmlteam/sbml-specifications/tree/release/RelaxNG/sbml.rng) is the top-level schema template for Level&nbsp;3, to be used in a manner described below, and it is designed to assume that it is physically located in the directory where the subdirectories <code>sbml-core</code>, <code>sbml-mathml</code>, etc., are located.  Similarly, the file [pkg.rng](https://github.com/sbmlteam/sbml-specifications/tree/release/RelaxNG/pkg-math.rng) is the top-level template for including any additional MathML that individual packages may have added and should also be in this directory even if no additional math is to be included.  When you use the schema, please be aware of this dependency on the subdirectory structure and files.

The schema for SBML L3V1 Core is located in the <code>sbml-core</code> subdirectory.  There is an RNG schema for the MathML subset supported by SBML L3V1. This is located within the <code>sbml-mathml</code> subdirectory. Note the sbml core schema references the mathml schema and thus both subdirectories need to be present when validating any SBML L3 document.

The package subdirectories and the schemas contained within them use the following naming convention: the name begins with <code>sbml-</code> followed by the package label.  Thus, for example, there is a subdirectory named <code>sbml-comp</code> containing the RNG schema for the [Hierarchical Model Composition](/documents/specifications/sbml-level-3/comp) package.  Within that subdirectory, there is a file named <code>sbml-comp.rng</code> that contains the RNG schema for the package.

Thus to validate a document that uses the '''comp''' package you would expect a directory structure as shown.

```
dir:sbml-comp

  file:sbml-comp.rng

dir:sbml-core

  file:sbml-core.rng
  file:sbml-simple-types.rng

dir:sbml-mathml

  whole load of files
  file:sbml-mathml.rng

file:pkg-math.rng
file:sbml.rng
```


## Using a schema processor

As noted above, the package schemas are not independent of the SBML Level&nbsp;3 Core schema, and must be combined with the Core schema to be used to validate an SBML file.  The reason for this stems from the use of mandatory attributes in the schema definitions. The problem is as follows. When a mandatory attribute is required on a given element, RNG validators will complain if it is missing; however, unless a model uses ''all'' possible Level&nbsp;3 packages, some attributes are going to be missing for some packages.  Thus, one cannot feed a union-of-all-schemas to an RNG validator as a means of validating any possible combination of packages that may arise in a model: the schema file must contain references to only those packages that ''are actually present within the SBML document'' being validated.  (We note in passing that we have tried many ways of avoiding this catch-22 situation. It has turned out to be an unanticipated and very frustrating repercussion of attempting to use RNG.)

The following example schema shows what the content of <code>sbml.rng</code> should be for validating a document containing construts from the "comp" and "qual" packages. 

```
<?xml version="1.0" encoding="UTF-8"?>

<grammar xmlns="http://relaxng.org/ns/structure/1.0"
   datatypeLibrary="http://www.w3.org/2001/XMLSchema-datatypes">

   <!-- include the sbml data types -->

   <include href="sbml-core/sbml-simple-types.rng"/>

   <!-- include sbml core  -->

   <include href="sbml-core/sbml-core.rng"/>

   <!-- need to include any packages that are present in the document -->

   <include href="sbml-comp/sbml-comp.rng"/>
   <include href="sbml-qual/sbml-qual.rng"/>

</grammar>
```


The need to construct a schema for each combination of packages is obviously not an ideal solution.  We have made several attempts to solve this issue, but so far have found that the only robust solution is to generate the appropriate <code>sbml.rng</code> schema document ''on the fly'' based on the SBML content being validated.  This approach is described below.

### Example code for generating a <code>sbml.rng</code> file on the fly

The following is a short Python program that, using [libSBML](/software/libsbml), can be used to generate the appropriate <code>sbml.rng</code> file for a given document.

```
import sys
import libsbml

def writeOpening(rng):  
  #write the first part of the file
  rng.write('<?xml version="1.0" encoding="UTF-8"?>\n\n')
  rng.write('<grammar xmlns="http://relaxng.org/ns/structure/1.0"\n')
  rng.write('\tdatatypeLibrary="http://www.w3.org/2001/XMLSchema-datatypes">\n')
  rng.write('\n')
  rng.write('\t<!-- include the sbml data types -->\n')
  rng.write('\t<include href="sbml-core/sbml-core.rng"/>\n')
  rng.write('\t<include href="sbml-core/sbml-simple-types.rng"/>\n\n')

def writeClosing(rng):
  rng.write('\n</grammar>\n')
  
def writeOptional(rng, sbmlFile):
  doc = libsbml.readSBML(sbmlFile)
  rng.write('\t<!-- include the sbml package data types -->\n')
  for i in range(0, doc.getNumPlugins()):
    name = (doc.getPlugin(i)).getPackageName()
    rng.write('\t<include href="sbml-{0}/sbml-{0}.rng"/>\n'.format(name))

if len(sys.argv) != 2:
  print 'Usage: createRNGfile.py sbmlFile'
else:
  rng = open("sbml.rng", 'w')
  writeOpening(rng)
  writeOptional(rng, sys.argv[1])
  writeClosing(rng)
```

### The <code>pkg-math.rng</code> file

The majority of Level 3 packages do not extend the MathML subset used by SBML and thus the `pkg-math.rng` need not be altered.  The exceptions are the [arrays](/documents/specifications/sbml-level-3/arrays) and  [multi](/documents/specifications/sbml-level-3/multi)  packages. In these cases the relevant lines in [pkg.rng](https://github.com/sbmlteam/sbml-specifications/tree/release/RelaxNG/pkg-math.rng) need to be uncommented.


## SBML validation using RELAX NG schemas

Once the appropriate <code>sbml.rng</code> file has been created, the resulting schema can be used to validate an SBML Level&nbsp;3 document. Several alternative methods are available to accomplish this; the [RELAX NG home page](http://relaxng.org/) lists a variety of different off-the-shelf validators and software systems that can be used.

### Using libSBML

The libSBML validation code allows users to add validators to those currently called by the <code>checkConsistency()</code> function in libSBML.  This facilitates the addition of RNG validation to the existing validation performed by libSBML. 

LibSBML provides two approaches to performing RNG validation; calling an external validator and using the RelaxNG schema validation provided by libxml2.  The [examples](https://github.com/sbmlteam/libsbml/tree/development/examples/c%2B%2B/) included with libSBML illustrate the use of these methods.  Note that the alternative parsers supported by libSBML, Xerces and Expat, do not provide RNG schema validation functionality; the examples will only work with libxml2.

1. The **callExternalValidator** example illustrates calling an external validation engine.
2. The **rngvalidator** illustrates an example of calling the rng schema validation provided by libxml2.

{{% notice type="warning" %}}
Our experiences with using [libxml2](http://xmlsoft.org)'s RNG validation show that it is extremely problematic. Thus, while it is supported in principle, we do not recommend using this approach in practice.
{{% /notice %}}

###  Using the online validator

Our official online validator will apply RNG schema validation for any SBML Level&nbsp;3 packages that are still under development. The validator will detect any such packages that are present within an uploaded model and will apply the appropriate RNG schema validation.  In order to remove the repetition of reported errors the online validator uses an adaptation of the approach detailed above.
