package com.sysdelphia.bindings.mismo;

import com.sysdelphia.bindings.w3.xmldsig.SignatureType;
import java.util.ArrayList;
import java.util.ArrayList;


public class ResponseGroup {
  protected RespondingParty respondinGPARTY;

  protected RespondToParty responDTOPARTY;

  protected SignatureType signature;

  protected String mismoVersionID;

  protected String _Identifier;

  protected String _ID;


  public RespondingParty getRESPONDINGPARTY() {
    return this.respondinGPARTY;
  }

  public void setRESPONDINGPARTY(RespondingParty respondinGPARTY) {
    this.respondinGPARTY = respondinGPARTY;
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

  public RespondToParty getRESPONDTOPARTY() {
    return this.responDTOPARTY;
  }

  public void setRESPONDTOPARTY(RespondToParty responDTOPARTY) {
    this.responDTOPARTY = responDTOPARTY;
  }

  public void addRESPONSE(Response response) {
    responseList.add(response);
  }

  public Response getRESPONSE(int index) {
    return (Response)responseList.get( index );
  }

  public int sizeRESPONSEList() {
    return responseList.size();
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

  protected ArrayList submittinGPARTYList = new ArrayList();

  protected ArrayList responseList = new ArrayList();

}
