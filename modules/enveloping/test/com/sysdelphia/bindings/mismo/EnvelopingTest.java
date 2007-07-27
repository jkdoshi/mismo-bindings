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
		mctx.setIndent(1, "\n", '\t');
		mctx.marshalDocument(requestGroup);
	}
	
	// Test for validating the parsed input values
	public void testRequestGroupValues() throws JiBXException{
		InputStream in = this.getClass().getResourceAsStream("REQUEST_GROUP_v2_4_Sample_1.xml");
		IBindingFactory factory = BindingDirectory.getFactory(RequestGroup.class);
		IUnmarshallingContext uctx = factory.createUnmarshallingContext();
		
		RequestGroup requestGroup = (RequestGroup) uctx.unmarshalDocument(in, null);
		checkForValues(requestGroup);
	}
	
	/*
	 * Method checkForValues which takes RequestGroup as input parameter
	 * Method checks for all the input values which comes under requestGroup tree
	 * in the Request Group input xml
	 */
	public void checkForValues(RequestGroup requestGroup){
		assertNotNull(requestGroup);
		assertEquals("2.4", requestGroup.getMISMOVersionID());
		assertEquals("{3F2504E0-4F89-11D3-9A0C-0305E82C3301}", requestGroup.get_Identifier());
		assertEquals("RG123", requestGroup.get_ID());
		
		RequestingParty requestingparty = requestGroup.getREQUESTINGPARTY(0);
		assertNotNull(requestingparty);
		assertEquals("Sample Lender", requestingparty.get_Name());
		assertEquals("789 Lender Avenue", requestingparty.get_StreetAddress());
		assertEquals("Suite 123", requestingparty.get_StreetAddress2());
		assertEquals("Milwaukee", requestingparty.get_City());
		assertEquals("WI", requestingparty.get_State());
		assertEquals("53202", requestingparty.get_PostalCode());
		assertEquals("{3J2504E0-4F89-11D3-9A0C-0305E82C3444}", requestingparty.get_Identifier());
		assertEquals("{9D021008-B9ED-40b6-9704-F81D94100E8D}", requestingparty.get_TransactionIdentifier());
		assertEquals("REQ123", requestingparty.get_ID());
		
		ContactDetail contactdetail = requestingparty.getCONTACTDETAIL(0);
		checkForContactDetailsValues(contactdetail, "Greg O'Welisten", "Tech", "Greg", "Welisten", "W", "1", "CD1");
		
		ContactPoint contactpoint = contactdetail.getCONTACTPOINT(0);
		checkForContactPointValues(contactpoint, null, "Phone", null, "201-348-4033", "N", null, null);
		contactpoint = contactdetail.getCONTACTPOINT(1);
		checkForContactPointValues(contactpoint, null, "Email", null, "gregowelisten@samplelender.com", "N", null, null);
		contactpoint = contactdetail.getCONTACTPOINT(2);
		checkForContactPointValues(contactpoint, "Other", "Other", "TwoCansOnAString", "gregowelisten@samplelender.com", "Y", "Play", "CP1");
		
		PreferredResponse preferredresponse = requestingparty.getPREFERREDRESPONSE(0);
		checkForPreferredResponse(preferredresponse, "PDF", "File", "70240023.pdf", "Y", "application/pdf", null, "PR1");
		preferredresponse = requestingparty.getPREFERREDRESPONSE(1);
		checkForPreferredResponse(preferredresponse,"Text", "SMTP", "DSmith@ABC.com", "N", "multipart/encrypted", null, "PR2");
		
		
		ReceivingParty receivingparty = requestGroup.getRECEIVINGPARTY(0);
		assertNotNull(receivingparty);
		assertEquals("Mortgage Insurance Company", receivingparty.get_Name());
		assertEquals("789 Homeownwership Avenue", receivingparty.get_StreetAddress());
		assertEquals("Suite 123", receivingparty.get_StreetAddress2());
		assertEquals("Milwaukee", receivingparty.get_City());
		assertEquals("WI", receivingparty.get_State());
		assertEquals("53202", receivingparty.get_PostalCode());
		assertEquals("{3F2504E0-4F89-11D3-9A0C-0305E82C3555}", receivingparty.get_Identifier());
		assertEquals("REC123", receivingparty.get_ID());
		
		
		SubmittingParty submittingparty = requestGroup.getSUBMITTINGPARTY(0);
		checkForSubmittingPartyValues(submittingparty, "1", "Sample L.O.S.", "losusername", "lospassword", 
				"IDLOS1", "{2C8B096C-15C1-4bc0-AA6B-24373ADAB8CD}", "SUB1");
		
		contactdetail = submittingparty.getCONTACTDETAIL(0);
		checkForContactDetailsValues(contactdetail, "Gloriasees Alot", "Tech", "Gloriasees", "Alot", null, "1", "CD2");
		contactpoint = contactdetail.getCONTACTPOINT(0);
		checkForContactPointValues(contactpoint, "Home", "Phone", null, "703-555-1212", "Y", null, null);
		contactpoint = contactdetail.getCONTACTPOINT(1);
		checkForContactPointValues(contactpoint, "Work", "Email", null, "gloriaseesalot@samplelos.com", "Y", null, "CP2");
		
		contactdetail = submittingparty.getCONTACTDETAIL(1);
		checkForContactDetailsValues(contactdetail, "Fred Smith", "Business", "Fred", "Smith", null, "2", "CD3");
		contactpoint = contactdetail.getCONTACTPOINT(0);
		checkForContactPointValues(contactpoint, null, "Phone", null, "201-348-4034", null, null, null);
		contactpoint = contactdetail.getCONTACTPOINT(1);
		checkForContactPointValues(contactpoint, null, "Email", null, "fsmith@samplelender.com", null, null, null);
		
		preferredresponse = submittingparty.getPREFERREDRESPONSE(0);
		checkForPreferredResponse(preferredresponse, "XML", "HTTPS", "https://testing.XYZWebPortalCompany.com/MiDataPost/post.asp", "N", null, "2.4", "PR3");
		preferredresponse = submittingparty.getPREFERREDRESPONSE(1);
		checkForPreferredResponse(preferredresponse, "Text", "HTTPS", "https://testing.XYZWebPortalCompany.com/MiDataPost/post.asp", "Y", null, null, "PR4");
		
		
		submittingparty = requestGroup.getSUBMITTINGPARTY(1);
		checkForSubmittingPartyValues(submittingparty, "2", "Sample Portal", "portalusername", "portalpassword", "IDPORTAL1", "{B27CEE5A-6857-406f-B847-C644D89BCEFA}", "SUB2");
		
		contactdetail = submittingparty.getCONTACTDETAIL(0);
		checkForContactDetailsValues(contactdetail, "Gaberuns abit", "Tech", "Gaberuns", "abit", null, "1", null);
		
		contactpoint = contactdetail.getCONTACTPOINT(0);
		checkForContactPointValues(contactpoint, null, "Phone", null, "202-456-1111", null, null, null);
		contactpoint = contactdetail.getCONTACTPOINT(1);
		checkForContactPointValues(contactpoint, null, "Email", null, "gaberunsabit@sampleportal.com", null, null, null);
		
		Request request = requestGroup.getREQUEST(0);
		assertNotNull(request);
		assertEquals("2002-01-08T17:19:01", request.getRequestDatetime());
		assertEquals("1234", request.getInternalAccountIdentifier());
		assertEquals("Login Text", request.getLoginAccountIdentifier());
		assertEquals("Password Text", request.getLoginAccountPassword());
		assertEquals("0001", request.getRequestingPartyBranchIdentifier());
		assertEquals("{3F2504E0-4F89-11D3-9A0C-0305E82C3666}", request.get_Identifier());
		assertEquals("REQ1", request.get_ID());
		
		Key key = request.getKEY(0);
		assertNotNull(key);
		assertEquals("Text", key.get_Name());
		assertEquals("Text", key.get_Value());
		assertEquals("KEY1", key.get_ID());
		
	}
	
	/*
	 * Method checkForContactDetailsValues which takes ContactDetail and other sub elements 
	 * as input parameters
	 * Method checks for all the input values which comes under ContactDetail tree
	 * in the Request Group input xml
	 */
	public void checkForContactDetailsValues(ContactDetail contactDetail, String name, String identifier, 
			String firstName, String lastName, String middleName, String sequenceIdentifier, String id){
		assertNotNull(contactDetail);
		assertEquals(name, contactDetail.get_Name());
		assertEquals(identifier, contactDetail.get_Identifier());
		assertEquals(firstName, contactDetail.get_FirstName());
		assertEquals(lastName, contactDetail.get_LastName());
		assertEquals(middleName, contactDetail.get_MiddleName());
		assertEquals(sequenceIdentifier, contactDetail.get_SequenceIdentifier());
		assertEquals(id, contactDetail.get_ID());
	}

	/*
	 * Method checkForContactPointValues which takes ContactPoint and other sub elements 
	 * as input parameters
	 * Method checks for all the input values which comes under ContactPoint tree
	 * in the Request Group input xml
	 */
	public void checkForContactPointValues(ContactPoint contactPoint, String roleType, 
			String type, String typeOtherDescription, String value, String preferenceIndicator, String roleTypeOtherDescription, String id){
		assertNotNull(contactPoint);
		assertEquals(roleType, contactPoint.get_RoleType());
		assertEquals(type, contactPoint.get_Type());
		assertEquals(typeOtherDescription, contactPoint.get_TypeOtherDescription());
		assertEquals(value, contactPoint.get_Value());
		assertEquals(preferenceIndicator, contactPoint.get_PreferenceIndicator());
		assertEquals(roleTypeOtherDescription, contactPoint.get_RoleTypeOtherDescription());
		assertEquals(id, contactPoint.get_ID());
	}
	
	/*
	 * Method checkForPreferredResponse which takes PreferredResponse and other sub elements 
	 * as input parameters
	 * Method checks for all the input values which comes under PreferredResponse tree
	 * in the Request Group input xml
	 */
	public void checkForPreferredResponse(PreferredResponse preferredResponse, String format, 
			String method, String destination, String useEmbeddedFileIndicator, String mIMEType, String versionIdentifier, String id){
		assertNotNull(preferredResponse);
		assertEquals(format, preferredResponse.get_Format());
		assertEquals(method, preferredResponse.get_Method());
		assertEquals(destination, preferredResponse.get_Destination());
		assertEquals(useEmbeddedFileIndicator, preferredResponse.get_UseEmbeddedFileIndicator());
		assertEquals(mIMEType, preferredResponse.getMIMEType());
		assertEquals(versionIdentifier, preferredResponse.get_VersionIdentifier());
		assertEquals(id, preferredResponse.get_ID());
	}
	
	/*
	 * Method checkForSubmittingPartyValues which takes SubmittingParty and other sub elements 
	 * as input parameters
	 * Method checks for all the input values which comes under SubmittingParty tree
	 * in the Request Group input xml
	 */
	public void checkForSubmittingPartyValues(SubmittingParty submittingParty, String sequenceIdentifier, 
			String name, String loginAccountIdentifier, String loginAccountPassword, String identifier, 
			String transactionIdentifier, String id){
		assertNotNull(submittingParty);
		assertEquals(sequenceIdentifier, submittingParty.get_SequenceIdentifier());
		assertEquals(name, submittingParty.get_Name());
		assertEquals(loginAccountIdentifier, submittingParty.getLoginAccountIdentifier());
		assertEquals(loginAccountPassword, submittingParty.getLoginAccountPassword());
		assertEquals(identifier, submittingParty.get_Identifier());
		assertEquals(transactionIdentifier, submittingParty.get_TransactionIdentifier());
		assertEquals(id, submittingParty.get_ID());
	}
}
