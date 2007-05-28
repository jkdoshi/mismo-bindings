package com.sysdelphia.bindings.w3.xmldsig;

import java.util.ArrayList;


public class SignatureType {
  protected SignedInfoType signedInfo;

  protected SignatureValueType signatureValue;

  protected KeyInfoType keyInfo;

  protected String id;


  public SignedInfoType getSignedInfo() {
    return this.signedInfo;
  }

  public void setSignedInfo(SignedInfoType signedInfo) {
    this.signedInfo = signedInfo;
  }

  public SignatureValueType getSignatureValue() {
    return this.signatureValue;
  }

  public void setSignatureValue(SignatureValueType signatureValue) {
    this.signatureValue = signatureValue;
  }

  public KeyInfoType getKeyInfo() {
    return this.keyInfo;
  }

  public void setKeyInfo(KeyInfoType keyInfo) {
    this.keyInfo = keyInfo;
  }

  public void addObject(ObjectType object) {
    objectList.add(object);
  }

  public ObjectType getObject(int index) {
    return (ObjectType)objectList.get( index );
  }

  public int sizeObjectList() {
    return objectList.size();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  protected ArrayList objectList = new ArrayList();

}
