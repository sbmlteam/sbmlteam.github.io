+++ # -*- mode: markdown -*-
######################################################################
title = "SBML Development Process for SBML Level 3"
date  = 2019-05-10
######################################################################
+++

The overall SBML Development Process is detailed on a [ separate
page](Documents/SBML_Development_Process "wikilink"). The present page
describes specific aspects of the process that concern the development
of SBML Level 3, particularly SBML Level 3 *packages*.

This process description was revised and updated in January, 2012.

## Principles for development of SBML Level 3

SBML Level 3 is modular, in the sense of having a defined *core* set of
features and optional *packages* adding features on top of the core.
This modular approach means that models can declare which feature-sets
they use, and likewise, software tools can declare which packages they
support. It also permits the development of SBML Level 3 as a whole to
proceed in a modular fashion. The development process for Level 3 is
designed around this concept.

### Process stages

Any member of the [ SBML
Forum](Documents/SBML_Development_Process#The_SBML_Forum "wikilink") may
propose the creation of a package for SBML Level 3. Whether this
proposed package is ultimately accepted as being a desirable addition to
the set of SBML Level 3 specifications is a decision made collectively
by a majority vote of the [ SBML
Forum](Documents/SBML_Development_Process#The_SBML_Forum "wikilink").
The decision-making process is implemented using electronic voting
organized by the SBML Editors.

Packages take significant time and effort to develop. It would be
unreasonable to require the production of a complete specification for a
package before the SBML Forum is asked to vote on whether the package is
even considered worthwhile and appropriate for SBML Level 3. Therefore,
the development of packages is divided into two main stages:

  - The [ proposal development
    stage](#Package_proposal_development "wikilink")
  - The [ specification development
    stage](#Package_specification_development "wikilink")

This separation means that *proposals* for packages may be produced at
relatively low cost in terms of effort, time and other resources. As
explained below, the *specification* stage requires more effort,
including software implementations. Only after the purpose and general
outline of a proposed package are accepted does the full specification
need to be produced.

### Design guidelines

Developers of SBML Level 3 packages are generally free to make decisions
they feel are most appropriate for their packages. Nevertheless, some
basic ground rules are important so that development of SBML packages
and the SBML Core can take place in a reasonably coherent fashion. The
following general principles for Level 3 packages are intended to
provide basic guidance to package developers. There are three types:
*architectural principles*, *structural principles*, and *community
principles*. Collectively, they **constitute the basis for voting by the
community** on the suitability of a package at different stages in its
life cycle. These principles, and only these principles, will be used to
judge the acceptability of packages. The principles have been drawn from
the history of SBML, from the specification documents for the SBML
Levels 1–3 Core, and from discussions between the SBML Editors and the
SBML community at large.

#### Architectural principles

This group of principles concerns the purpose and general orientation of
a package. They are also used as the basis for voting on a package
proposal (one of the stages of the [SBML Level 3 Development
Process](http://sbml.org/Documents/SBML_Development_Process/SBML_Development_Process_for_SBML_Level_3)
for Level 3 packages). All package proposals and specifications must be
formulated with these points in mind:

1.  *Utility*: A package must concern itself with a subject or problem
    area that enough SBML users find useful to sustain interest in the
    package.
2.  *Biological orientation*: The overall aim of a package must be to
    support the description of biological processes and phenomena.
    (However, this does not preclude supporting the description of other
    phenomena, if doing so serves the overall aim.)
3.  *Coherence*: A package must extend SBML in a way that follows
    naturally from Level 3 Core and other packages, reusing concepts as
    appropriate and integrating new concepts into the existing
    frameworks in a reasonably natural manner.
4.  *Orthogonality*: As a general goal, SBML Level 3 and all its
    packages must strive to encode every given concept only once. Data
    and concepts should not be duplicated in multiple components or
    packages, except in extenuating circumstances or when a package is
    intentionally proposed as a replacement for another package.

If the developer(s) of a given package believe(s) that the package
should not or cannot follow one or more of these principles, they must
provide a compelling argument for their case.

#### Structural principles

Once a package proposal has been accepted and work has begun on a
specification for the package, the following additional guidelines must
be followed:

1.  *Effective abstractions*: A package must provide ways to store data
    using the most useful and general abstractions possible, to
    facilitate the exchangeability of models between different
    mathematical frameworks, different software tools, and possibly even
    different modeling paradigms.
2.  *Implementability*: A specification for an SBML package must be
    described clearly enough that readers can understand how to
    implement software support for it.
3.  *Explicitness*: All of SBML Level 3, including packages, must avoid
    defining attributes and elements with implicit default values that
    may be omitted from a syntactically-valid model definition. All
    non-optional attribute and element values must always be written out
    explicitly.
      - Note that this is not the same as inheritance. Attributes *are*
        allowed to be optional with no default values, and a
        specification can define how a missing value is inherited from
        another attribute elsewhere in the model. (For example, the
        Model attributes for units in Level 3 Core provide values that
        can be inherited by other SBML constructs.)
4.  *No removed restrictions*: If the core specification imposes some
    restriction on the contents of an SBML file, no package may lift
    that restriction. Any reference must still adhere to any rules about
    that reference; any required attribute or subelement must still be
    required; etc. This is to ensure that a validator may still
    correctly validate the parts of an SBML model that it understands,
    even in the presence of an unknown package.
      - Note that SBML Level 3 Version 2 lifted a great many
        restrictions itself, in large part to ease package development.
        IDs from packages may now be referenced in core constructs and
        in MathML; formerly required subelements are now optional; and
        the MathML subset may be extended by defining a new package that
        allows those particular constructs. Further restriction lifting
        should not be necessary in the course of normal package
        development.
      - Validation *warning* restrictions (such as anything to do with
        units) may be lifted (or changed), though this should be done
        sparingly. For example, the *Spatial* package uses different
        units for Reactions (concentration/time instead of extent/time)
        for those reactions with a particular attribute value from the
        Spatial package.
      - Exception: If during the course of package development, an
        intractable situation is discovered where some restriction from
        core must be lifted, and that otherwise the information cannot
        be encoded, the package developers may propose that this
        restriction be lifted from the core specification itself. If
        this is unfeasible, and if the SBML editors agree, the SBML core
        restriction may be lifted by the package directly. This should
        be the course of last resort, however.
      - Note that a package may impose new restrictions not present in
        core--it could make an otherwise optional attribute (like 'id')
        newly required, or require the presence of an element (such as a
        Reaction). It is also possible to make an optional attribute
        illegal in certain situations, or a required attribute always
        have a particular value. A validator would still be correct in
        any violations it found, even if it didn't know of the new
        restriction.
      - This rule does not apply to new classes that might inherit from
        SBML core classes, as the new class elements will necessarily
        live in the package namespace. A class may be defined that
        inherits from Parameter but which removes the 'constant' flag,
        for example. Again, a validator would still be correct in any
        violations it found, even when it didn't understand the package,
        as the new elements would exist in a not-understood namespace.

The implications of the principles above, especially *no removed
restrictions*, can be subtle and fundamental. The SBML Core
specification explicitly ascribes specific semantics to most core
constructs, especially species, compartments and reactions. SBML
"species" are assumed to be pools of entities considered
indistinguishable from each other, with their essential property being
the quantity of the species. The attributes of species in SBML Level 3
Core, such as `initialAmount`, `initialConcentration`, and
`substanceUnits`, are oriented towards this physical interpretation of
species. Similarly, SBML "reactions" are assumed to be processes that
*change the quantities of species*. An SBML Level 3 package may
reinterpret or extend the semantics of these constructs, but the way it
does so must preserve the *no removed restrictions* principle.
Sometimes, this may mean that required attributes may lose their meaning
in the new context of the package; this should simply be stated in the
package specification, and models created with the required attribute
anyway.

#### Community principles

SBML only exists to serve common purposes shared by a community of
users. To serve those purposes, it must continue to be developed with
input from the SBML community. This leads to one simple but important
principle:

1.  *Community involvement*: The development package must proceed with
    opportunities for involvement by, and contributions from, other
    interested members of the SBML community.

## Package proposal development

In the following text, "*proposer(s)*" refers to individuals or groups
who propose a package for SBML Level 3.

### The pre-proposal stage

1.  Individuals or groups who wish to propose a package for SBML Level 3
    must first consult the [ Level 3 activity
    area](Community/Wiki "wikilink") in the SBML.org Community Wiki and
    check whether a similar package has already been proposed or is
    already in development.
2.  If a package with similar goals has already been proposed, the
    proposer(s) should evaluate the details of the existing proposal and
    compare it to their own plans.
      - If the existing proposed package can satisfy the proposer(s)'s
        needs, then it is probably more worthwhile for the proposer(s)
        to join the existing package's development efforts. By doing so,
        they can save themselves considerable effort, and perhaps also
        influence some of the details of the ongoing effort to better
        suit them.
      - If, however, the proposer(s) judge(s) the existing efforts to be
        limited or unsuitable, the proposer(s) should proceed to step 2
        ("*The proposal stage*") described below.
3.  If no existing activity in Level 3 is similar enough to the new
    proposal, the proposer(s) must proceed to raise the topic on the
    [sbml-discuss](http://sbml.org/Forums/index.php?t=threadt&frm_id=2&rid=0)
    mailing list and ask for community input about whether proceeding
    with a proposal is worthwhile. (Motivation for this step:
    functionality may often be achieved in more than one way, and the
    SBML community may already have discussed developing a given feature
    through a different approach. Therefore, before spending effort on a
    detailed proposal, it is worth first checking with the rest of the
    community to make sure there is enough interest.)

### The proposal development stage

1.  All proposals should start with a post to sbml-discuss to assess
    community interest and involvement. This also allows others who
    would be interested to join the development of the proposal.
2.  Proposers must develop their Level 3 package proposal using the [
    Level 3 Package Proposal
    Template](Documents/SBML_Development_Process/Level_3_Package_Proposal_Template "wikilink").
      - There is no prescribed file format for Level 3 proposals; the [
        template](Documents/SBML_Development_Process/Level_3_Package_Proposal_Template "wikilink")
        only prescribes the content that should be provided. Many
        proposals are written as wiki pages in the SBML.org [ Community
        Wiki](Community/Wiki "wikilink"), but they could equally be
        written as LaTeX documents or another format.
      - Proposers are invited to store their proposals in the [ SVN
        repository for SBML](SBML_Projects/SVN "wikilink"). Interested
        persons should contact the SBML Editors for guidance and
        assistance in doing this.
      - There are no length requirements for a package proposal. The
        proposal should be long enough to allow the SBML community to
        assess and vote on the proposal as described below. Some
        packages may be simple enough that a few paragraphs suffice;
        others may need more detailed explanations. In all cases,
        authors of package proposals are advised to pay particular
        attention to giving clear explanations of (i) the needs that the
        proposed package is meant to address and (ii) the approach being
        proposed to address those needs.
3.  After writing the proposal according to the template, the
    proposer(s) should ask the Chair of the SBML Editors to add a link
    to the proposal in the Level 3 area on the SBML.org [ Community
    Wiki](Community/Wiki "wikilink"). The link should be placed on the
    appropriate topic page (if one exists) or added to the table of
    activity areas.
4.  Next, the proposer(s) must notify the SBML community about the
    proposal by posting on the
    [sbml-discuss](http://sbml.org/Forums/index.php?t=threadt&frm_id=2&rid=0)
    mailing list.
5.  A period of discussion will ensue. The proposer(s) should engage in
    a period of requesting comments and replying to them. During this
    time, the proposer(s) should modify the proposal if needed in
    response to issues raised by other people.

### The proposal voting/selection stage

1.  The period of discussion described in step (5) of [the proposal
    development stage](#The_proposal_development_stage "wikilink") must
    last a minimum of 2 weeks. Any time after the minimum period of
    discussion, either the proposer(s), or the SBML Editors, can request
    a formal vote on whether the proposal should be pursued further.
      - The request can be made by posting a request on
        [sbml-discuss](http://sbml.org/Forums/index.php?t=threadt&frm_id=2&rid=0)
        or by contacting the SBML Editors directly.
      - The SBML Editors must respond publicly in a timely fashion to
        the request.
      - The timing and other conditions for issuing the voting survey
        are left to the judgment of the SBML Editors.
2.  The SBML Editors will construct a survey for the purpose of holding
    a public vote on the proposal. The voting form will allow members of
    the SBML community to indicate one of 4 choices: (i) *accept*: the
    proposal addresses a need that SBML should cover, and it is clear
    the proposed approach follows the stated principles; (ii) *reject*:
    the proposal does not address a need that SBML should cover; (iii)
    *revise*: the proposed approach either does not follow the stated
    principles, or there is insufficient information to tell if it does;
    (iv) *abstain*: the voter does not wish to take a position or cannot
    fully assess the proposal as given.
      - The detailed contents of the voting form are described in more
        detail in a [separate
        subsection](#Contents_of_the_voting_form "wikilink") below.
      - The form may also contain the option for voters to sign up for
        the relevant [Package Working
        Group](#The_Package_Working_Group_.28PWG.29 "wikilink") (PWG).
3.  The Chair of the SBML Editors will issue the call for votes. A
    *minimum* period of 2 weeks will be given before the vote is closed
    to give the SBML community sufficient time to evaluate the technical
    aspects of the proposal. At the Chair's discretion, a longer period
    may be chosen if it is warranted.
4.  At the end of the voting period, the SBML Editors will report the
    outcome publicly. The results will be assessed according to the
    formula described in the section titled "[Formula for assessing the
    outcome](#Formula_for_assessing_the_results "wikilink")" below.
5.  Unless the outcome of the previous step is *reject*, the SBML
    Editors will form a [Package Working
    Group](#The_Package_Working_Group_.28PWG.29 "wikilink") (PWG)
    consisting of at least one of the package proposers, at least one
    SBML Editor, and any other members of the
    [sbml-discuss](http://sbml.org/Forums/index.php?t=threadt&frm_id=2&rid=0)
    mailing list who request to be part of the PWG. The Editors will
    further create a mailing list that will serve as both a basic
    notification/communication mechanism as well as a membership list
    for the PWG. The Editors will announce the formation of the PWG on
    the
    [sbml-discuss](http://sbml.org/Forums/index.php?t=threadt&frm_id=2&rid=0)
    mailing list, and optionally via other means.
      - The mailing list should have the name
        `sbml-`<i><span style="background-color: #fff8aa">`label`</span></i>,
        where
        <i><span style="background-color: #fff8aa">`label`</span></i> is
        the short-form label for the package. (Example: `sbml-multi`.)
        If technical reasons prevent using
        `sbml-`<i><span style="background-color: #fff8aa">`label`</span></i>,
        the list should have the next-best alternative name that the
        purpose of the list clear.
      - The grandfather clause detailed in [ Special case
        \#1](Documents/SBML_Development_Process/SBML_Development_Process_for_SBML_Level_3#Special_cases_and_circumstances "wikilink")
        applies.

#### Contents of the voting form

The voting form for package proposals will reflect the principles
described in the section on [architectural
principles](#Architectural_principles "wikilink"). To encourage
thoughtful and thorough consideration of the proposed packages with
respect to those [architectural
principles](#Architectural_principles "wikilink"), the form will request
voters to address the points individually, and ask for an overall
assessment as a separate question. The following is an outline of the
basic content of the voting form:

<table class="no-borders tight-spacing" style="margin: 1rem auto; background-color: #f9f9f9 !important">
  <thead>
    <tr>
      <td colspan="4"><strong><em>Utility</em></strong>: the package addresses a problem whose solution SBML users are likely to find useful</td>
   </tr>
  </thead>
  <tr>
    <td width="20%">&#9744; Agree</td>
    <td width="20%">&#9744; Disagree</td>
    <td width="25%">&#9744; Insufficient information</td>
    <td width="20%">&#9744; Abstain</td>
 </tr>
  <thead>
    <tr>
      <td colspan="4"><strong><em>Biological orientation</em></strong>: the package's overall aim is to support the description of biological processes and phenomena</td>
   </tr>
  </thead>
  <tr>
    <td width="20%">&#9744; Agree</td>
    <td width="20%">&#9744; Disagree</td>
    <td width="25%">&#9744; Insufficient information</td>
    <td width="20%">&#9744; Abstain</td>
 </tr>
  <thead>
    <tr>
      <td colspan="4"><strong><em>Orthogonality</em></strong>: within reason, the package does not duplicate the purpose or data captured by other packages.</td>
   </tr>
  </thead>
  <tr>
    <td width="20%">&#9744; Agree</td>
    <td width="20%">&#9744; Disagree</td>
    <td width="25%">&#9744; Insufficient information</td>
    <td width="20%">&#9744; Abstain</td>
 </tr>
  <thead>
    <tr>
      <td colspan="4"><strong><em>Overall assessment of the package proposal</em></strong>:</td>
   </tr>
  </thead>
  <tr>
    <td colspan="4">&#9744; <em>Accept</em>: proposal addresses a need that SBML should cover, and the approach clearly follows the stated principles</td>
 </tr>
  <tr>
    <td colspan="4">&#9744; <em>Reject</em>: proposal does not address a need that SBML should cover</td>
 </tr>
  <tr>
    <td colspan="4">&#9744; <em>Revise</em>: approach either does not follow the stated principles, or there is insufficient information to tell if it does</td>
 </tr>
  <tr>
    <td colspan="4">&#9744; <em>Abstain</em>: I cannot fully assess the proposal as given, or do not wish to state an opinion</td>
 </tr>
</table>

In addition to the above, the voting form will include comment boxes
that allow voters to provide more detailed feedback about the proposal
and why they voted they way they did.

#### Formula for assessing the outcome

To assess the outcome of the vote, the SBML Editors will use only the
question titled "*Overall assessment of the package proposal*" in the
form [described above](#Contents_of_the_voting_form "wikilink"). The
formula to be used is as follows:

1.  For the decision to be *accept*, 50% or more of the non-abstaining
    voters must have chosen the *accept* option.
2.  For the decision to be *reject*, more than 50% of the non-abstaining
    voters must have chosen the ''reject option.
3.  Any other outcome is deemed equivalent to *revise*.

#### Resubmission of proposals

Any proposal that is not approved by the community (where the majority
of non-abstaining voters did not vote *Accept*) may be rewritten and
resubmitted after a minimum period of 3 months has passed. Proposal
authors are advised to consider the reason(s) the vote failed the first
time—if several people checked *Disagree* for one for more of the
proposal characteristics, a new approach is probably called for, while
if people checked *Insufficient information*, more detail may be all
that is needed.

### The proposal acceptance stage

1.  If there is only one proposal for a given topic or purpose, and the
    outcome of step (4) of [the proposal voting/selection
    stage](#The_proposal_voting.2Fselection_stage "wikilink") is the
    acceptance of that package, then no further action is needed. The
    authors of that package can move to [ The package specification
    development
    stage](Documents/SBML_Development_Process/SBML_Development_Process_for_SBML_Level_3#The_package_specification_development_stage "wikilink").
2.  If there are multiple proposals for a given topic or purpose, then
    the authors of the different proposals should be encouraged by the
    SBML Editors to either (i) combine their proposals to reach a single
    combined proposal, or (ii) remove the overlap in their proposals so
    that they address distinct problems and can be treated as solutions
    to different problems.
3.  If, after the previous step, multiple proposals still remain, then a
    separate community vote must be performed to select which one of the
    proposals should be adopted as the accepted approach for a given
    problem area. The following are the steps for that process.
    1.  The Chair of the SBML Editors will construct a survey for the
        purpose of holding a public vote to select between the
        alternative proposals. The survey will allow members of the SBML
        community to indicate which one of the proposals they prefer.
    2.  The Chair of the SBML Editors will issue the call for votes. A
        minimum period of 4 weeks will be given before the vote is
        closed to give the SBML community sufficient time to evaluate
        the merits of the alternative proposals. At the Chair's
        discretion, a longer period may be chosen if it is deemed
        appropriate.
    3.  At the end of the voting period, the SBML Editors will report
        the outcome publicly using the same rules as described in step
        (4) of [the proposal voting/selection
        stage](#The_proposal_voting.2Fselection_stage "wikilink"). The
        proposal chosen by majority vote will be the one moved to the
        stage of [ Package specification
        development](#Package_specification_development "wikilink").

## Package specification development

At any time, but especially after a package proposal is accepted, the
proposer(s) and other interested individuals may begin writing a full
specification for the package. Coordination and communication during the
development of the specification(s) is intended to be helped by the
[Package Working Group](#The_Package_Working_Group_.28PWG.29 "wikilink")
described below. There are also guidelines for the [format of the
specification](#The_format_of_the_specification "wikilink"), and there
is a process for [approving the final
specification](#The_approval_of_the_specification "wikilink").

### The Package Working Group (PWG)

SBML, being a community standard, depends vitally on community
participation for development and review. The Package Working Group
(PWG) is intended to promote focused participation centered around a
subset of SBML, namely, an SBML Level 3 package. The goal is to bring
together individuals who have relevant expertise and interests, and
enable them to collaborate throughout the life of a package—not only
taking the package proposal from inception to full specification, but
also supporting the package's maintenance throughout its existence.

The requirements for a PWG are as follows:

1.  The existence of a mailing list, as noted in point (5) of the
    section on "[The proposal voting/selection
    stage](#The_proposal_voting.2Fselection_stage "wikilink")". This
    list serves the dual purpose of providing a basic mechanism for
    notification and discussion, and identifying the membership list the
    PWG. (PWGs are of course free to implement other mechanisms of
    communication in addition to the list.)
2.  Inclusion, as member of the PWG, of one or more of the original
    authors of the proposal for the package, at least during the initial
    creation of the PWG. Original authors of the proposal may
    subsequently depart the PWG at any time after the PWG is created.
3.  Inclusion, as member of the PWG, of one or more SBML Editors, to act
    as liaison. It is up to the SBML Editors to decide who will be the
    member.
4.  Regular reporting to the SBML Editors about the progress on the
    development of the specification for the SBML Level 3 package.
    Reporting will take place not less than once a year at the occasion
    of the SBML Forum's general meeting. (However, PWGs are encouraged
    to report and discuss activities with the SBML Editors and the wider
    SBML community *much* more frequently than once a year.)

PWGs are free to organize themselves and make decisions as they deem
appropriate, but the development of the SBML Level 3 package must follow
the overall [principles for development of SBML
Level 3](#Principles_for_development_of_SBML_Level_3 "wikilink"). The
developers of an SBML Level 3 package should strive to solicit feedback
from the other members of their relevant PWG, and to keep the PWG
abreast of package developments in a timely manner, so that concerns can
be addressed quickly and new ideas can be incorporated early in the
process. The PWG should be viewed as a resource to help bring the
package to realization, not as an obstacle or bureaucratic hurdle.

### The format of the specification

In order for the collection of SBML Level 3 specifications to form a
better-integrated whole despite being written by different people at
different times, the SBML Development Process places a few requirements
on the format of specification documents.

1.  Specification documents must use the [ official document
    template](Documents/Specifications/The_SBMLPkgSpec_LaTeX_class "wikilink")
    for SBML Level 3 package specifications.
2.  The specification must include [UML 1.0 class
    diagrams](http://en.wikipedia.org/wiki/Unified_Modeling_Language)
    describing all data structures defined by the package. (The
    specification may also use other means to describe the structures,
    in addition to using UML 1.0.)
3.  If the package extends components of SBML Level 3 Core, the
    specification must make clear what the extensions are.
4.  The specification must follow the SBML Level 3 [ package numbering
    and declaration
    scheme](Community/Wiki/SBML_Level_3_Core/Package_mechanism "wikilink").
5.  Packages developed for one version of SBML Level 3 may be used for
    future versions of SBML Level 3 if and only if the semantics of that
    package are unchanged in the new context, and they do not take
    advantage of new features of the new version. This is so that all
    behaviors are always defined explicitly, and never assumed.

### The approval of the specification

Package authors may seek approval of the specification when they feel it
is appropriate to do so and the specification has met the criteria
listed below. No time limit is set for this part of the process because
different packages will differ in their needs, complexity, scale, and
other factors.

#### Criteria for approval

A proposed package specification becomes an *Approved SBML Level 3
Package* after it satisfies the following criteria:

1.  ***There exist at least two separate software implementations***.
    There must be at least two software systems that implement support
    for manipulating the constructs defined in the package
    specification.
    1.  The software must be able to *manipulate* the constructs in the
        package, and not simply store and retrieve the package
        constructs. (For this reason, implementing support for the
        package in a library such as
        [libSBML](Software/libSBML "wikilink") alone does not qualify as
        one of the implementations, although of course other software
        may use the libSBML package support as part of their qualifying
        implementations.)
    2.  *Each* software package must be able to manipulate a majority of
        the features defined in the package. (The precise definitions of
        what constitutes a *majority of the features* and *able to
        manipulate* are left to the PWG to decide. The operational
        criteria may be different for different SBML Level 3 packages.)
    3.  Every feature in the package specification must be supported and
        manipulated by *at least one* of the two tools.
2.  ***The SBML Editors approve the package specification***. Approval
    by the SBML Editors means that the package will be judged according
    to its adherence to (i) the package [ design
    guidelines](#Design_guidelines "wikilink"), (ii) the [ format
    guidelines](#The_format_of_the_specification "wikilink"), and (iii)
    the process described in this document. With respect to the design
    guidelines, the SBML Editors will consider the following points:
      - *Utility*: Does the package concern itself with a subject or
        problem area that SBML users find useful?
      - *Biological orientation*: Is the overall aim of the package to
        support the description of biological processes and phenomena?
      - *Coherence*: Are there concepts in this package that are already
        encoded in a different package? If so, could they be
        synchronized? Are the new constructs tied, where appropriate, to
        Level 3 core concepts, or to other package constructs?
      - *Orthogonality*: Does the package overlap any other SBML Level 3
        package? Are the data it stores represented only once, or is
        data being duplicated unnecessarily?
      - *Effective abstractions*: What are the various ways one can
        analyze the data stored with this package? Are all (or a
        reasonable subset) accommodated by this package? Is there a bias
        in favor of a particular approach?
      - *Implementability*: Are the two purported implementations of the
        package truly functional?
      - *Explicitness*: Does the package define any implicit defaults
        anywhere?
      - *No removed restrictions*: Do models created with this package
        continue to adhere to core/other package validation rules?
      - *Community*: As this package was developed, was the community
        invited to participate in the Package Working Group (PWG), and
        was the PWG consulted when making key decisions? Is there anyone
        who justifiably feels left out of the development process?

#### Approval process

As mentioned above, a specific time schedule is not provided for seeking
approval of a full specification. A request for approval can be
initiated by the authors of the SBML Level 3 package specification
whenever they feel it is appropriate. The process is as follows:

1.  The authors contact the SBML Editors and request approval of the
    specification. (They must also inform their relevant PWG at the same
    time.)
2.  Using the [SBML issue tracker](http://sbml.org/issue-tracker) with
    the Label *"SBML Level 3 package approval"*, the author(s) must log
    their intention to submit their package for final approval,
    detailing their justification for doing so (adherence to the
    principles for package development, and evidence of implementation).
    This will provide a tracking number and a place for the SBML Editors
    and other people to record comments related to the topic, as well as
    a place to record the SBML Editor's final decision, evaluating the
    specification according to the criteria described above.
3.  The SBML Editors, in addition to reading the specification
    themselves, should solicit feedback from the community at large,
    especially from
    [sbml-discuss](http://sbml.org/Forums/index.php?t=index&rid=0).
4.  The SBML Editors will report the results of their evaluation to the
    package authors and the relevant PWG.
      - If the decision is *not* to approve the specification, the SBML
        Editors must provide a detailed justification to the authors and
        PWG. The justification must explain how the specification fails
        to adhere to the criteria described above. The authors of the
        specification may address the issues raised and revise the
        proposal as needed, then return to step (1) of this approval
        process.
      - If the decision is to approve the specification, the SBML
        Editors will perform the following steps:
        1.  Incorporate the package specification document(s) in the [
            list of SBML Level 3
            specifications](Documents/Specifications#SBML_Level_3 "wikilink").
        2.  Arrange for a [COMBINE Specifications
            URL](http://co.mbine.org/standards/specification-infrastructure)
            for the specification document.
        3.  Update the package activity web page(s) in the SBML.org [
            Community Wiki](Community/Wiki "wikilink").
        4.  Issue a public announcement to the
            [sbml-discuss](http://sbml.org/Forums/index.php?t=index&rid=0)
            and
            [sbml-announce](http://sbml.org/Forums/index.php?t=index&rid=0)
            mailing lists.

## Special cases and circumstances

As a result of the fact that the SBML process is being developed
essentially at the same time as SBML itself and its community is
evolving, sometimes special cases (such as grandfather clauses) are
introduced in provide smoother continuity in official procedures. This
section gathers these cases separately from the main body of the text
above. The clauses are numbered sequentially, and the text above refers
to the numbers.

1.  *Grandfather clause for the creation of PWG's for package proposals
    in existence as of April 2011*. In recognition of the fact that many
    package proposals were in existence for some years before these SBML
    process rules were created, and have achieved a type of de facto
    acceptance in the SBML community as being desirable packages, the
    formation of a Package Working Group (PWG) for each of these
    existing packages may be initiated at the same time as the call for
    votes described in (3.c). The justification is that the probability
    of these package proposals being ultimately rejected is considered
    low enough that the effort of creating the PWG is warranted: in
    other words, it appears reasonably clear that the packages *are*
    desired by the SBML community, and what remains is to work out the
    details of their formulations. The packages recognized under these
    terms are the following (listed here using their short labels):
    `layout`, `render`, `multi`, `comp`, `qual`, `distrib`, `spatial`,
    `arrays`, `dyn`, `fbc`, `groups`, `annot`. Note that this clause
    *does not guarantee ultimate acceptance of the proposal*, it merely
    hastens the formation of the PWG. This step is viewed by the SBML
    Editors as desirable to help accelerate the process of working out
    the details with a larger group of interested participants.
