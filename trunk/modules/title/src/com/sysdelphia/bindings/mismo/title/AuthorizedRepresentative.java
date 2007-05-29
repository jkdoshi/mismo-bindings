package com.sysdelphia.bindings.mismo.title;

public class AuthorizedRepresentative {
  protected ContactDetail contacTDETAIL;

  protected String _ID;

  protected String _UnparsedName;

  protected String _TitleDescription;

  protected String authorizedToSignIndicator;


  public ContactDetail getCONTACTDETAIL() {
    return this.contacTDETAIL;
  }

  public void setCONTACTDETAIL(ContactDetail contacTDETAIL) {
    this.contacTDETAIL = contacTDETAIL;
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public String get_UnparsedName() {
    return this._UnparsedName;
  }

  public void set_UnparsedName(String _UnparsedName) {
    this._UnparsedName = _UnparsedName;
  }

  public String get_TitleDescription() {
    return this._TitleDescription;
  }

  public void set_TitleDescription(String _TitleDescription) {
    this._TitleDescription = _TitleDescription;
  }

  public String getAuthorizedToSignIndicator() {
    return this.authorizedToSignIndicator;
  }

  public void setAuthorizedToSignIndicator(String authorizedToSignIndicator) {
    this.authorizedToSignIndicator = authorizedToSignIndicator;
  }

}
