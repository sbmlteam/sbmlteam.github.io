--- # -*- mode: markdown -*-
#=====================================================================
active: true
title: "SBML Development Process"
date: 2019-04-07
#=====================================================================
---

An intrinsic aspect of SBML's development has been the adoption of a participatory, community-oriented approach. In the early years of SBML, this process was highly informal.  The use of SBML has grown to the point where its original, informal approach to development is no longer sufficient to meet the needs of the SBML community and the continued evolution of SBML.  Beginning in 2003, the SBML Team and SBML Editors developed a more formal organization and systematic process, one that aims to be less ambiguous and subjective and more responsive to the needs of the SBML community.  This page describes the plans for this _SBML Development Process_, and the current status of its implementation.

This SBML Development Process has been followed since mid-2008.

The process described here is an evolution of past discussions about the SBML Development Process.  Previous proposals were presented at the following SBML Forum meetings: the [7th](20030512-hucka-finney-sbmlorganization.pdf), the [10th](Hucka-process.pdf), the [11th](Hucka-sbml-process-2006.pdf), and the [12th](20071005-hucka-newsbmlprocess.pdf).  Several other organizations served as sources of inspiration and ideas for the process described here.  These include [BioPAX](ttp://www.biopax.org), [CellML](ttp://www.cellml.org), [HL7](ttp://www.hl7.org/), the [IETF](ttp://www.ietf.org/), the [OASIS](ttp://www.oasis-open.org/who/), the [OMG](ttp://www.omg.org), and the [W3C](ttp://www.w3.org/Consortium/).

During 2015&ndash;2016, this process was revised to remove the need for a Chair of the SBML Editors, introduce a Coordinator and a Secretary, and make other adjustments to account for  miscellaneous developments over the years.

## Goals and Motivations for SBML

The ultimate goal of the Systems Biology Markup Language (SBML) is to serve as a declarative representation language for computational models in biology.  More precisely, the goal of SBML is to serve as a software lingua franca supporting the encoding of models such that those models can be exchanged and interpreted unambiguously by different software systems.  SBML is not intended to encode the details of algorithms used to instantiate the models, nor the procedures used to process and analyze the models.  Further, SBML is not linked to any specific software system.

SBML will always be available free of cost and restrictions to all users, developers, and other interested persons and organizations, whether they are academic or commercial.

## Goals of the SBML Development Process

The process of SBML language development must be open, systematic, transparent and capable of producing standards that are useful to the modeling community.  To this end, the goal of the SBML Development _Process_ is to provide an explicit set of procedures and guidelines for how SBML will be systematically evolved and refined in a way that promotes the collaborative development of high-quality standards based on community consensus.  The purpose of this SBML Development Process _document_ is to provide a written description of this process.

The following are specific points that the SBML Development Process must address:

1. _The election and rotation of decision-makers involved in steering and developing SBML_.
2. _The identification and articulation of goals for SBML development_.
3. _The development and release of SBML specifications_.
4. _The procedures and mechanisms for reporting and correcting errors and other issues in SBML specifications_.

All of the procedures in the SBML Development Process will be carried out in the English language.

## SBML Community Organization

This section defines who is involved in decision-making and development of SBML, how those individuals are selected, and how and when they are replaced by other individuals.  For the purpose of establishing roles and responsibilities, the SBML community is first divided into the following four broad groups:

1. The _SBML Forum_
2. The _SBML Editors_
3. The _SBML Team_
4. The _SBML Scientific Advisory Board_

The divisions are not mutually exclusive; members are often part of more than one group.  The following subsections describe these groups in more detail.

### The SBML Forum {#sbml-forum}

The _SBML Forum_ is simply the community of people sufficiently interested in SBML that they take the trouble to observe and  participate in discussions about SBML.  By implication and necessity, all other subgroups of the SBML Community (i.e., the Editors, the Scientific Advisory Board and the SBML Team) are subsets of the SBML Forum. Membership in the SBML Forum is open to all interested parties.

#### Requirements for membership

There is only one requirement for being counted as a member of the SBML Forum: subscribing to the electronic mailing list [sbml-discuss@googlegroups.com](ttps://groups.google.com/forum/#!forum/sbml-discuss).  This requirement simultaneously satisfies three goals.  First, it requires nothing more from members than supplying an email address and paying attention to a mailing list.  Second, it provides a means of communicating with members and disseminating information.  And third, it supplies a concrete list of unique names for determining the validity of votes cast in community voting processes (discussed below in [voting for Editors](#election-process) and general procedures for [voting on issues](#achieving-consensus)).

The requirement specifically demands the use of the mailing list.  To be counted as a member of the SBML Forum for purposes of being able to vote, individuals cannot simply monitor the list via the [web interface](ttps://groups.google.com/forum/#!forum/sbml-discuss) or [RSS feed](ttps://groups.google.com/forum/#!aboutgroup/sbml-discuss).  The reason is simply that there is no way of determining membership for people who use the web or RSS feed.  We need a registry of members of the SBML Forum, and subscribing to the mailing list provides this. _People who want to participate in community voting must subscribe to the [sbml-discuss](ttps://groups.google.com/forum/#!forum/sbml-discuss) mailing list._

(Those who prefer to minimize the amount of mail they receive from  [sbml-discuss](ttps://groups.google.com/forum/#!forum/sbml-discuss) may wish to investigate the mailing list system's option to receive _digests_.  Turning on the digest mode in your personal subscription options will cause you to receive sbml-discuss postings in one-a-day batches, rather than as individual messages.)

#### Conduct of meetings

The primary face-to-face meetings of the SBML community are the biannual meetings organized by [COMBINE](ttp://co.mbine.org) (_COmputational Modeling in BIology NEtwork_), namely the annual COMBINE Forums and the annual HARMONY (_Hackathon on Resources for Modeling in Biology_).  SBML-specific meetings are organized as sessions during these COMBINE meetings. The meetings are public; anyone is welcome to attend, subject to limitations of venue size.  Meetings are announced on the [sbml-announce@googlegroups.com](ttps://groups.google.com/forum/#!forum/sbml-announce) mailing list with a minimum of one month lead time.  The meetings are organized by the SBML Team and the SBML Editors, optionally with help from other interested parties.  Records of the meeting are made available online in the [SBML.org Events area](/community/events).  As much as possible, the SBML  Team tries to take minutes or produce full recordings of meetings, in order to have a record of important decisions and discussions.  These minutes or recordings are made available on the meeting web page.

Additional focused workshops may be organized at the discretion of the SBML Team and SBML Editors.

### The SBML Editors {#sbml-editors}

The SBML Editors are volunteers who are deeply interested in SBML and its continued success.  The principal role of the SBML Editors is to organize the development, writing, and correction of SBML specifications.  They are responsible for making the final decisions about SBML language design.

As will be clear from the descriptions below, SBML Editors have to be willing to invest time and effort  into evaluating proposals for changes, researching the possible impact of those changes, thinking about how to implement the changes, writing new text in the SBML specification, dealing with practical matters of writing, editing, coordinating, tracking changes to documents, etc.  To do this effectively, Editors must have a thorough and detailed understanding of SBML and the latest SBML specifications, as well as experience developing software or algorithms in support of SBML, and finally, excellent communication skills.

#### Responsibilities of SBML Editors

<!-- commented out changes made after revision of governance Jan 2016
<strike>To simplify the following description, the Chair of the SBML Editors is counted as an SBML Editor, although the Chair is not selected in the same way as proper SBML Editors and does not carry the same voting power in decisions about SBML language design.</strike>
-->
The following are among the specific responsibilities for SBML Editors:

1. Track, respond to, and process error reports and requests for changes in SBML specifications.  The procedure to be used by the SBML Editors for dispatching these reports is described on a [separate page](handling-reports).
2. Evaluate and reconcile proposals for changes to SBML and participate in writing updated versions of the SBML specifications.
3. Participate in discussions between the SBML Editors about matters related to SBML.  Most discussions take place over email (on a separate mailing list), electronic chat, telephone calls, teleconferences, and face-to-face meetings. When discussions take place outside of the sbml-editors mailing list or the issue trackers, the Editors should make an effort to keep minutes of the discussions and the reasoning that lead to specific decisions, to prevent these important work products from being lost.  Minutes are listed on a [separate page](/events/sbml-editors-meetings) devoted to this purpose.
4. Participate in discussions on the SBML mailing lists (particularly [sbml-discuss@googlegroups.com](https://groups.google.com/forum/#!forum/sbml-discuss)).
5. Perform research and critical thinking in support of the activities above.

The work of SBML Editors is performed on a voluntary basis and is not compensated.  <!-- However, the Coordinator and the SBML Team will place a high priority on finding financial support for travel and other expenses incurred by Editors for attending face-to-face meetings. -->

#### Terms for SBML Editors

The following are the conditions of the terms served by SBML Editors:

1. There is a total of 5 editors serving at any given time.
<!-- Commented out after revision of governance Jan 2016
#* The _Chair of the SBML Editors_ works with the Editors, but strictly speaking is not one of them, and holds lower voting power than the SBML Editors.
-->
2. Editors are elected via a majority vote by the members of the [SBML Forum](#sbml-forum).  The election process is described on a [separate page](editor-elections).
 * Candidates must themselves be members of the SBML Forum.
 * The election process is managed by the Permanent Secretary.
<!-- Commented out after revision of governance Jan 2016
#* The election process is managed by the Chair of the SBML Editors.
#* The Chair of the SBML Editors is not elected, but rather comes from the SBML Team (see below).
-->
3. The duration of an Editor's term is 3 years.
 * Terms begin on January 1 of the year following the year in which the Editor's election is held.
 * Due care must be taken by the Permanent Secretary to ensure that Editors' terms start and end in a staggered fashion, so that not all 5 Editors' terms happen to end in the same year.
<!-- Commented out after revision of governance Jan 2016 * Due care must be taken by the _Chair of the SBML Editors_ to ensure that Editors' terms start and end in a staggered fashion, so that not all 5 Editors' terms happen to end in the same year. #* The Chair of the SBML Editors does not have a duration limit. -->
4. Editors may serve more than one term, if they are nominated and elected at the end of their 3 year term, but must step down for a year following six years as Editor. <!-- but not consecutive terms ** change 2018-10-08 ** * If an Editor has served 3 years, that person cannot be a candidate again for a minimum of one year. * These limits do not apply to the Chair, who does not serve terms.-->
5. If an Editor cannot or does not wish to serve a full term for any reason, a special election will be held to replace them as soon as possible.
 * The election process will be managed by the Coordinator of the SBML Editors and the Permanent Secretary.

#### Election process for SBML Editors {#election-process}

The step-by-step process for electing new SBML Editors is described in detail on a [separate page](editor-elections).

#### Selection of the Coordinator of the SBML Editors

<!-- Commented out after revision of governance Jan 2016
The Chair of the SBML Editors comes from the SBML Team.    Selection of  the Chair is done by the SBML Team and SBML Editors.  The Chair is typically the principal investigator on grants supporting the work of the SBML Team and the SBML Editors; however, this is not a requirement, and the Chair could equally be someone who does not hold any grants.
-->

Each year in January, after the selection of new SBML Editors, the Editors select a _Coordinator_ from among themselves. This person assumes the duties of organizing and chairing SBML Editor meetings. There are no restrictions on the length of time for which an individual might take this role, other than the fact that the person themselves must be a current SBML Editor.

#### The Permanent Secretary

The _Permanent Secretary_ helps the SBML Editors perform their work by carrying out tasks under the Editors' direction. The role of the Secretary can be burdensome and tedious, and should be undertaken by someone who is funded to devote the necessary time. For this reason, one of the members of the [SBML Team](#sbml-team) is expected to act as Permanent Secretary, at the discretion of the principal investigator(s) of the grant(s) funding the SBML Team and core SBML resources.

The following are the responsibilities of the Permanent Secretary:

1. Write/edit specification documents for content and appearance.
2. Maintain and update the SBML Development Process documentation (i.e., this document).
3. Issue calls for voting and tally the results, in cooperation with the Coordinator of the SBML Editors.
4. Arrange meetings of the SBML Editors, in cooperation with the Coordinator of the SBML Editors.
5. Coordinate the election of new SBML Editors each year.  In the event that the Secretary is a candidate, the Coordinator will perform this task.

### The SBML Team {#sbml-team}

The SBML Team strives to support the development and evolution of SBML.  Team members devote significant portions of their time to SBML-related activities and are typically (though not necessarily) employed and paid specifically to do this work. The Team is chiefly responsible for the following items and activities:

1. Maintain the resources and infrastructure supporting the SBML community and SBML development in general.  The physical infrastructure consists mostly of the following:
 * The [SBML.org](ttp://sbml.org) website software, hardware, and network access, along with associated backup systems
 * Source code repositories, bug trackers, and other systems
 * Electronic forums/mailing lists for the SBML community
 * Miscellaneous hardware and software used for various purposes, such as audio-video recording of SBML workshops
2. Arrange for the development and support of critical software, including libSBML, the SBML Test Suite, and other online facilities.
3. Organize SBML events.
4. Perform other support and development activities as the need may arise.
5. Seek financial support for 1&ndash;4 above.

Members of the SBML Team are employed and not elected, and they have no specific power for controlling the direction or process of SBML development by virtue of being members of the SBML Team.  (However, SBML Team members may also be members of the SBML Forum or SBML Editors, in which case, they may have the normal voting powers or influence on SBML development that result from those positions.)

<!-- Commented out after revision of governance 2016
The activities of the SBML Team are under the direction of the Chair, who is usually (though not necessarily) also the principal investigator on grants funding the work of the SBML Team.  It is also possible for the employer of a given Team member to be different from the Chair; for example, it may happen that a Team member is paid from an academic grant whose principal investigator is someone other than the Chair.  In such cases, it is to be understood that the Chair has the authority to direct the SBML-related activities of that SBML Team member, and the chair and the employer must come to a mutually agreeable arrangement for how to manage the relationships between the three parties involved.
-->
The activities of the SBML Team are under the direction of the principal investigator(s) on the grant(s) funding the work of the SBML Team.

### The SBML Scientific Advisory Board {#sab}

Formed in 2013, the SBML Scientific Advisory Board (SAB) is composed of scientists and researchers with expertise in topics covered by SBML. The SAB provides guidance to the SBML Editors and the SBML Forum regarding the goals, features, applications, and other aspects of SBML development and use.  Although the board does not exert direct decision-making power on the content of SBML, its advice carries considerable weight in in the decisions made by the SBML Editors and the SBML community as a whole.

More information about the SBML Scientific Advisory Board and its members is available on a [separate page](scientific-advisory-board).

## SBML Development Procedures and Guidelines

This section describes specific procedures and guidelines used by the SBML community for the continued evolution of all aspects of SBML.

### General Procedures and Guidelines

#### Public participation

The SBML effort relies crucially on the participation of interested groups and individuals.  The project is not as decentralized as (for example) the [Apache Project](ttp://apache.org/foundation/how-it-works.html#management) largely because of the management needs that arise from relying on government grant funding to support core work on software, the website, meeting support, specification development, etc.  However, beyond that, the SBML effort strives to be inclusive and encompassing of community involvement, and works by building consensus.  Newcomers are viewed as volunteers who genuinely want to help and are welcomed cheerfully.

#### Communication and transparency

SBML has been, and continues to be, developed in collaboration with an international community of researchers and software developers. As with many other projects, the primary mode of interaction between members is electronic mail. Discussions about SBML language development take place on [sbml-discuss@googlegroups.com](ttps://groups.google.com/forum/#!forum/sbml-discuss); discussions about SBML software and interoperability experiences take place on [sbml-interoperability@googlegroups.com](ttps://groups.google.com/forum/#!forum/sbml-interoperability).

As a general principal, discussions that have an impact on SBML development are conducted in public as much as possible, either at workshops or over one of the SBML mailing lists. All messages to the mailing lists are publicly archived, with links at <http://sbml.org/community/forums>.  The public discussions and archives improve transparency, provide a public record of arguments and reasoning, and stimulate the broader community.  Written text also helps bridge language barriers, because written text is often easier to understand than speech for non-native English speakers.

The records of discussions and materials presented and produced at the various SBML workshops (the Forums, Hackathons, and focused workshops) are made publicly available from the SBML.org website.  The [SBML Team](#sbml-team) is responsible for organizing, collecting and managing the workshop materials.

A public [issue tracking system](ttp://sbml.org/issue-tracker) is available for anyone to report issues with SBML specifications, request feature changes, and request packages for SBML Level&nbsp;3 development.  The history of issues and records of actions are publicly available to support transparency and accountability on the part of the SBML Editors and SBML Team.

The sources to all SBML specification documents, as well as other related documents, are made freely available from the [SBML repository](SBML_Projects/SVN) in the <tt>/trunk/project</tt> subdirectory.

#### Achieving consensus {#achieving-consensus}

Many questions that initially appear to be a matter of opinion are ultimately resolvable on the basis of rational, technical reasoning.  This is one reason why public archives of communications (such as the SBML mailing lists) are so valuable: they provide a trace of the reasoning (or at least the discussions) behind various technical decisions during SBML development.

In situations where a decision appears to have no obvious right or wrong answer on technical grounds alone, the SBML Editors may initiate a public vote on the matter.  Public votes can be conducted in one of two ways.

1. For minor issues, the SBML Editors may describe the topic during an SBML Forum meeting and call for a vote to be conducted via a show of hands.  What constitutes a _minor_ issue is left to the discretion of the SBML Editors.
2. Major issues must be taken to a full community vote.  This must be conducted using an electronic voting system, with the topic and call-for-votes announced on the [sbml-discuss@googlegroups.com](ttps://groups.google.com/forum/#!forum/sbml-discuss) mailing list.  The issue must be described in detail and in as neutral a fashion as possible, to avoid biasing the vote.  Voting will be open only to the registered members of the [sbml-discuss@googlegroups.com](ttps://groups.google.com/forum/#!forum/sbml-discuss) mailing list.  (The latter requirement is necessary to allow a minimal level of verification of votes cast, for example to prevent multiple anonymous votes by the same person.)

### Language Development Process

Most of the activities described below are organized and directed by the SBML Editors.  However, other members of the SBML Forum are free to raise questions or concerns about any aspect of the process and SBML itself.  One of the most important aims in SBML development is to reach consensus among a majority of SBML users and developers; thus, feedback and dissenting opinions must always have a voice.

#### SBML Levels, Versions, and Releases

Major editions of SBML are termed _levels_ and represent substantial
changes to the composition and structure of the language.  Models defined
in lower levels of SBML can always be represented in higher levels, though
some translation may be necessary.  The converse (from higher level to
lower level) is sometimes also possible, though not guaranteed.  The
levels remain distinct; a valid SBML Level&nbsp;1 document is not a valid
SBML Level&nbsp;2 document, and likewise, a valid SBML Level&nbsp;2
document is not a valid SBML Level&nbsp;1 document.

Minor revisions of SBML are termed _versions_ and constitute changes
within a level to correct, adjust, and refine language features.  Changes
in versions of a level do not introduce large architectural or conceptual
changes to SBML; such large changes are only made between SBML levels.

Specification documents inevitably require minor editorial changes as their users discover errors and ambiguities.  As a practical reality, these
discoveries occur over time.  In the context of SBML, such problems are
formally announced publicly as _errata_ in a given specification
document.  Borrowing concepts from the [W3C](ttp://www.w3.org), we define SBML errata as changes of the following types: (a)
formatting changes that do not result in changes to textual content; (b)
corrections that do not affect conformance of software implementing support
for a given combination of SBML level and version; and (c) corrections that
_may_ affect such software conformance, but add no new language features.
A change that affects conformance is one that either turns conforming data,
processors, or other conforming software into non-conforming software, or
turns non-conforming software into conforming software, or clears up an
ambiguity or insufficiently documented part of the specification in such a
way that software in which conformance was once unclear now becomes clearly
conforming or non-conforming.  In short, errata do not change the
fundamental semantics or syntax of SBML; they clarify and disambiguate the
specification and correct errors.  These errata are corrected in new _releases_ of the SBML specification.  Each release is numbered with an integer, with the first release of the specification being called Release&nbsp;1.

The SBML Editors announces new levels, versions, and releases of SBML specifications on the [sbml-announce@googlegroups.com](ttps://groups.google.com/forum/#!forum/sbml-announce) mailing list.

#### Process for SBML Level 2

With the introduction of Version&nbsp;4 in late 2008, SBML Level&nbsp;2 entered a maintenance mode.  Refinements and error corrections continue, and on rare occasions an update is released (as it was with SBML Level&nbsp;2 Version&nbsp;5 in 2015); however, serious SBML development has instead moved on to SBML Level&nbsp;3 (see the [next section](#process-for-level-3) below).

The development process for SBML Level&nbsp;2 is the following:

1. Problems, requests, and other issues must be reported using the [SBML issue tracker](ttp://sbml.org/issue-tracker). This system assigns a tracking number to each issue and provides a means of associating a trail of actions and discussions with the issue.  Reports may be logged by anyone at any time.
2. The SBML Editors follow a [specific procedure](handling-reports) for evaluating and addressing the issue report.
 * The Editors will inform the person who logged the initial report about the status of the discussions and decisions for action on the issue.
 * If the issue does not have a clear resolution path, the Editors may bring up the issue with the SBML Forum (either in face-to-face meetings or on the electronic mailing list) and request broader community input.
3. After a period of time, an accumulation of issues _may_ warrant the development of a new _release_ of Version&nbsp;5, or possibly a new _version_ of Level&nbsp;2 altogether. This decision, and the timing, is left up to the discretion of the SBML Editors, who must evaluate the significance of the issues in the SBML specifications against the impact on software developers.
 * Releases have less impact on software developers since releases introduce no substantive changes to the SBML Level&nbsp;2 Version&nbsp;5 language; however, a new release still takes time and effort to develop, and potentially has _some_ implications for software developers.
 * As a general principle, additional versions of SBML Level&nbsp;2 after Version&nbsp;5 should be avoided unless truly important issues arise.

The specification documents for SBML Level&nbsp;2 are maintained in a source code management system (the [SVN](SBML_Projects/SVN) repository for SBML), thereby providing detailed document change history and versioning.  For Level&nbsp;2, the specific subdirectory is <tt>/trunk/specifications/sbml-level-2</tt>.  The documents and revision information are made public.

#### Process for SBML Level 3 {#process-for-level-3}

SBML Level 3 is modular, in the sense of having a defined core set of features and optional _packages_ adding features on top of the core. This modular approach means that models can declare which feature-sets they use, and likewise, software tools can declare which packages they support. It also means that the development of SBML Level 3 can proceed in a more modular fashion. SBML Level 3 Version 1 Core (Release 1) was [released on 6 October 2010](ttp://sbml.org/Forums/index.php?t=tree&goto=6392&rid=2); development of software support for the Core and development of Level&nbsp;3 packages is under way.

The development process for SBML Level&nbsp;3 is described in detail on a [separate page](level-3-process).

## Translations

Translations of this page are available for the following languages. We gratefully acknowledge the efforts of the individuals who have kindly undertaken the translation:

* [Serbo-Croatian](ttp://science.webhostinggeeks.com/sbml-razvojni-proces) by Jovana Milutinovich from [Webhostinggeeks.com](ttp://webhostinggeeks.com) (version translated circa late 2010).
