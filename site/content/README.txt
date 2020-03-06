Notes about the site organization:

* The front page/home page is the file "_index.md".  It has its own layout template, the file "layouts/home.html".  (BTW, because the name of the file is "_index.md", Hugo consider this file to be a "branch bundle".  This has some implications if you ever need to modify the file or the layout.)

* The subdirectories under here mirror the sections in the site.  (This is a standard Hugo convention.)  The subdirectories establish the hierarchy of paths in the site. For example, "documents" becomes https://sbml.org/documents/.

* In common with most ordinary websites, the structure of this website is a directed acyclic graph (DAG) because cross-links can send you anywhere, but on disk, the structure is a tree.  In practical terms, this means that some documents are in the middle of the tree and have subdocuments (contained here in nested subdirectories), and some documents are at the ends or leaves of the tree.  In Hugo, the former are known as Branch Bundles and the latter as Leaf Bundles.  This is a confusing and complicated business in Hugo, but two details are worth knowing: 

  1. Branch Bundle index files are named "_index.md" and Leaf Bundle index files are named "index.md" (without an underscore).  If you make a mistake naming your index file, that particular page in the site will be blank.

  2. Branch Bundles use the "list" layout type and Leaf Bundles use the "single" layout type, by default.  You can override the layout type by putting a 'layout = "single"' in the header of the file (between the pair of +++'s).

* The complexity of the branch vs leaf business and the corresponding changes in default layouts make things hard to understand, IMHO, so I ended up using the layout type "single" almost everywhere by explicitly setting the layout in most files.  Hugo experts would probably scoff at this, but I believe it will make it easier to maintain the site by reducing the number of layouts and assumptions being made by different parts of the site.
