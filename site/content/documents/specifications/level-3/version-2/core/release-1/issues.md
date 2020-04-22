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
version = 2
release = 1

[[issue]]
id = 346
link = "https://sourceforge.net/p/sbml/sbml-specifications/346"
description = "Clarify `rateOf` behavior at _t < 0_."
location = "Section 3.4.6"
date = "December '18"

[[issue]]
id = 349
link = "https://sourceforge.net/p/sbml/sbml-specifications/349"
description = "Clarify that `max`/`min` are only discouraged if there are no arguments."
location = "Section 3.4.1"
date = "December '18"

[[issue]]
id = 353
link = "https://sourceforge.net/p/sbml/sbml-specifications/353"
description = "Extend relaxed unit rules to **Compartment** validation."
location = "Validation rules 20507-9"
date = "December '18"

[[issue]]
id = 356
link = "https://sourceforge.net/p/sbml/sbml-specifications/356"
description = "Emphasize that the `metaid` syntax is taken from XML 1.0, not 1.1."
location = "Section 3.1.6"
date = "December '18"

[[issue]]
id = 357
link = "https://sourceforge.net/p/sbml/sbml-specifications/357"
description = "Update URLs: fix dead links; use https if possible."
location = "Section 6 and others"
date = "December '18"

[[issue]]
id = 358
link = "https://sourceforge.net/p/sbml/sbml-specifications/358"
description = "Clarify rules about XML namespace for attributes."
location = "Section 1.4.3, Appendix A"
date = "February '19"

[[issue]]
id = 362
link = "https://sourceforge.net/p/sbml/sbml-specifications/362"
description = "Clarify use of `bvar` in `lambda` element of **FunctionDefinition**."
location = "Appendix A"
date = "March '19"

[[issue]]
id = 363
link = "https://sourceforge.net/p/sbml/sbml-specifications/363"
description = "Update MathML-related validation rules to let packages override them."
location = "Appendix A"
date = "March '19"

#============================================================================
+++
