+++
#=====================================================================
title  = "LibSBML development cycle"
date   = 2020-04-02
layout = "single"
#=====================================================================
+++

This page outlines guidelines for the development cycle that facilitates
giving all developers the time and opportunity to comment on
additions/changes to libSBML as well as focussing on providing a stable,
well-tested library to our users.

## Introducing new API

When introducing new functions/variables into libSBML it is best to discuss the functionality and names used prior to the point where they are released and we cannot change them. The [**cooling off period**](#code-freeze-periods) (see below) introduced prior to a **code freeze** provides an additional time buffer to allow consensus to be reached.

There are two ways to introduce new functionality into libSBML.

1.  For minor changes, create a [Pivotal Tracker
    story](https://www.pivotaltracker.com/s/projects/248655#) that
    outlines the functionality and proposed function/variable names.
    Label the item with the `design` and `new_api` labels. Team
    members will automatically get an email showing this item and can
    then respond. Development can then take place in the main
    trunk/experimental branches. If longer more involved discussion is
    needed, it can move to the team mailing list, but it is good
    practice to have a tracker item.
2.  For more substantial changes, more than one tracker item may be
    appropriate. These can be linked together using the **Epic**
    facility. A new branch of libsbml svn should be created so that
    development can take place outside of the stable code. Once code is
    complete, tested and consensus reached it can be reintegrated into
    trunk.

{{% notice type="info" %}}
The exception to needing consensus on new function names are for the standard getter and setter functions for experimental packages which should be named according to our SBML conventions.
{{% /notice %}}

## Code freeze periods

Prior to a release code is frozen for a period to facilitate testing.
The length of the code freeze depends on whether we are doing a full or
experimental release. A full release is much more thoroughly tested and
therefore requires a longer period.

In order to allow testing to be done on a stable code base, the week
before code freeze is considered a **cooling off** period. During this
period, no new API should be added to the code. This avoids the
situation where a last minute addition causes issues during testing. It
allows the testing period to be focussed.

Both the **cooling off** period and the **code freeze** period are
marked in the team calendar.

## Interim testing

Nightly builds mean that the standard build of libsbml gets tested
frequently. However some of the configuration options are not tested and
on occasion cause issues during the release testing period.

In order to minimise the impact of these issues mid way between each
release a day or two is designated where these configurations are
tested.

These builds include:

1.  expat
2.  xerces
3.  libsbml namespaces
4.  strict includes
5.  legacy math
6.  straightforward gnumake
7.  generating src archives

During this mini testing period code will be frozen; however this period
can be arranged to cause least disruption to people\'s personal work
schedules/agendas.
