+++
title   = "libSBML 5.18.0 released"
authors = ["Mike Hucka"]
date    = 2019-04-23
summary = "libSBML version 5.18.0 has been released."
+++

The latest version of libSBML is available for download from

https://sourceforge.net/projects/sbml/files/libsbml/5.18.0/ 

Python packages are available as `python-libsbml-5.18.0` and `python-libsbml-5.18.0-experimental`.  The following is a list of changes. 

## Changes in the stable release

### New features 

- LibSBML now defines a DefinitionURLRegistry to allow a user to log 
  their own values of the 'definitionURL' attribute on a math <csymbol> 
  element. Once logged these definitionURL values will not trigger the 
  unknown csymbol error when reading a model that uses them. 

- LibSBML now defines a CallbackRegistry which allows a user to register 
  a callback to interrupt a long running read operation. Examples 
for C++ 
  and Python are included. In future it would be anticipated that would 
  have callbacks to interrupt long running validation or conversion 
  processes. 
     

### Bug fixes 

- Validation was incorrectly stating that the id of a <localParameter> 
  that mirrored the id of a <species> should be listed as a 
  <modifierSpeciesReference> in the enclosing <reaction>. It no longer 
  issue an incorrect error. 

- The string to MathML parser was failing to identify known constants 
  as arguments to a lambda function. lambda(pi, pi*2) should treat 'pi' 
  as an unknown argument not the constant pi. This has been fixed. 

- The MathML parser adds logbase and degree to log and root elements 
  respectively. These are dimensionless integers and but unit 
  validation was failing.  This has been corrected.  Note this means 
  that for L3 models libSBML will write out the dimensionless units 
  on the relevant <cn> element explicitly.  This may cause an 
  apparent difference in models if reading and then writing. 

- In MathML a <bvar> element within a <lambda> can only contain a 
  <ci> child element. Validation was failing to spot when this was 
  not the case. This has been corrected. 

- MathML within a <semantics> element was not being properly validated. 
  This has been improved. 

- 'layout' package-specific bug fixes: 

  - Code was failing to roundtrip glyphs that contained both a <curve> 
    and a <boundingBox> element. This has been fixed. 


### Configuration/build system changes 

- The cmake files that enable using the check library on 
  a Linux OS have been updated to make this easier. 

- Python 3.7 is now supported. 


### Miscellaneous 

- Several obscure memory leaks have been plugged. 


## Changes in the experimental release 

### New features 

- 'distrib' package-specific updates: 

   - The code has been updated to reflect the specification 
     agreed during HARMONY 2019 version 0.24. 

- 'spatial' package-specific updates: 

  - The code has been updated to reflect the specification 
    version 0.93. 

  - Attributes 'id' and 'name' have been added to the SpatialPoints 
    class in anticipation of these being added to the specification. 

  - Plugin code has changed so that child element class members are 
    initialized to NULL.  This saves memory but may cause existing 
    code to hit an issue when using a getAbc function; which may now 
    return a NULL object when previously it did not. 

----

Please report any problems you encounter using libSBML either to the 
mailing list libsbml-team@googlegroups.com or using the issue tracker for 
libSBML at 

https://sourceforge.net/tracker/?group_id=71971&atid=942737 
