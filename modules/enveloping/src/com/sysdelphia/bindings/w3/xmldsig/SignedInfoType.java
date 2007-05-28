package com.sysdelphia.bindings.w3.xmldsig;

import java.util.ArrayList;


public class SignedInfoType {
  protected CanonicalizationMethodType canonicalizationMethod;

  protected SignatureMethodType signatureMethod;

  protected String id;


  public CanonicalizationMethodType getCanonicalizationMethod() {
    return this.canonicalizationMethod;
  }

  public void setCanonicalizationMethod(CanonicalizationMethodType canonicalizationMethod) {
    this.canonicalizationMethod = canonicalizationMethod;
  }

  public SignatureMethodType getSignatureMethod() {
    return this.signatureMethod;
  }

  public void setSignatureMethod(SignatureMethodType signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

  public void addReference(ReferenceType reference) {
    referenceList.add(reference);
  }

  public ReferenceType getReference(int index) {
    return (ReferenceType)referenceList.get( index );
  }

  public int sizeReferenceList() {
    return referenceList.size();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  protected ArrayList referenceList = new ArrayList();

}
