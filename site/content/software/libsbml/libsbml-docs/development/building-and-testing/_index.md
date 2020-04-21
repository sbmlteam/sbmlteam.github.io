+++
#=====================================================================
title  = "Building and testing releases of libSBML"
layout = "single"
toc    = true
#=====================================================================
+++

This page describes in detail the procedure for building and testing the various binaries and installers that make up the libSBML release. This is done in two main stages: creating and stabilizing the source archives and then building and testing the various installers.

## Creating and stabilizing source archives

The first stage is stabilizing the source archives. This involves first creating the archives, then testing the content, doing non-standard builds and repeating the process until everything works as expected.

### Create the archives

1.  The src archive for just libsbml-core is created using a GNU Make build on libsbml trunk SVN.
    1.  Configure enabling the language bindings for C\#, Java, Perl, Python, Ruby & Matlab; disabling all SBML L3 packages and enabling check.
    2.  Run `make check` and ensure all tests pass.
    3.  Run `make dist-zip`
    4.  Rename the files produced to `libsbml-X.Y.Z-core-src`.
2.  The individual src archives for each SBML L3 package are created by running the windows batch files that generate these.
    1.  In libsbml trunk change to `libsbml/dev/packages/create-archives` and run each of the batch files.
    2.  In libsbml-experimental branch change to `libsbml-experimental/dev/packages/create-archives` and run each of the batch files.
3.  The src archive for core plus stable packages is created.
    1.  Extract the archive created in Step 1.
    2.  Extract the archive for each stable package over the extracted core code.
    3.  Create a CMake build directory for the extracted source.
    4.  Change to the CMake build directory.
        1.  Run `cpack -G ZIP` to create the .zip file.
        2.  Run `cpack -G TGZ` to create the .tar.gz file.
    5.  Rename the files produced to `libsbml-X.Y.Z-core-plus-packages-src`.
4.  The src archive for core plus all packages is created.
    1.  Extract the archive created in Step 3.
    2.  Extract the archive for each experimental package over the extracted code.
    3.  Create a CMake build directory for the extracted source.
    4.  Change to the CMake build directory.
        1.  Run `cpack -G ZIP` to create the .zip file.
        2.  Run `cpack -G TGZ` to create the .tar.gz file.
    5.  Rename the files produced to `libsbml-X.Y.Z-Source`.


### Test archives

1.  Each archive is extracted somewhere completely separated and checked against the SVN repository to ensure it contains all the necessary files and the correct versions of these. This step is a manual step and requires someone to do a diff on the directories and assess the results.
2.  At least one build is done from the src archives to double check everything necessary is present.
3.  If any problems are encountered, the necessary corrections are made and the archives are recreated.


### Check non-standard builds

This step involves doing builds with the different possible configurations of libsbml and using platforms/compilers that we do not generally use in day to day development.

LibSBML is built and the unit tests run for each of the listed options below. These builds are done using the source archives that have been produced during the stages above. If any issues are found and fixed it is necessary to recreate and test the affected archives.


#### Configuration options

-   `with-strict-includes`
-   `with-namespace`
-   `with-legacy-math`
-   `with-expat`
-   `with-xerces`
-   different C++ standards (by overriding the `CXXFLAGS`, or `CMAKE_CXX_FLAGS` with
    -   `std=c++0x`
    -   `std=c++11`
    -   `std=c++14`
    -   `std=c++98`


#### Platforms/compilers

-   Clang compiler
-   Borland compiler
-   Using cygwin
-   Using a standalone gnumake build (no cmake involved) with
    -   GCC 5.1
    -   GCC 5.2
    -   GCC 4.2
    -   GCC 3.4
-   ARM processor

The creation of archives and testing phases cycle until the source archives produce successful builds on all platforms/configuration/compiler options.


## Building and testing installers

The next stage is to build and test installers. Installers are built and then tested on a machine that is NOT the machine they were built on. The criteria tested are:

1.  The Installer itself runs correctly.
2.  The Installed files work as expected.
    1.  One of the libSBML example programs is built and run.
    2.  Language bindings are tested by running the relevant unit tests.

These builds can be done concurrently and if problems occur then the installer with issues is rebuilt. Note each installer is built twice - once using the stable release and once for experimental.

### Windows

The windows installers and binary packages are built automatically on raterule.caltech.edu.

These are all downloaded and individually tested on SMK_Win.

### Mac OS X

The Mac OS X Packages are built for the release. At time of writing (December 2015) the following builds are done.

  | Version            |  Build machine            | Test machine |
  |--------------------|---------------------------|--------------|
  | latest             | FTB_Mac                   | SMK_Mac |
  | Yosemite (10.10)   | Remote machine at Caltech | FTB_Mac |
  | SnowLeopard (10.6) | SMK_Mac                   | FTB_Mac |

We continue to support the 10.6 build as it is the last Mac OS X to support PowerPC applications.


### Linux

The Linux Packages are built for the release. At time of writing (December 2015) the following builds are done.

  | Version                   | Build machine | Test machine |
  |---------------------------|---------------|--------------|
  | CentOS 4.8 32-bit (.rpm)  | FTB_VM_C      | SMK_EBI |
  | CentOS 4.8 64-bit (.rpm)  | FTB_VM_C      | SMK_EBI |
  | Ubuntu 8.08 32-bit (.deb) | FTB_VM_U      | SMK_VM_U |
  | Ubuntu 8.08 64-bit (.deb) | FTB_VM_U      | SMK_VM_U |

We use the packages built on these old versions of Linux as the binaries created will work on all newer Linux distributions. (as libc and libstdc++ are backwards compatible).


### MATLAB Interface

We provide separate bundles of the only the MATLAB interface for each operating system. The following builds are done.

  | OS           | Build machine        | Test machine |
  |--------------|----------------------|--------------|
  | Linux 32-bit | FTB_VM_C             | FTB_VM_U |
  | Linux 64-bit | FTB_VM_C             | FTB_VM_U |
  | Windows      | raterule.caltech.edu | SMK_Win |
  | Mac OS X     | SMK_Mac              | FTB_Mac |

Once all the matlab bindings are built, we bundle them all together into a combined archive for release.


### R Interface

Here we provide a source package for use on Linux/Mac and a binary package for use on Windows.

The Windows binary package is created on raterule.caltech.edu and tested on SMK_Win.

#### R source package

The source package is created on FTB_Mac using the following:

1.  Use a fresh SVN checkout. We have noticed that if a libsbml src tree
    has been configured with GNUMake some of the files cause conflict
    when configuring CMake for package creation.
2.  Configure with cmake option `WITH_CREATE_R_SOURCE=ON`.
3.  Run CMake build to create the R source package.

The R source package needs to be tested manually by running `R CMD check <r source archive>` which is done on SMK_Mac.

### Python Interface

The source package is created on FTB_Mac using the following:

1.  Use a fresh SVN checkout. We have noticed that if a libsbml src tree has been configured with GNUMake some of the files cause conflict when configuring CMake for package creation.
2.  Configure with cmake option `WITH_CREATE_PYTHON_SOURCE=ON`.
3.  Run CMake build to create the Python source package.

This next two stages are done prior to the main Release to allow for testing.

#### OBS

1.  Log onto the openbuildservice.
2.  Upload the source archives to: [python-libsbml](https://build.opensuse.org/package/show/home:fbergman:libsbml/python-libsbml)
    or   [python-libsbml-experimental](https://build.opensuse.org/package/show/home:fbergman:libsbml/python-libsbml-experimental)
3.  Modify the following files on the OBS:
    1.  `debian.changelog`: add the new line for the new release (Formatting has to be precise, no added spaces or indentations, otherwise debian builds will fail)
    2.  `python-libsbml.changes`: the same new lines for the new release for RPM builds
    3.  `python-libsbml.dsc`: update the link to the new file by updating the fields: Version, Debtransform-Tar and the Files.
    4.  `python-libsbml.spec`: update the link to the new file by updating the fields: Version and Source0
4.  Wait for the builds to complete, and spot check download individual files and verify that they work.
5.  Check that list of distributions is up to date.


#### PyPi

1.  Using the Python source package change into the CMake build directory.
2.  Change into `src/bindings/python/out`.
3.  Run `python setup.py register`. This will create a new release on pypi.
4.  Log into the [pypi account](https://pypi.python.org/pypi?%3Aaction=pkg_edit&name=python-libsbml).
5.  Upload the created source archive. (Automatic submission does not work, as not all the files are submitted).
6.  Test a `pip install python-libsbml` and check python libsbml tests run.

Testing of OBS and PyPi is done on various Mac and Linux VMs.


### Test machines

A key to the different machines used for building and testing.

  | Nickname   | Machine OS |
  |------------|-------------------------------------|
  | FTB_VM_C   | VMWare installation of CentOS 4.8 |
  | FTB_VM_U   | VMWare installation of Ubuntu 8.08 |
  | SMK_Win    | Windows 8.1 |
  | SMK_Mac    | Mac OS 10.6 |
  | FTB_Mac    | Mac OS 10.11 |
  | SMK_VM_U   | VMWare installation of Ubuntu 15.04 |
  | SMK_EBI    | RedHat Enterprise Linux 6.7 |
