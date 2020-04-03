+++
#=====================================================================
title  = "Creating libSBML documentation archives"
date   = 2020-04-02
layout = "single"
#=====================================================================
+++

The following is the procedure we follow for creating documentation
archives to go along with releases of libSBML. In the following text,
\[libsbml\] refers to the root of the libsbml source tree on your local
computer. This also assumes the copy of libSBML has been compiled using
all the language bindings (C\#, MATLAB, Octave, etc., although not
necessarily Ruby). Also, the only version of doxygen supported at this
time (2011-11-10) is 1.6.3.

1.  Spin up your favorite terminal shell
2.  cd to \[libsbml\]
3.  Run the following command: `make docs`
4.  Run the following commands:
    ```
    tar czf libSBML-`cat VERSION.txt`-docs.tar.gz docs/.graphics/*.* docs/*.txt docs/*.pdf docs/*.html docs/formatted
    zip -r9 libSBML-`cat VERSION.txt`-docs.zip docs/.graphics/*.* docs/*.txt docs/*.pdf  docs/*.html docs/formatted
    ```

After that, spot check the results, to make sure the pages look properly
formatted, there are no broken links, etc. A simple way of doing this is
to cd /tmp, untar or unzip one of the archives, then open
docs/formatted/index.html in your browser and start browsing around
through the documentation at random.
