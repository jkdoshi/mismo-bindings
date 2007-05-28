package com.sysdelphia.bindings.mismo;

import com.sysdelphia.bindings.w3.xmldsig.SignatureType;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;


public class ENVELOPEREQUESTGROUPType {
  protected SignatureType signature;

  protected String mismoVersionID;

  protected String _Identifier;

  protected String _ID;


  public void addREQUESTINGPARTY(ENVELOPEREQUESTINGPARTYType requestinGPARTY) {
    requestinGPARTYList.add(requestinGPARTY);
  }

  public ENVELOPEREQUESTINGPARTYType getREQUESTINGPARTY(int index) {
    return (ENVELOPEREQUESTINGPARTYType)requestinGPARTYList.get( index );
  }

  public int sizeREQUESTINGPARTYList() {
    return requestinGPARTYList.size();
  }

  public void addRECEIVINGPARTY(ENVELOPERECEIVINGPARTYType receivinGPARTY) {
    receivinGPARTYList.add(receivinGPARTY);
  }

  public ENVELOPERECEIVINGPARTYType getRECEIVINGPARTY(int index) {
    return (ENVELOPERECEIVINGPARTYType)receivinGPARTYList.get( index );
  }

  public int sizeRECEIVINGPARTYList() {
    return receivinGPARTYList.size();
  }

  public void addSUBMITTINGPARTY(ENVELOPESUBMITTINGPARTYType submittinGPARTY) {
    submittinGPARTYList.add(submittinGPARTY);
  }

  public ENVELOPESUBMITTINGPARTYType getSUBMITTINGPARTY(int index) {
    return (ENVELOPESUBMITTINGPARTYType)submittinGPARTYList.get( index );
  }

  public int sizeSUBMITTINGPARTYList() {
    return submittinGPARTYList.size();
  }

  public void addREQUEST(ENVELOPEREQUESTType request) {
    requestList.add(request);
  }

  public ENVELOPEREQUESTType getREQUEST(int index) {
    return (ENVELOPEREQUESTType)requestList.get( index );
  }

  public int sizeREQUESTList() {
    return requestList.size();
  }

  public SignatureType getSignature() {
    return this.signature;
  }

  public void setSignature(SignatureType signature) {
    this.signature = signature;
  }

  public String getMISMOVersionID() {
    return this.mismoVersionID;
  }

  public void setMISMOVersionID(String mismoVersionID) {
    this.mismoVersionID = mismoVersionID;
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

  protected ArrayList requestinGPARTYList = new ArrayList();

  protected ArrayList receivinGPARTYList = new ArrayList();

  protected ArrayList submittinGPARTYList = new ArrayList();

  protected ArrayList requestList = new ArrayList();

}
