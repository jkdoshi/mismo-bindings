package com.sysdelphia.bindings.mismo.title;

import java.util.ArrayList;



public class RealEstateAgent {
  protected String _ID;

  protected String _Type;

  protected String _TypeOtherDescription;

  protected String _UnparsedName;

  protected String _StreetAddress;

  protected String _StreetAddress2;

  protected String _City;

  protected String _State;

  protected String _PostalCode;

  protected String _County;

  protected String _Country;


  public void addCONTACTDETAIL(ContactDetail contacTDETAIL) {
    contacTDETAILList.add(contacTDETAIL);
  }

  public ContactDetail getCONTACTDETAIL(int index) {
    return (ContactDetail)contacTDETAILList.get( index );
  }

  public int sizeCONTACTDETAILList() {
    return contacTDETAILList.size();
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public String get_Type() {
    return this._Type;
  }

  public void set_Type(String _Type) {
    this._Type = _Type;
  }

  public String get_TypeOtherDescription() {
    return this._TypeOtherDescription;
  }

  public void set_TypeOtherDescription(String _TypeOtherDescription) {
    this._TypeOtherDescription = _TypeOtherDescription;
  }

  public String get_UnparsedName() {
    return this._UnparsedName;
  }

  public void set_UnparsedName(String _UnparsedName) {
    this._UnparsedName = _UnparsedName;
  }

  public String get_StreetAddress() {
    return this._StreetAddress;
  }

  public void set_StreetAddress(String _StreetAddress) {
    this._StreetAddress = _StreetAddress;
  }

  public String get_StreetAddress2() {
    return this._StreetAddress2;
  }

  public void set_StreetAddress2(String _StreetAddress2) {
    this._StreetAddress2 = _StreetAddress2;
  }

  public String get_City() {
    return this._City;
  }

  public void set_City(String _City) {
    this._City = _City;
  }

  public String get_State() {
    return this._State;
  }

  public void set_State(String _State) {
    this._State = _State;
  }

  public String get_PostalCode() {
    return this._PostalCode;
  }

  public void set_PostalCode(String _PostalCode) {
    this._PostalCode = _PostalCode;
  }

  public String get_County() {
    return this._County;
  }

  public void set_County(String _County) {
    this._County = _County;
  }

  public String get_Country() {
    return this._Country;
  }

  public void set_Country(String _Country) {
    this._Country = _Country;
  }

  protected ArrayList contacTDETAILList = new ArrayList();

}
