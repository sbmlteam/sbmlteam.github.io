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
level   = 1
version = 2

[[issue]]
id          = "2945736"
link        = "https://github.com/sbmlteam/sbml-specifications/issues/160"
location    = "p. 9 Fig. 4" 
date        = "9 Feb. 2010" 
description = "The specification document for Level 1 Version 2 states a model may have zero or more compartments, but the XML Schema required _one_ or more. The schema is considered to be in error."

#============================================================================
+++
