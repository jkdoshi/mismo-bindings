package com.sysdelphia.bindings.mismo.title;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;


public class PropertyLegalDescription {
  protected String _ID;

  protected String _TextDescription;

  protected String _Type;

  protected String _TypeOtherDescription;


  public void addPARCELIDENTIFICATION(ParcelIdentification parceLIDENTIFICATION) {
    parceLIDENTIFICATIONList.add(parceLIDENTIFICATION);
  }

  public ParcelIdentification getPARCELIDENTIFICATION(int index) {
    return (ParcelIdentification)parceLIDENTIFICATIONList.get( index );
  }

  public int sizePARCELIDENTIFICATIONList() {
    return parceLIDENTIFICATIONList.size();
  }

  public void addPLATTEDLAND(PlattedLand platteDLAND) {
    platteDLANDList.add(platteDLAND);
  }

  public PlattedLand getPLATTEDLAND(int index) {
    return (PlattedLand)platteDLANDList.get( index );
  }

  public int sizePLATTEDLANDList() {
    return platteDLANDList.size();
  }

  public void addUNPLATTEDLAND(UnPlattedLand unplatteDLAND) {
    unplatteDLANDList.add(unplatteDLAND);
  }

  public UnPlattedLand getUNPLATTEDLAND(int index) {
    return (UnPlattedLand)unplatteDLANDList.get( index );
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
