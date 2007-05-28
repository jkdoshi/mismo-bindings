package com.sysdelphia.bindings.mismo;

import java.util.ArrayList;
import java.util.ArrayList;


public class TITLEREQUESTType {
  protected String _ID;

  protected String requestDatetime;

  protected String internalAccountIdentifier;

  protected String loginAccountIdentifier;

  protected String loginAccountPassword;

  protected String requestingPartyBranchIdentifier;


  public void addKEY(TITLEKEYType key) {
    keyList.add(key);
  }

  public TITLEKEYType getKEY(int index) {
    return (TITLEKEYType)keyList.get( index );
  }

  public int sizeKEYList() {
    return keyList.size();
  }

  public void addREQUESTDATA(TITLEREQUESTDATAType requesTDATA) {
    requesTDATAList.add(requesTDATA);
  }

  public TITLEREQUESTDATAType getREQUESTDATA(int index) {
    return (TITLEREQUESTDATAType)requesTDATAList.get( index );
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
