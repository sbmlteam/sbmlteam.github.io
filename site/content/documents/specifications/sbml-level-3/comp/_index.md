+++
#=====================================================================
layout = "level3-spec"
spec   = "comp"
date   = 2020-03-12
#=====================================================================
+++

## Notes about this specification

**2013-11-14**: The third release of version 1 of the Hierarchical Model Composition specification is now available.

**2013-02-15**: The second release of version 1 of the Hierarchical Model Composition specification is now available.

**2012-11-30**: The first release of version 1 of the Hierarchical Model Composition specification is now available.

**2012-11-20**: The SBML Editors have evaluated the package specification according to the criteria for approval described in the SBML Development Process for Level&nbsp;3. Via email discussions on the SBML Editors' mailing list, they have concluded that the specification meets the criteria. The package specification is therefore accepted.

**2012-09-27**: The proposal plus a letter to the SBML editors has been sent to the SBML editors for final assessment and approval.

**2012-08-08**: The results of the survey are now available.

**2012-07-31**: We issued a survey to the comp PWG about whether the MD5 attribute is important for the first release of the comp specification. Please join the comp PWG list if you'd like to participate.

**2012-07-30**: Editing of the specification is underway. A new release is expected prior to COMBINE 2012.

**2012-07-20**: A separate page lists a number of examples, discussion points and questions about the Hierarchical Model Composition package for SBML Level&nbsp;3.


## Notes about libSBML support

**2013-02-28**: Release 5.8.0 of libSBML supports the stable Release 2 specification of the SBML Level 3 Hierarchical Model Composition package, along with validation of most rules in the specification.

**2013-01-14**: Release 5.7.0 of libSBML supports the stable Release 1 specification of the SBML Level 3 Hierarchical Model Composition package. Because "comp" has reached the level of a stable specification release, libSBML features "comp" support in the stable branch, and pre-built binaries include "comp" package code.

**2012-07-03**: In the implementation of the extension for libSBML 5.5.0, all new attributes and child objects can be read, written, created, examined, and modified. Additionally, a 'flattening' routine is available that will fully translate a hierarchical model to a non-hierarchical 'flat' model with exactly the same mathematics, including all conversion factors. Unavailable at this time is a method for validating a model according to the rules defined in the "comp" specification, though many of these rules are implemented to prevent dynamic creation of invalid models. Additionally, no routine is available to calculate the MD5 hash of a file within libsbml. These capabilities are planned for a future release.


## Notes about JSBML support

JSBML supports "comp" and flattening "comp" models.


## Notes about third-party application support

**2012-09-27**: Both Antimony version 2.3-beta and iBioSim version 2.2-beta have full support for importing and exporting SBML models with the comp package, with all elements and attributes supported in some way between both tools. Both have exchanged several documents as well. See the letter to the SBML editors for more detail on implementation support in these two tools.

**2012-07-25**: Two programs are known to be developing support for comp and serve as the current testbeds for comp package development: Antimony and iBioSim. The Antimony release version v2.1-beta has partial support for comp, and can create, read, and flatten the hierarchical models it creates using these constructs. Current development work in Antimony includes better support for rule and assignment replacement, as well as for deletions. iBioSim support for comp is in an internal as-yet unreleased version, but will, when released, include support for import and export of all (or nearly all) comp elements. iBioSim's current implementation status is the following:
- External model definitions (read/write)
- Internal model definitions (read/write)
- Submodels (read/write/create/modify)
- Ports (read/write/create/modify for each SBML core element)
- Submodel conversion factors (read/write/cannot yet create/modify)
- Deletions (read/write/create/modify for each SBML core element)
- ReplacedElements (read/write/create/modify but only with a strict like for like policy)
- ReplacedElements conversion factors (read/write/cannot yet create/modify)
- ReplacedBy (read/write/create/modify but only using a strict like for like policy)
- SBaseRef (read all types but only write port references, which means all other types of references are converted to reference through ports which are created as needed).
