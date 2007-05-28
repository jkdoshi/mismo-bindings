package com.sysdelphia.bindings.mismo;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;


public class TITLEREQUESTGROUPType {
  protected TITLERECEIVINGPARTYType receivinGPARTY;

  protected String _ID;

  protected String mismoVersionID;


  public void addREQUESTINGPARTY(TITLEREQUESTINGPARTYType requestinGPARTY) {
    requestinGPARTYList.add(requestinGPARTY);
  }

  public TITLEREQUESTINGPARTYType getREQUESTINGPARTY(int index) {
    return (TITLEREQUESTINGPARTYType)requestinGPARTYList.get( index );
  }

  public int sizeREQUESTINGPARTYList() {
    return requestinGPARTYList.size();
  }

  public TITLERECEIVINGPARTYType getRECEIVINGPARTY() {
    return this.receivinGPARTY;
  }

  public void setRECEIVINGPARTY(TITLERECEIVINGPARTYType receivinGPARTY) {
    this.receivinGPARTY = receivinGPARTY;
  }

  public void addSUBMITTINGPARTY(TITLESUBMITTINGPARTYType submittinGPARTY) {
    submittinGPARTYList.add(submittinGPARTY);
  }

  public TITLESUBMITTINGPARTYType getSUBMITTINGPARTY(int index) {
    return (TITLESUBMITTINGPARTYType)submittinGPARTYList.get( index );
  }

  public int sizeSUBMITTINGPARTYList() {
    return submittinGPARTYList.size();
  }

  public void addREQUEST(TITLEREQUESTType request) {
    requestList.add(request);
  }

  public TITLEREQUESTType getREQUEST(int index) {
    return (TITLEREQUESTType)requestList.get( index );
  }

  public int sizeREQUESTList() {
    return requestList.size();
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public String getMISMOVersionID() {
    return this.mismoVersionID;
  }

  public void setMISMOVersionID(String mismoVersionID) {
    this.mismoVersionID = mismoVersionID;
  }

  protected ArrayList requestinGPARTYList = new ArrayList();

  protected ArrayList submittinGPARTYList = new ArrayList();

  protected ArrayList requestList = new ArrayList();

}
