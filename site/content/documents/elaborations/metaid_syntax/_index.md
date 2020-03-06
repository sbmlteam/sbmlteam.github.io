+++ # -*- mode: html -*-
######################################################################
title  = "The syntax of 'metaid' values in SBML"
date   = 2019-04-06
layout = "single"
######################################################################
+++

All SBML components can have an optional attribute, `metaid`, to store a "meta identifier". This attribute is used to support metadata annotations in an SBML document.  Often, users of SBML-compatible software tools do not have to see or interact with this attribute directly &ndash; it is something that software tools usually manage and hide from end users.  Software developers _do_ have to work with `metaid` attributes, however, and the allowed values for `metaid` have been a source of confusion for developers and advanced users of SBML.  This page attempts to clarify the syntax of the allowed values of the SBML `metaid` attribute.

## The origin of the `metaid` attribute

SBML uses the XML type `ID` as defined in the February 2004 version of the [XML 1.0 specification](https://www.w3.org/TR/2004/REC-xml-20040204/#id). Although later versions of the XML specifications imposed more restrictions on the format of the `ID` type, SBML specifications have always continued to use the original definition.  This is the source of confusion: although people often speak loosely and say that the `metaid` attribute takes on the values permitted by "the type `ID` defined in XML," in reality the permitted values are taken from a _specific version_ of the XML specification.

The specific definition of XML `ID` used in SBML is explicitly defined in the SBML specification documents, and has remained the same since the first introduction of the SBML `metaid` attribute.  Developers and advanced users of SBML are advised to consult the definition in the SBML specification rather than searching for the XML specification documents, to avoid the risk of accidentally reading a different definition of XML `ID`.

## Syntax explained

The specific text of the SBML specifications related to the definition of `metaid` is reproduced [further below on this page](http://sbml.org/Documents/Elaboration_and_clarification_of_selected_SBML_topics/The_Syntax_of_meta_id_in_SBML#The_relevant_text_from_the_SBML_specification) for reference.  Informally, the syntax stipulates that the value of an attribute of type `ID` must start with either a letter, an underscore, or a colon, and following the first character, it can then have any number of characters permitted in the categories shown below.

| Category          | Explanation                                          |
|-------------------|------------------------------------------------------|
| `dot`             | `.`                                                  |
| `dash`            | `-`                                                  |
| `underscore`      | `_`                                                  |
| `colon`           | `:`                                                  |
| `Letter`          | range of Unicode characters considered to be letters |
| `Digit`           | range of Unicode characters considered to be digits  |
| `CombiningChar`   | list of characters that add such things as accents to the preceding character |
| `Extender`        | list of characters that extend the shape of the preceding character |
| `NameChar`        | one of `Letter`, `Digit`, `CombiningChar`, `Extender`, `dot`, `dash`, `underscore`, `colon` |
| `ID`              | one of letter, underscore, colon _followed by_ any number of characters of type `NameChar` |

## XML Productions

The XML specification documents refer to ranges of Unicode characters as 'productions' (which are rules defined according to a certain convention). The following subsections list the allowable Unicode characters for a given definition. 

### Production `Letter`

These includes the expected (to English users) lower and uppercase Latin characters, as well as characters from all other sets.  More precisely, letters are defined by following production:

<pre>
Letter ::= BaseChar | Ideographic
</pre>

The XML specification then goes on to provide additional productions that list Unicode character ranges for `BaseChar` and `Ideographic`.

### Production `Digit`

The `Digit` production includes 0&ndash;9 and others. 

### Production `CombiningChar`

These are characters that are used to add an accent to the preceding character and therefore allow text such as å to be used.

### Production `Extender`

These are characters that can extend the shape of a character, such as · for example.  The full set of Unicode characters that falls into each of the categories listed above can be found [here](https://www.w3.org/TR/2004/REC-xml-20040204/#CharClasses).

## The relevant text from the SBML specification

The SBML specification documents explicitly define the syntax of the XML `ID` type used.  In recent Levels and Versions of SBML, the text is in section 3.1.6.  The following is the text verbatim.

_The XML Schema 1.0 type ID is identical to the XML 1.0 type ID. The literal representation of this type consists of strings of characters restricted as summarized in Figure 5._

<pre>
NameChar ::= letter | digit | '.' | '-' | '_' | ':' | CombiningChar | Extender
ID ::= ( letter | '_' | ':' ) NameChar*
</pre>

_Figure 5: Type ID expressed in the variant of BNF used by the XML 1.0 specification (Bray et al., 2004). The characters `(` and `)` are used for grouping, the character `*` indicates “zero or more times”, and the character `|` indicates “or”. The production letter consists of the basic upper and lower case alphabetic characters of the Latin alphabet along with a large number of related characters defined by Unicode 2.0; similarly, the production digit consists of the numerals `0..9` along with related Unicode 2.0 characters. The `CombiningChar` production is a list of characters that add such things as accents to the preceding character. (For example, the Unicode character `#x030A` when combined with ‘a’ produces ‘å’.) The `Extender` production is a list of characters that extend the shape of the preceding character. Please consult the XML 1.0 specification (Bray et al., 2004) for the complete definitions of `letter`, `digit`, `CombiningChar`, and `Extender`._

_In SBML, type `ID` is the data type of the metaid attribute on `SBase`, described in Section 3.2. An important aspect of `ID` is the XML requirement that a given value of `ID` must be unique throughout an XML document. All data values of type `ID` are considered to reside in a single common global namespace spanning the entire XML document, regardless of the attribute where type `ID` is used and regardless of the level of nesting of the objects (or XML elements)._

## References

Bray, T., Paoli, J., Sperberg-McQueen, C. M., Maler, E., and Yergeau, F. (2004). Extensible markup language (XML) 1.0 (third edition), W3C recommendation 4-February-2004. Available via the World Wide Web at http://www.w3.org/TR/2004/REC-xml-20040204.
