package com.sysdelphia.bindings.w3.xmldsig;

public class ReferenceType {
  protected TransformsType transforms;

  protected DigestMethodType digestMethod;

  protected DigestValueType digestValue;

  protected String id;

  protected String uri;

  protected String type;


  public TransformsType getTransforms() {
    return this.transforms;
  }

  public void setTransforms(TransformsType transforms) {
    this.transforms = transforms;
  }

  public DigestMethodType getDigestMethod() {
    return this.digestMethod;
  }

  public void setDigestMethod(DigestMethodType digestMethod) {
    this.digestMethod = digestMethod;
  }

  public DigestValueType getDigestValue() {
    return this.digestValue;
  }

  public void setDigestValue(DigestValueType digestValue) {
    this.digestValue = digestValue;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getURI() {
    return this.uri;
  }

  public void setURI(String uri) {
    this.uri = uri;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
