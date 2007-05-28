package com.sysdelphia.bindings.mismo;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;


public class TITLEPROPERTYLEGALDESCRIPTIONType {
  protected String _ID;

  protected String _TextDescription;

  protected String _Type;

  protected String _TypeOtherDescription;


  public void addPARCELIDENTIFICATION(TITLEPARCELIDENTIFICATIONType parceLIDENTIFICATION) {
    parceLIDENTIFICATIONList.add(parceLIDENTIFICATION);
  }

  public TITLEPARCELIDENTIFICATIONType getPARCELIDENTIFICATION(int index) {
    return (TITLEPARCELIDENTIFICATIONType)parceLIDENTIFICATIONList.get( index );
  }

  public int sizePARCELIDENTIFICATIONList() {
    return parceLIDENTIFICATIONList.size();
  }

  public void addPLATTEDLAND(TITLEPLATTEDLANDType platteDLAND) {
    platteDLANDList.add(platteDLAND);
  }

  public TITLEPLATTEDLANDType getPLATTEDLAND(int index) {
    return (TITLEPLATTEDLANDType)platteDLANDList.get( index );
  }

  public int sizePLATTEDLANDList() {
    return platteDLANDList.size();
  }

  public void addUNPLATTEDLAND(TITLEUNPLATTEDLANDType unplatteDLAND) {
    unplatteDLANDList.add(unplatteDLAND);
  }

  public TITLEUNPLATTEDLANDType getUNPLATTEDLAND(int index) {
    return (TITLEUNPLATTEDLANDType)unplatteDLANDList.get( index );
  }

  public int sizeUNPLATTEDLANDList() {
    return unplatteDLANDList.size();
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public String get_TextDescription() {
    return this._TextDescription;
  }

  public void set_TextDescription(String _TextDescription) {
    this._TextDescription = _TextDescription;
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

  protected ArrayList parceLIDENTIFICATIONList = new ArrayList();

  protected ArrayList platteDLANDList = new ArrayList();

  protected ArrayList unplatteDLANDList = new ArrayList();

}
