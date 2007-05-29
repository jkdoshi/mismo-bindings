package com.sysdelphia.bindings.mismo.title;

import java.util.ArrayList;




public class RequestGroup {
  protected ReceivingParty receivinGPARTY;

  protected String _ID;

  protected String mismoVersionID;


  public void addREQUESTINGPARTY(RequestingParty requestinGPARTY) {
    requestinGPARTYList.add(requestinGPARTY);
  }

  public RequestingParty getREQUESTINGPARTY(int index) {
    return (RequestingParty)requestinGPARTYList.get( index );
  }

  public int sizeREQUESTINGPARTYList() {
    return requestinGPARTYList.size();
  }

  public ReceivingParty getRECEIVINGPARTY() {
    return this.receivinGPARTY;
  }

  public void setRECEIVINGPARTY(ReceivingParty receivinGPARTY) {
    this.receivinGPARTY = receivinGPARTY;
  }

  public void addSUBMITTINGPARTY(SubmittingParty submittinGPARTY) {
    submittinGPARTYList.add(submittinGPARTY);
  }

  public SubmittingParty getSUBMITTINGPARTY(int index) {
    return (SubmittingParty)submittinGPARTYList.get( index );
  }

  public int sizeSUBMITTINGPARTYList() {
    return submittinGPARTYList.size();
  }

  public void addREQUEST(Request request) {
    requestList.add(request);
  }

  public Request getREQUEST(int index) {
    return (Request)requestList.get( index );
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
