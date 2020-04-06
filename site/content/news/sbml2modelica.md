+++
title   = "SBML2Modelica released"
authors = ["Mike Hucka"]
date    = 2019-12-19
summary = "SBML2Modelica can generate Modelica code from an SBML model."
+++

The [Modelica Language](https://www.modelica.org/modelicalanguage) is a non-proprietary, object-oriented, equation based language to conveniently model complex physical systems containing, such as mechanical, electrical, electronic, hydraulic, thermal, control, electric power or process-oriented subcomponents. Modelica Simulation Environments are available commercially and free of charge, such as CATIA Systems, Dymola, LMS AMESim, JModelica.org, MapleSim, MWorks, OpenModelica, SCICOS, SimulationX, and Wolfram SystemModeler.

[SBML2Modelica](https://bitbucket.org/mclab/sbml2modelica/src/master/) is a tool written in Java that translates biochemical models written in System Biology Markup Language (SBML) Version&nbsp;3 Level&nbsp;2 into well-structured, user-intelligible, easily-modifiable Modelica models.  The code of SBML2Modelica can also be used as a library, which provides a language-independent data structure to represent an input SBML model, as well as classes and methods for the generation of Modelica code.  The accompanying tool [SBML2FMU](https://bitbucket.org/mclab/sbml2modelica/src/master/) is a helper tool that can produce, in one shot, a Functional Mockup Unit (FMU) from an SBML model, by leveraging the JModelica API.

You can find out more about SBML2Modelica from the [project website](https://bitbucket.org/mclab/sbml2modelica) as well as the following 2019 paper by Maggioli, Mancini and Tronci:

{{< reference title="SBML2Modelica: integrating biochemical models within open-standard simulation ecosystems" authors="F. Maggioli,  T. Mancini,  E. Tronci." pub="_Bioinformatics_ btz860, https://doi.org/10.1093/bioinformatics/btz860, 2019" link="https://doi.org/10.1093/bioinformatics/btz860" >}}


