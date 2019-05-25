Notes about the site organization:

* The subdirectories here mirror the sections in the site.  (This is a standard Hugo convention.)  The subdirectories establish the hierarchy of paths in the site; e.g., https://sbml.org/documents/.

* The front page of the site is located in home/front.md.  The use of a section called "home" is implemented by the Academic theme for Hugo.  The front page template is layouts/partials/widget_page.html.

* The news portion of the front page is created by virtue of the fact that the front page template subdirectory (home/) has another file, news.md, in addition to front.md.  The widget_page template automatically uses all the .md files it finds in home/ to populate the front page.

