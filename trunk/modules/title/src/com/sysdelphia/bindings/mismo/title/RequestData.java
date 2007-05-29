package com.sysdelphia.bindings.mismo.title;

import java.util.ArrayList;


public class RequestData {
  public void addTITLEREQUEST(TitleRequest titlEREQUEST) {
    titlEREQUESTList.add(titlEREQUEST);
  }

  public TitleRequest getTITLEREQUEST(int index) {
    return (TitleRequest)titlEREQUESTList.get( index );
  }

  public int sizeTITLEREQUESTList() {
    return titlEREQUESTList.size();
  }

  protected ArrayList titlEREQUESTList = new ArrayList();

}
