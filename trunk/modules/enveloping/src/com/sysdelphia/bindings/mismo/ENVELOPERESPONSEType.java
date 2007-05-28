package com.sysdelphia.bindings.mismo;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;


public class ENVELOPERESPONSEType {
  protected String _ID;

  protected Date responseDateTime;

  protected String internalAccountIdentifier;

  protected String loginAccountIdentifier;

  protected String loginAccountPassword;

  protected String _Identifier;


  public void addKEY(ENVELOPEKEYType key) {
    keyList.add(key);
  }

  public ENVELOPEKEYType getKEY(int index) {
    return (ENVELOPEKEYType)keyList.get( index );
  }

  public int sizeKEYList() {
    return keyList.size();
  }

  public void addRESPONSEDATA(ENVELOPERESPONSEDATAType responsEDATA) {
    responsEDATAList.add(responsEDATA);
  }

  public ENVELOPERESPONSEDATAType getRESPONSEDATA(int index) {
    return (ENVELOPERESPONSEDATAType)responsEDATAList.get( index );
  }

  public int sizeRESPONSEDATAList() {
    return responsEDATAList.size();
  }

  public void addSTATUS(ENVELOPESTATUSType status) {
    statusList.add(status);
  }

  public ENVELOPESTATUSType getSTATUS(int index) {
    return (ENVELOPESTATUSType)statusList.get( index );
  }

  public int sizeSTATUSList() {
    return statusList.size();
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public Date getResponseDateTime() {
    return this.responseDateTime;
  }

  public void setResponseDateTime(Date responseDateTime) {
    this.responseDateTime = responseDateTime;
  }

  public String getInternalAccountIdentifier() {
    return this.internalAccountIdentifier;
  }

  public void setInternalAccountIdentifier(String internalAccountIdentifier) {
    this.internalAccountIdentifier = internalAccountIdentifier;
  }

  public String getLoginAccountIdentifier() {
    return this.loginAccountIdentifier;
  }

  public void setLoginAccountIdentifier(String loginAccountIdentifier) {
    this.loginAccountIdentifier = loginAccountIdentifier;
  }

  public String getLoginAccountPassword() {
    return this.loginAccountPassword;
  }

  public void setLoginAccountPassword(String loginAccountPassword) {
    this.loginAccountPassword = loginAccountPassword;
  }

  public String get_Identifier() {
    return this._Identifier;
  }

  public void set_Identifier(String _Identifier) {
    this._Identifier = _Identifier;
  }

  protected ArrayList keyList = new ArrayList();

  protected ArrayList responsEDATAList = new ArrayList();

  protected ArrayList statusList = new ArrayList();

}
