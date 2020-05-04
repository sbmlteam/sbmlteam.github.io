How to update a software page
=============================

When new releases of a software package such as JSBML or libSBML are made, the corresponding pages of the site usually need to be updated as well.  The following are the approximates needed to be followed.  This uses the JSBML pages as a concrete example.

Example: JSBML pages
--------------------

1. Update [`/software/jsbml/_index.md`](/software/jsbml/_index.md) as needed. Two things that needs to be updated each time a new release comes out are: (a) the URL in the value of the `changes ` parameter of `{{< software-link >}}` (because that parameter has the release number embedded in it), and (b) the "Software releases" section, where the new release number and latest DOI needed to be added.
2. Create a new subdirectory under [`/static/software/jsbml`](/static/software/jsbml) named after the release number. Example: `1.5.0`.
3. Copy the software API documentation under the subdirectory you just created. In the case of JSBML, the API documentation is the directory `build/apidocs` in a new release, so in this example, the `apidocs` directory needs to be copied to [`/static/software/jsbml/1.5.0/apidocs`](/static/software/jsbml/1.5.0/apidocs).
4. Update the file [`/software/jsbml/jsbml-docs/apidocs.md`](/software/jsbml/jsbml-docs/apidocs.md) to reference the API documentation you just copied.  There is a URL near the top of the file, in the variable `source`.
