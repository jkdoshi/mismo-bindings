package com.sysdelphia.bindings.mismo.title;

import java.util.ArrayList;


public class NonPersonEntityDetail {
  protected String _ID;

  protected String _OrganizationType;

  protected String _OrganizationTypeOtherDescription;

  protected String _OrganizedUnderTheLawsOfJurisdictionName;

  protected String _SuccessorClauseTextDescription;

  protected String _TaxIdentificationNumberIdentifier;

  protected String _OrganizationLicensingTypeDescription;

  protected String mersOrganizationIdentifier;


  public void addAUTHORIZEDREPRESENTATIVE(AuthorizedRepresentative authorizeDREPRESENTATIVE) {
    authorizeDREPRESENTATIVEList.add(authorizeDREPRESENTATIVE);
  }

  public AuthorizedRepresentative getAUTHORIZEDREPRESENTATIVE(int index) {
    return (AuthorizedRepresentative)authorizeDREPRESENTATIVEList.get( index );
  }

  public int sizeAUTHORIZEDREPRESENTATIVEList() {
    return authorizeDREPRESENTATIVEList.size();
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public String get_OrganizationType() {
    return this._OrganizationType;
  }

  public void set_OrganizationType(String _OrganizationType) {
    this._OrganizationType = _OrganizationType;
  }

  public String get_OrganizationTypeOtherDescription() {
    return this._OrganizationTypeOtherDescription;
  }

  public void set_OrganizationTypeOtherDescription(String _OrganizationTypeOtherDescription) {
    this._OrganizationTypeOtherDescription = _OrganizationTypeOtherDescription;
  }

  public String get_OrganizedUnderTheLawsOfJurisdictionName() {
    return this._OrganizedUnderTheLawsOfJurisdictionName;
  }

  public void set_OrganizedUnderTheLawsOfJurisdictionName(String _OrganizedUnderTheLawsOfJurisdictionName) {
    this._OrganizedUnderTheLawsOfJurisdictionName = _OrganizedUnderTheLawsOfJurisdictionName;
  }

  public String get_SuccessorClauseTextDescription() {
    return this._SuccessorClauseTextDescription;
  }

  public void set_SuccessorClauseTextDescription(String _SuccessorClauseTextDescription) {
    this._SuccessorClauseTextDescription = _SuccessorClauseTextDescription;
  }

  public String get_TaxIdentificationNumberIdentifier() {
    return this._TaxIdentificationNumberIdentifier;
  }

  public void set_TaxIdentificationNumberIdentifier(String _TaxIdentificationNumberIdentifier) {
    this._TaxIdentificationNumberIdentifier = _TaxIdentificationNumberIdentifier;
  }

  public String get_OrganizationLicensingTypeDescription() {
    return this._OrganizationLicensingTypeDescription;
  }

  public void set_OrganizationLicensingTypeDescription(String _OrganizationLicensingTypeDescription) {
    this._OrganizationLicensingTypeDescription = _OrganizationLicensingTypeDescription;
  }

  public String getMERSOrganizationIdentifier() {
    return this.mersOrganizationIdentifier;
  }

  public void setMERSOrganizationIdentifier(String mersOrganizationIdentifier) {
    this.mersOrganizationIdentifier = mersOrganizationIdentifier;
  }

  protected ArrayList authorizeDREPRESENTATIVEList = new ArrayList();

}
