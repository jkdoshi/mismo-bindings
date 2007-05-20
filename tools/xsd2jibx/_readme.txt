This directory contains xsd2jibx, which helps us generate Java sources and
the JiBX bindings from the XSD grammar. But generated code and bindings are
just a starting point. We have to then modify them to make it fit our needs.
We use the "xsd2jibx" target in the Ant build (build.xml) to generate the
sources and the bindings.

We do sometimes have to edit the XSD before xsd2jibx would be able to process
it.

This is an outdated version of xsd2jibx, which will eventually replaced with
other tools from JiBX family. Also, it requires jibx-1.1.3, rather than the
most current one. That is why we have copied version 1.1.3 of jibx-run.jar
and xpp3.jar in this directory, rather than pointing to the main one, because
our main JiBX distribution is more recent than version 1.1.3.
