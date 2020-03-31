Notes about /static/software/.

Each subdirectory here must be the name of a software package, in all lowercase letters.  E.g.: "jsbml", "libsbml", "sbmltoolbox".

Underneath each subdirectory, software releases should be added in directories whose names are the release number.  E.g.: "1.4.0", "5.18.0".  In other words, we should end up with paths like these examples:

  /static/software/jsbml/1.4.0/
  /static/software/libsbml/5.18.0/

There can be other, non-number subdirectories under the software subdirectories, but there should be at least one that contains a release of the software in question and is named after the release number.  The reason is that other parts of the site, notably some shortcodes defined in /content/layouts/shortcodes/, rely on looking for numbered directory names to figure out the latest version of something.
 
Note: Hugo does not allow symlinks to subdirectories within /static/.
