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

layout  = "sbml-issues"
package = "core"
level   = 2
version = 4
release = 1

[[issue]]
id = 115
link = "https://sourceforge.net/p/sbml/sbml-specifications/115"
description = "Add a section talking about underdetermined models."
location = "(none)"
date = "28 May '14"

[[issue]]
id = 128
link = "https://sourceforge.net/p/sbml/sbml-specifications/128"
description = "A long-standing bug that was forgotten until recently is that the RDF subset defined in the spec does not allow annotations of annotations.  Fix this by allowing nested RDF content."
location = "Section&nbsp;6.3"
date = "8 July '14"

[[issue]]
id = 139
link = "https://sourceforge.net/p/sbml/sbml-specifications/139/"
description = "Reversed statements: The sentence describes the namespaces for model qualifiers and biological qualifiers, but accidentally reverses the URIs and prefixes.  They should be swapped."
location = "p.&nbsp;95 lines 16&#150;17"
date = "11 May '09"

[[issue]]
id = 140
link = "https://sourceforge.net/p/sbml/sbml-specifications/140/"
description = "Throughout the specification, sometimes **SBase** is spelled **SBase** and sometimes it is spelled **Sbase**.  The inconsistency is simply a typographical error perpetuated via a LaTeX macro used in the document.  The preferred spelling is **SBase**.  This is also the spelling used in the XML Schema for SBML."
location = "p.&nbsp;14 Fig.&nbsp;8, and throughout the text (too many instances to list individually)"
date = " 30 Jun. '09"

[[issue]]
id = 141
link = "https://sourceforge.net/p/sbml/sbml-specifications/141/"
description = "The example models provided in Sections&nbsp;7.4 and&nbsp;7.5 involve irreversible reactions, but the SBML code lacks the attribute setting <code>reversible=\"false\"</code> on the <code>&lt;reaction&gt;</code> elements.  Each <code>&lt;reaction&gt;</code> should have the attribute <code>reversible=\"false\"</code>."
location = "p.&nbsp;109 lines&nbsp;46 and 67, p.&nbsp;111 lines&nbsp;26 and &nbsp;47"
date = "30 Jun. '09"

[[issue]]
id = 142
link = "https://sourceforge.net/p/sbml/sbml-specifications/142/"
description = "The paragraph on p.&nbsp;71, lines 19&ndash;27, should not be there at all.  It is a left-over from the Version&nbsp;3 specification that should have been removed for Version&nbsp;4. The paragraph should be ignored and deleted in future Releases of the L2V4 specification."
location = "p.&nbsp;71 lines&nbsp;19&ndash;27"
date = "16 May '09"

[[issue]]
id = 143
link = "https://sourceforge.net/p/sbml/sbml-specifications/143/"
description = "The value of 0-dimensional compartments cannot be changed (because they have no size), but the specification lacks explicit statements to this effect in Section&nbsp;4.11 and in the list of validation rules in Appendix&nbsp;C.  Such statements need to be added to the specification."
location = "Section&nbsp;4.11 and Appendix&nbsp;C"
date = "11 May '09"

[[issue]]
id = 144
link = "https://sourceforge.net/p/sbml/sbml-specifications/144/"
description = "The end of section 4.7.4 gives an explanation of whether the identifiers of 0-dimensional compartment can appear in mathematical expressions.  The statement is that it \"should\" not appear in expressions.  The word \"should\" should actually be \"must\": identifiers of 0-D compartments _must_ not appear in mathematical expressions."
location = "p.&nbsp;46 line&nbsp;24"
date = "11 May '09"

[[issue]]
id = 145
link = "https://sourceforge.net/p/sbml/sbml-specifications/145/"
description = "The links to the descriptions of the MIRIAM qualifiers are out of date.  The obsolete links are of the form <code>http://www.ebi.ac.uk/compneur-srv/miriam-main/mdb?section=qualifiers</code>.   To future-proof what is printed in the SBML specifications,  SBML.org now maintains a perennial URL, <code>http://sbml.org/miriam/qualifiers</code>, that will always point to the correct URL even if the future MIRIAM Resources link changes."
location = "p.&nbsp;92 line&nbsp;24,<br> p.&nbsp;95 line&nbsp;15"
date = "11 Jul. '09"

[[issue]]
id = 146
link = "https://sourceforge.net/p/sbml/sbml-specifications/146/"
description = "The links to MIRIAM Resources are out of date.  The obsolete links are those of the form <code>http://www.ebi.ac.uk/compneur-srv/miriam-main/</code>.  To future-proof what is printed in the SBML specifications,  SBML.org now maintains a perennial URL <code>http://sbml.org/miriam</code> that will always point to the correct URL even if the future MIRIAM Resources link changes."
location = "p.&nbsp;94 line&nbsp;39,<br> p.&nbsp;95 line&nbsp;7"
date = "11 Jul. '09"

[[issue]]
id = 148
link = "https://sourceforge.net/p/sbml/sbml-specifications/148/"
description = "The UML box for Event in Figure&nbsp;22 does not define a data type for the attribute <code>useValuesFromTriggerTime</code>. It should say the type is <code>boolean</code>. The text makes this clear, but the UML is missing information."
location = "p.&nbsp;78 Fig.&nbsp;22"
date = "30 Jun. '09"

[[issue]]
id = 149
link = "https://sourceforge.net/p/sbml/sbml-specifications/149/"
description = "Section 4.9.4 says local parameters <em>should</em> not have <code>constant=false</code>.  It should read <em>must</em>: local parameters must not set the <code>constant</code> attribute to <code>false</code>."
location = "p.&nbsp;53 line&nbsp;32"
date = "30 Jun. '09"

[[issue]]
id = 150
link = "https://sourceforge.net/p/sbml/sbml-specifications/150/"
description = "In Section 6.3, the given RDF template contains a number of <code>xmlns</code> namespace declarations.  What is not made clear is (1) a model doesn't need to list all of them every time, only those it actually uses, and (2) the namespace declarations can appear in any order, not only the one shown in the template."
location = "p.&nbsp;93 lines&nbsp;3&ndash;30"
date = "9 Feb. '10"

[[issue]]
id = 151
link = "https://sourceforge.net/p/sbml/sbml-specifications/151/"
description = "A closing parenthesis is missing for the parenthetical statement. The closing parenthesis should come after the word \"resources\"."
location = "p.&nbsp;18 line&nbsp;39"
date = "10 Feb. '10"

[[issue]]
id = 152
link = "https://sourceforge.net/p/sbml/sbml-specifications/152/"
description = "The text states only that the attributes `level` and `version` are required, when in fact `xmlns` is also required. The text should be changed to mention `xmlns` too."
location = "p.&nbsp;30 line&nbsp;10-12"
date = "10 Feb. '10"

[[issue]]
id = 154
link = "https://sourceforge.net/p/sbml/sbml-specifications/154/"
description = "The 2nd and 3rd bullets in the bulleted list state that the units _must_ agree, but in fact the rule for units in L2v4 is that they _should_ agree. The word _must_ must be changed to _should_."
location = "p.&nbsp;46 lines&nbsp;13&ndash;18"
date = "9 Feb. '10"

[[issue]]
id = 155
link = "https://sourceforge.net/p/sbml/sbml-specifications/155/"
description = "In Figure 5, the symbol <code>NCNameChar</code> should actually be <code>NameChar</code>, per the XML 1.0 third edition.  There is no other change in the definition or implications; the wrong name appears here, but the correct definition for <code>NameChar</code> is given."
location = "p.&nbsp;12 lines&nbsp;30&ndash;31"
date = "9 Feb. '10"

[[issue]]
id = 163
link = "https://sourceforge.net/p/sbml/sbml-specifications/163/"
description = "The specification fails to stipulate whether the _delay_ <code>csymbol</code> can be used within a **FunctionDefinition** object, yet it explicitly disallows _time_.  In the interest of consistency and simplicity, the <code>csymbol</code> for _delay_ is also disallowed."
location = "p.&nbsp;34 line&nbsp;14"
date = "19 Apr. '10"

[[issue]]
id = 166 
link = "https://sourceforge.net/p/sbml/sbml-specifications/166/"
description = "The overconstrained model example needs to remove references to compartment `C`, as was done for L3v1."
location = "Appendix D, page 154"
date = "5 Apr. '14"

[[issue]]
id = 168 
link = "https://sourceforge.net/p/sbml/sbml-specifications/168/"
description = "`xhtml=` should be `xmlns=`."
location = "p.&nbsp;159 lines&nbsp;19,24,29"
date = "5 Apr. '14"

[[issue]]
id = 187 
link = "https://sourceforge.net/p/sbml/sbml-specifications/187/"
description = "The existing xsd does not allow a semantics element to contain a lambda element."
location = "(schema)"
date = "5 Apr. '14"

[[issue]]
id = 192
link = "https://sourceforge.net/p/sbml/sbml-specifications/192"
description = "The paragraph about **UnitDefinition** should make it explicit that new unit identifiers cannot be the same as any of the base units defined in Table 2 on p.&nbsp;37."
location = "p.&nbsp;17 lines 9&ndash;11"
date = "19 Jun.'12"

[[issue]]
id = 202
link = "https://sourceforge.net/p/sbml/sbml-specifications/202/"
description = "The specification should be updated to use identifiers.org wherever it is appropriate. This needs to be done in a new Release or new Version of Level&nbsp;3."
location = "(many pages)"
date = "16 Sep.'13"

[[issue]]
id = 213
link = "https://sourceforge.net/p/sbml/sbml-specifications/213"
description = "The XML diagram illustrating the history structure is complete and defines what is optional and what is required, but the text under the figure is not complete and does not recapitulate what is in the diagram. The text should be expanded."
location = "p.&nbsp;96"
date = "19 Jun.'12"

[[issue]]
id = 215 
link = "https://sourceforge.net/p/sbml/sbml-specifications/215/"
description = "Need extra explanation of how the `constant` attribute on a **Species** only affects its amount--its concentration may change due to a changing **Compartment**."
location = "p.&nbsp;50-51"
date = "5 Apr. '14"

[[issue]]
id = 224
link = "https://sourceforge.net/p/sbml/sbml-specifications/224"
description = "The Dublin Core Metadata Initiative has updated the namespace <code>http://purl.org/dc/terms/</code> to include the terms in <code>http://purl.org/dc/elements/1.1/</code>. Therefore, SBML does not need to declare the second namespace, contrary to the examples in Section&nbsp;6.  The use of the namespace will be deprecated in SBML Level&nbsp;2 Version&nbsp;5."
location = "Section&nbsp;6"
date = "9 Dec.'13"

[[issue]]
id = 226 
link = "https://sourceforge.net/p/sbml/sbml-specifications/226/"
description = "Need update for changes in SBO"
location = "p.&nbsp; line&nbsp;"
date = "5 Apr. '14"

[[issue]]
id = 227 
link = "https://sourceforge.net/p/sbml/sbml-specifications/227/"
description = "Simplify overdetermined algorithm to match L3v1."
location = "Appendix&nbsp;D"
date = "8 July '14"

[[issue]]
id = 228 
link = "https://sourceforge.net/p/sbml/sbml-specifications/228/"
description = "Equation 4 on page 38 needs to be fixed as it was for the L3v1 specification."
location = "p.&nbsp;38"
date = "5 Apr. '14"

[[issue]]
id = 230
link = "https://sourceforge.net/p/sbml/sbml-specifications/230"
description = "The statement that stoichiometry values \"should be greater than zero\" should be removed. (There was never a validation warning associated with this statement.)"
location = "p&nbsp;62"
date = "01 Jan.'14"

[[issue]]
id = 257
link = "https://sourceforge.net/p/sbml/sbml-specifications/257/"
description = "Add `hasTaxon` to the list of Biological Qualifiers."
location = "p.&nbsp;64 line&nbsp;45,53"
date = "11 June '14"

[[issue]]
id = 259
link = "https://sourceforge.net/p/sbml/sbml-specifications/259/"
description = "Add validation rule claiming that `delay` may not be used in **FunctionDefinitions**."
location = "Appendix&nbsp;A"
date = "7 July '14"

[[issue]]
id = 262
link = "https://sourceforge.net/p/sbml/sbml-specifications/262/"
description = "Two closing tags in the XML example read `</listProducts>` instead of `</listOfProducts>`."
location = "p.&nbsp;64 line&nbsp;45,53"
date = "14 May '14"

[[issue]]
id = 265
link = "https://sourceforge.net/p/sbml/sbml-specifications/265/"
description = "Remove statement that referencing **Reaction** IDs that don't have kinetic laws is an error."
location = "p.&nbsp;24 line&nbsp;1-2"
date = "7 July '14"

[[issue]]
id = 268
link = "https://sourceforge.net/p/sbml/sbml-specifications/268/"
description = "Add validation rule forbidding indirectly-recursive **FunctionDefinitions**."
location = "Appendix&nbsp;A"
date = "7 July '14"

[[issue]]
id = 270
link = "https://sourceforge.net/p/sbml/sbml-specifications/270/"
description = "Remove erroneous extra line between `S1` and `law` in figure in Appendix D."
location = "Appendix&nbsp;D"
date = "21 July '14"

[[issue]]
id = 275
link = "https://sourceforge.net/p/sbml/sbml-specifications/275"
description = "The section on SBO should mention the version of SBO described."
location = "Section 5"
date = "10 Oct. '14"

[[issue]]
id = 280
link = "https://sourceforge.net/p/sbml/sbml-specifications/280"
description = "Need new unit validation error for nonexistent units."
location = "Appendix&nbsp;A"
date = "22 Apr. '15"

#============================================================================
+++
