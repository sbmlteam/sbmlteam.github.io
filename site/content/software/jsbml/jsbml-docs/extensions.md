+++
#=====================================================================
active = true
title = "Installation of JSBML extensions and modules"
date = "2020-03-21"
layout = "single"
#=====================================================================
+++

JSBML implements support for SBML Level 3 packages using _JSBML extensions_, and also provides additional (non-SBML) functionality via _JSBML modules_.


## Using JSBML extensions

SBML Level 3 is a modular format, with optional Level&nbsp;3 ''packages'' that add additional format features.  To work with SBML packages using JSBML, you need to add the JSBML extensions that implement the desired packages.  You can check out all extensions at once using this method:

    # Check out all JSBML extension packages as one repository:
    svn co https://github.com/sbmlteam/jsbml.git/trunk/extensions JSBMLext

Or you can create a separate repository for each package you are interested in:

	# Download an individual extension package, for example the layout package:
    svn co https://github.com/sbmlteam/jsbml.git/trunk/extensions/extensions/layout Layout

[Here](https://github.com/sbmlteam/jsbml/tree/master/extensions) you can see all currently available [SBML packages for JSBML](https://github.com/sbmlteam/jsbml/tree/master/extensions).


## Using JSBML modules

You can check out the modules of JSBML as follows:

    # The module for using JSBML-based applications on Android OS can be obtained here:
    svn co https://github.com/sbmlteam/jsbml.git/trunk/modules/android jsbml-android

    # Obtain the CellDesigner bridge here:
    svn co https://github.com/sbmlteam/jsbml.git/trunk/modules/celldesigner celldesigner

    # The JSBML/libSBML compare module contains test functions for comparion of both:
    svn co https://github.com/sbmlteam/jsbml.git/trunk/modules/compare compare

    # And the libSBML compatibility module is available from this resource:
    svn co https://github.com/sbmlteam/jsbml.git/trunk/modules/libSBMLcompat libSBMLcomp

    # The libSBML communication layer can be found here:
    svn co https://github.com/sbmlteam/jsbml.git/trunk/modules/libSBMLio/ libSBMLio
