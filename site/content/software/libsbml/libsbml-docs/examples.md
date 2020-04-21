+++
#=====================================================================
title  = "Example programs using libSBML"
layout = "single"
toc    = true
#=====================================================================
+++

The following are example programs demonstrating the use of different libSBML API calls.  The programs are available in different programming languages.  (Due to limited resources, not all programs are available in all programming languages supported by libSBML.)  Further below, you can also find examples of using [SBML Level 3 packages](/documents/specifications#sbml-level-3-packages).


## Simple programs

{{% libsbml-example-table %}}
  {{< libsbml-example name="echoSBML" description="Echoes (and in the process, pretty prints) an SBML model." >}}
  {{< libsbml-example name="readSBML" description="A simple command-line program that reads an SBML file and prints some statistics about it." >}}
  {{< libsbml-example name="printSBML" description="Prints information about the top-level model in the given SBML file." >}}
  {{< libsbml-example name="printSupported" description="Prints the supported SBML Levels and Versions for this copy of libSBML." >}}
  {{< libsbml-example name="printRegisteredPackages" description="Prints the SBML Level 3 packages registered/installed in this copy of libSBML." >}}
{{% /libsbml-example-table %}}


## More advanced programs

{{% libsbml-example-table %}}
  {{< libsbml-example name="addCVTerms" description="Adds controlled vocabulary terms to a species in a model." >}}
  {{< libsbml-example name="addCustomValidator" description="Example of creating a custom validator to be called during validation." >}}
  {{< libsbml-example name="addModelHistory" description="Adds a model history to a model." >}}
  {{< libsbml-example name="addingEvidenceCodes_1" description="Adds controlled vocabulary terms to a reaction in a model." >}}
  {{< libsbml-example name="addingEvidenceCodes_2" description="Adds evidence codes to a species in a model." >}}
  {{< libsbml-example name="appendAnnotation" description="Adds annotation strings to a model and a species." >}}
  {{< libsbml-example name="callExternalValidator" description="Example that shows how to call an external program for validation." >}}
  {{< libsbml-example name="convertSBML" description="Example demonstrating how to convert SBML documents between SBML Levels." >}}
  {{< libsbml-example name="createExampleSBML" description="Lengthy example of creating SBML models presented in the SBML specification." >}}
  {{< libsbml-example name="getAllElementsWithNotes" description="Demonstrates how to use the element filter class to search the model for elements with specific attributes ." >}}
  {{< libsbml-example name="inlineFunctionDefintions" description="Loads an SBML File and inlines all the function definitions found in the model." >}}
  {{< libsbml-example name="printAnnotation" description="Prints the annotation strings for each element in a given model." >}}
  {{< libsbml-example name="printMath" description="Prints the rule, reaction, and event formulas in a given SBML document." >}}
  {{< libsbml-example name="printNotes" description="Prints the notes strings for each element in a given model." >}}
  {{< libsbml-example name="printRegisteredPackages" description="A command-line program that prints the package plug-ins that are registered with this copy of libSBML." >}}
  {{< libsbml-example name="printUnits" description="A command-line program that prints information about the units of measurement used in a given SBML file." >}}
  {{< libsbml-example name="promoteParameters" description="Promote all local parameters in the model to global parameters." >}}
  {{< libsbml-example name="renameSId" description="Program that renames a specific SId and updates all references to it in a given model." >}}
  {{< libsbml-example name="rngvalidator" description="Example of creating a RELAX NG (RNG) validator to be called during validation." >}}
  {{< libsbml-example name="setIdFromNames" description="Program that renames all SIds that also have names specified. The new identifiers will be derived from the name, with all invalid characters removed." >}}
  {{< libsbml-example name="setNamesFromIds" description="Program that changes all objects name attribute values to match their id attribute values." >}}
  {{< libsbml-example name="stripPackage" description="Strips the given SBML Level 3 package from the given SBML file." >}}
  {{< libsbml-example name="translateL3Math" description="Translates infix formulas into MathML and vice-versa, using the SBML Level 3 parser instead of the old Level 1 parser." >}}
  {{< libsbml-example name="translateMath" description="Translates infix formulas into MathML and vice-versa." >}}
  {{< libsbml-example name="unsetAnnotation" description="Unsets the annotation for each element in the given SBML file." >}}
  {{< libsbml-example name="unsetNotes" description="Unsets the notes for each element in the given SBML file." >}}
  {{< libsbml-example name="validateSBML" description="Validates one or more SBML files." >}}
{{% /libsbml-example-table %}}


## Programs using SBML Level 3 packages

The libSBML API documentation has examples programs using libSBML plug-ins that support [SBML Level&nbsp;3 packages](/documents/specifications#sbml-level-3-packages).  Please consult the appropriate [libSBML API documentation](/software/libsbml/libsbml-docs/api/) for your programming language.



<!-- Dummy needed to make TOC show up -->
###
