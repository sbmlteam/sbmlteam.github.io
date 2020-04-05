--- # -*- mode: markdown -*-
#=====================================================================
active: true
title: "Systems Biology Format Converter (SBFC)"
date: 2020-03-14
layout: "single"
#=====================================================================
---

{{< software-icon file="/img/sbfc-logo.png" >}}

The Systems Biology Format Converter (SBFC) is both a framework and an online service for converting between formats used in systems biology.  The framework is written in Java and can be used as a standalone executable or as web service. The SBFC framework currently supports conversion from SBML to [BioPAX](http://www.biopax.org) Levels&nbsp;2 and&nbsp;3, [MATLAB](https://www.mathworks.com/products/matlab.html), [Octave](https://www.gnu.org/software/octave/), [XPP](http://www.math.pitt.edu/~bard/xpp/xpp.html), [GraphViz](https://www.graphviz.org), and [APM](http://apmonitor.com).  SBFC is free software distributed under the terms of the [LGPL](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html). The lead author of SBFC is [Nicholas Rodriguez](https://www.babraham.ac.uk/people/member/278), but it is a collaborative project and we hope that other developers will create new modules to support more formats.

{{< software-links download="https://sourceforge.net/projects/sbfc/files/" website="http://sbfc.sourceforge.net/mediawiki/index.php/Main_Page" tracker="https://sourceforge.net/p/sbfc/bugs/" forum="https://groups.google.com/forum/#!forum/sbfc-forum" repo="https://sourceforge.net/p/sbfc/code/HEAD/tree/" >}}

User and developer manuals for SBFC are also available. They can be downloaded from the following web links:

* [SBFC User Manual](https://sourceforge.net/p/sbfc/code/HEAD/tree/trunk/doc/sbfc_manual/sbfc_user_manual.pdf?format=raw)
* [SBFC Developer Manual](https://sourceforge.net/p/sbfc/code/HEAD/tree/trunk/doc/sbfc_manual/sbfc_developer_manual.pdf?format=raw)


## Please cite the paper if you use SBFC or the SBFC framework

Citations are crucial to our ability to justify continued development of SBFC, as well as our academic careers. If you use SBFC and you publish papers about your software, we ask that you please cite the SBFC papers:

{{% notice %}}
Gaël Jalowicki, Nicolas Rodriguez, Martina Kutmon, Jean-Baptiste Pettit, Lu Li, Arnaud Henry, Kedar Nath Natarajan, Camille Laibe, Chris T. Evelo, and Nicolas Le&nbsp;Novère. (2011) The System Biology Format Converter. _Nature Precedings_, [https://doi.org/10.1038/npre.2011.6363.1](https://doi.org/10.1038/npre.2011.6363.1).
{{% /notice %}}

{{% notice %}}
Martina Kutmon and Nicolas Rodriguez (2011). The System Biology Format Converter Framework. _Nature Precedings_, [https://doi.org/10.1038/npre.2011.6370.1](https://doi.org/10.1038/npre.2011.6370.1)
{{% /notice %}}


## Using SBFC (either as a standalone application or a library)

Download the latest copy of the SBFC distribution or a specific converter of interest from the [SBFC download page](https://sourceforge.net/projects/sbfc/files) on SourceForge. After downloading and uncompressing the package, you can put the extracted folder where you prefer. We suggest you create a folder containing the model you need to convert inside the SBFC folder.

The distribution includes a number of script files for Linux and Windows to run SBFC as a standalone program.  Alternatively, you can include SBFC within another Java program.  Put the JAR file in the library folder of your program and add this file to the Java program library path required for compilation. If you have downloaded the standalone version of SBFC, you do not need to do anything else. Otherwise, you should also install the dependencies libraries required by SBFC.

More information is available from the [SBFC website and wiki](http://sbfc.sourceforge.net/mediawiki/index.php?title=Main_Page).


## Using the SBFC web service

Systems biology models can also be converted online using the SBFC web service.  Two modes are available:

* _Via a web browser_. This approach uses the cluster of computer machines at the EBI. Please visit the SBFC web service page at http://www.ebi.ac.uk/biomodels/tools/converters/.  Models can be converted via three input methods: file upload, URL reference, or copy/paste. Once the conversion jobs are started, the results can be downloaded for 72 hours after the conversion finished. For privacy reasons, neither the original nor the converted models are kept on the servers for a period longer than 72 hours.

* _Via the Java class `ConverterLink`_. This class allows the user to run a conversion job and get the converted model directly as the return value of a method. This is convenient if SBFC is integrated into a software application. Depending on user requirements, two types of methods for submitting conversion jobs can be selected within the class `ConverterLink`.  Blocking calls start a conversion job and wait until the model is converted and returned from the web server.  Alternatively, nonblocking calls start a conversion job and immediately return a `ConversionId` object that can be checked later another method.

## Converters currently supported

<figure>
<img width="95%" src="http://sbfc.sourceforge.net/mediawiki/images/2/29/Sbfc_overview.png">
</figure>


## More about SBFC

This page only provides a summary of SBFC. Much more information is available from the [SBFC home page and wiki](http://sbfc.sourceforge.net/mediawiki/index.php?title=Main_Page), including examples, a user manual, a developer manual, links to bug and feature request trackers
