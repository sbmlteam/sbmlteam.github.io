+++
#=====================================================================
title  = "LibSBML tutorials"
date   = 2020-04-02
layout = "single"
#=====================================================================
+++

Here we provide access to a number of presentations that deal with particular aspects of using libSBML together with same sample coding exercises (with answers). These are adapted versions of tutorials given in the past.

## Presentations

* [Building and installing](LibSBML_Tutorial_building_and_installing.pdf) &ndash; This tutorial shows how to build and install libSBML.
* [Getting started with programming](LibSBML_Tutorial_Getting_started.pdf) &ndash; This tutorial gives a very basic introduction to the libSBML API. It focusses on how the API relates to SBML components and attributes.
* [Using MIRIAM annotations](LibSBML_Tutorial_using_miriam_annotation.pdf) &ndash; This tutorial provides information on the custom API included within libSBML that facilitates the use of MIRIAM compliant annotations.
* [Using MATLAB/Octave](LibSBML_Tutorial_using_matlab_octave.pdf) &ndash; This tutorial gives a brief introduction to building, installing and using the libSBML interface to either MATLAB and Octave.
* [L3 Package extensions](LibSBML_Tutorial_Package_extensions.pdf) &ndash; This tutorial deals with how to develop the plugin code that allows an SBML Level 3 package to be included with libSBML-5. It deals purely with the libSBML extension classes that register an extension and shows how to include an additional element and also an additional attrbute with a core element.

## Exercises

1. Read in Model_1.xml and produce the list of reaction equations contained in the model. (i.e. information of the form: Reaction 1: A + B -> C; where A,B,C reflect the 'name' of the species - not the 'id').

* [Sample code](Answer_1.zip)
* [Sample C++ code](Answer_1.cpp)
* [Sample Java code](Answer_1.java)

2. Create a model which encodes the following: Four parameters, `p1`, `p2`, `p3` and `p4`, where
   ```
   p2 = 3*p1
   p3 = p1*p2
   d(p4)/dt = p3/time
   p1 = x metres
   x is some unknown number
   ```

You will need to look at InitialAssignments/AssignmentRules/RateRules/csymbol time.  To make it slightly harder, try to fully specify the units for each parameter.

* [Sample code](Answer_2.zip)
* [Sample C++ code](Answer_2.cpp)
* [Sample Java code](Answer_2.java)
* [Sample model](Model_2.xml.zip)
