package com.sysdelphia.bindings.w3.xmldsig;

public class X509IssuerSerialType {
  protected X509IssuerNameType x509IssuerName;

  protected X509SerialNumberType x509SerialNumber;


  public X509IssuerNameType getX509IssuerName() {
    return this.x509IssuerName;
  }

  public void setX509IssuerName(X509IssuerNameType x509IssuerName) {
    this.x509IssuerName = x509IssuerName;
  }

  public X509SerialNumberType getX509SerialNumber() {
    return this.x509SerialNumber;
  }

  public void setX509SerialNumber(X509SerialNumberType x509SerialNumber) {
    this.x509SerialNumber = x509SerialNumber;
  }

}
