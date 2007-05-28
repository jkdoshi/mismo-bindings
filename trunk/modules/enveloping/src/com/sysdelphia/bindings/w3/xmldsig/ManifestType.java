package com.sysdelphia.bindings.w3.xmldsig;

import java.util.ArrayList;


public class ManifestType {
  protected String id;


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
