+++
title   = "sbmlutils 0.9.3 released"
authors = ["Mike Hucka"]
date    = 2020-03-20
summary = "sbmlutils is a set of Python utilities for working with SBML, and it now supports Level&nbsp;3 'distrib'."
+++

[`sbmlutils`](https://github.com/matthiaskoenig/sbmlutils) is a collection of Python utilities for working with SBML models.  It is implemented using [libSBML](/software/libsbml) and other libraries.  Its features include the following:

* HTML reports of SBML models
* helper functions for model creation, manipulation, and annotation
* interpolation functions to add experimental data to models
* implementation of dynamic flux balance analysis (DFBA)
* file converters (XPP)

The [latest release](https://github.com/matthiaskoenig/sbmlutils/releases/tag/v0.3.9) of `sbmlutils` supports the SBML Level&nbsp;3 _Distributions_ package.  Nicknamed 'distrib', this SBML Level&nbsp;3 package extends the core of SBML Level&nbsp;3 with additional constructs for encoding models that sample values from statistical distributions.

Visit the [`sbmlutils` documentation on _Read the Docs_](https://sbmlutils.readthedocs.io/en/stable/) for more information.
