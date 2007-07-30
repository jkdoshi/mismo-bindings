package com.sysdelphia.bindings.mismo.title;

import java.io.InputStream;
import java.math.BigDecimal;

import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IMarshallingContext;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;

import com.sysdelphia.bindings.mismo.title.ContactDetail;
import com.sysdelphia.bindings.mismo.title.ContactPoint;
import com.sysdelphia.bindings.mismo.title.Key;
import com.sysdelphia.bindings.mismo.title.PreferredResponse;
import com.sysdelphia.bindings.mismo.title.ReceivingParty;
import com.sysdelphia.bindings.mismo.title.Request;
import com.sysdelphia.bindings.mismo.title.RequestGroup;
import com.sysdelphia.bindings.mismo.title.RequestingParty;
import com.sysdelphia.bindings.mismo.title.SubmittingParty;

import junit.framework.TestCase;

public class TitleTest extends TestCase {
	public void testRequestGroup() throws JiBXException{
		InputStream in = this.getClass().getResourceAsStream("TITLE_REQUEST_SAMPLE_1.xml");
		IBindingFactory factory = BindingDirectory.getFactory(RequestGroup.class);
		IUnmarshallingContext uctx = factory.createUnmarshallingContext();
		RequestGroup requestGroup = (RequestGroup)uctx.unmarshalDocument(in, null);
		IMarshallingContext mctx = factory.createMarshallingContext();
		mctx.setOutput(System.out, null);
		mctx.setIndent(1, "\n", '\t');
		mctx.marshalDocument(requestGroup);
	}
	
	// Test for validating the parsed input values
	public void testRequestGroupValues() throws JiBXException{
		InputStream in = this.getClass().getResourceAsStream("TITLE_REQUEST_SAMPLE_1.xml");
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
		assertEquals("2.3.1", requestGroup.getMISMOVersionID());
		assertEquals("ID000093", requestGroup.get_ID());
		
		RequestingParty requestingparty = requestGroup.getREQUESTINGPARTY(0);
		assertNotNull(requestingparty);
		assertEquals("String", requestingparty.get_City());
		assertEquals("String", requestingparty.get_Name());
		assertEquals("String", requestingparty.get_State());
		assertEquals("ID000094", requestingparty.get_ID());
		assertEquals("String", requestingparty.get_PostalCode());
		assertEquals("String", requestingparty.get_StreetAddress());
		assertEquals("String", requestingparty.get_StreetAddress2());
		
		
		ContactDetail contactdetail = requestingparty.getCONTACTDETAIL(0);
		checkForContactDetailsValues(contactdetail, "String", "ID000095");
		
		ContactPoint contactpoint = contactdetail.getCONTACTPOINT(0);
		checkForContactPointValues(contactpoint, "Y", "Home", "ID000096", "String", "Email", "String");
		
		PreferredResponse preferredresponse = requestingparty.getPREFERREDRESPONSE(0);
		checkForPreferredResponse(preferredresponse, "Other", "Fax", "String", "ID000097", "String", "String", "String", "Y", "String");
		
		ReceivingParty receivingparty = requestGroup.getRECEIVINGPARTY();
		assertNotNull(receivingparty);
		assertEquals("String", receivingparty.get_City());
		assertEquals("String", receivingparty.get_Name());
		assertEquals("String", receivingparty.get_State());
		assertEquals("ID000098", receivingparty.get_ID());
		assertEquals("String", receivingparty.get_Identifier());
		assertEquals("String", receivingparty.get_PostalCode());
		assertEquals("String", receivingparty.get_StreetAddress());
		assertEquals("String", receivingparty.get_StreetAddress2());
		
		contactdetail = receivingparty.getCONTACTDETAIL(0);
		checkForContactDetailsValues(contactdetail, "String", "ID000099");
		
		checkForContactPointValues(contactdetail.getCONTACTPOINT(0), "Y", "Home", "ID000100", "String", "Email", "String");
		
		SubmittingParty submittingparty = requestGroup.getSUBMITTINGPARTY(0);
		checkForSubmittingPartyValues(submittingparty, "String", "String", "String", "ID000101", "String", 
				"String", "String", "String", "String", "String", "String");
		
		contactdetail = submittingparty.getCONTACTDETAIL(0);
		checkForContactDetailsValues(contactdetail, "String","ID000102");
		contactpoint = contactdetail.getCONTACTPOINT(0);
		checkForContactPointValues(contactpoint, "Y", "Home", "ID000103", "String", "Email", "String");
		
		preferredresponse = submittingparty.getPREFERREDRESPONSE(0);
		checkForPreferredResponse(preferredresponse, "Other", "Fax", "String", "ID000104", "String", "String", "String", "Y", "String");
		

		Request request = requestGroup.getREQUEST(0);
		assertNotNull(request);
		assertEquals("String", request.getRequestingPartyBranchIdentifier());
		assertEquals("String", request.getRequestDatetime());
		assertEquals("ID000105", request.get_ID());
		assertEquals("String", request.getLoginAccountPassword());
		assertEquals("String", request.getInternalAccountIdentifier());
		assertEquals("String", request.getLoginAccountIdentifier());
		
		Key key = request.getKEY(0);
		assertNotNull(key);
		assertEquals("String", key.get_Name());
		assertEquals("String", key.get_Value());
		assertEquals("ID000106", key.get_ID());
		
		RequestData requestdata = request.getREQUESTDATA(0);
		assertNotNull(requestdata);
		
		TitleRequest titlerequest = requestdata.getTITLEREQUEST(0);
		assertNotNull(titlerequest);
		
		Borrower borrower = titlerequest.getBORROWER(0);
		checkForBorrowerValues(borrower, "1", "Shannon", "M", "Anderson", "222-22-4444", "S");
		BorrowerResidence residence = borrower.get_RESIDENCE(0);
		checkForBorrowerResidenceValues(residence, "444 Herring Rd", "Grayson", "GA", "30017", "ABC");
		contactpoint = borrower.getCONTACTPOINT(0);
		checkForContactPointValues(contactpoint, null, "Home", null, null, "Phone", "7322335445");
		contactpoint = borrower.getCONTACTPOINT(1);
		checkForContactPointValues(contactpoint, null, "Work", null, null, "Phone", "7324545885");
		
		borrower = titlerequest.getBORROWER(1);
		checkForBorrowerValues(borrower, "2", "Jacob", "M", "Anderson", "222-22-8888", "M");
		residence = borrower.get_RESIDENCE(0);
		checkForBorrowerResidenceValues(residence, "444 Herring Rd", "Grayson", "GA", "30017", "ABC");
		contactpoint = borrower.getCONTACTPOINT(0);
		checkForContactPointValues(contactpoint, null, "Home", null, null, "Phone", "7322338888");
		contactpoint = borrower.getCONTACTPOINT(1);
		checkForContactPointValues(contactpoint, null, "Work", null, null, "Phone", "7324559999");
		
		LoanPurpose loanpurpose = titlerequest.getLOANPURPOSE(0);
		assertNotNull(loanpurpose);
		assertEquals("80000.0", loanpurpose.getEstimatedCashOutAmount().toString());
		assertEquals("1st Mortgage", loanpurpose.getOtherLoanPurposeDescription());
		assertEquals("PrimaryResidence", loanpurpose.getPropertyUsageType());
		assertEquals("Refinance", loanpurpose.get_Type());
		
		MortgageTerm mortgageterms = titlerequest.getMORTGAGETERMS(0);
		assertNotNull(mortgageterms);
		assertEquals("320000", mortgageterms.getBaseLoanAmount().toString());
		assertEquals("FirstLien", mortgageterms.getLienPriorityType());
		
		Property property = titlerequest.getPROPERTY(0);
		assertNotNull(property);
		assertEquals("1111 Park Ave", property.get_StreetAddress());
		assertEquals("Bedford", property.get_City());
		assertEquals("IN", property.get_State());
		assertEquals("Lawrence", property.get_County());
		assertEquals("47421", property.get_PostalCode());
		assertEquals("XYZ", property.get_StreetAddress2());
		assertEquals("SingleFamily", property.get_TitleCategoryType());
		
		key = titlerequest.getKEY(0);
		assertNotNull(key);
		assertEquals("LIEN_HOLDER", key.get_Name());
		assertEquals("XYZ MORTGAGE", key.get_Value());
		
		key = titlerequest.getKEY(1);
		assertNotNull(key);
		assertEquals("TITLE_POLICY", key.get_Name());
		assertEquals("FULL ALTA", key.get_Value());
		
		Product product = titlerequest.get_PRODUCT(0);
		assertNotNull(product);
		ProductType productType = product.get_TYPE(0);
		assertNotNull(productType);
		assertEquals("346", productType.get_Description());
		assertEquals("XyzProductCode", productType.get_Identifier());
		productType = product.get_TYPE(1);
		assertNotNull(productType);
		assertEquals("80000.0", productType.get_Description());
		assertEquals("CombinedLoanAmount", productType.get_Identifier());
		
	}
	
	/*
	 * Method checkForContactDetailsValues which takes ContactDetail and other sub elements 
	 * as input parameters
	 * Method checks for all the input values which comes under ContactDetail tree
	 * in the Request Group input xml
	 */
	public void checkForContactDetailsValues(ContactDetail contactDetail, String name, String id){
		assertNotNull(contactDetail);
		assertEquals(name, contactDetail.get_Name());
		assertEquals(id, contactDetail.get_ID());
	}

	/*
	 * Method checkForContactPointValues which takes ContactPoint and other sub elements 
	 * as input parameters
	 * Method checks for all the input values which comes under ContactPoint tree
	 * in the Request Group input xml
	 */
	public void checkForContactPointValues(ContactPoint contactPoint, String preferenceIndicator, String roleType, 
			String id, String typeOtherDescription, String type, String value){
		assertNotNull(contactPoint);
		assertEquals(preferenceIndicator, contactPoint.get_PreferenceIndicator());
		assertEquals(roleType, contactPoint.get_RoleType());
		assertEquals(id, contactPoint.get_ID());
		assertEquals(typeOtherDescription, contactPoint.get_TypeOtherDescription());
		assertEquals(type, contactPoint.get_Type());
		assertEquals(value, contactPoint.get_Value());
	}
	
	/*
	 * Method checkForPreferredResponse which takes PreferredResponse and other sub elements 
	 * as input parameters
	 * Method checks for all the input values which comes under PreferredResponse tree
	 * in the Request Group input xml
	 */
	public void checkForPreferredResponse(PreferredResponse preferredResponse, String format, 
			String method, String destination, String id, String formatOtherDescription, String mIMEType, 
			String methodOther, String useEmbeddedFileIndicator, String versionIdentifier){
		assertNotNull(preferredResponse);
		assertEquals(format, preferredResponse.get_Format());
		assertEquals(method, preferredResponse.get_Method());
		assertEquals(destination, preferredResponse.get_Destination());
		assertEquals(id, preferredResponse.get_ID());
		assertEquals(formatOtherDescription, preferredResponse.get_FormatOtherDescription());
		assertEquals(mIMEType, preferredResponse.getMIMEType());
		assertEquals(methodOther, preferredResponse.get_MethodOther());
		assertEquals(useEmbeddedFileIndicator, preferredResponse.get_UseEmbeddedFileIndicator());
		assertEquals(versionIdentifier, preferredResponse.get_VersionIdentifier());
	}
	
	/*
	 * Method checkForSubmittingPartyValues which takes SubmittingParty and other sub elements 
	 * as input parameters
	 * Method checks for all the input values which comes under SubmittingParty tree
	 * in the Request Group input xml
	 */
	public void checkForSubmittingPartyValues(SubmittingParty submittingParty, String city, String name, 
			String state, String id, String sequenceIdentifier, String loginAccountPassword, String identifier, 
			String postalCode, String streetAddress, String streetAddress2, String loginAccountIdentifier){
		assertNotNull(submittingParty);
		assertEquals(city, submittingParty.get_City());
		assertEquals(name, submittingParty.get_Name());
		assertEquals(state, submittingParty.get_State());
		assertEquals(id, submittingParty.get_ID());
		assertEquals(sequenceIdentifier, submittingParty.get_SequenceIdentifier());
		assertEquals(loginAccountPassword, submittingParty.getLoginAccountPassword());
		assertEquals(identifier, submittingParty.get_Identifier());
		assertEquals(postalCode, submittingParty.get_PostalCode());
		assertEquals(streetAddress, submittingParty.get_StreetAddress());
		assertEquals(streetAddress2, submittingParty.get_StreetAddress2());
		assertEquals(loginAccountIdentifier, submittingParty.getLoginAccountIdentifier());
	}
	
	public void checkForBorrowerValues(Borrower borrower, String sequenceIdentifier, String firstName,
			String middleName, String lastName, String sSN, String nameSuffix){
		assertNotNull(borrower);
		assertEquals(sequenceIdentifier, borrower.get_SequenceIdentifier());
		assertEquals(firstName, borrower.get_FirstName());
		assertEquals(middleName, borrower.get_MiddleName());
		assertEquals(lastName, borrower.get_LastName());
		assertEquals(sSN, borrower.get_SSN());
		assertEquals(nameSuffix, borrower.get_NameSuffix());
	}
	
	public void checkForBorrowerResidenceValues(BorrowerResidence residence, String streetAddress, String city,
			String state, String postalCode, String streetAddress2){
		assertNotNull(residence);
		assertEquals(streetAddress, residence.get_StreetAddress());
		assertEquals(city, residence.get_City());
		assertEquals(state, residence.get_State());
		assertEquals(postalCode, residence.get_PostalCode());
		assertEquals(streetAddress2, residence.get_StreetAddress2());
	}
}
