package com.sysdelphia.bindings.mismo.title;

import java.math.BigDecimal;


public class Property {
  protected PropertyIdentification _IDENTIFICATION;

  protected PropertyLegalDescription _LEGALDESCRIPTION;

  protected ParsedStreetAddress parseDSTREETADDRESS;

  protected String _ID;

  protected String _SequenceIdentifier;

  protected String _StreetAddress;

  protected String _StreetAddress2;

  protected String _City;

  protected String _State;

  protected String _County;

  protected String _PostalCode;

  protected String _Country;

  protected String buildingStatusType;

  protected String _TitleCategoryType;

  protected String _TitleCategoryTypeOtherDescription;

  protected String assessorsParcelIdentifier;

  protected BigDecimal _SalesAmount;

  protected String _UnincorporatedAreaName;

  protected String propertyTitleMannerHeldType;

  protected String propertyTitleMannerHeldTypeOtherDescription;

  protected String plannedUnitDevelopmentIndicator;


  public PropertyIdentification get_IDENTIFICATION() {
    return this._IDENTIFICATION;
  }

  public void set_IDENTIFICATION(PropertyIdentification _IDENTIFICATION) {
    this._IDENTIFICATION = _IDENTIFICATION;
  }

  public PropertyLegalDescription get_LEGALDESCRIPTION() {
    return this._LEGALDESCRIPTION;
  }

  public void set_LEGALDESCRIPTION(PropertyLegalDescription _LEGALDESCRIPTION) {
    this._LEGALDESCRIPTION = _LEGALDESCRIPTION;
  }

  public ParsedStreetAddress getPARSEDSTREETADDRESS() {
    return this.parseDSTREETADDRESS;
  }

  public void setPARSEDSTREETADDRESS(ParsedStreetAddress parseDSTREETADDRESS) {
    this.parseDSTREETADDRESS = parseDSTREETADDRESS;
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public String get_SequenceIdentifier() {
    return this._SequenceIdentifier;
  }

  public void set_SequenceIdentifier(String _SequenceIdentifier) {
    this._SequenceIdentifier = _SequenceIdentifier;
  }

  public String get_StreetAddress() {
    return this._StreetAddress;
  }

  public void set_StreetAddress(String _StreetAddress) {
    this._StreetAddress = _StreetAddress;
  }

  public String get_StreetAddress2() {
    return this._StreetAddress2;
  }

  public void set_StreetAddress2(String _StreetAddress2) {
    this._StreetAddress2 = _StreetAddress2;
  }

  public String get_City() {
    return this._City;
  }

  public void set_City(String _City) {
    this._City = _City;
  }

  public String get_State() {
    return this._State;
  }

  public void set_State(String _State) {
    this._State = _State;
  }

  public String get_County() {
    return this._County;
  }

  public void set_County(String _County) {
    this._County = _County;
  }

  public String get_PostalCode() {
    return this._PostalCode;
  }

  public void set_PostalCode(String _PostalCode) {
    this._PostalCode = _PostalCode;
  }

  public String get_Country() {
    return this._Country;
  }

  public void set_Country(String _Country) {
    this._Country = _Country;
  }

  public String getBuildingStatusType() {
    return this.buildingStatusType;
  }

  public void setBuildingStatusType(String buildingStatusType) {
    this.buildingStatusType = buildingStatusType;
  }

  public String get_TitleCategoryType() {
    return this._TitleCategoryType;
  }

  public void set_TitleCategoryType(String _TitleCategoryType) {
    this._TitleCategoryType = _TitleCategoryType;
  }

  public String get_TitleCategoryTypeOtherDescription() {
    return this._TitleCategoryTypeOtherDescription;
  }

  public void set_TitleCategoryTypeOtherDescription(String _TitleCategoryTypeOtherDescription) {
    this._TitleCategoryTypeOtherDescription = _TitleCategoryTypeOtherDescription;
  }

  public String getAssessorsParcelIdentifier() {
    return this.assessorsParcelIdentifier;
  }

  public void setAssessorsParcelIdentifier(String assessorsParcelIdentifier) {
    this.assessorsParcelIdentifier = assessorsParcelIdentifier;
  }

  public BigDecimal get_SalesAmount() {
    return this._SalesAmount;
  }

  public void set_SalesAmount(BigDecimal _SalesAmount) {
    this._SalesAmount = _SalesAmount;
  }

  public String get_UnincorporatedAreaName() {
    return this._UnincorporatedAreaName;
  }

  public void set_UnincorporatedAreaName(String _UnincorporatedAreaName) {
    this._UnincorporatedAreaName = _UnincorporatedAreaName;
  }

  public String getPropertyTitleMannerHeldType() {
    return this.propertyTitleMannerHeldType;
  }

  public void setPropertyTitleMannerHeldType(String propertyTitleMannerHeldType) {
    this.propertyTitleMannerHeldType = propertyTitleMannerHeldType;
  }

  public String getPropertyTitleMannerHeldTypeOtherDescription() {
    return this.propertyTitleMannerHeldTypeOtherDescription;
  }

  public void setPropertyTitleMannerHeldTypeOtherDescription(String propertyTitleMannerHeldTypeOtherDescription) {
    this.propertyTitleMannerHeldTypeOtherDescription = propertyTitleMannerHeldTypeOtherDescription;
  }

  public String getPlannedUnitDevelopmentIndicator() {
    return this.plannedUnitDevelopmentIndicator;
  }

  public void setPlannedUnitDevelopmentIndicator(String plannedUnitDevelopmentIndicator) {
    this.plannedUnitDevelopmentIndicator = plannedUnitDevelopmentIndicator;
  }

}
