# mismo-bindings User Guide #

This document gives the overview on how to use the mismo-bindings toolkit. If you still have questions, please feel free to email us at [opensource@sysdelphia.com](mailto:opensource@sysdelphia.com).

# What is "mismo-bindings" project? #
It is a toolkit (a collection of libraries and utilities), rather than a "framework" (frameworks put restrictions on applications that use them, we don't), for developing Java applications (we do intend to support .NET at a later stage) that deal with (consumer, produce) XML documents written according to [MISMO](http://www.mismo.org) XML specifications. You will be able to convert MISMO XML documents into Java Beans and back to XML.

# Getting Familiar with MISMO specifications #
  * Read the [General Implementation Guide](http://www.mismo.org/files/mismo/MISMOGeneralImplementationGuidev2.pdf)
  * Optionally, read the [XML Design Rules and Guidelines](http://www.mismo.org/files/mismo/MISMOXMLDesignRulesandGuidelines,RC10.pdf)
  * To do any serious MISMO XML development, you will also need a copy of the specification you are going to work with. A bundle of all specifications can be downloaded from http://www.mismo.org/files/mismo/MISMOSpring2007Release.zip.

# Getting Started with MISMO Bindings Project #
  1. First, download latest release from the [downloads area](http://code.google.com/p/mismo-bindings/downloads/list).
  1. Unzip the ZIP file into a new directory named "mismo-bindings"
  1. An Eclipse (Java IDE) project is already included (you'll need Eclipse 3.2+), but if you have your own favorite IDE, you'll have to create a project.
  1. A sample test client is [com.sysdelphia.bindings.mismo.EnvelopingTest](http://mismo-bindings.googlecode.com/svn/trunk/modules/enveloping/test/com/sysdelphia/bindings/mismo/EnvelopingTest.java) in the "modules/enveloping/test" source folder.
  1. Make sure the code is compile either using IDE, or using Ant and the included "build.xml" file.
  1. Run the above test. It should pass.