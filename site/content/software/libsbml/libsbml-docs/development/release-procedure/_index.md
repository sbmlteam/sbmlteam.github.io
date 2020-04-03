+++
#=====================================================================
title  = "LibSBML release procedure"
date   = 2020-04-02
layout = "single"
#=====================================================================
+++

This page lists the steps in our current libSBML release procedure.

## Step 1: Set the date of release

The planned date of a full libsbml release allows two weeks for testing the binaries and archives that we produce. Thus for a given release a date for "code freeze" is set at two weeks prior to the anticipated release date.

1.  Enter dates for code freeze and release the team calendar.
2.  Enter date for release on
    \[<https://www.pivotaltracker.com/projects/248655#>\| Pivotal
    Tracker\].
3.  Discuss at a team meeting what needs to be done in preparation for
    the freeze.
4.  Add the following Pivotal items:
    1.  Update SBO
    2.  Update NEWS and send for review
    3.  Update README.md.in files if necessary
    4.  Update version number
    5.  Test odd configurations
    6.  Create and test archives
    7.  Create and test installers

## Step 2: Immediately prior to code freeze

1.  Change the version number in VERSION.txt.
2.  Check whether any ErrorTables have changed and update documentation
    using the writeErrorTable utility.
3.  Update NEWS.txt with all relevant changes.
4.  Ensure all members of the team have read and commented on NEWS.txt
    as this will become the release announcement.

{{% notice type="warning" %}}
Once code freeze has been reached, there should be no more commits of any kind to the libsbml core and libsbml package svn repositories.  The only exception to this is when a problem is identified during the testing phase.
{{% /notice %}}

## Step 3: Testing

Code then enters the testing phase, where the binaries, archives and
installers are tested on a wide variety of platforms with a range of
versions of different supported programming languages. Full details are
available
[here](http://sbml.org/SBML_Projects/libSBML/Building_and_Testing).

### Procedure when all goes well

The end of the testing period is when all the archives and installers
have been created and tested.

### Procedure when something goes wrong

If a problem is encountered, the following needs to be done:

1.  Create a pivotal story with the following characteristics:
    1.  Outlines the problem encountered
    2.  Identifies what needs to be changed to fix it
    3.  Is placed **above** the release marker in the backlog in Pivotal
        Tracker
2.  Send an email to libsbml-team to highlight the issue as a potential
    release bug

The project leader (currently Sarah) then does the following:

1.  Reviews the problem
2.  Makes a decision on whether the change needs to be incorporated into
    the current release

If the change is to be made, then:

1.  The story is allocated to a developer
2.  The story then goes through the finish/deliver/acceptance procedure
3.  Additional changes to NEWS.txt are made if necessary
4.  Testing is restarted

Otherwise:

1.  The story is moved to the pivotal backlog to be addressed in the
    next release

## Step 4: Update software on SourceForge and PyPI

1.  Create a skeleton of the release folder for SF with the README files
    so these can be reviewed.
2.  Create new release number on sf.net.
3.  Upload the files created during testing.
4.  Follow the [ procedure for creating and uploading the documentation
    archives](SBML_Projects/libSBML/Creating_libSBML_documentation_archives "wikilink")
5.  Upload to PyPI

## Step 5: Update the copy of libSBML and the API documentation on sbml.org

Let <span style="background-color: #aaccaa; font-style: italic">X.Y.Z</span> be the new version number. The name of the libSBML source directory will be <span style="background-color: #aaccaa; font-style: italic">`X.Y.Z`</span> after it is unpacked.

{{% notice type="danger" %}}
This part NEEDS UPDATING RE SERVER DOCS
{{% /notice %}}

1.  rsync a copy of the libSBML core-plus-packages src distribution
    archive for
    <span style="background-color: #aaccaa; font-style: italic">X.Y.Z</span>
    to `sbml.org:/var/www/sites/sbml/Special/Software/libSBML/`
2.  rsync a copy of the server-side docs distribution for
    <span style="background-color: #aaccaa; font-style: italic">X.Y.Z</span>
    to `sbml.org:/var/www/sites/sbml/Special/Software/libSBML/`
    1.  The server-side docs are made using `make server-docs` instead
        of the usual `docs` target.
    2.  Note: it is fastest to rsync the archives and use
        `tar -zxvf filename.tar.gz` on sbml.org to extract them.
3.  `ssh sbml.org`
4.  `cd /var/www/sites/sbml/Special/Software/libSBML`
5.  `tar xzvf libSBML-`<span style="background-color: #aaccaa; font-style: italic">`X.Y.Z`</span>`-core-plus-packages-src.tar.gz`
6.  `rm latest-stable`
7.  `ln -s `<span style="background-color: #aaccaa; font-style: italic">`X.Y.Z`</span>` latest-stable`
8.  `cd `<span style="background-color: #aaccaa; font-style: italic">`X.Y.Z`</span>
9.  `tar xzf ../libSBML-`<span style="background-color: #aaccaa; font-style: italic">`X.Y.Z`</span>`-docs.tar.gz`
10. `cd docs/formatted`
11. `../../../doc-utilities/server-doc-setup.sh`
12. In the
    <span style="background-color: #aaccaa; font-style: italic">X.Y.Z</span>/NEWS.txt
    file any special characters get mangled and need to be replaced.
    Currently we have several occurrences of an umlaut that need to be
    replaced with & o u m l ; Note chmod -R 775 on the X.Y.Z dir gives
    everyone permission to edit this file.
13. Tidy up the `/var/www/sites/sbml/Special/Software/libSBML` directory
    to remove the `.tar.gz` files and anything else you may have left
    there.

## Step 5a: Other references

1.  Get a DOI by uploading to
    [zenodo](https://zenodo.org/login/?next=%2Fdeposit)
2.  Update the release information on the [libsbml wikipedia
    page](https://en.wikipedia.org/wiki/LibSBML).

## Step 6: Update the libSBML web pages

1.  Edit the following links:
    1.  Edit
        [Template:LibSBMLStableReleaseNumber](Template:LibSBMLStableReleaseNumber "wikilink")
        to reflect the new release number.
    2.  Edit
        [Template:LibSBMLStableReleaseDate](Template:LibSBMLStableReleaseDate "wikilink")
        to reflect the new release date.
    3.  Check the information at the top of [ libSBML
        page](Software/libSBML "wikilink") to make sure it reflects the
        correct release number and date, and either add or remove
        mention of the experimental release if necessary.
    4.  Go to [ the release notes
        page](Software/libSBML/LibSBML_Release_Notes "wikilink") and
        select edit. Change the text to refer to NEWS.txt inside the
        correct
        <span style="background-color: #aaccaa; font-style: italic">X.Y.Z</span>
        directory for this release.
    5.  If necessary, change [
        downloadURL](Template:LibSBMLDownloadURL "wikilink") to the
        appropriate sourceforge directory for this release. Note:
        updating
        [Template:LibSBMLStableRelease](Template:LibSBMLStableRelease "wikilink")
        should have resulted in the correct download URL to be set, but
        it\'s good to check.
2.  Visit [ the development roadmap
    page](SBML_Projects/libSBML/LibSBML_Development_Roadmap "wikilink"):
    1.  Edit the date and release of latest release.
    2.  Update any text relevant to this and the next release.
    3.  Change [ last release number](Template:Last_release "wikilink")
        to reflect the new release number.
3.  Also update the list of contributors near the bottom of the [
    libSBML page](Software/libSBML "wikilink"), if appropriate.
4.  Update the links in the [master spreadsheet for SBML Level 3
    specifications](http://tinyurl.com/sbml-level-3-package-statuses).
5.  Do anything necessary to update examples
6.  Update the online validator as detailed
    [here](http://sbml.org/SBML_Projects/Online_Validator_Release_procedure).

## Step 7: Sourceforge/other housekeeping

1.  Tag the release in SVN
2.  Add a tracker group for the new libSBML release number
3.  Update the VERSION number so that svn code is distinguishable from
    release
4.  Free up space in dropbox dist folder

## Step 8: Announce

1.  Post to sbml-discuss and libsbml-development about the new release.
2.  Add a link to news box on sbml.org
3.  Post to Google+
4.  Tweet under the sbmlnews account
5.  Mail the linux developers who include libsbml
