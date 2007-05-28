package com.sysdelphia.bindings.w3.xmldsig;

import java.util.ArrayList;


public class ObjectType {
  protected String id;

  protected String mimeType;

  protected String encoding;


  public void addChoice(Object choice) {
    choiceList.add(choice);
  }

  public Object getChoice(int index) {
    return (Object)choiceList.get( index );
  }

  public int sizeChoiceList() {
    return choiceList.size();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMimeType() {
    return this.mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public String getEncoding() {
    return this.encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  protected ArrayList choiceList = new ArrayList();

}
