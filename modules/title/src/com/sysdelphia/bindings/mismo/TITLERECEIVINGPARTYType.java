package com.sysdelphia.bindings.mismo;

import java.util.ArrayList;


public class TITLERECEIVINGPARTYType {
  protected String _ID;

  protected String _Name;

  protected String _StreetAddress;

  protected String _StreetAddress2;

  protected String _City;

  protected String _State;

  protected String _PostalCode;

  protected String _Identifier;


  public void addCONTACTDETAIL(TITLECONTACTDETAILType contacTDETAIL) {
    contacTDETAILList.add(contacTDETAIL);
  }

  public TITLECONTACTDETAILType getCONTACTDETAIL(int index) {
    return (TITLECONTACTDETAILType)contacTDETAILList.get( index );
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

  public String get_Name() {
    return this._Name;
  }

  public void set_Name(String _Name) {
    this._Name = _Name;
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

  public String get_Identifier() {
    return this._Identifier;
  }

  public void set_Identifier(String _Identifier) {
    this._Identifier = _Identifier;
  }

  protected ArrayList contacTDETAILList = new ArrayList();

}
