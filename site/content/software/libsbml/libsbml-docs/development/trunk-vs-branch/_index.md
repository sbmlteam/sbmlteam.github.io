+++
#=====================================================================
title  = "LibSBML SVN trunk vs branch"
date   = 2020-04-02
layout = "single"
#=====================================================================
+++

At present libSBML code is present in two repositories:

1.  [trunk/libsbml](https://svn.code.sf.net/p/sbml/code/trunk/libsbml/)
    which contains code for core plus accepted packages
2.  [branches/libsbml-experimental](https://svn.code.sf.net/p/sbml/code/branches/libsbml-experimental/)
    which contains code for core plus both accepted and non-accepted
    packages

## Policy for where to check in code

### Working on core or accepted packages code

1.  Work in trunk/libsbml and commit changes here.
2.  Once a week the designated person (currently Sarah) will merge these
    changes into branches/libsbml-experimental. They do not need to be
    highlighted as any changes here will need to merge.

{{% notice type="info" %}}
If you need the changes merged sooner then create a [Pivotal Tracker](https://www.pivotaltracker.com/s/projects/248655) item stating which revision(s) it is vital to move and assign that item to Sarah; who will do the merge asap.
{{% /notice %}}

### Working on not-yet-accepted packages code

1.  Work in branches/libsbml-experimental and commit changes here.

### Working on core/accepted packages AND not-yet-accepted packages code

There may be situations when not-yet-accepted packages code requires
addition to or indeed change of core/accepted packages code. In this
case:

1.  Work in branches/libsbml-experimental and commit changes here.
2.  Create tests for the new core code and commit these to
    branches/libsbml-experimental. These will facilitate checking that a
    merge has been successful.
3.  Create a [Pivotal
    Tracker](https://www.pivotaltracker.com/s/projects/248655) item that
    explains the changes that were necessary with their revision
    numbers. This highlights the fact that a commit to the branch needs
    to be merged with trunk.
4.  The designated person will merge these changes during the weekly
    maintainance of the repositories.

{{% notice type="info" %}}
Please only use the branches/libsbml-experimental repository for making changes to core/accepted packages **IF IT IS VITAL** to your work on a not-yet-accepted package.
{{% /notice %}}


### Layout package code

Historically layout code has been part of libsbml stable trunk code
since 2002. Although it has not reached the accepted package status it
should be treated as such and thus work on layout should be primarily in
the trunk/libsbml repository.
