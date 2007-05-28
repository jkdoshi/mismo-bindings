package com.sysdelphia.bindings.mismo;

import java.math.BigDecimal;
import java.util.ArrayList;


public class TITLEPAYOFFType {
  protected String _ID;

  protected String _SequenceIdentifier;

  protected String _ActionType;

  protected String _ActionTypeOtherDescription;

  protected String _AccountNumberIdentifier;

  protected BigDecimal _Amount;

  protected String liabilityType;

  protected String liabilityTypeOtherDescription;

  protected String lienPriorityType;


  public void addPAYEE(TITLEPAYEEType payee) {
    payeeList.add(payee);
  }

  public TITLEPAYEEType getPAYEE(int index) {
    return (TITLEPAYEEType)payeeList.get( index );
  }

  public int sizePAYEEList() {
    return payeeList.size();
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public String get_SequenceIdentifier() {
    return this._SequenceIdentifier;
  }

  public void set_SequenceIdentifier(String _SequenceIdentifier) {
    this._SequenceIdentifier = _SequenceIdentifier;
  }

  public String get_ActionType() {
    return this._ActionType;
  }

  public void set_ActionType(String _ActionType) {
    this._ActionType = _ActionType;
  }

  public String get_ActionTypeOtherDescription() {
    return this._ActionTypeOtherDescription;
  }

  public void set_ActionTypeOtherDescription(String _ActionTypeOtherDescription) {
    this._ActionTypeOtherDescription = _ActionTypeOtherDescription;
  }

  public String get_AccountNumberIdentifier() {
    return this._AccountNumberIdentifier;
  }

  public void set_AccountNumberIdentifier(String _AccountNumberIdentifier) {
    this._AccountNumberIdentifier = _AccountNumberIdentifier;
  }

  public BigDecimal get_Amount() {
    return this._Amount;
  }

  public void set_Amount(BigDecimal _Amount) {
    this._Amount = _Amount;
  }

  public String getLiabilityType() {
    return this.liabilityType;
  }

  public void setLiabilityType(String liabilityType) {
    this.liabilityType = liabilityType;
  }

  public String getLiabilityTypeOtherDescription() {
    return this.liabilityTypeOtherDescription;
  }

  public void setLiabilityTypeOtherDescription(String liabilityTypeOtherDescription) {
    this.liabilityTypeOtherDescription = liabilityTypeOtherDescription;
  }

  public String getLienPriorityType() {
    return this.lienPriorityType;
  }

  public void setLienPriorityType(String lienPriorityType) {
    this.lienPriorityType = lienPriorityType;
  }

  protected ArrayList payeeList = new ArrayList();

}
