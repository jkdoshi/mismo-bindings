package com.sysdelphia.bindings.w3.xmldsig;

import java.util.ArrayList;


public class SignatureMethodType {
  protected String algorithm;


  public void addChoice(Object choice) {
    choiceList.add(choice);
  }

  public Object getChoice(int index) {
    return (Object)choiceList.get( index );
  }

  public int sizeChoiceList() {
    return choiceList.size();
  }

  public String getAlgorithm() {
    return this.algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  protected ArrayList choiceList = new ArrayList();

}
