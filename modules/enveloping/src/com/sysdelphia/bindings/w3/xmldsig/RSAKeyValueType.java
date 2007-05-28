package com.sysdelphia.bindings.w3.xmldsig;

public class RSAKeyValueType {
  protected ModulusType modulus;

  protected ExponentType exponent;


  public ModulusType getModulus() {
    return this.modulus;
  }

  public void setModulus(ModulusType modulus) {
    this.modulus = modulus;
  }

  public ExponentType getExponent() {
    return this.exponent;
  }

  public void setExponent(ExponentType exponent) {
    this.exponent = exponent;
  }

}
