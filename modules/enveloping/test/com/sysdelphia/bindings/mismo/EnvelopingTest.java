package com.sysdelphia.bindings.mismo;

import java.io.InputStream;

import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IMarshallingContext;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;

import junit.framework.TestCase;

public class EnvelopingTest extends TestCase {
	public void testRequestGroup() throws JiBXException {
		InputStream in = this.getClass().getResourceAsStream("REQUEST_GROUP_v2_4_Sample_1.xml");
		IBindingFactory factory = BindingDirectory.getFactory(RequestGroup.class);
		IUnmarshallingContext uctx = factory.createUnmarshallingContext();
		RequestGroup requestGroup = (RequestGroup) uctx.unmarshalDocument(in, null);
		IMarshallingContext mctx = factory.createMarshallingContext();
		mctx.setOutput(System.out, null);
		mctx.marshalDocument(requestGroup);
	}
}
