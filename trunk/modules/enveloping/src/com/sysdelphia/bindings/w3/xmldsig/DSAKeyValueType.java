package com.sysdelphia.bindings.w3.xmldsig;

public class DSAKeyValueType {
  protected PType p;

  protected QType q;

  protected GType g;

  protected YType y;

  protected JType j;

  protected SeedType seed;

  protected PgenCounterType pgenCounter;


  public PType getP() {
    return this.p;
  }

  public void setP(PType p) {
    this.p = p;
  }

  public QType getQ() {
    return this.q;
  }

  public void setQ(QType q) {
    this.q = q;
  }

  public GType getG() {
    return this.g;
  }

  public void setG(GType g) {
    this.g = g;
  }

  public YType getY() {
    return this.y;
  }

  public void setY(YType y) {
    this.y = y;
  }

  public JType getJ() {
    return this.j;
  }

  public void setJ(JType j) {
    this.j = j;
  }

  public SeedType getSeed() {
    return this.seed;
  }

  public void setSeed(SeedType seed) {
    this.seed = seed;
  }

  public PgenCounterType getPgenCounter() {
    return this.pgenCounter;
  }

  public void setPgenCounter(PgenCounterType pgenCounter) {
    this.pgenCounter = pgenCounter;
  }

}
