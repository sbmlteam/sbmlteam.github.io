--- # -*- mode: markdown -*-
#=====================================================================
title: "All Versions of SBML Level 2"
date: 2020-03-10
layout: "single"
#=====================================================================
---

An explanation is warranted about release numbering. The term _Releases_ was introduced in SBML Level&nbsp;2 Version&nbsp;3; the Release approach is used to cope with minor editorial changes to specification documents. Prior to that, in Version&nbsp;2, the same concept existed under the name _Revision_, but only one revision of Level&nbsp;2 Version&nbsp;2 was ever produced. In SBML Level&nbsp;2 Version&nbsp;1, the Release/Revision concept was not used at all; there is only "SBML Level&nbsp;2 Version&nbsp;1". To make matters simpler, this page lists all previously issued specifications of SBML Level&nbsp;2, regardless of whether they were Releases of Version&nbsp;5, or past Versions.

Developers and modelers are **strongly encouraged** to support the **latest** Version of SBML in any new software development and modeling efforts, as well as to update actively-supported software tools they may be involved in developing or maintaining.

{{% notice type="info" %}}
SBML uses a subset of MathML 2.0 to encode mathematical expressions. The XML Schema for this subset of MathML is included in the SBML specification documents themselves; it is is also provided here as a separate download for convenience: [<i class="file-download fa-file-download fas fa-1x"></i> **sbml-mathml.xsd**](/documents/specifications/sbml-level-2/sbml-mathml.xsd).
{{% /notice %}}

{{% notice type="warning" %}}
Although [XML Schemas](https://en.wikipedia.org/wiki/XML_schema) are available for SBML Level&nbsp;2, <strong>the schemas only capture the basic syntax</strong> of the format.  Semantics and correct usage are <strong>not</strong> captured by the schemas and can only be understood by reading the specification documents.
{{% /notice %}}


## SBML Level 2 Version 5

The current definition of SBML Level 2 is **Version 5**.

{{< sbml-spec-box package="core" level="2" version="5" release="1" >}}


## SBML Level 2 Version 4

**Release 1**

{{< sbml-spec-box package="core" level="2" version="4" release="1" >}}


## SBML Level 2 Version 3

**Release 2**

{{< sbml-spec-box package="core" level="2" version="3" release="2" >}}

**Release 1**

{{< sbml-spec-box package="core" level="2" version="3" release="1" >}}


## SBML Level 2 Version 2

As noted above, SBML Level 2 Version 2 existed in only one Revision.

{{< sbml-spec-box package="core" level="2" version="2" revision="1" >}}


## SBML Level 2 Version 1

As noted above, the use of Releases/Revisions was introduced after Level 2 Version 1 was developed; consequently, for Level&nbsp;2 Version&nbsp;1, there is no "Release" or "Revision" designation.

{{% notice type="danger" %}}
Note that Version 1 has significant limitations and conceptual gaps. The SBML Editors strongly encourage developers to update existing Version 1-supporting tools to support a later version of SBML Level 2 or SBML Level&nbsp3;. Similarly, we courage modelers who have models in Version 1 format to update their models to a later Version.
{{% /notice %}}

{{< sbml-spec-box package="core" level="2" version="1" release="none" >}}
