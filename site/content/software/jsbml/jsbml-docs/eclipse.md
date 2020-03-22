+++
#=====================================================================
active = true
title = "Eclipse configuration for JSBML"
date = "2020-03-21"
layout = "single"
#=====================================================================
+++

To set up [Eclipse](https://www.eclipse.org) to use JSBML, in general, you have to add the `src`, `test` and `resources` folder to your Eclipse build path. In addition, you need to add `.jar` files included in the `lib` folder.

Then, you need to do an extra step to configure the annotation processor, as the different parsers in JSBML are registered automatically using java annotation.

To configure the annotation processor, follow the instructions in the page https://github.com/niko-rodrigue/spi/blob/wiki/EclipseSettings.md
The jar file of the annotation processor is located in the jsbml source tree at “jsbml”/core/lib/spi-full-0.2.4.jar.

You can run the `ParserManager` class to check that the list of parsers are not empty and that they contain the parsers you need.
