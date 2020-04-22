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
level   = 3
version = 1
release = 1

[[issue]]
id          = 115
link        = "https://sourceforge.net/p/sbml/sbml-specifications/115"
location    = "none"
date        = "28 May '14"
description = "Add a section talking about underdetermined models."

[[issue]]
id = 128
link = "https://sourceforge.net/p/sbml/sbml-specifications/128"
description = "A long-standing bug that was forgotten until recently is that the RDF subset defined in the spec does not allow annotations of annotations.  Fix this by allowing nested RDF content."
location = "Section&nbsp;6.3"
date = "8 July '14"

[[issue]]
id = 147
link = "https://sourceforge.net/p/sbml/sbml-specifications/147/"
description = "Rewrite section 3.4.8 to be clearer about simulation before _t0_."
location = "Section&nbsp;3.4.8"
date = "27 May '14"

[[issue]]
id = 150
link = "https://sourceforge.net/p/sbml/sbml-specifications/150/"
description = "In RDF blocks, only the used namespaces need be declared."
location = "Section&nbsp;6.3"
date = "27 May '14"

[[issue]]
id = 190
link = "https://sourceforge.net/p/sbml/sbml-specifications/190/"
description = "The recommended practices section should provide some guidance about how to structure **KineticLaw** in the presence of using **SpeciesReference** identifiers for stoichiometries."
location = "Section&nbsp;8"
date = "16 Sep.'13"

[[issue]]
id = 191
link = "https://sourceforge.net/p/sbml/sbml-specifications/191"
description = "The explanation of what constitutes unique top-level elements in an annotation is insufficiently clear about whether it is the namespace or the namespace prefixes that matter.  It is the namespaces that matter, not the prefixes. "
location = "p.&nbsp;15&ndash;16"
date = "19 Jun.'12"

[[issue]]
id = 192
link = "https://sourceforge.net/p/sbml/sbml-specifications/192"
description = "The paragraph about **UnitDefinition** should make it explicit that new unit identifiers cannot be the same as any of the base units defined in Table&nbsp;2 on p.&nbsp;37."
location = "p.&nbsp;17 lines 9&ndash;11"
date = "19 Jun.'12"

[[issue]]
id = 193
link = "https://sourceforge.net/p/sbml/sbml-specifications/193"
description = "The use of the word 'symbol' in different parts of the specification is not always consistent."
location = "(many)"
date = "19 Jun.'12"

[[issue]]
id = 194
link = "https://sourceforge.net/p/sbml/sbml-specifications/194"
description = "The sentence begins \"The **Event** attribute `variable` ...\" but the attribute is actually on **EventAssignment**, not **Event**."
location = "p.&nbsp;76 line 16"
date = "30 Apr.'11"

[[issue]]
id = 195
link = "https://sourceforge.net/p/sbml/sbml-specifications/195"
description = "The text refers to _MathML `ci` attributes_, but `ci` is an element, not an attribute, so the text should really read \"MathML `ci` elements\"."
location = "p.&nbsp;77 lines 8, 11"
date = "30 Apr.'11"

[[issue]]
id = 198
link = "https://sourceforge.net/p/sbml/sbml-specifications/198"
description = "The UML box for **Model** misspells the data type `UnitSIdRef` as  `UnitsSIdRef`.  The former is the correct spelling."
location = "p.&nbsp;30 Fig.&nbsp;10"
date = "1 Dec.'11"

[[issue]]
id = 199
link = "https://sourceforge.net/p/sbml/sbml-specifications/199"
description = "The precise extent of identifier shadowing by local parameters is unclear. The specification should give a complete list about what is shadowed."
location = "p.&nbsp;17 lines 12&ndash;16"
date = "19 Jun.'12"

[[issue]]
id = 201
link = "https://sourceforge.net/p/sbml/sbml-specifications/201"
description = "The UML box for **EventAssignment** declares the data type of attribute `variable` to be `SId`, but in fact the correct data type is `SIdRef`."
location = "p.&nbsp;71 Fig.&nbsp;20"
date = "1 Dec.'11"

[[issue]]
id = 202
link = "https://sourceforge.net/p/sbml/sbml-specifications/202/"
description = "The specification should be updated to use identifiers.org wherever it is appropriate."
location = "(many pages)"
date = "16 Sep.'13"

[[issue]]
id = 203
link = "https://sourceforge.net/p/sbml/sbml-specifications/203"
description = "The UML diagram does not show that **Trigger** is derived from **SBase**.  A line is missing to show the derivation."
location = "p.&nbsp;71 Fig.&nbsp;20"
date = "1 Dec.'11"

[[issue]]
id = 206
link = "https://sourceforge.net/p/sbml/sbml-specifications/206"
description = "Figure 10 has a misspelled attribute name. The attribute `listOfContraints` on **Model** should be named `listOfConstraints`."
location = "p.&nbsp;30 Figure&nbsp;10"
date = "19 Jun.'12"

[[issue]]
id = 207
link = "https://sourceforge.net/p/sbml/sbml-specifications/207"
description = "The specification lacks a validation rule stating that the value of the attribute `substanceUnits` on a **Model** object should be either `&quot;mole&quot;`, `&quot;item&quot;`, `&quot;gram&quot;`, `&quot;kilogram&quot;`, `&quot;dimensionless&quot;`, `&quot;avogadro&quot;`, or the identifier of a **UnitDefinition** object based on these units. The rule should be number 20233."
location = "p.&nbsp;150 line 13"
date = "19 Jun.'12"

[[issue]]
id = 208
link = "https://sourceforge.net/p/sbml/sbml-specifications/208"
description = "Validation rule #10311 should include the `units` attribute on **LocalParameter** along with the other SBML components listed."
location = "p.&nbsp;144 line 10&ndash;14"
date = "19 Jun.'12"

[[issue]]
id = 210
link = "https://sourceforge.net/p/sbml/sbml-specifications/210"
description = "The XML fragment defines a namespace prefix `size` but this is incorrect; the namespace prefix should be named `struct`."
location = "p.&nbsp;16 line 13"
date = "19 Jun.'12"

[[issue]]
id = 211
link = "https://sourceforge.net/p/sbml/sbml-specifications/211"
description = "Section 4.6.6 is insufficiently clear about when species amounts may or may not change. Table&nbsp;4 states that a species quantity never changes under some circumstances, but it is specifically the species _amount_ that does not change; if the compartment size changes, species concentrations _may_ change even for the conditions where the table indicates \"never changes\". The section would benefit from a rewrite."
location = "p.&nbsp;45 Section&nbsp;4.6.6"
date = "3 Jul.'12"

[[issue]]
id = 213
link = "https://sourceforge.net/p/sbml/sbml-specifications/213"
description = "The XML diagram illustrating the history structure is complete and defines what is optional and what is required, but the text under the figure is not complete and does not recapitulate what is in the diagram. The text should be expanded."
location = "p.&nbsp;92 lines 9&ndash;40"
date = "19 Jun.'12"

[[issue]]
id = 215
link = "https://sourceforge.net/p/sbml/sbml-specifications/215"
description = "The role of the 'constant' flag on a Species needs to be clarified to emphasize that it only refers to the Species amount, not the species concentration: changes to the Species' compartment are irrelevant to the 'constant' flag (this elaborates on issue [211](https://sourceforge.net/p/sbml/sbml-specifications))."
location = "p.&nbsp;45 Section&nbsp;4.6.6"
date = "3 Jul.'12"

[[issue]]
id = 218
link = "https://sourceforge.net/p/sbml/sbml-specifications/218"
description = "Validation rule #20608 mentions the availability of a unit named `substance`, but this does not exist in Level&nbsp;3 Version&nbsp;1 Core. It should be removed from the list of valid unit names."
location = "p.&nbsp;152 lines 28"
date = "20 Jun.'12"

[[issue]]
id = 220
link = "https://sourceforge.net/p/sbml/sbml-specifications/220"
description = "Validation rules #10311 and #20401 have overlap: both of them state that the value of the attribute `id` in a **UnitDefinition** object must conform to the syntax of the SBML type `UnitSId`. Rule #20401 also adds the condition that the identifier must be unique and not be identical to certain other identifiers. The overlapping condition should be removed from rule #20401; the rule should only be concerned with the topic of uniqueness of identifiers."
location = "p.&nbsp;144 lines 10&ndash;14,<br>p.&nbsp;150 lines 35&ndash;41"
date = "25 Jun.'12"

[[issue]]
id = 221
link = "https://sourceforge.net/p/sbml/sbml-specifications/221"
description = "The text states that the type of attribute 'id' is `UnitSIdRef`, but in fact it is `UnitSId`. This is clear from the UML diagram."
location = "p.&nbsp;36 lines 2"
date = "25 Jun.'12"

[[issue]]
id = 222
link = "https://sourceforge.net/p/sbml/sbml-specifications/222/"
description = "The text misleadingly implies there is something special about the designated examples that use attributes `boundaryCondition` and `constant`, when in fact, all models must provide values for these attributes because the attributes are not optional."
location = "p.&nbsp;45 lines 34&ndash;35"
date = "28 Jun.'12"

[[issue]]
id = 223
link = "https://sourceforge.net/p/sbml/sbml-specifications/223/"
description = "Because of changes to the licensing of KEGG, we should remove the use of KEGG as examples in the specification. The sample on p.&nbsp;94 should be updated to use ChEBI URI references instead of KEGG URI references. On p.&nbsp;93, instead of referencing KEGG, we should reference the [entry in Wikipathways](http://identifiers.org/wikipathways/WP179)."
location = "p.&nbsp;93 line&nbsp;46;<br>p.&nbsp;94 line&nbsp;29"
date = "16 Sep.'13"

[[issue]]
id = 224
link = "https://sourceforge.net/p/sbml/sbml-specifications/224"
description = "The Dublin Core Metadata Initiative has updated the namespace `http://purl.org/dc/terms/` to include the terms in `http://purl.org/dc/elements/1.1/`. Therefore, SBML does not need to declare the second namespace, contrary to the examples in Section&nbsp;6.  The use of the namespace will be deprecated in SBML Level&nbsp;3 Version&nbsp;2."
location = "Section&nbsp;6"
date = "9 Dec.'13"

[[issue]]
id = 225
link = "https://sourceforge.net/p/sbml/sbml-specifications/225"
description = "Support for vCard version&nbsp;4 will be added. The text for SBML Level&nbsp;3 Version&nbsp;2 will indicate that the use of vCard version&nbsp;3 is deprecated."
location = "Section&nbsp;6"
date = "9 Dec.'13"

[[issue]]
id = 226
link = "https://sourceforge.net/p/sbml/sbml-specifications/226"
description = "Update specification to most recent version of SBO."
location = "Section&nbsp;5.2"
date = "07 Sept. '16"

[[issue]]
id = 230
link = "https://sourceforge.net/p/sbml/sbml-specifications/230"
description = "The statement that stoichiometry values \"should be greater than zero\" should be removed. (There was never a validation warning associated with this statement.)"
location = "p&nbsp;62"
date = "01 Jan.'14"

[[issue]]
id = 236
link = "https://sourceforge.net/p/sbml/sbml-specifications/236"
description = "The statement about using SBML Constraints for flux balance analysis should be removed. The Level&nbsp;3 FBA package is now the preferred means of supporting flux balance analysis."
location = "p.&nbsp;58 lines&nbsp;2&ndash;3"
date = "9 Dec.'13"

[[issue]]
id = 250
link = "https://sourceforge.net/p/sbml/sbml-specifications/250/"
description = "Clarify the meaning of the 'required' flag: it should apply to the presence of the package in relation to the Core model and should be applied on a per package basis; it is not intended to be reflective of the actual model and constructs used in a particular instance."
location = "p.&nbsp;29 Section&nbsp;4.1.2"
date = "16 Sep.'13"

[[issue]]
id = 251
link = "https://sourceforge.net/p/sbml/sbml-specifications/251/"
description = "The 'id' of UnitDefinition is of type UnitSId, not UnitSIdRef."
location = ""
date = "15 Aug.'13"

[[issue]]
id = 257
link = "https://sourceforge.net/p/sbml/sbml-specifications/257/"
description = "Add 'hasTaxon' to the list of Biological Qualifiers."
location = "p.&nbsp;64 line&nbsp;45,53"
date = "11 June '14"

[[issue]]
id = 258
link = "https://sourceforge.net/p/sbml/sbml-specifications/258/"
description = "'Vn' (a volume) is encased in square brackets, which is supposed to indicate a concentration. The brackets should be removed."
location = "p.&nbsp;118 line&nbsp;39"
date = "04 May '14"

[[issue]]
id = 259
link = "https://sourceforge.net/p/sbml/sbml-specifications/259/"
description = "Add validation rule claiming that `delay` may not be used in FunctionDefinitions."
location = "Appendix&nbsp;A"
date = "7 July '14"

[[issue]]
id = 262
link = "https://sourceforge.net/p/sbml/sbml-specifications/262/"
description = "Two closing tags in the XML example read `</listProducts>` instead of `</listOfProducts>`."
location = "p.&nbsp;69 line&nbsp;53,61"
date = "14 May '14"

[[issue]]
id = 265
link = "https://sourceforge.net/p/sbml/sbml-specifications/265/"
description = "Remove statement that referencing Reaction IDs that don't have kinetic laws is an error."
location = "p.&nbsp;21 line&nbsp;16"
date = "7 July '14"

[[issue]]
id = 268
link = "https://sourceforge.net/p/sbml/sbml-specifications/268/"
description = "Modify validation rule 20303 to forbid indirectly-recursive FunctionDefinitions."
location = "Appendix&nbsp;A"
date = "7 July '14"

[[issue]]
id = 270
link = "https://sourceforge.net/p/sbml/sbml-specifications/270/"
description = "Remove erroneous extra line between `S1` and `law` in figure in Appendix D."
location = "Appendix&nbsp;D"
date = "21 July '14"

[[issue]]
id = 271
link = "https://sourceforge.net/p/sbml/sbml-specifications/271/"
description = "Add a validation warning about what SBO branch a LocalParameter should inherit from."
location = "Page&nbsp;147"
date = "25 July '14"

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

[[issue]]
id = 284
link = "https://sourceforge.net/p/sbml/sbml-specifications/284"
description = "Link to MIRIAM URIs instead linked to MIRIAM qualifiers."
location = "Page&nbsp;90"
date = "15 May '15"

[[issue]]
id = 288
link = "https://sourceforge.net/p/sbml/sbml-specifications/288"
description = "Add clarification that even when species levels drop to zero, reactions are still to fire."
location = "Page&nbsp;77"
date = "22 Jan. '16"

[[issue]]
id = 292
link = "https://sourceforge.net/p/sbml/sbml-specifications/292"
description = "Clarify that the `variable` attribute of Rules must point to a valid SId, not just 'can' point to a valid SId."
location = "Pages&nbsp;60, 61"
date = "23 Nov. '15"

[[issue]]
id = 293
link = "https://sourceforge.net/p/sbml/sbml-specifications/293"
description = "Correct namespace for protein modification ontology to `psimod`."
location = "Page&nbsp;105"
date = "01 Jan. '16"

[[issue]]
id = 295
link = "https://sourceforge.net/p/sbml/sbml-specifications/295"
description = "`Boolean` should be capitalized when not talking about the attribute type, and in typewriter font otherwise."
location = "(many)"
date = "23 Nov. '15"

[[issue]]
id = 298
link = "https://sourceforge.net/p/sbml/sbml-specifications/298"
description = "Move general XML information to beginning of chapter."
location = "Page&nbsp;30"
date = "4 Feb. '16"

[[issue]]
id = 304
link = "https://sourceforge.net/p/sbml/sbml-specifications/304/"
description = "Allow SBO terms from the 'modeling framework' branch for Model objects."
location = "Table&nbsp;6"
date = "31 Mar. '16"

[[issue]]
id = 312
link = "https://sourceforge.net/p/sbml/sbml-specifications/312"
description = "Add statement that identifiers.org is not required, but best practice."
location = "Section&nbsp;6.8"
date = "15 Mar. '16"

[[issue]]
id = 325
link = "https://sourceforge.net/p/sbml/sbml-specifications/325"
description = "Add sentence about variable-stoichiometry models."
location = "Page&nbsp;67"
date = "15 June '16"

[[issue]]
id = 326
link = "https://sourceforge.net/p/sbml/sbml-specifications/326"
description = "Relax validation warnings about substance, volume, etc. by allowing combinations of units of the appropriate types."
location = "Appendix&nbsp;A"
date = "07 Sept '16"

[[issue]]
id = 328
link = "https://sourceforge.net/p/sbml/sbml-specifications/328"
description = "Better explain that the `constant` flag can be used to determine what variable AlgebraicRules pertain to."
location = "(several)"
date = "17 May '16"

[[issue]]
id = 336
link = "https://sourceforge.net/p/sbml/sbml-specifications/336"
description = "Relax SBO terms for Parameter, LocalParameter, Species, and Compartment."
location = "Table&nbsp;6"
date = "1 Nov. '16"

[[issue]]
id = 337
link = "https://sourceforge.net/p/sbml/sbml-specifications/337"
description = "Fix MathML in avogadro example, and describe said formula."
location = "Page&nbsp;24"
date = "18 Aug. '16"

[[issue]]
id = 338
link = "https://sourceforge.net/p/sbml/sbml-specifications/338"
description = "Change 'an event assignment' to 'the assignments from a given event' since assignments are executed as a block."
location = "Page&nbsp;80"
date = "14 Sept. '16"

[[issue]]
id = 339
link = "https://sourceforge.net/p/sbml/sbml-specifications/339"
description = "Clarify that XML namespaces may be declared on containing elements."
location = "Page&nbsp;15"
date = "1 Nov. '16"

#============================================================================
+++
