package com.sysdelphia.bindings.w3.xmldsig;

public class RetrievalMethodType {
  protected TransformsType transforms;

  protected String uri;

  protected String type;


  public TransformsType getTransforms() {
    return this.transforms;
  }

  public void setTransforms(TransformsType transforms) {
    this.transforms = transforms;
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
