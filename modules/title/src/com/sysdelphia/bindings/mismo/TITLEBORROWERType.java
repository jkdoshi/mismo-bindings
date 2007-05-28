package com.sysdelphia.bindings.mismo;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;


public class TITLEBORROWERType {
  protected String _ID;

  protected String _SequenceIdentifier;

  protected String nonPersonEntityIndicator;

  protected String _FirstName;

  protected String _MiddleName;

  protected String _LastName;

  protected String _NameSuffix;

  protected String _UnparsedName;

  protected String _SSN;

  protected String maritalStatusType;

  protected String _USATaxPayerIdentificationNumber;


  public void add_ALIAS(TITLEBORROWERALIASType _ALIAS) {
    _ALIASList.add(_ALIAS);
  }

  public TITLEBORROWERALIASType get_ALIAS(int index) {
    return (TITLEBORROWERALIASType)_ALIASList.get( index );
  }

  public int size_ALIASList() {
    return _ALIASList.size();
  }

  public void add_RESIDENCE(TITLEBORROWERRESIDENCEType _RESIDENCE) {
    _RESIDENCEList.add(_RESIDENCE);
  }

  public TITLEBORROWERRESIDENCEType get_RESIDENCE(int index) {
    return (TITLEBORROWERRESIDENCEType)_RESIDENCEList.get( index );
  }

  public int size_RESIDENCEList() {
    return _RESIDENCEList.size();
  }

  public void addNONPERSONENTITYDETAIL(TITLENONPERSONENTITYDETAILType noNPERSONENTITYDETAIL) {
    noNPERSONENTITYDETAILList.add(noNPERSONENTITYDETAIL);
  }

  public TITLENONPERSONENTITYDETAILType getNONPERSONENTITYDETAIL(int index) {
    return (TITLENONPERSONENTITYDETAILType)noNPERSONENTITYDETAILList.get( index );
  }

  public int sizeNONPERSONENTITYDETAILList() {
    return noNPERSONENTITYDETAILList.size();
  }

  public void addCONTACTPOINT(TITLECONTACTPOINTType contacTPOINT) {
    contacTPOINTList.add(contacTPOINT);
  }

  public TITLECONTACTPOINTType getCONTACTPOINT(int index) {
    return (TITLECONTACTPOINTType)contacTPOINTList.get( index );
  }

  public int sizeCONTACTPOINTList() {
    return contacTPOINTList.size();
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

  public String getNonPersonEntityIndicator() {
    return this.nonPersonEntityIndicator;
  }

  public void setNonPersonEntityIndicator(String nonPersonEntityIndicator) {
    this.nonPersonEntityIndicator = nonPersonEntityIndicator;
  }

  public String get_FirstName() {
    return this._FirstName;
  }

  public void set_FirstName(String _FirstName) {
    this._FirstName = _FirstName;
  }

  public String get_MiddleName() {
    return this._MiddleName;
  }

  public void set_MiddleName(String _MiddleName) {
    this._MiddleName = _MiddleName;
  }

  public String get_LastName() {
    return this._LastName;
  }

  public void set_LastName(String _LastName) {
    this._LastName = _LastName;
  }

  public String get_NameSuffix() {
    return this._NameSuffix;
  }

  public void set_NameSuffix(String _NameSuffix) {
    this._NameSuffix = _NameSuffix;
  }

  public String get_UnparsedName() {
    return this._UnparsedName;
  }

  public void set_UnparsedName(String _UnparsedName) {
    this._UnparsedName = _UnparsedName;
  }

  public String get_SSN() {
    return this._SSN;
  }

  public void set_SSN(String _SSN) {
    this._SSN = _SSN;
  }

  public String getMaritalStatusType() {
    return this.maritalStatusType;
  }

  public void setMaritalStatusType(String maritalStatusType) {
    this.maritalStatusType = maritalStatusType;
  }

  public String get_USATaxPayerIdentificationNumber() {
    return this._USATaxPayerIdentificationNumber;
  }

  public void set_USATaxPayerIdentificationNumber(String _USATaxPayerIdentificationNumber) {
    this._USATaxPayerIdentificationNumber = _USATaxPayerIdentificationNumber;
  }

  protected ArrayList _ALIASList = new ArrayList();

  protected ArrayList _RESIDENCEList = new ArrayList();

  protected ArrayList noNPERSONENTITYDETAILList = new ArrayList();

  protected ArrayList contacTPOINTList = new ArrayList();

}
