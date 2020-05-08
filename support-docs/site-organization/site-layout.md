Site layout
===========

This repository ([sbml-org-website](https://github.com/sbmlteam/sbml-org-website)) contains almost all of the files used to configure and run the server that serves [https://sbml.org](https://sbml.org).  The site is generated with the help of Hugo, a static site generator.  What this means, basically, is that Hugo reads some configuration files and content files written in Markdown, and then produces a bunch of HTML files that constitute the actual site.  Those HTML sites are then made available by a web server listening to the address [https://sbml.org](https://sbml.org).

The Hugo configuration and content are located in the [site](../../site) subdirectory of the repository.  Here are the first two levels:

```
site
├── content
│   ├── _fragments
│   ├── about
│   ├── community
│   ├── documents
│   ├── facilities
│   ├── news
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

* `content`: This directory contains the hand-written content of the site (as Markdown files).

* `data`: this subdirectory contains some style materials, and one very important data file called `SBML.toml`.  This data file is used to derive some of the content in the content web pages.  For example, the data file contains all the information about SBML core specifications, and the latest libSBML and JSBML software releases.

* `layouts`

* `static`

* `themes`
