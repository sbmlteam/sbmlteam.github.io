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
version = 3
release = 1

[[issue]]
id = 1742495
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1742495"
description = "<em>Incorrect MathML in the example of Sec. 7.10</em>. The example contained the MathML expression <code>&lt;apply&gt;&lt;cn&gt;0&lt;/cn&gt;&lt;/apply&gt;</code>, which is invalid. The <code>&lt;cn&gt;0&lt;/cn&gt;</code> should not be inside <code>&lt;apply&gt;</code>."
location = "p.&nbsp;118 lines 66&#150;69; p.&nbsp;119 lines&nbsp;17&#150;19"
date = "(not noted)"

[[issue]]
id = 1745160
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1745160"
description = "<em>Validation rule 10204 is incorrect</em>. Validation rule 10204 incorrectly stated that the <code>definitionURL</code> is only allowed on MathML <code>csymbol</code> elements, whereas in fact it must be allowed on <code>semantics</code> as well.  In the section on SBO, the examples already use the attribute on <code>semantics</code>.  The validation rule needs to be modified, as does the text in Sec.&nbsp;3.4.1 and the MathML subset schema; see also issue #1801776 below."
location = "p.&nbsp;140 lines&nbsp;20&#150;21"
date = "(not noted)"

[[issue]]
id = 1760157
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1760157"
description = "<em>Incorrect statement about <code>id</code> on Event</em>. The text stated that attribute <code>id</code> was required on an Event instance, but this was not true and disagreed with the UML diagram, in which the field is actually optional."
location = "p.&nbsp;78, lines 2&#150;3"
date = "(not noted)"

[[issue]]
id = 1761663
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1761663"
description = "<em>Incorrect description of event action</em>. The text stated that \"When the event fires, the value of the model component identified by <code>variable</code> is changed by the EventAssignment to the value computed by the <code>math</code> element\".  This was incorrect: the change takes place when the event assignment is <em>executed</em>."
location = "p.&nbsp;80 lines 19&#150;20"
date = "(not noted)"

[[issue]]
id = 1772814
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1772814"
description = "<em>Bad typo in <code><annotation></code> example</em>. The example on page 17 had <code>xmlns:&quot;URL&quot;</code>.  The <code>:</code> character should actually be <code>=</code>."
location = "p.&nbsp;17 line 31"
date = "(not noted)"

[[issue]]
id = 1785279
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1785279"
description = "<em>Inconsistency in example of Sec.&nbsp;7.7</em>. The text description said the volume of the compartment was equal to 1, but the SBML disagreed.  Moreover, the text description was so confusing that people misinterpreted it."
location = "p.&nbsp;114 line&nbsp;61"
date = "(not noted)"

[[issue]]
id = 1785712
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1785712"
description = "<em>Error in rate equation example</em>. The rate expressions examples on p.72 incorrectly had negative signs.  The negatives are added later and should not have appeared where they did. "
location = "p.&nbsp;72, lines 37, 39"
date = "(not noted)"

[[issue]]
id = 1787185
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid="
description = "<em>Out of order words</em>. The text of validation rule 21103 contained words out of order."
location = "p.&nbsp;150 line&nbsp;33"
date = "(not noted)"

[[issue]]
id = 1792674
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1792674"
description = "<em>Attribute <code>encoding</code> must be allowed on MathML elements <code>annotation</code> and <code>annotation-xml</code></em>. The <code>encoding</code> element was incorrectly disallowed from these MathML elements, both in validation rule 10203 and in Sec.&nbsp;3.4.1.  It must be allowed for <code>annotation</code> and <code>annotation-xml</code> as well.  The SBML MathML subset XML Schema allowed <code>encoding</code>, so the text and validation rule were at odds with the schema definition."
location = "p.&nbsp;140 line&nbsp;27"
date = "(not noted)"

[[issue]]
id = 1796300
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1796300"
description = "<em>Error in stoichiometry of example formulas in Sec.&nbsp;4.13.6</em>. The last example in that section, involving grams as units, had expressions such as <em>1000&nbsp;*&nbsp;m<sub>A</sub></em>, when in fact they should have divided by molecular mass."
location = "p.&nbsp;75 lines 19&#150;20"
date = "(not noted)"

[[issue]]
id = 1797728
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1797728"
description = "<em>Species' <code>constant</code> attribute is \"<code>false</code>\" by default</em>. A sentence in the text description incorrectly stated that the default of Species' <code>constant</code> attribute is \"<code>true</code>\"."
location = "p.&nbsp;49 line 11"
date = "(not noted)"

[[issue]]
id = 1797729
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1797729"
description = "<em>Confusing language about species size</em>. The passage on p.&nbsp;49 had language that referred to a species' `size`, but it would be less confusing to talk about the species' quantity rather than its size. Compartments have size, but species don't."
location = "p.&nbsp;49 line 11"
date = "(not noted)"

[[issue]]
id = 1800685
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1800685"
description = "<em>Clarification needed about shadowing of parameters</em>. The implications of local parameters shadowing global identifiers of any kind was not stated explicitly enough and could too easily be missed by readers."
location = "Sec.&nbsp;3.3.1 and p.&nbsp;70 lines&nbsp;17&#150;19"
date = "(not noted)"

[[issue]]
id = 1801776
link = "http://sourceforge.net/tracker/index.php?func=detail&group_id=71971&atid=894711&aid=1801776"
description = "<em>MathML schema must change, allow <code>definitionURL</code> on semantics</em>. The MathML subset schema does not allow the <code>definitionURL</code> attribute on the <code>&lt;semantics&gt;</code> element, but must in order to address issue #1745160 above."
location = "p.&nbsp;138 line&nbsp;54"
date = "(not noted)"

#============================================================================
+++
