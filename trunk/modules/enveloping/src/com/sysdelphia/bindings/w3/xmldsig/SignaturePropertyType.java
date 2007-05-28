package com.sysdelphia.bindings.w3.xmldsig;

import java.util.ArrayList;


public class SignaturePropertyType {
  protected String target;

  protected String id;


  public void addChoice(Object choice) {
    choiceList.add(choice);
  }

  public Object getChoice(int index) {
    return (Object)choiceList.get( index );
  }

  public int sizeChoiceList() {
    return choiceList.size();
  }

  public String getTarget() {
    return this.target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  protected ArrayList choiceList = new ArrayList();

}
