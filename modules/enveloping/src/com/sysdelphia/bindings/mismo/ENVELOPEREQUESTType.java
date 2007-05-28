package com.sysdelphia.bindings.mismo;

import java.util.ArrayList;
import java.util.ArrayList;


public class ENVELOPEREQUESTType {
  protected String requestDatetime;

  protected String internalAccountIdentifier;

  protected String loginAccountIdentifier;

  protected String loginAccountPassword;

  protected String requestingPartyBranchIdentifier;

  protected String _Identifier;

  protected String _ID;


  public void addKEY(ENVELOPEKEYType key) {
    keyList.add(key);
  }

  public ENVELOPEKEYType getKEY(int index) {
    return (ENVELOPEKEYType)keyList.get( index );
  }

  public int sizeKEYList() {
    return keyList.size();
  }

  public void addREQUESTDATA(ENVELOPEREQUESTDATAType requesTDATA) {
    requesTDATAList.add(requesTDATA);
  }

  public ENVELOPEREQUESTDATAType getREQUESTDATA(int index) {
    return (ENVELOPEREQUESTDATAType)requesTDATAList.get( index );
  }

  public int sizeREQUESTDATAList() {
    return requesTDATAList.size();
  }

  public String getRequestDatetime() {
    return this.requestDatetime;
  }

  public void setRequestDatetime(String requestDatetime) {
    this.requestDatetime = requestDatetime;
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

  public String getRequestingPartyBranchIdentifier() {
    return this.requestingPartyBranchIdentifier;
  }

  public void setRequestingPartyBranchIdentifier(String requestingPartyBranchIdentifier) {
    this.requestingPartyBranchIdentifier = requestingPartyBranchIdentifier;
  }

  public String get_Identifier() {
    return this._Identifier;
  }

  public void set_Identifier(String _Identifier) {
    this._Identifier = _Identifier;
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  protected ArrayList keyList = new ArrayList();

  protected ArrayList requesTDATAList = new ArrayList();

}
