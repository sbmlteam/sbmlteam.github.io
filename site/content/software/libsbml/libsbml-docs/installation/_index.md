+++
#=====================================================================
title  = "Downloading and installing libSBML"
date   = 2020-03-24
layout = "single"
toc    = true
#=====================================================================
+++

We provide ready-to-use installers for many operating systems and programming languages, so most users don't need to build libSBML themselves (though that's an option too!).  Please use table at right to find the appropriate instructions for your case.

Note: _**stable**_ releases of libSBML contain support for only the accepted parts of SBML and finalized SBML Level&nbsp;3 packages, while _**experimental**_ releases contain code for SBML Level&nbsp;3 packages that have not been finalized.


## MATLAB

For _stable_ releases of libSBML, we provide a unified installer for all versions of MATLAB and all operating systems.  The result is ready to run after installation; it **does not need compilation**, and only requires you tell MATLAB where you placed the files. Here are the steps:

<ol>
<li><a href="{{< value "libsbml" "download_url" >}}/MATLAB%20Interface">Download the distribution archive file</a>.</li>
<li>Extract the archive to a folder somewhere on your computer.  (Let's refer to this folder as <span style="background-color: #ffcc99; font-style: italic">folder</span>.)
</li>
<li>Start your copy of MATLAB, then do <i>one</i> of the following series of steps.<br>
  <i>Approach #1:</i>
  <ol style="list-style-type: lower-alpha">
    <li>Add <span style="background-color: #ffcc99; font-style: italic">folder</span> to your MATLAB path using MATLAB's <code>addPath</code> command.</li>
    <li>Verify that it works: change the current directory within your running MATLAB environment to <span style="background-color: #ffcc99; font-style: italic">folder</span> and issue the command <code>TranslateSBML('test.xml')</code>. If all is well, the output will be a MATLAB data structure.</li>
    <li>Save the changes to your MATLAB path for future use. You can use MATLAB's standard <code>savepath</code> command.</li>
  </ol>
  <i>Approach #2:</i>
  <ol style="list-style-type: lower-alpha">
  <li>On your computer (outside of MATLAB), navigate to <span style="background-color: #ffcc99; font-style: italic">folder</span>.</li>
  <li>Run the program <code>installSBML</code>, which performs the above steps.</li>
  </ol>
</li>
</ol>

{{% notice type="info" %}}
The MATLAB installation contains a statically-linked copy of libSBML integrated into the MATLAB interface; it does **not** contain interfaces to other programming languages or a copy of libSBML usable outside of the MATLAB environment.  To use libSBML outside of MATLAB, you will also need to install libSBML using one of the other methods described on this page.
{{% /notice %}}


## Python

We provide four ways to obtain the libSBML Python interface. Please use whichever one you prefer.


### Alternative #1: using Conda

We provide the libSBML Python interface through [conda forge](https://conda-forge.org). To get the **stable** release of libSBML using [conda](http://conda.pydata.org/docs/), run the following command in a terminal:

    conda install -c conda-forge python-libsbml

_Alternatively_, if you want to install the **experimental** release of libSBML using [conda](http://conda.pydata.org/docs/), run the following command in a terminal:

    conda install -c conda-forge python-libsbml-experimental

After this, you should be able to access the Python language interface for libSBML directly from your Python programs by importing it like any other Python module.  In other words, `import libsbml` should work in your Python program.


### Alternative #2: using `pip` from PyPI

First, if you do not have [pip](https://pip.pypa.io/en/stable/installing/) or are uncertain if you do, run the following command in a terminal:

    sudo python3 -m ensurepip

Then, to install the **stable** release of libSBML, run the following command:

    sudo python3 -m pip install python-libsbml --upgrade

_Alternatively_, if you want to install the **experimental** release of libSBML, run the following command:

    sudo python3 -m pip install python-libsbml-experimental --upgrade

Note that in either case, **the process may take a long time** because on some operating system versions, it must install and build dependent libraries.  Please be patient.  If all goes well, the steps above should result in `pip` eventually printing the following message to tell you has it finished successfully:

    Successfully installed python-libsbml
    Cleaning up...

After this, you should be able to access the Python language interface for libSBML directly from your Python programs by importing it like any other Python module.  In other words, `import libsbml` should work in your Python program.

## R

We provide installers for the stable version of the libSBML R language interface for Linux, Mac OS X and Windows. Download the version that is appropriate for your situation:

* _For **Linux and Mac OS X**_: Download the [libSBML R source package]({{< value "libsbml" "download_url" >}}/{{< value "libsbml" "latest_release" >}}) from SourceForge.

Once you have downloaded the appropriate version, one more step is required to install the libSBML R interface. You can do this step in **one of two ways**: either using the R graphical interface, or using a terminal/shell command.


### Using the R GUI

From the R menu **Packages** or **Packages & Data** (depending on your operating system), select the **Package Installer** item. You will be presented with an interface that lets you install a local binary package. Use that interface to navigate to the directory where you copied the libSBML archive file, and select the archive file for installation.


### Using a shell command

Suppose that the path to the libSBML R archive on your computer is <span style="background-color: #ffcc99; font-style: italic">archive</span>. Execute the following command in a terminal/shell window (note: **not** in the R command line interpreter!):
<pre>
R CMD INSTALL <span style="background-color: #ffcc99; font-style: italic">archive</span>
</pre>

If all goes well, you should see R print messages. If you're using the source package, it will be something such as the following (the paths on your computer may differ):

    * installing to library ‘/Library/Frameworks/R.framework/Versions/3.1/Resources/library’
    * installing *binary* package ‘libSBML’ ...
    * DONE (libSBML)

whereas if you are using a binary package, the messages will be something like the following instead:

	> utils:::menuInstallLocal()
      package ‘libSBML’ successfully unpacked and MD5 sums checked
	>

From this point forward, you should be able to call on libSBML functions from within your copy of R. You can test whether the installation was successful by trying the following command in R:

	library('libSBML')

If R does not report an error when you execute this command, then the
libSBML R interface is probably installed correctly.

## Other languages

If no installation package is available for your platform, or you have special requirements for libSBML's configuration, you can always build libSBML from sources.

1. [Download libSBML]({{< value "libsbml" "download_url" >}}/{{< value "libsbml" "latest_release" >}}) from our SourceForge distribution site.
2. [Follow the instructions]() for configuring, compiling and installing libSBML manually.
