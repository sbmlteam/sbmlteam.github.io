Site content
============

This is the source for the content of the sbml.org website.  It uses the Academic Theme for Hugo, but makes changes to some parts.  The changes are implemented by adding replacements for some files into subdirectories such as [data](data) and [layouts](layouts); the original Academic theme files in [themes/academic](themes/academic) are left as-is.


Updating the Academic Theme
---------------------------

Run the following in a shell:

```bash
# Display available updates to Academic.
cd themes/academic
git fetch
git log --pretty=oneline --abbrev-commit --decorate HEAD..origin/master
cd ../../

# Update Academic.
git submodule update --remote --merge
```
