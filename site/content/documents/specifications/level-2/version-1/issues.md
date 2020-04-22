+++
#============================================================================
# This is the source file for producing an errata page for this SBML
# specification. The information in this file header (what you are reading
# right now, between the "+++" delimiters in this file) is used to produce
# the content of the final displayed page. The logic for producing that
# content is encoded in the layout page template. The template is found in
# the directory site/layouts/_default/.
#
# The issue/errata summaries need to be written by a human, and hence are not
# found in any other location than the present file.  See the other issue
# files for an example of the syntax, but the basic idea is, start each new
# issue with "[[issue]]" followed by keyword-value pairs.  The keywords are
# "id", "link", "location", "date" and "description".
# ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

layout = "sbml-issues"
package = "core"
level   = 2
version = 1

[[issue]]
id = "1"
link = ""
date = "not recorded"
location = "p. 7 Sec. 3.3"
description = "The second bullet definition should read (double quote was added and the order of `\"` and `'` were switched): The double quote (`\"`) and single-quote character (`’`) must be escaped using the entities `\"` and `'`, respectively, when those characters are used to delimit a string attribute value."

[[issue]]
id = "2"
link = ""
date = "not recorded"
location = "p. 9 Sec. 3.6.1"
description = "The encoding attribute is permitted on MathML annotation and `<annotation-xml>` elements, not only on <csymbol>` as stated on that page."

[[issue]]
id = "3"
link = ""
date = "not recorded"
location = "p. 9 Section 3.6.1"
description = "The MathML standard doesn't specify the result of n-ary operators when the number of operands is critically small, for example for times and add elements, when the number of operands are zero or one. The specification should clarify the correct behavior. The detailed semantics are described in http://www.sbml.org/forums/index.php?t=tree&goto=2010&rid=0"

[[issue]]
id = "4"
link = ""
date = "not recorded"
location = "p. 10, Sec. 3.6.4"
description = "The delay `<csymbol>` function is not clearly defined. There is no explanation of what range of values is valid for the time. For example, can times be less than zero? Also, are there restrictions on the acceptable values of the argument `x`?"

[[issue]]
id = "5"
link = ""
date = "not recorded"
location = "p. 13, Sec. 4.3.1"
description = "The can in the 2nd sentance should be replaced by should. Thanks to Sarah Keating for catching this."

[[issue]]
id = "6"
link = ""
date = "not recorded"
location = "p. 14, Sec. 4.4.2"
description = "The `id` field of a `<unitDefinition>` element must not contain a value from Table 2, the table of UnitKind values. This restriction is necessary because otherwise, a unit definition could redefine one of the base unit kinds, and thereby create a cyclic dependency between unit definitions."

[[issue]]
id = "7"
link = ""
date = "not recorded"
location = "p. 14, Sec. 4.4.2"
description = "(Thanks to Maria Schilstra for catching this.) The first formula should be the following:"

[[issue]]
id = "8"
link = ""
date = "not recorded"
location = "p. 16, Sec 4.4.3"
description = "(Thanks to Sven Sahle for catching this.) The example code redefining the built-in unit volume should replace `liters` with `litre`. `liters` is not a valid value for the kind attribute because the spelling is not the official SI spelling."

[[issue]]
id = "9"
link = ""
date = "not recorded"
location = "p. 17 Sec. 4.5.5 and p.19 Sec. 4.6.4"
description = "The text is slightly contradictory. The text might be improved by using the language that is used to describe the validation rules for units on species and compartment elements in Semantic_Validation."

[[issue]]
id = "10"
link = ""
date = "not recorded"
location = "p. 18 Sec. 4.5.6"
description = "The value of outside for a given compartment must be the `id` (not name) of another compartment in the model."

[[issue]]
id = "11"
link = ""
date = "not recorded"
location = "p. 18 Sec. 4.5.6"
description = "The graph formed where compartments are nodes and the arcs are implied by the values of outside attributes must be acyclic. Reasoning: otherwise a compartment can be outside itself."

[[issue]]
id = "12"
link = ""
date = "not recorded"
location = "p. 21 Sec. 4.7.3"
description = "or the `id` (not `name`) of a new unit defined in the list of unit definitions"

[[issue]]
id = "13"
link = ""
date = "not recorded"
location = "p. 24 Sec. 4.8.4"
description = "This section should specify that the model should not be over determined as defined in the Semantic_Validation Algebraic Rules section."

[[issue]]
id = "14"
link = ""
date = "not recorded"
location = "p. 27 Sec. 4.9.5"
description = "The phrase: In `speciesReference`, the field `species` of type `SId` must refer to the name of an existing species should be: In `speciesReference`, the field `species` of type `SId` must refer to the `id` (not `name`) of an existing species, because the name is optional and SBML structures must refer to other components using their identifiers."

[[issue]]
id = "15"
link = ""
date = "not recorded"
location = "p. 27 Sec. 4.95"
description = "If a species identifier occurs in any MathML `ci` element, including inside `kineticLaw` and `stoichiometryMath` elements, then it should appear in a `simpleSpeciesReference` element in the containing reaction. The specification only applies this rule to the `kineticLaw` element. Reasoning: such a species is at a minimum a modifier of the reaction."

[[issue]]
id = "16"
link = ""
date = "not recorded"
location = "p. 29 Sec. 4.9.7, 3rd paragraph"
description = "The text is overly restrictive and contradictory with respect of the units of species symbols. Species symbols can be either amount or concentration units depending on the species declaration."

[[issue]]
id = "17"
link = ""
date = "not recorded"
location = "p. 31 Sec. 4.10.5"
description = "A variable attribute on a `eventAssignment` element should be unique amoung the set of assignments within an event element. Reasoning: otherwise the effect of event assignment is ambigous. Which assignment has effect?"

[[issue]]
id = "18"
link = ""
date = "not recorded"
location = "p. 32 Sec. 4.10.7"
description = "Any transition of a trigger expression from false to true will cause an event to fire. Consider an event with delay _d_, where the trigger expression makes a transition from false to true at times _t1_ and _t2_. The eventAssignment structure will have effect at _t1 + d_ and _t2 + d_ irrespective of the relative times of _t1_ and _t2_. For example, events can overlap in time so that _t1 < t2 < t1 + d_ still causes an event assignment to occur at _t1 + d_ and _t2 + d_."

[[issue]]
id = "19"
link = ""
date = "not recorded"
location = "p. 38 Example 5.3"
description = "The `out` reaction should have a `listOfModifiers` with a `modifierSpeciesReference` for species S2 since it is referenced in the reaction's `kineticLaw`. Thanks to Tatsuya Ishida for catching this."

[[issue]]
id = "20"
link = ""
date = "not recorded"
location = "p. 40"
description = "The one rule in listOfRules should not use `<apply>` ... `</apply>`. These tags should be omitted. Thanks to Bruce Shapiro for catching this."

[[issue]]
id = "21"
link = ""
date = "not recorded"
location = "p. 42"
description = "The MathML in the two `rateRule` definitions should not use `<apply>` ... `</apply>`. These tags should be omitted. Thanks to Bruce Shapiro for catching this."

[[issue]]
id = "22"
link = ""
date = "not recorded"
location = "p. 46"
description = "The `definitionURL` for the csymbol delay should be `http://www.sbml.org/sbml/symbols/delay`, not `http://www.sbml.org/symbols/delay` (the incorrect form has the characters 'sbml' omitted). Thanks to Marc Vass for catching this."

[[issue]]
id = "23"
link = ""
date = "not recorded"
location = "p. 55 appendix A and the SCHUCS notation document p.14 section 3.9"
description = "The SCHUCS notation document (and by default appendix A) states that UML inheritance is mapped, in XML Schema, to extension of complexType elements. This is by far the most natural interpretation and the one used in the schema available on the SBML website and used by libSBML. However, this approach introduces a restriction: an ordering of elements is imposed on all extended types because the definition of XML Schema effectively requires the use of sequence ordering in order to be able to use type inheritance in this way. (A full explanation of the details can be found in sec. 13.5 of the book Definitive XML Schema, 2002, by P. Walmsley.) The result is that the ordering of subelements in SBML XML is important: they must appear in the order shown in the UML diagrams in the specification and subelements inherited from super-classes must occur before those of derived classes. For example, notes and annotation elements must occur before listOfReactants elements within a reaction element. Appendix A should state this restriction explicitly. This is an argument for moving appendix A into the main text. The dependence on sequence is a result of using XML Schema."

[[issue]]
id = "24"
link = ""
date = "not recorded"
location = "p. 55 appendix A and SCHUCS notation document p.5 section 3.2 onwards"
description = "The SCHUCS document doesn't state what model group element should be used in the XML schema interpretation of UML. (Examples of XML schema are that `xs:element` elements should be enclosed in `xs:choice`, `xs:all` or `xs:sequence` elements; see p.488 table A-1 of Walmsley's book Definitive XML Schema, 2002.) Perhaps to be consistent with the erratum noted above, `xs:sequence` elements should be used. (The SBML schemas currently use this interpretation). In some instances, `xsd:all` could be used, but this has repercussions for type inheritance."

[[issue]]
id = "25"
link = ""
date = "not recorded"
location = "multiple"
description = "On any given reaction, any species occuring in the list of products or reactants can also occur in the list of modifiers."

[[issue]]
id = "26"
link = ""
date = "not recorded"
location = "p.56, Appendix B"
description = "The last bullet, second sentence starts with the words there is no longer a type field on Rule. Technically, this should read: there is no longer a type field on AssignmentRule."

[[issue]]
id = "27"
link = ""
date = "not recorded"
location = "p.20, table 4.6.5"
description = "The table should also include events, which can change species concentrations if the species has `constant=\"false\"`."

#============================================================================
+++
