+++
#=====================================================================
title  = "Known libSBML problems and pitfalls"
date   = 2020-03-27
layout = "single"
#=====================================================================
+++

{{< toc >}}

This section documents the following known problems, limitations, and
possible pitfalls in using libSBML.

## Potential for language bindings to link old versions of libSBML by accident

At application run-time, the language bindings for C#, Java, JavaScript, Perl, PHP, Python and others must be able to dynamically link the core libSBML library file (i.e., <code>libsbml.so</code>, <code>libsbml.dylib</code> or <code>libsbml.dll</code>, depending on your operating system).  If a user's environment includes an <em>old</em> version of this library file, and it is picked up at run-time instead of the correct library version, linking may fail with mysterious errors about undefined symbols.  Users and developers are cautioned to make sure that their installations have matched versions of libSBML components and are free of older versions that may be picked up inadvertently.


## Some versions of MATLAB include a conflicting version of `libstdc++`
  
Some versions of MATLAB produced for Linux include a version of the stdc++ library that conflicts with the version provided by the operating system. This copy of the library is installed in MATLAB's own directories. This may cause a conflict not in building libSBML, but <em>running</em> MATLAB code that use libSBML, such as <code>TranslateSBML</code> (the MATLAB interface function provided as part of libSBML).  The result is that MATLAB will produce an error messages such as <em><code>"libSBML is not linked"</code></em> or <em><code>"/unix/bin/glnxa64/../../sys/os/glnxa64/libstdc++.so.6: version `GLIBCXX_3.4.11' not found"</code></em>.

The solution is to preload the system stdc++ library before invoking MATLAB.  You can accomplish this by setting the Linux environment variable <code>LD_PRELOAD</code> to the path of the system's <code>libstdc++</code> library file.  You must first locate this file on your particular operating system.  Giving a precise recipe for finding the file is difficult because it differs slightly by operating system, but it is often found in a subdirectory of <code>/usr/lib</code> and will be named <code>libstdc++.so.6</code>.

Once you know the path to the stdc++ library file, set the value of <code>LD_PRELOAD</code> This will take the form of the following:

<pre class="fragment">
export LD_PRELOAD=/path/to/system/libstdc++</code>
</pre>
for <i>sh</i>-based shells such as Bash, or 
<pre class="fragment">
setenv LD_PRELOAD /path/to/system/libstdc++</code>
</pre>
for <i>csh</i>-based shells.


## Explicit freeing of memory when using static MSVC runtimes

On MS Windows, when using libSBML compiled against a static MSVC runtime library, it is not possible to use the standard <code>free()</code> function call to free memory allocated and returned by libSBML.  Without the ability to use <code>free()</code> to free the string returned by libSBML, the calling application will leak memory.  An example of typical code where one would want to free the returned by libSBML is the following:

<pre class="fragment">
   char * formula = SBML_formulaToString(astNode);
   /* ... do some work with formula here ... */
   free(formula);
</pre>

<p> To cope with this issue, beginning with version 4.2, libSBML provides a special function for this situation: <code>util_free()</code>.


## Name collisions in mathematical expressions

In the C-like, text-based, formula expression syntax supported by libSBML and used in SBML Level&nbsp;1, four constants are reserved words: <code>true</code>, <code>false</code>, <code>exponentiale</code> and <code>pi</code>.  Most of them will not easily lead to a name collision, but unfortunately, the character sequence <code>pi</code> <em>is</em> also sometimes used as a species identifier by biological modelers (e.g., to use "Pi" to represent a phosphate ion).  If the string "<code>pi</code>" or "<code>Pi</code>" appears in a text string passed to a libSBML method that interprets formulas, it will be interpreted as the mathematical constant &#960; (pi).  For example, the expression <em>2 * Pi</em> will yield

<pre class="fragment">
&lt;math xmlns="http://www.w3.org/1998/Math/MathML"&gt;
  &lt;apply&gt;
    &lt;times/&gt;
    &lt;cn type="integer"&gt; 2 &lt;/cn&gt;
    &lt;pi/&gt;
  &lt;/apply&gt;
&lt;/math&gt;
</pre>

This problem exists for all four of the constants mentioned above, but is most commonly encountered in the context of "pi".  Currently, the only ways to avoid this problem are either to avoid using the strings "pi" and "Pi" in this context, or to avoid using the text-string expressions altogether and instead use ASTs.  All libSBML methods that accept text-string mathematical formulas have variants that accept ASTs instead.


## Differences in XML parser behavior

The different parsers supported by libSBML (Xerces, Expat, libxml2) behave slightly differently when reading files, and the differences are difficult for libSBML to hide.  The following are the differences of which we are currently aware:

<ol>

<li style="margin-bottom: 1em">Libxml2 version 2.6.16 on Mac&nbsp;OS&nbsp;X, which is the <strong>default version of libxml installed on Macs</strong> in <code>/usr/lib</code> up through at least Mac&nbsp;OS 10.5.8, fails to report uses of undefined namespaces in an XML document.  This means that a construct such as <code>n:attribute</code>, where <code>n</code> is a namespace prefix that is not defined, will be silently ignored.  As a result, libSBML cannot catch and report this error when libSBML has been configured with this version of libxml2.  We know of no workaround at this time if you are using a system with libxml2 2.6.16, except to compile your own copy of libxml2 or use another parser library.  (Incredibly enough, libxml 2.6.16 built from original sources on a Mac <em>does</em> report the error.  The only explanation is that that Apple ships a modified version of libxml 2.6.16 in versions of the operating system up through 10.5.8.)

<li style="margin-bottom: 1em">Expat and libxml2 tend to quit earlier than Xerces when they encounter an XML error in an input stream, whereas Xerces tends to process the input further and report an error as being on the element in which the XML error occurs.  The result is that the first error reported by libSBML is sometimes different depending on which of the underlying XML parsers is being used.  In our tests, this affects almost exclusively low-level XML syntax errors (such as start/end tag mismatches, unterminated strings) and not SBML errors per se, although a basic XML error can of course mask other, more substantive errors.  The exceptional cases (the reason for the "almost" in the previous sentence) concern SBML Level&nbsp;2 Versions&nbsp;3 and&nbsp;4 validation rules 10309 (detection of metaid syntax), and rules 10802, 10803, 21004 and 21005 (detection of disallowed XML constructs inside <code>&lt;notes&gt;</code> and <code>&lt;annotation&gt;</code> elements).</li>

<li style="margin-bottom: 1em">Some versions of libxml2 behave incorrectly when given a blank namespace (e.g., the use of <code>xmlns=" "</code>, with a space character).  Versions of libxml prior 2.7.7 will report this as an invalid or undefined XML namespace, but in fact a namespace URI containing a single space is valid (albeit not a very useful one).  This highlights another issue: different versions of the underlying XML parsers may behave differently in the face of unusual (though not necessarily illegal) inputs.

<li style="margin-bottom: 1em">Expat 2.1.0 appears to have a configuration issue.  If CMake is used to compile the Expat library but GNU <code>configure</code> is used to configure libSBML, <code>configure</code> will report the following:
<pre class="fragment">
checking for Expat version >= 1.95.8... 
*** The Expat header file (version 2.1.0) does not match
*** the Expat library found (version 2.0.1).
</pre>
However, if the GNU <code>./configure</code>, <code>make</code> & <code>make install</code> are also used to build the Expat library (i.e., instead of using CMake for them), the header mismatch is avoided.

</ol>


## Cannot report a failure of validation rule #10312

The SBML Level&nbsp;3 Version&nbsp;1 Core specification defines validation rule #10312 as being <em>The value of a "name" attribute must always conform to the syntax of type <code>string</code></em>.  Unfortunately, given the way that all three XML parser libraries (libxml2, Expat, and Xerces) work, it is impossible for libSBML to ever report this error directly.  The kinds of SBML input that would lead to a failure of this validation rule cause the XML parsers to report overly general errors of the "XML content not well formed" variety, and libSBML cannot determine the true root cause.  As a result, libSBML cannot detect when rule #10312 is breached.


## Different error number (either 20413 or 20409) may be reported depending on Level of SBML in use

In SBML Level&nbsp;3 Version&nbsp;1 Core, validation rule #20413 (concerning whether the ListOfUnits container element can be empty) subsumes what was validation rule #20409 in the specifications for SBML Level&nbsp;2 Versions&nbsp;2&ndash;4.  Rule #20409 does not exist in Level&nbsp;3.  The consequence of this difference in the specifications is that an application may receive different validation error numbers for the same situation depending on whether it is dealing with a Level&nbsp;2 or a Level&nbsp;3 model.


## Possible unexpected `make uninstall`

The libSBML <code>make uninstall</code> command on Linux, Mac&nbsp;OS, Cygwin, and Solaris only knows about the features <em>most recently</em> configured into libSBML.  If you run <code>configure</code>, then <code>make install</code>, then run <code>configure</code> again with different options, and finally try <code>make uninstall</code>, the result will be to attempt removing the files implied by the most recent run of <code>configure</code>, <em>not</em> the files installed by the <em>original</em> <code>make install</code>.


## Conversion to/from SBML Level 1 Version 1 is not supported

The method <code>setLevelAndVersion()</code> on the class <code>SBMLDocument</code> performs conversion between versions and levels of SBML (to the extent possible within technical and practical limits).  However, conversion to/from SBML Level&nbsp;1 Version&nbsp;1 is not supported.


## Line/column numbers are not always accurate

LibSBML includes methods to report the line and column number where an object or an error situation appears in a file.  However, the accuracy of the line and column numbers cannot be guaranteed by libSBML.  Many factors affect how accurate the line/column information ultimately is.  For example, sometimes, the underlying XML parsers can only report such information for the parent XML element where an error occurs, and not for the specific point where the problem occurs.  In other situations, some parsers report invalid line and/or column numbers altogether.  If this occurs and libSBML can detect that it has occurred, the line and/or column number reported by <code>SBMLError</code> and <code>XMLError</code> will be set to either <code>0</code> or the value of the maximum unsigned long integer representable on the platform where libSBML is running.  The probability that a <em>true</em> line or column number in a real-life SBML model would equal this value is vanishingly small; thus, if an application encounters these values in an XMLError object, it can assume no valid line/column number could be provided by libSBML in that situation.


## Sometimes, the `libsbml_wrap.cpp` files are not recreated

Many of the language bindings in libSBML are created using <a target="_blank" href="http://www.swig.org">SWIG</a>, a language wrapper generator. The output of SWIG for libSBML is a file named <code>libsbml_wrap.cpp</code> in the respective language binding's subdirectory (e.g., <code>src/bindings/java</code>), sometimes in combination with other files, depending on the language in question. If you obtained your copy of libSBML as a distribution archive (e.g., from <a target="_blank" href="https://sourceforge.net/projects/sbml/files/libsbml">SourceForge</a>), this file will already be present in the distribution. If, instead, you obtained your copy of libSBML from the SVN source tree, you will need to have SWIG available on your system in order to regenerate the <code>libsbml_wrap.cpp</code> file. In both cases, all things should work fine.

<em>If</em> you modify the libSBML source files yourself (and in particular, files upon which the SWIG binding code depends), the makefile rules <em>should</em> always automatically cause the appropriate <code>libsbml_wrap.cpp</code> files to be recreated. However, <em>sometimes</em> the makefile rules do not regenerate the wrapper files when they should. This happens very rarely, and under conditions that the libSBML developers have had a very hard time reproducing consistently. In some versions of libSBML, it seemed to happen slightly more often under cygwin.

When a version skew occurs with the language binding wrapper files, either the compilation phase or the link phase will fail, often with cryptic and mysterious errors about missing methods. Often it is possible to guess that the language bindings are the problem from the error messages.

The solution is to delete the <code>libsbml_wrap.cpp</code> file(s), and when the Java interface is involved, also delete the <code>src/bindings/java/java-files</code> subdirectory. Re-running make will regenerate the files and (if the problem was indeed due to the SWIG binding files being out of date) compilation/linking will work.

We emphasize that this problem should not affect normal users of libSBML, only the libSBML developers and those are are venturing into developing new features in libSBML.


## Some `libsbml_wrap.cpp` files produce compile-time warnings

As mentioned above, many of the language bindings in libSBML are created using <a target="_blank" href="http://www.swig.org">SWIG</a>, a language wrapper generator. The output of SWIG for libSBML is a file named <code>libsbml_wrap.cpp</code> in the respective language binding's subdirectory (e.g., <code>src/bindings/java</code>).

In some cases, the <code>libsbml_wrap.cpp</code> file produced by SWIG will cause compilers to issue warnings during compilation.  The following is an example from the Ruby language bindings compiled on Mac&nbsp;OS&nbsp;X 10.9 using plain <code>make</code>:

<pre class="fragment">
libsbml_wrap.cpp:4802:13: warning: unused variable 'r' [-Wunused-variable]
      VALUE r = Qnil;
            ^
libsbml_wrap.cpp:4957:9: warning: unused variable 'type' [-Wunused-variable]
  VALUE type = TYPE(obj);
        ^
</pre>

The warnings are about harmless issues.  Unfortunately, there is very little that libSBML can do about these warnings, since they come from code auto-generated by SWIG.


## MATLAB on Windows has issues with Unicode filenames

Using MATLAB on a Windows system unicode filenames can prove problematic.  There appears to be an issue with MATLAB failing to correctly pass along such filenames when typed directly into the workspace.  It is possible to use unicode filenames directly via the dialogs that OutputSBML / TranslateSBML open up; but only if the relevant executable and the file are in the same directory.

## Parallel builds with GNU `make` are not supported

Parallel GNU make builds of libSBML are not supported at this time.  Attempting to use the <nobr><code>-j</code></nobr> option with <code>make</code> will not work properly and will not complete, but will also not produce diagnostics that indicate the cause of the failure (thus making it difficult to understand what went wrong).  Do not use the <nobr><code>-j</code></nobr> option with GNU make.

## Bug in GCC 5.1 and 5.2 causes `free()` errors in Python interface

There is a <a href="https://gcc.gnu.org/bugzilla/show_bug.cgi?id=67557">known bug in GCC versions 5.1 and 5.2</a> which results in the problem that calling the copy constructor of a base class in the constructor of derived classes produces crashing code.  The problem manifests itself in libSBML when using a language binding such as the Python interface, and leads to the following error:

<pre class="fragment">
>>> from libsbml import *
>>> reader = SBMLReader()
>>> doc = reader.readSBML('MODEL1504280000_URNs.xml')
*** Error in `python`: free(): invalid pointer: 0x00007ffda7deb2a8 ***
Aborted (core dumped)
</pre>

There are four work-arounds for this problem:

<ol>
<li> Do not use <code>gcc</code> versions 5.1 or 5.2 (use a different version).
<li> Use the <code>clang</code> compiler instead of <code>gcc</code>.
<li> Use <code>gcc</code> with the option <code>-D_GLIBCXX_USE_CXX11_ABI=0</code>.
<li> Use <code>gcc</code> with the option <code>-fno-elide-constructors</code>.
</ol>


###
