package com.sysdelphia.bindings.mismo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;


public class TITLETITLEREQUESTPRODUCTType {
  protected String _ID;

  protected String _CategoryType;

  protected String _CategoryTypeOtherDescription;

  protected BigDecimal serviceRequestedPriceAmount;

  protected Date serviceRequestedCompletionDueDate;


  public void add_TYPE(TITLETITLEREQUESTPRODUCTTYPEType _TYPE) {
    _TYPEList.add(_TYPE);
  }

  public TITLETITLEREQUESTPRODUCTTYPEType get_TYPE(int index) {
    return (TITLETITLEREQUESTPRODUCTTYPEType)_TYPEList.get( index );
  }

  public int size_TYPEList() {
    return _TYPEList.size();
  }

  public void add_NAME(TITLETITLEREQUESTPRODUCTNAMEType _NAME) {
    _NAMEList.add(_NAME);
  }

  public TITLETITLEREQUESTPRODUCTNAMEType get_NAME(int index) {
    return (TITLETITLEREQUESTPRODUCTNAMEType)_NAMEList.get( index );
  }

  public int size_NAMEList() {
    return _NAMEList.size();
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public String get_CategoryType() {
    return this._CategoryType;
  }

  public void set_CategoryType(String _CategoryType) {
    this._CategoryType = _CategoryType;
  }

  public String get_CategoryTypeOtherDescription() {
    return this._CategoryTypeOtherDescription;
  }

  public void set_CategoryTypeOtherDescription(String _CategoryTypeOtherDescription) {
    this._CategoryTypeOtherDescription = _CategoryTypeOtherDescription;
  }

  public BigDecimal getServiceRequestedPriceAmount() {
    return this.serviceRequestedPriceAmount;
  }

  public void setServiceRequestedPriceAmount(BigDecimal serviceRequestedPriceAmount) {
    this.serviceRequestedPriceAmount = serviceRequestedPriceAmount;
  }

  public Date getServiceRequestedCompletionDueDate() {
    return this.serviceRequestedCompletionDueDate;
  }

  public void setServiceRequestedCompletionDueDate(Date serviceRequestedCompletionDueDate) {
    this.serviceRequestedCompletionDueDate = serviceRequestedCompletionDueDate;
  }

  protected ArrayList _TYPEList = new ArrayList();

  protected ArrayList _NAMEList = new ArrayList();

}
