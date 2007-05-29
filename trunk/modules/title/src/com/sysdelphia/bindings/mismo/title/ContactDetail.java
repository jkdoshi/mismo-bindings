package com.sysdelphia.bindings.mismo.title;

import java.util.ArrayList;

public class ContactDetail {
  protected String _ID;

  protected String _Name;


  public void addCONTACTPOINT(ContactPoint contacTPOINT) {
    contacTPOINTList.add(contacTPOINT);
  }

  public ContactPoint getCONTACTPOINT(int index) {
    return (ContactPoint)contacTPOINTList.get( index );
  }

  public int sizeCONTACTPOINTList() {
    return contacTPOINTList.size();
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public String get_Name() {
    return this._Name;
  }

  public void set_Name(String _Name) {
    this._Name = _Name;
  }

  protected ArrayList contacTPOINTList = new ArrayList();

}
