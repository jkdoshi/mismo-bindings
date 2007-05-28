package com.sysdelphia.bindings.mismo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;


public class TITLETITLEREQUESTType {
  protected TITLELENDERType lender;

  protected String _ID;

  protected String _ActionType;

  protected String titleOwnershipType;

  protected String titleOwnershipTypeOtherDescription;

  protected String namedInsuredType;

  protected String titleAssociationType;

  protected String titleAssociationTypeOtherDescription;

  protected String _Comment;

  protected String insuredName;

  protected String mismoVersionID;

  protected String officeIdentifier;

  protected String processorIdentifier;

  protected BigDecimal _ProposedTitleInsuranceCoverageAmount;

  protected Date requestedClosingDate;

  protected String requestedClosingTime;

  protected String vendorOrderIdentifier;

  protected String vendorTransactionIdentifier;


  public void addBORROWER(TITLEBORROWERType borrower) {
    borrowerList.add(borrower);
  }

  public TITLEBORROWERType getBORROWER(int index) {
    return (TITLEBORROWERType)borrowerList.get( index );
  }

  public int sizeBORROWERList() {
    return borrowerList.size();
  }

  public void addLOANPURPOSE(TITLELOANPURPOSEType loaNPURPOSE) {
    loaNPURPOSEList.add(loaNPURPOSE);
  }

  public TITLELOANPURPOSEType getLOANPURPOSE(int index) {
    return (TITLELOANPURPOSEType)loaNPURPOSEList.get( index );
  }

  public int sizeLOANPURPOSEList() {
    return loaNPURPOSEList.size();
  }

  public void addMORTGAGETERMS(TITLEMORTGAGETERMSType mortgagETERMS) {
    mortgagETERMSList.add(mortgagETERMS);
  }

  public TITLEMORTGAGETERMSType getMORTGAGETERMS(int index) {
    return (TITLEMORTGAGETERMSType)mortgagETERMSList.get( index );
  }

  public int sizeMORTGAGETERMSList() {
    return mortgagETERMSList.size();
  }

  public void addPROPERTY(TITLEPROPERTYType property) {
    propertyList.add(property);
  }

  public TITLEPROPERTYType getPROPERTY(int index) {
    return (TITLEPROPERTYType)propertyList.get( index );
  }

  public int sizePROPERTYList() {
    return propertyList.size();
  }

  public void addKEY(TITLEKEYType key) {
    keyList.add(key);
  }

  public TITLEKEYType getKEY(int index) {
    return (TITLEKEYType)keyList.get( index );
  }

  public int sizeKEYList() {
    return keyList.size();
  }

  public void add_PRODUCT(TITLETITLEREQUESTPRODUCTType _PRODUCT) {
    _PRODUCTList.add(_PRODUCT);
  }

  public TITLETITLEREQUESTPRODUCTType get_PRODUCT(int index) {
    return (TITLETITLEREQUESTPRODUCTType)_PRODUCTList.get( index );
  }

  public int size_PRODUCTList() {
    return _PRODUCTList.size();
  }

  public void addEXECUTION(TITLEEXECUTIONType execution) {
    executionList.add(execution);
  }

  public TITLEEXECUTIONType getEXECUTION(int index) {
    return (TITLEEXECUTIONType)executionList.get( index );
  }

  public int sizeEXECUTIONList() {
    return executionList.size();
  }

  public void addREALESTATEAGENT(TITLEREALESTATEAGENTType reaLESTATEAGENT) {
    reaLESTATEAGENTList.add(reaLESTATEAGENT);
  }

  public TITLEREALESTATEAGENTType getREALESTATEAGENT(int index) {
    return (TITLEREALESTATEAGENTType)reaLESTATEAGENTList.get( index );
  }

  public int sizeREALESTATEAGENTList() {
    return reaLESTATEAGENTList.size();
  }

  public void addPAYOFF(TITLEPAYOFFType payoff) {
    payoffList.add(payoff);
  }

  public TITLEPAYOFFType getPAYOFF(int index) {
    return (TITLEPAYOFFType)payoffList.get( index );
  }

  public int sizePAYOFFList() {
    return payoffList.size();
  }

  public void addSELLER(TITLESELLERType seller) {
    sellerList.add(seller);
  }

  public TITLESELLERType getSELLER(int index) {
    return (TITLESELLERType)sellerList.get( index );
  }

  public int sizeSELLERList() {
    return sellerList.size();
  }

  public TITLELENDERType getLENDER() {
    return this.lender;
  }

  public void setLENDER(TITLELENDERType lender) {
    this.lender = lender;
  }

  public void addEMBEDDEDFILE(TITLEEMBEDDEDFILEType embeddeDFILE) {
    embeddeDFILEList.add(embeddeDFILE);
  }

  public TITLEEMBEDDEDFILEType getEMBEDDEDFILE(int index) {
    return (TITLEEMBEDDEDFILEType)embeddeDFILEList.get( index );
  }

  public int sizeEMBEDDEDFILEList() {
    return embeddeDFILEList.size();
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public String get_ActionType() {
    return this._ActionType;
  }

  public void set_ActionType(String _ActionType) {
    this._ActionType = _ActionType;
  }

  public String getTitleOwnershipType() {
    return this.titleOwnershipType;
  }

  public void setTitleOwnershipType(String titleOwnershipType) {
    this.titleOwnershipType = titleOwnershipType;
  }

  public String getTitleOwnershipTypeOtherDescription() {
    return this.titleOwnershipTypeOtherDescription;
  }

  public void setTitleOwnershipTypeOtherDescription(String titleOwnershipTypeOtherDescription) {
    this.titleOwnershipTypeOtherDescription = titleOwnershipTypeOtherDescription;
  }

  public String getNamedInsuredType() {
    return this.namedInsuredType;
  }

  public void setNamedInsuredType(String namedInsuredType) {
    this.namedInsuredType = namedInsuredType;
  }

  public String getTitleAssociationType() {
    return this.titleAssociationType;
  }

  public void setTitleAssociationType(String titleAssociationType) {
    this.titleAssociationType = titleAssociationType;
  }

  public String getTitleAssociationTypeOtherDescription() {
    return this.titleAssociationTypeOtherDescription;
  }

  public void setTitleAssociationTypeOtherDescription(String titleAssociationTypeOtherDescription) {
    this.titleAssociationTypeOtherDescription = titleAssociationTypeOtherDescription;
  }

  public String get_Comment() {
    return this._Comment;
  }

  public void set_Comment(String _Comment) {
    this._Comment = _Comment;
  }

  public String getInsuredName() {
    return this.insuredName;
  }

  public void setInsuredName(String insuredName) {
    this.insuredName = insuredName;
  }

  public String getMISMOVersionID() {
    return this.mismoVersionID;
  }

  public void setMISMOVersionID(String mismoVersionID) {
    this.mismoVersionID = mismoVersionID;
  }

  public String getOfficeIdentifier() {
    return this.officeIdentifier;
  }

  public void setOfficeIdentifier(String officeIdentifier) {
    this.officeIdentifier = officeIdentifier;
  }

  public String getProcessorIdentifier() {
    return this.processorIdentifier;
  }

  public void setProcessorIdentifier(String processorIdentifier) {
    this.processorIdentifier = processorIdentifier;
  }

  public BigDecimal get_ProposedTitleInsuranceCoverageAmount() {
    return this._ProposedTitleInsuranceCoverageAmount;
  }

  public void set_ProposedTitleInsuranceCoverageAmount(BigDecimal _ProposedTitleInsuranceCoverageAmount) {
    this._ProposedTitleInsuranceCoverageAmount = _ProposedTitleInsuranceCoverageAmount;
  }

  public Date getRequestedClosingDate() {
    return this.requestedClosingDate;
  }

  public void setRequestedClosingDate(Date requestedClosingDate) {
    this.requestedClosingDate = requestedClosingDate;
  }

  public String getRequestedClosingTime() {
    return this.requestedClosingTime;
  }

  public void setRequestedClosingTime(String requestedClosingTime) {
    this.requestedClosingTime = requestedClosingTime;
  }

  public String getVendorOrderIdentifier() {
    return this.vendorOrderIdentifier;
  }

  public void setVendorOrderIdentifier(String vendorOrderIdentifier) {
    this.vendorOrderIdentifier = vendorOrderIdentifier;
  }

  public String getVendorTransactionIdentifier() {
    return this.vendorTransactionIdentifier;
  }

  public void setVendorTransactionIdentifier(String vendorTransactionIdentifier) {
    this.vendorTransactionIdentifier = vendorTransactionIdentifier;
  }

  protected ArrayList borrowerList = new ArrayList();

  protected ArrayList loaNPURPOSEList = new ArrayList();

  protected ArrayList mortgagETERMSList = new ArrayList();

  protected ArrayList propertyList = new ArrayList();

  protected ArrayList keyList = new ArrayList();

  protected ArrayList _PRODUCTList = new ArrayList();

  protected ArrayList executionList = new ArrayList();

  protected ArrayList reaLESTATEAGENTList = new ArrayList();

  protected ArrayList payoffList = new ArrayList();

  protected ArrayList sellerList = new ArrayList();

  protected ArrayList embeddeDFILEList = new ArrayList();

}
