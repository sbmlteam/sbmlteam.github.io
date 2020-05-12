Pre and post commit hooks for SBML.org source files
===================================================

The information in the /site area of SBML.org is generated from git revision information.  To do this, it is necessary to use a combination of git post-commit and post-merge hooks.  Unfortunately, those git hooks are per-user &ndash; they cannot be installed in a way that affects all users of a repository, nor can they be installed on GitHub.  Therefore, any developers or SBML Editors who would like to commit changes directly to the site repository need to install the git hooks in their local git environment.

There are two git hooks used for that purpose:

* [post-commit](post-commit)
* [post-merge](pre-merge)

Please install them in your local copy of this git repository using the following command:

``` shell
git config core.hooksPath .githooks
```

Thereafter, commits will regenerate the file `/site/data/site.toml` with the latest timestamp and revision information.

Note that these scripts are written in Unix [bash](https://www.gnu.org/software/bash/).  They have been tested on macOS and Linux CentOS environments, but they have not been tested on Windows.  If you get them running in a Windows environment, please submit revisions so that we can improve the hook scripts for everyone.
