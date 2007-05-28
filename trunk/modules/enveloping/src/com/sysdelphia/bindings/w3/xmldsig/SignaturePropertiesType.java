package com.sysdelphia.bindings.w3.xmldsig;

import java.util.ArrayList;


public class SignaturePropertiesType {
  protected String id;


  public void addSignatureProperty(SignaturePropertyType signatureProperty) {
    signaturePropertyList.add(signatureProperty);
  }

  public SignaturePropertyType getSignatureProperty(int index) {
    return (SignaturePropertyType)signaturePropertyList.get( index );
  }

  public int sizeSignaturePropertyList() {
    return signaturePropertyList.size();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  protected ArrayList signaturePropertyList = new ArrayList();

}
