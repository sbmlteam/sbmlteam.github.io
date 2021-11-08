+++ # -*- mode: html -*-
#============================================================================
title  = "About annotations in SBML Level 2 and Level 3"
layout = "single"
toc    = true
#============================================================================
+++

The following is an attempt to clarify some issues in the SBML annotation scheme defined since SBML Level&nbsp;2.  The fact that the scheme uses RDF, but not _all_ RDF, has been a source of confusion.  The use of a very restricted subset of RDF is intended to let software developers avoid having to implement full-on RDF parsing, but at the same time, understanding what can and cannot be put into SBML Level&nbsp;2 merits elaboration.  We discuss these issues here and provide guidelines for how to encode certain kinds of information that SBML developers have requested.

## What is allowed inside <code>rdf:Description</code> in SBML Level 2 and Level 3?

In Section 6.3, the SBML specification states that RDF content in an `<annotation>` element, when not attached to the `model` element, essentially must take the following form (and here we've shortened the list of XML namespace declarations to a typical minimum set):

<pre>
&lt;<span style="background-color: #aaccaa; font-style: italic">SBML_ELEMENT</span> <span style="background-color: #999999; color: #ffffff">...</span> metaid="<span style="background-color: #9999ff; font-style: italic">SBML_META_ID</span>" <span style="background-color: #999999; color: #ffffff">...</span>&gt; 
&nbsp;&nbsp;<span style="background-color: #999999; color: #ffffff">...</span> 
&nbsp;&nbsp;&lt;annotation&gt; 
&nbsp;&nbsp;&nbsp;&nbsp;<span style="background-color: #999999; color: #ffffff">...</span> 
&nbsp;&nbsp;&nbsp;&nbsp;&lt;rdf:RDF&nbsp;xmlns:rdf="<nowiki>http://www.w3.org/1999/02/22-rdf-syntax-ns#</nowiki>" 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;xmlns:bqbiol="<nowiki>https://biomodels.net/biology-qualifiers/</nowiki>" 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;xmlns:bqmodel="<nowiki>https://biomodels.net/model-qualifiers/</nowiki>"  &gt; 
<font color="darkred">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;rdf:Description rdf:about="#<span style="background-color: #9999ff; font-style: italic">SBML_META_ID</span>" &gt; 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;<span style="background-color: #cc9999; font-style: italic">QUALIFIER</span>&gt; 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;rdf:Bag&gt; 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;rdf:li rdf:resource="<span style="background-color: #c9f900; font-style: italic">MIRIAM_URI</span>" /&gt; 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="background-color: #ffcc99">...</span> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="background-color: #cc9999">[NESTED_CONTENT]</span> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;/rdf:Bag&gt; 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;/<span style="background-color: #cc9999; font-style: italic">QUALIFIER</span>&gt; 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="background-color: #ffcc99">...</span> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;/rdf:Description&gt; </font>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="background-color: #999999; color: #ffffff">...</span> 
&nbsp;&nbsp;&nbsp;&nbsp;&lt;/rdf:RDF&gt; 
&nbsp;&nbsp;&nbsp;&nbsp;<span style="background-color: #999999; color: #ffffff">...</span> 
&nbsp;&nbsp;&lt;/annotation&gt; 
&nbsp;&nbsp;<span style="background-color: #999999; color: #ffffff">...</span> 
&lt;/<span style="background-color: #aaccaa; font-style: italic">SBML_ELEMENT</span>&gt; 
</pre>

The different elements have the following meanings:

| Thing                                                                                        | Description                                |
|---------------------------------------------------------------------------------------------:|--------------------------------------------|
| <code style="background-color: #aaccaa; font-style: italic">SBML_ELEMENT</code> | The SBML element being annotated.  Can be any SBML element such as <code>species</code>, <code>reaction</code>, etc. |
| <code style="background-color: #9999ff; font-style: italic">SBML_META_ID</code> | The <code>metaid</code> attribute value of the SBML element being annotated.  Each SBML element being annotated must have a value for the <code>metaid</code> so that the annotations can refer to the element.  SBML's <code>metaid</code> attributes have data type XML ID and must be unique across _the entire model file_. |
| <code style="background-color: #cc9999; font-style: italic">QUALIFIER</code> | A [BioModels qualifier](http://co.mbine.org/standards/qualifiers) expressing the nature of the relationship between the SBML object being annotated and the target of the annotation (i.e., the thing pointed to by the <code style="background-color: #c9f900; font-style: italic">MIRIAM_URI</code>).  The qualifiers begin with the character strings <code>bqbiol:</code> and <code>bqmodel:</code>.  In all cases using the biology qualifiers, the object of the relation is the biological or biochemical object represented by the enclosing model element. In the cases of the model qualifiers, the object of the relation is the model element itself. |
| <code style="background-color: #cc9999; font-style: italic">[NESTED_CONTENT]</code> | The <code style="background-color: #cc9999; font-style: italic">[NESTED_CONTENT]</code> has the same format and restrictions as <code style="background-color: #cc9999; font-style: italic">QUALIFIER</code>, and is used to describe a clarification or another annotation about the <code style="background-color: #cc9999; font-style: italic">QUALIFIER</code> in which it appears, using such elements as <code>bqbiol:isDescribedBy</code>. Nested content permits, for example, describing protein modifications on species, or adding evidence codes for an annotation. Nested content relates to its containing <code style="background-color: #cc9999; font-style: italic">QUALIFIER</code>, not the other way around. It qualifies, but does not change, its meaning. Ignoring a <code style="background-color: #cc9999; font-style: italic">[NESTED_CONTENT]</code> does not affect the information provided by the containing <code style="background-color: #cc9999; font-style: italic">QUALIFIER</code>. These elements may be nested arbitrarily deep, with each successive layer describing or clarifying the annotation it is embedded within. |
| <code style="background-color: #c9f900; font-style: italic">MIRIAM_URI</code>  | The URI of the (external) resource being referenced, following the [MIRIAM URI specification](http://co.mbine.org/standards/miriam_uris). |
| <code style="background-color: #ffcc99">&#46;&#46;&#46;</code> | A placeholder for "more of the same", meaning, zero or more elements of the same form as the immediately preceding element.  In the template above, there are 2 places where this appears: inside the `rdf:Bag` element to indicate that more `rdf:li` elements can appear there, and after the <code style="background-color: #cc9999; font-style: italic">QUALIFIER</code> element, to indicate that more <code style="background-color: #cc9999; font-style: italic">QUALIFIER</code> elements can appear there. |
| <code style="background-color: #999999; color: #ffffff">&#46;&#46;&#46;</code> | A placeholder for either no content, or content that is other than the content defined by this Level&nbsp;2 annotation scheme |

There are some important restrictions to keep in mind regarding the SBML Level&nbsp;2 scheme.  The first restriction (stipulated in Section&nbsp;3.2.4 of the SBML Level&nbsp;2 Version&nbsp;4 specification) is that  there can be only one `<rdf:RDF>` element inside a given `<annotation>` element.  Consequently, all RDF content associated with a given SBML object must be contained in this single `<rdf:RDF>` element.  The second restriction (stipulated in Section&nbsp;6.3 of the SBML Level&nbsp;2 Version&nbsp;4 specification) is that SBML controlled annotations are only recognized when they are in the first `rdf:Description` element within the `<rdf:RDF>` element.  (This is shown in red type in the fragment above.)  There can be other content inside the `<rdf:RDF>` element, but as far as the SBML MIRIAM annotation scheme is concerned, such other RDF content is private to a given model or software application and falls outside the simple scheme defined by SBML Level&nbsp;2.  (These restrictions are an effort to reduce the burden on software developers&mdash;it is presumed that the highly restricted scheme means an application does not need a full-blown RDF parser/writer in order to parse or write the SBML controlled annotations.)

A third restriction is that the structure of the `rdf:Description` element (shown in red type above) is actually limited to _only what is shown here_, and the structure of the <code style="background-color: #cc9999; font-style: italic">QUALIFIER</code> element is likewise limited to just an `rdf:Bag` containing only `rdf:li` elements that only use `rdf:resource` attributes.  For better or worse, this is what SBML Level&nbsp;2 defines as the scheme for annotations.   While an application _could_ write other RDF content inside the first `rdf:Description` element, it _would not be compliant with SBML Level&nbsp;2_.  Applications should put other RDF content outside, where indicated above by the <code style="background-color: #999999; color: #ffffff">&#46;&#46;&#46;</code> after the first `rdf:Description` element. The sections below provide give examples of doing this.

## Can the <code style="background-color: #c9f900; font-style: italic">MIRIAM_URI</code> refer to something inside the model?

No.  Although this is perhaps not clear in the SBML Level&nbsp;2 specification, the restriction on the <code>&lt;rdf:li rdf:resource="</code><code style="background-color: #c9f900; font-style: italic">MIRIAM_URI</code><code>"&gt;</code> elements is that the value _must_ be  an Identifiers.org URI (or the former MIRIAM URN)a MIRIAM URN.  Although this simplifies reading model definitions, it unfortunately limits what can be put within this annotation framework.

An application or model author is free to put other RDF content elsewhere (for example, after the first `rdf:Description` element, as mentioned above), but then it becomes a proprietary annotation, and there is no guarantee that another software program will be prepared to interpret it in the intended way.

## How do I put evidence codes in annotations?

There are at least two ways to do this.  One approach puts the annotations entirely within the first `rdf:Description` element, making it SBML MIRIAM compliant, but it comes with a limitation that may or may not be significant in a particular situation.  The second approach puts the annotation outside the first `rdf:Description` element, and while it is correct RDF and provides more power and flexibility, it is not compliant with the restricted SBML MIRIAM scheme of SBML Level&nbsp;2 (but may nevertheless be understood by software that can parse full RDF).  We describe each approach in turn.

### Approach #1

[MIRIAM Resources](http://www.ebi.ac.uk/miriam/main/mdb?section=browse) defines a URI for the ECO evidence code ontology accessed via the [Ontology Lookup Service](http://www.ebi.ac.uk/ontology-lookup).  To use it in the SBML Level&nbsp;2 annotation scheme, use the `isDescribedBy` biological qualifier from the [BioModels qualifiers list](http://www.ebi.ac.uk/miriam/main/mdb?section=qualifiers).  The following is an example of annotating a reaction with the ECO code `ECO:0000183`.

```
<reaction metaid="metaid_0000052" id="vPFK" name="Phosphofructokinase">
  <annotation>
    <rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"  
             xmlns:bqbiol="https://biomodels.net/biology-qualifiers/"  >

      <rdf:Description rdf:about="#metaid_0000052">
  
        <bqbiol:isDescribedBy>  
          <rdf:Bag>
            <rdf:li rdf:resource="http://identifiers.org/eco/ECO:0000183"/>
          </rdf:Bag>
        </bqbiol:isDescribedBy>
  
        <bqbiol:is>
          <rdf:Bag>
            <rdf:li rdf:resource="http://identifiers.org/kegg.reaction/R00756"/>
            <rdf:li rdf:resource="http://identifiers.org/reactome/REACT_736"/>
          </rdf:Bag>
        </bqbiol:is>
  
      </rdf:Description>

    </rdf:RDF>
  </annotation>
  ...  
</reaction>
```

The above says that the reaction "is described by" the given evidence code `ECO:0000183` ("Inferred from experiment/inferred from cell-free assay"), which is to be interpreted as the kind of evidence that supports the presence of the reaction in the model.  (Since the evidence code is _attached to the reaction_ and refers to it, this is the only possible interpretation.)  This approach is simple and fits entirely within the scheme defined in SBML Level&nbsp;2.

Depending on a modeler's goals, this evidence association may be just what is sought.  However, sometimes a modeler wants to describe the evidence associated with a particular _statement_ about an SBML model entity.  An example is associating an evidence code with a claim that a species occurs in a particular compartment: it is not a statement about the species, but rather about a relationship involving the species. The SBML Level&nbsp;2 annotation scheme does not permit this kind of annotation-referring-to-another-annotation structure.  We therefore describe an alternative (approach #2) below.

### Approach #2

The second approach uses other RDF syntax (specifically, [http://www.w3.org/TR/rdf-primer/#reification RDF Reification]) placed outside of the first `rdf:Description` element controlled by the SBML MIRIAM annotation scheme.  RDF reification provides a vocabulary for describing RDF statements using RDF, which is exactly the situation we face when we want to attach evidence codes to particular SBML annotations.  RDF reification uses a `rdf:Statement` element and three RDF property elements for the _subject_, _object_, and _predicate_ involved in the relationship being stated.

The following examples illustrates the syntax and approach:

```
<species metaid="metaid_0000052" id="S" compartment="ly"> 
  <annotation> 
    <rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
             xmlns:bqbiol="https://biomodels.net/biology-qualifiers/" > 
 
      <rdf:Description rdf:about="#metaid_0000052"> 
        <bqbiol:occursIn> 
          <rdf:Bag> 
            <rdf:li rdf:resource="http://identifiers.org/go/GO:0005764"/> 
          </rdf:Bag> 
        </bqbiol:occursIn> 
      </rdf:Description> 
 
      <rdf:Statement> 
        <rdf:subject rdf:resource="#metaid_0000052"/> 
        <rdf:predicate rdf:resource="https://biomodels.net/biology-qualifiers/occursIn"/> 
        <rdf:object rdf:resource="http://identifiers.org/go/GO:0005764"/> 
        <bqbiol:isDescribedBy> 
          <rdf:Bag> 
            <rdf:li rdf:resource="http://identifiers.org/eco/ECO:0000004"/> 
            <rdf:li rdf:resource="http://identifiers.org/pubmed/7017716"/> 
          </rdf:Bag> 
        </bqbiol:isDescribedBy> 
      </rdf:Statement> 
 
    </rdf:RDF> 
  </annotation> 
  ...
</species>
```

The `rdf:Description` element above says that the species `S` is located in a lysosome (a cellular structure identified by GO term `GO:0005764`).  That much conforms to the SBML MIRIAM annotation scheme defined in SBML Level&nbsp;2.

After this, the annotation above contains a second RDF element, the `rdf:Statement`.  This element states that the relationship "`S` occurs in `GO:0005764`" is described by two things simultaneously: the Pubmed publication number `7017716`, and the ECO evidence code `ECO:0000004` ("inferred from cell fractionation assay").  The first part of the statement uses the properties `rdf:subject`, `rdf:predicate` and `rdf:object`, respectively to identify the subject (here, the element with XML ID value `metaid_0000052`, which is the element for species `S`), the predicate (here, "occurs in", defined by a BioModels.net qualifier), and the target/object (here, the lysosome as identified by GO term `GO:0005764`) of the relationship.  The second part of the statement records the fact that this relationship is described by the given publication and evidence code.

It may seem as though there is duplication of information between the `rdf:Description` and `rdf:Statement` elements, but there is not.  The RDF reification statement in the second element is not an assertion that species `S` is located in a lysosome; it is a statement _about_ the assertion that species `S` is located in a lysosome.  As the [RDF Primer](http://www.w3.org/TR/rdf-primer/#reification) puts it, "... when someone says that John said something about the weight of a tent, they are not making a statement about the weight of a tent themselves, they are making a statement about something John said".

### Sample code for approaches #1 and #2

[Sarah Keating](http://sbml.org/About#The_SBML_Team) wrote sample code demonstrating how to add the annotations above using [libSBML](../../../software/libsbml).  The programs are included in the libSBML distribution under the `examples/c++` directory.  Here are direct links to the files:

* Example code for case #1 above: http://sourceforge.net/p/sbml/code/HEAD/tree/trunk/libsbml/examples/c++/addingEvidenceCodes_1.cpp
* Example code for case #2 above: http://sourceforge.net/p/sbml/code/HEAD/tree/trunk/libsbml/examples/c++/addingEvidenceCodes_2.cpp

## How do I put InChI strings in annotations?

_Update: InChIs now form [a collection in the MIRIAM Registry](http://www.ebi.ac.uk/miriam/main/collections/MIR:00000383). Therefore, one can use InChIs using MIRIAM URIs as described above._

Certain modeling efforts want to attach [InChI](http://www.iupac.org/inchi/) strings to SBML species elements, as a way of putting self-contained unique identifiers on the species.  The limitations on SBML Level&nbsp;2's RDF annotation content described above prevents putting the InChI content directly inside the `rdf:Description` elements as defined by the SBML MIRIAM scheme.  Consequently, in SBML Level&nbsp;2, the annotations must be entered as "proprietary" annotations, outside the Level&nbsp;2-defined scheme.  We give an example of an approach to doing this here.

```
<species metaid="metaid_M_8" id="M_8" name="1-Methylnicotinamide" compartment="C_1"> 
  <annotation> 
    <rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"  
             xmlns:bqbiol="https://biomodels.net/biology-qualifiers/"  >

      <rdf:Description rdf:about="#metaid_M_8"> 
        <bqbiol:is> 
          <rdf:Bag> 
            <rdf:li rdf:resource="http://identifiers.org/chebi/CHEBI:16797"/> 
          </rdf:Bag> 
        </bqbiol:is> 
      </rdf:Description> 

      <rdf:Description rdf:about="#metaid_M_8"> 
        <in:inchi xmlns:in="https://biomodels.net/inchi"> 
           InChI=1/C7H8N2O/c1-9-4-2-3-6(5-9)7(8)10/h2-5H,1H3,(H-,8,10)/p+1 
        </in:inchi> 
      </rdf:Description> 

    </rdf:RDF> 
  </annotation> 
</species>
```

The essential point of the scheme above is that it puts the InChI string as the content of an element other than the first `rdf:Description` element inside the `rdf:RDF` element.  The SBML Level&nbsp;2 specification only constrains the content of the first `rdf:Description` element, and permits valid XML RDF content beyond it, so the above is valid RDF, but simply outside the scope of the SBML Level&nbsp;2 annotation scheme.  SBML-compliant software tools may not attempt to understand it, but tools with extended support for RDF may be able to.

One last note about the use of the namespace URI `"https://biomodels.net/inchi"`. The use of a namespace-qualified element implies that the entity controlling the namespace has defined (or can define) the content that does into the element.   It may seem reasonable to use `"http://iupac.org/inchi"` for the namespace string, but it turns out that IUPAC, the organization behind InChI, does not define this namespace (or any namespace, as far as we can determine). This introduces the question of just exactly what to use in this situation.  Attempting to use `"http://iupac.org/inchi"` would risk encountering a conflict in the future if IUPAC ever ''does'' define something using the `"http://iupac.org/inchi"` namespace.  Consequently, a different namespace must be used.  The BioModels.net consortium will release a simple schema for this purpose, using the namespace URI `"https://biomodels.net/inchi"`.
