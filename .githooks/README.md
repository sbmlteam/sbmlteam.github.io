Pre and post commit hooks for SBML.org source files
===================================================

The information in the file `/site/data/site.toml` is generated from git revision information.  On the web server, that file is updated by `/admin/update-from-github`.  However, when editing locally, the web server update process will not update your copy of the file.  If you wish to see the data normally produced and stored in that file, it is necessary to use a combination of git post-commit, post-merge and post-rewrite hooks.  Unfortunately, those git hooks are per-user &ndash; they cannot be installed in a way that affects all users of a repository, nor can they be installed on GitHub.  Therefore, any developers or SBML Editors who would like to see `/site/data/site.toml` updated in their local development environment need to install the git hooks in their local git environment.

There are two git hooks used for that purpose:

* [post-commit](post-commit)
* [post-merge](post-merge)
* [post-rewrite](post-rewrite)

Please install them in your local copy of this git repository using the following command:

``` shell
git config core.hooksPath .githooks
```

Thereafter, commits will regenerate the file `/site/data/site.toml` with the latest timestamp and revision information.

Note that these scripts are written in Unix [bash](https://www.gnu.org/software/bash/).  They have been tested on macOS and Linux CentOS environments, but they have not been tested on Windows.  If you get them running in a Windows environment, please submit revisions so that we can improve the hook scripts for everyone.
