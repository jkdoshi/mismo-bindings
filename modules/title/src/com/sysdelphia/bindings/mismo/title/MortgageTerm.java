package com.sysdelphia.bindings.mismo.title;

import java.math.BigDecimal;
import java.util.Date;


public class MortgageTerm {
  protected String _ID;

  protected String agencyCaseIdentifier;

  protected BigDecimal baseLoanAmount;

  protected BigDecimal borrowerRequestedLoanAmount;

  protected String lenderCaseIdentifier;

  protected String mortgageType;

  protected String mortgageTypeOtherDescription;

  protected Date loanEstimatedClosingDate;

  protected String lienPriorityType;

  protected String lienPriorityTypeOtherDescription;

  protected String loanAmortizationType;

  protected String otherAmortizationTypeDescription;


  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public String getAgencyCaseIdentifier() {
    return this.agencyCaseIdentifier;
  }

  public void setAgencyCaseIdentifier(String agencyCaseIdentifier) {
    this.agencyCaseIdentifier = agencyCaseIdentifier;
  }

  public BigDecimal getBaseLoanAmount() {
    return this.baseLoanAmount;
  }

  public void setBaseLoanAmount(BigDecimal baseLoanAmount) {
    this.baseLoanAmount = baseLoanAmount;
  }

  public BigDecimal getBorrowerRequestedLoanAmount() {
    return this.borrowerRequestedLoanAmount;
  }

  public void setBorrowerRequestedLoanAmount(BigDecimal borrowerRequestedLoanAmount) {
    this.borrowerRequestedLoanAmount = borrowerRequestedLoanAmount;
  }

  public String getLenderCaseIdentifier() {
    return this.lenderCaseIdentifier;
  }

  public void setLenderCaseIdentifier(String lenderCaseIdentifier) {
    this.lenderCaseIdentifier = lenderCaseIdentifier;
  }

  public String getMortgageType() {
    return this.mortgageType;
  }

  public void setMortgageType(String mortgageType) {
    this.mortgageType = mortgageType;
  }

  public String getMortgageTypeOtherDescription() {
    return this.mortgageTypeOtherDescription;
  }

  public void setMortgageTypeOtherDescription(String mortgageTypeOtherDescription) {
    this.mortgageTypeOtherDescription = mortgageTypeOtherDescription;
  }

  public Date getLoanEstimatedClosingDate() {
    return this.loanEstimatedClosingDate;
  }

  public void setLoanEstimatedClosingDate(Date loanEstimatedClosingDate) {
    this.loanEstimatedClosingDate = loanEstimatedClosingDate;
  }

  public String getLienPriorityType() {
    return this.lienPriorityType;
  }

  public void setLienPriorityType(String lienPriorityType) {
    this.lienPriorityType = lienPriorityType;
  }

  public String getLienPriorityTypeOtherDescription() {
    return this.lienPriorityTypeOtherDescription;
  }

  public void setLienPriorityTypeOtherDescription(String lienPriorityTypeOtherDescription) {
    this.lienPriorityTypeOtherDescription = lienPriorityTypeOtherDescription;
  }

  public String getLoanAmortizationType() {
    return this.loanAmortizationType;
  }

  public void setLoanAmortizationType(String loanAmortizationType) {
    this.loanAmortizationType = loanAmortizationType;
  }

  public String getOtherAmortizationTypeDescription() {
    return this.otherAmortizationTypeDescription;
  }

  public void setOtherAmortizationTypeDescription(String otherAmortizationTypeDescription) {
    this.otherAmortizationTypeDescription = otherAmortizationTypeDescription;
  }

}
