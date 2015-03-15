This project provides bindings of MISMO XML documents to Java Beans. Later we may provide bindings in .NET and other platforms as well.

# What is MISMO? #
_MISMO_ is short for **Mortgage Industry Standards Maintenance Organization**. It is a group mortgage industry participants that define and promote common standards across the industry. As part of their mission, they also define **XML grammars** (DTDs or W3C Schemas) that define the structure of XML documents that describe industry data (e.g. loan application, credit request, credit report, flood certificate, title etc.) and the rules governing it.

You can download the entire collection of their specifications at http://www.mismo.org/files/mismo/MISMOSpring2007Release.zip

# What is "mismo-bindings" project? #
There are several DTDs and W3C Schemas published by MISMO. This projects aims to ...
  * create Java classes that model those XML structures
  * create Java/XML bindings to convert XML documents to Java Beans and Java Beans to XML documents
  * create other utilities that developers working with MISMO (and perhaps other XML documents) will find useful
  * at a later stage, do the same for .NET

In other words, **mismo-bindings is a toolkit you'd use to develop applications that work with MISMO XML documents**.

# Features #
  * Mapping of Java Beans to XML elements and attributes and back. This means you can unmarshal an XML document into a graph of Java Bean instances (not DOM tree) and also marshal the Java Bean instance graph back into XML.
  * More natural naming of Java Bean classes and their properties. If you use automated code generation tools, it will not be as natural, because ours is done by hand (we do start out with generated code, but we then refactor it extensively by hand).
  * More expressive relationship between nodes in the graph. By that we mean that if an attributes "points to" another element in the document (using IDREF or IDREFS), we provide not only properties that provide the values of the IDs, but also the actual bean instance representing the element that is being pointed to. In other words, if an "ASSET" element has a "BorrowerID" attribute with value "ssn111111111", the "borrowerID" property will give the String value "ssn111111111", but there will be another property named "borrower" on the same class that is a reference to the actual Borrower instance "ssn111111111" points to.
  * More type-safe properties. In DOM, everything looks like a String. We create our mappings such that not just Strings, but Dates, Booleans, ints/Integers, BigDecimals and doubles/Doubles are represented when appropriate.

As we said, we want to make it very easy to create applications that deal with MISMO XML documents.

# Documentation #
The following documents are available ...
  * UserGuide
  * DeveloperGuide (read the UserGuide first)

# Technology Stack #
Currently, we use and support the following technologies. This may change over time ...

| **Software** | **Version** | **Comments** |
|:-------------|:------------|:-------------|
| JDK | 1.5 | although we don't use any special features of JDK 1.5, but simply haven't tested with prior versions |
| JiBX | 1.1.5 | XML binding framework - high performance, low memory usage |
| Ant | 1.6 | for building/compiling |
| W3C Schema| ? | XSD (W3C Schema) rather than DTD, because XSD are more evolved |
| JUnit | 1.2.8 | for Unit Testing with assertions |

# About Us #
We are a group of veteran developers with decades of industry experience (most of it in the Finance and Mortgage industry) who want to provide free, common technology to the industry so no one has to keep re-inventing the wheel. When foundational technology is given to you for free, you will be able to focus on creating better products for your customers.

  * Jitesh Doshi is a Principal Architect and Partner at Sysdelphia, Inc.
  * Nagaraj Poojary is a Senior Consultant at Sysdelphia, Inc.
  * Sunitha Sreedaran is a Consultant at Sysdelphia, Inc.

If you have a question or comment, please email [opensource@sysdelphia.com](mailto:opensource@sysdelphia.com).