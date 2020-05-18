How to report errors or propose changes for SBML.org
====================================================

Hosting the site source files on GitHub, and using a static site creation approach, was intended to make updates to SBML.org easier.  Not only can anyone report problems and suggest changes (via the GitHub issue tracking system); edits to the site can be made directly by committing changes to files on GitHub, and live server updates can be automated so that changes made to the git repository result in updates to the actual SBML.org site.
To make this work requires some procedures and conventions to be adopted.


Preview server versus live server
---------------------------------

In order to maintain a high standard of quality in the public SBML.org site, we keep a separate preview server where proposed changes to the site can be viewed, live, before committing them on the real SBML.org site.  The preview server reflects exactly the versions of the files as they appear in the `develop` branch, while the live server reflects the files that are in `master branch`.


Principles and procedures for making changes
--------------------------------------------

There are only a few simple oveall principles in the approach:

1. The `master` branch of the git repository and the live SBML.org site should always be synchronized: what you see in the `master` branch should be the files that are used to generate the SBML.org site contents, with the exception of content drawn from external sources such as the SBML Level 3&nbsp;Packages Google spreadsheet.
2. The `develop` branch of the git repository should similarly be always synchronized with the preview server for SBML.org (again, with the exception of content drawn from external sources).
3. Changes to `master` should never be made directly: they should always be previewed by merging them into the `develop` branch first and examining the results on the preview server.  In other words, the path of changes should always be `develop` ➜ `master`.
4. Non-trivial changes to content (made to the `develop` branch) should be reviewed by someone other than the proposer before merging the changes into `develop`.  Although the separation of the preview server (which reflects the `develop` branch) and the live server (which reflects the `master` branch) means there is a chance to catch problems before they hit the live site, the merges from `develop` to `master` are likely to involve multiple changes all at once, and thus it is easier and safer to examine change requests when they first come in.


### _Making a request for changes_

Depending on how you like to work, there are three ways you can propose changes to the site:

* [Open an issue](https://github.com/sbmlteam/sbml-org-website/issues) to make a request or report a problem.
* [Start editing a file directly on GitHub](https://help.github.com/en/github/managing-files-in-a-repository/editing-files-in-another-users-repository). GitHub will automatically fork the repository and open a pull request for changes against the SBML.org repository.  Remember to make the branch from the `develop` branch.
* (If you are working on your local computer) Create a new branch off of the `develop` branch, make your changes, commit the changes to the branch, push to GitHub, and open a pull request in GitHub.


### _Merging changes to `develop`_

If you are an SBML Team member or an SBML Editor, feel free to review change proposals using the [GitHub facilities for reviewing pull requests](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/about-pull-request-reviews).  If the changes seem appropriate, worthwhile and error-free, you can go ahead and merge the pull request into the `develop` branch.


### _Merging changes to `master`_

_(Forthcoming.)_
