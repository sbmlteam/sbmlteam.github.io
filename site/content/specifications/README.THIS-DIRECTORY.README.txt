2022-04-30 <mhucka@caltech.edu>

This directory came about because I couldn't make the desired solution work.  The desired solution was to use Hugo's "aliases" directive in the _index.md files in content/documents/specifications to set up the same hierarchy as existed in the old sbml.org (and is embedded in countless papers in the world, and also in co.mbine.org's specification URLs) and then put the PDFs in the right locations there.  I also tried symbolic links on the server, but no dice.  I couldn't get it to work for paths that began with https://sbml.org/.  I *almost* got it to work: it worked for paths that began with https://synonym.caltech.edu/ (the real host at the time of this writing), but not for the CNAME sbml.org, and I couldn't figure out why.  It could be a Hugo configuration issue, or a haproxy configuration issue, or maybe it's simply impossible.

I gave up and created this directory hierarchy instead.
