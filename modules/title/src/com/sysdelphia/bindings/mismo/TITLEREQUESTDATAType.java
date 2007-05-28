package com.sysdelphia.bindings.mismo;

import java.util.ArrayList;


public class TITLEREQUESTDATAType {
  public void addTITLEREQUEST(TITLETITLEREQUESTType titlEREQUEST) {
    titlEREQUESTList.add(titlEREQUEST);
  }

  public TITLETITLEREQUESTType getTITLEREQUEST(int index) {
    return (TITLETITLEREQUESTType)titlEREQUESTList.get( index );
  }

  public int sizeTITLEREQUESTList() {
    return titlEREQUESTList.size();
  }

  protected ArrayList titlEREQUESTList = new ArrayList();

}
