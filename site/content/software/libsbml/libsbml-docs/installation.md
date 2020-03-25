+++
#=====================================================================
title  = "Downloading and installing libSBML"
date   = 2020-03-24
layout = "single"
#=====================================================================
+++

{{< toc >}}

We offer ready-to-use installers for many operating systems and programming languages, so most users don't need to build [libSBML](/software/libSBML) themselves (though that's an option).  Please use table at right to find the appropriate instructions for your case:

## MATLAB

For _stable_ releases of libSBML, we provide a unified installer for all versions of MATLAB and all operating systems.  The result is ready to run after installation; it **does not need compilation**, and only requires you tell MATLAB where you placed the files. Here are the steps:

1. [https://sourceforge.net/projects/sbml/files/libsbml/MATLAB%20Interface/ Download the distribution archive] from SourceForge.
2. Extract the archive somewhere on your local computer.
3. Start your copy of MATLAB, then _either_:
   a.
     i) that folder to your MATLAB path using MATLAB's <code>addPath</code> command.
     ii) Verify it works: change into that folder within your running MATLAB environment and issue the command <code>TranslateSBML('test.xml')</code>. If all is well, the output will be a MATLAB data structure.
     iii) Save the changes to your MATLAB path for future use. You can use MATLAB's standard <code>savepath</code> command.
   b. _or_
     i) Navigate to the directory where you extracted the archive.
     ii) Run <code>installSBML</code> - which performs the above steps.

Note that the MATLAB installation archive contains _only_ the MATLAB interface; it does **not** contain the core libSBML library or language libSBML API interfaces for other programming languages.

## Python

We provide four ways to obtain the libSBML Python interface. Please use whichever one you prefer.

### Using `conda`

We provide a distribution of the libSBML Python interface through [Anaconda Cloud](http://anaconda.org/sbmlteam), making it accessible through [conda](http://conda.pydata.org/docs/).  To install it this way, follow these instructions:

* _To get the stable version of libSBML_:
  conda install -c SBMLTeam python-libsbml

* _To get the experimental version of libSBML_: 
  conda install -c SBMLTeam python-libsbml-experimental

After this, you should be able to access the Python language interface for libSBML directly from your Python interpreter by importing it like any other Python module.  In other words, <code>import libsbml</code> should work in your Python interpreter.

### Using `pip` from PyPI

_Important_: the default version of <code>pip</code> on your system may not be appropriate for the version of Python you want to use.  (For example, the command <code>pip</code> on your system may be for Python 2.7, which will not work if you want to use Python 3.x.)  If you do not have <code>pip</code> installed for a given version of Python, a reliable way to install it is the following:
<ol>
<li> Download [get-pip.py](https://bootstrap.pypa.io/get-pip.py)
<li> Run the following command in a shell terminal, where <span style="background-color: #c9f900; font-style: italic">version</span> is your version of Python (e.g., <code>3</code>):
<blockquote>
  <code>sudo python<span style="background-color: #c9f900; font-style: italic">version</span> get-pip.py</code>
</blockquote>
An example of the command line above is the following: <code>sudo python3 get-pip.py</code>.
</ol>

Assuming you have either <code>pip2</code> or <code>pip3</code> on your system, then to get the _stable_ release of libSBML, run the following:
<blockquote>
  <code>sudo pip<span style="background-color: #c9f900; font-style: italic">version</span> install python-libsbml</code>
</blockquote>
where <span style="background-color: #c9f900; font-style: italic">version</span> is either <code>2</code> or <code>3</code>, depending on whether you want to use Python&nbsp;2 or Python&nbsp;3. Alternatively, for the _experimental_ release of libSBML, use the following command instead:
<blockquote>
  <code>sudo pip<span style="background-color: #c9f900; font-style: italic">version</span> install python-libsbml-experimental</code>
</blockquote>

Note that in either case, **the process will take a long time** because it must install and build dependent libraries. If all goes well, the steps above should result in <code>pip</code> eventually printing the following message to tell you has it finished successfully:

<pre class="fragment">
Successfully installed python-libsbml
Cleaning up...
</pre>

After this, you should be able to access the Python language interface for libSBML directly from your Python interpreter by importing it like any other Python module.  In other words, <code>import libsbml</code> should work in your Python interpreter.

### Using Linux's `apt-get` or `yum` ===

If you are running Linux, and you prefer to use the standard over-the-air installation tools provided by your operating system (e.g., <code>yum</code> and <code>apt-get</code>), you can take advantage of online repositories of installers we provide using the [OpenSUSE Build System](https://build.opensuse.org/) (OBS). You can find instructions for many different flavors of Linux including CentOS, Fedora, Ubuntu, and others, at the following URLs:

* For the stable release: [python-libsbml](http://software.opensuse.org/download.html?project=home%3Afbergman%3Alibsbml&package=python-libsbml)
* For the experimental release: [python-libsbml-experimental](http://software.opensuse.org/download.html?project=home%3Afbergman%3Alibsbml&package=python-libsbml-experimental)

After this, you should be able to access the Python language interface for libSBML directly from your Python interpreter by importing it like any other Python module.  In other words, <code>import libsbml</code> should work in your Python interpreter.

### Using the Windows libSBML installer for Python

You can take advantage of executable installers that we make available for Windows. They can be found in a subdirectory named **python**  within each of the Windows subdirectories ([stable](https://sourceforge.net/projects/sbml/files/libsbml/{{LibSBMLStableRelease}}/stable/Windows) and [experimental](https://sourceforge.net/projects/sbml/files/libsbml/{{LibSBMLStableRelease}}/experimental/binaries/Windows/python/)) on SourceForge. There are different installers for different versions of Python.  The following screenshot shows an example.

<center>
{{ImageLink | link=https://sourceforge.net/projects/sbml/files/libsbml/{{LibSBMLStableRelease}}/stable/Windows | image=Sourceforge-windows-python-downloaders-2014-v2.png | width=460px | halfwidth=230px | height=300px}}
</center>


After you download an appropriate <code>.exe</code> file for your system, run the installer. The installer will lead you through the installation process. Note: Windows may produce a security warning about the installer being from an unknown publisher. **Please tell Windows to proceed** despite this warning.

## C, C++, C#, Java, JavaScript, Perl, PHP, or Ruby

The installation packages in the libSBML [SourceForge download site][{{LibSBMLDownloadURL}}) contain interfaces for C, C++, C#, Java, JavaScript, Perl, PHP, Python, and Ruby in the same package. (However, there are better ways to get the Python interface, as  [[#Python | explained above]].) The download area has two subdirectories: one for stable releases of libSBML, and one for experimental releases.  The _stable_ releases contain support for only the accepted parts of SBML, _experimental_ releases contain code for SBML Level&nbsp;3 packages still in development.

<center>
{{ImageLink | link={{LibSBMLDownloadURL}} | image=Sourceforge-download.png | width=400px | halfwidth=200px | height=282px}}
</center>


Click on either <em>stable</em> or <em>experimental</em>, and then navigate to a subdirectory matching your operating system platform. Download the appropriate installer or package file for your platform, and use the appropriate platform-specific approach to install the software. (E.g., if you downloaded a Mac <code>.dmg</code> file, double-click the file in the Mac Finder to mount the disk image, open the image contents in the Finder, and finally, double-click the <code>.pkg</code> file contained inside.)

## R

We provide installers for the stable version of the libSBML R language interface for Linux, Mac OS X and Windows. Download the version that is appropriate for your situation:

* _For **Linux and Mac OS X**_: Download the [libSBML R source package](http://sf.net/projects/sbml/files/libsbml/{{LibSBMLStableRelease}}) from SourceForge.

* _For **Windows**_: Download the [https://sourceforge.net/projects/sbml/files/libsbml/{{LibSBMLStableRelease}}/stable/Windows/64-bit/R%20interface/ 64-bit version] or the [https://sourceforge.net/projects/sbml/files/libsbml/{{LibSBMLStableRelease}}/stable/Windows/32-bit/R%20interface/ 32-bit version] of the binary installer for R.

Once you have downloaded the appropriate version, one more step is required to install the libSBML R interface. You can do this step in **one of two ways**: either using the R graphical interface, or using a terminal/shell command.  

### Using the R GUI

From the R menu **Packages** or **Packages & Data** (depending on your operating system), select the **Package Installer** item. You will be presented with an interface that lets you install a local binary package. Use that interface to navigate to the directory where you copied the libSBML archive file, and select the archive file for installation.

### Using a shell command

Suppose that the path to the libSBML R archive on your computer is <span style="background-color: #ffcc99; font-style: italic">archive</span>. Execute the following command in a terminal/shell window (note: **not** in the R command line interpreter!):

	R CMD INSTALL <span style="background-color: #ffcc99; font-style: italic">archive</span>

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

# [{{LibSBMLDownloadURL}} Download libSBML] from our SourceForge distribution site.
# [{{LibSBMLDocsRoot}}/cpp-api/libsbml-installation.html Follow the instructions] for configuring, compiling and installing libSBML manually.
