package com.sysdelphia.bindings.mismo;

import java.util.ArrayList;


public class ContactDetail {
  protected String _Name;

  protected String _Identifier;

  protected String _FirstName;

  protected String _LastName;

  protected String _MiddleName;

  protected String _NameSuffix;

  protected String _SequenceIdentifier;

  protected String _ID;


  public void addCONTACTPOINT(ContactPoint contacTPOINT) {
    contacTPOINTList.add(contacTPOINT);
  }

  public ContactPoint getCONTACTPOINT(int index) {
    return (ContactPoint)contacTPOINTList.get( index );
  }

  public int sizeCONTACTPOINTList() {
    return contacTPOINTList.size();
  }

  public String get_Name() {
    return this._Name;
  }

  public void set_Name(String _Name) {
    this._Name = _Name;
  }

  public String get_Identifier() {
    return this._Identifier;
  }

  public void set_Identifier(String _Identifier) {
    this._Identifier = _Identifier;
  }

  public String get_FirstName() {
    return this._FirstName;
  }

  public void set_FirstName(String _FirstName) {
    this._FirstName = _FirstName;
  }

  public String get_LastName() {
    return this._LastName;
  }

  public void set_LastName(String _LastName) {
    this._LastName = _LastName;
  }

  public String get_MiddleName() {
    return this._MiddleName;
  }

  public void set_MiddleName(String _MiddleName) {
    this._MiddleName = _MiddleName;
  }

  public String get_NameSuffix() {
    return this._NameSuffix;
  }

  public void set_NameSuffix(String _NameSuffix) {
    this._NameSuffix = _NameSuffix;
  }

  public String get_SequenceIdentifier() {
    return this._SequenceIdentifier;
  }

  public void set_SequenceIdentifier(String _SequenceIdentifier) {
    this._SequenceIdentifier = _SequenceIdentifier;
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  protected ArrayList contacTPOINTList = new ArrayList();

}
