package com.sysdelphia.bindings.w3.xmldsig;

import java.util.ArrayList;


public class TransformsType {
  public void addTransform(TransformType transform) {
    transformList.add(transform);
  }

  public TransformType getTransform(int index) {
    return (TransformType)transformList.get( index );
  }

  public int sizeTransformList() {
    return transformList.size();
  }

  protected ArrayList transformList = new ArrayList();

}
