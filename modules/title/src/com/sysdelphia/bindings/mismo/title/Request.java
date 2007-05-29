package com.sysdelphia.bindings.mismo.title;

import java.util.ArrayList;




public class Request {
  protected String _ID;

  protected String requestDatetime;

  protected String internalAccountIdentifier;

  protected String loginAccountIdentifier;

  protected String loginAccountPassword;

  protected String requestingPartyBranchIdentifier;


  public void addKEY(Key key) {
    keyList.add(key);
  }

  public Key getKEY(int index) {
    return (Key)keyList.get( index );
  }

  public int sizeKEYList() {
    return keyList.size();
  }

  public void addREQUESTDATA(RequestData requesTDATA) {
    requesTDATAList.add(requesTDATA);
  }

  public RequestData getREQUESTDATA(int index) {
    return (RequestData)requesTDATAList.get( index );
  }

  public int sizeREQUESTDATAList() {
    return requesTDATAList.size();
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
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

  protected ArrayList keyList = new ArrayList();

  protected ArrayList requesTDATAList = new ArrayList();

}
