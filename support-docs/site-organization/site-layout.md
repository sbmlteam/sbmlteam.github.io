Site layout
===========

This repository ([sbml-org-website](https://github.com/sbmlteam/sbml-org-website)) contains almost all of the files used to configure and run the server that serves [https://sbml.org](https://sbml.org).  The site is generated with the help of Hugo, a static site generator.  What this means, basically, is that Hugo reads some configuration files and content files written in Markdown, and then produces a bunch of HTML files that constitute the actual site.  Those HTML sites are then made available by a web server listening to the address [https://sbml.org](https://sbml.org).  The Hugo configuration and content are located in the [site](../../site) subdirectory of the repository.

File hierarchy
--------------

Here are the first two levels of the site files:

```
site
├── content
│   ├── _fragments
│   ├── about
│   ├── community
│   ├── documents
│   ├── facilities
│   ├── news
│   ├── site
│   └── software
├── data
│   ├── fonts
│   └── themes
├── layouts
│   ├── _default
│   ├── partials
│   └── shortcodes
├── static
│   ├── css
│   ├── img
│   ├── js
│   ├── software
│   └── specifications
└── themes
    └── academic
```

* `content`: This directory contains the hand-written content of the site (as Markdown files).  With the exception of `_fragments` (described below), each subdirectory under `content` corresponds to a path accessible via a URL on the site.  For example, `content/about` is `sbml.org/about`, and so on.

* `data`: this subdirectory contains some style materials, and some data files in TOML format.  The `SBML.toml` data file is used to some of the content in the pages about SBML specifications.  The `site.toml` file provides information about the current version and timestamp of the site.  The files `libsbml.toml` and `jsbml.toml` provide some information about libSBML and JSBML, used in the files under `content/software/libsbml` and `content/software/jsbml`.  (In the future, more data files may be added here.)

* `layouts`: this contains custom content templates (Hugo "shortcodes"), as well page layout templates.  The files under `layouts/partials` mostly override files provided by the Hugo Academic theme; the files in `layouts/shortcodes` are all custom for this site, as are the files under `layouts/_default`.

* `static`: this directory contains files that are not processed by Hugo, but can be referenced from shortcodes and page layout templates.  This is also where ready-to-use HTML files are placed.  For example, `static/software/jsbml` contains API documentation for JSBML; similarly, `static/software/libsbml` contains API docs for libSBML.  The subdirectory `static/specifications` contains copies of SBML specifications and associated files such as BibTex `.bib` files, which are referenced from the specification pages in `sbml.org/documents/specifications`.

* `themes`: this holds the files from the Hugo Academic theme.


Explanation of some choices made in the site organization
---------------------------------------------------------

### The `_fragments` directory

Hugo has certain expectations about how content is accessed.  One of those quirks is that the Markdown content to be processed by Hugo belongs in the `content` directory, and certain features (in particular, the use of Hugo shortcodes) is not available to files placed _elsewhere_ in the site.  This is what drove the creation of the `content/_fragments` directory.  This is our own SBML.org solution, not a Hugo requirement.  It is there to contain content fragments (not standalone pages) that are meant to be inserted into other pages elsewhere.  The mechanism to insert them into content pages is our custom `page-fragment` shortcode.  An example of its use can be found in `content/software/libsbml/libsbml-docs/pivotal-tracker.md`.


### Page templates versus shortcodes

Hugo is somewhat oriented towards blog-style sites, in which different sections of the site use common layouts (e.g., a blog section, a news section, a section that lists all pages by tags, etc.).  Typically, Hugo sites leverage the use of page layout templates in `site/layouts/_default`, and assume that much of the information put into a content page is actually put into the header of a file.  I found this awkward: in examples that I studied when creating the site, I found it hard to guess what a page will look like by looking at its Markdown input because so much depends on the page layout template.

In designing this site, I tried to avoid defining custom page layouts as much as possible, and instead, tried to make most pages be as close as possible to "what you see is what you get".  Page content and even some aspects of the layout are achieved by writing it directly into the file through a combination of Markdown, shortcodes, and if necessary, raw HTML.  Only time will tell if this was a good idea :-).

The consequence of this is that most pages use the same layout (called "single"), and contain Markdown with a mix of some shortcodes.  Here's an example, using the beginning of the page for libSBML:

```text
+++
#=====================================================================
title      = "libSBML"
layout     = "single"
icon       = "/img/libsbml-logo-and-name.svg"
icon_width = "25%"
#=====================================================================
+++

LibSBML is a programming library that helps you read, write, manipulate, translate, and validate SBML files and data streams.  The library supports all Levels and Versions of SBML.  LibSBML is written in ISO standard C++ and C and provides APIs for the languages C, C++, C#, Java, JavaScript, MATLAB, Perl, PHP, Python, R, and Ruby.  It works on Linux, Windows, and MacOS X, and has been known to work on FreeBSD and Solaris in the past.

{{< software-links download="libsbml-docs/download-and-install" changes="https://sourceforge.net/p/sbml/code/HEAD/tree/trunk/libsbml/NEWS.txt" tracker="https://sourceforge.net/p/sbml/libsbml/" docs="libsbml-docs" repo="https://sourceforge.net/p/sbml/code/HEAD/tree/trunk/libsbml/" forum="https://groups.google.com/forum/#!forum/libsbml-development">}}


## Please cite the paper if you use libSBML

Article citations are crucial to our ability to justify continued development of libSBML, as well as our academic careers.  If you use libSBML and you publish papers about your software, we ask that you **please cite the following paper**:

{{< reference highlight="true" title="LibSBML: An API Library for SBML" authors="Bornstein, B.&nbsp;J., Keating, S.&nbsp;M., Jouraku, A., and Hucka M." pub="_Bioinformatics_,  24(6):880&ndash;881, 2008" link="https://doi.org/10.1093/bioinformatics/btn051" bibtex="libsbml.bib" endnote="libsbml.ris" >}}
```


In this example, the first part between `+++` is the page header, and it defines the title of the page, the layout, and an icon to be shown on the right-hand side near the top of the page.  Then there is some Markdown, followed by the invocation of a shortcode called `software-links`.  Shortcodes in Hugo are invoked by wrapping them either in `{{< ... >}}` or `{{% ... %}}`.  (Due to some subtle differences in their behavior, it is best to stick to the convention of using `{{< ... >}}` when invoking in-line shortcodes and `{{% shortcode ... %}} ... {{% /shortcode %}}` when using shortcodes that take bodies.)

The `software-links` shortcode encapsulates some fairly complicated markup, and takes arguments that control the final output.  Similarly, later in the example above, there is another shortcode, `reference` take also takes a number of arguments and produces an even more complicated result in the final output.

The point, though, is that instead of defining a layout for software pages, and putting all the values for the software links, the references, and other things into the header as additional `variable = value` assignments, the header is very simple, and the content you see in the file reflects very directly what is produced in the final output.  The hope is that by hiding less, it will be easier for people to grasp what is happening and be able to make updates more easily.
