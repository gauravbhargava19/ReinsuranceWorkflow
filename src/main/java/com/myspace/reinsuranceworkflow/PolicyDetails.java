package com.myspace.reinsuranceworkflow;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PolicyDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Policy Number")
	private java.lang.String policyNumer;
	@org.kie.api.definition.type.Label("Application Number")
	private java.lang.String applicationNumber;
	@org.kie.api.definition.type.Label("Product Name")
	private java.lang.String productName;
	@org.kie.api.definition.type.Label("Policy Term")
	private java.lang.Integer policyTerm;
	@org.kie.api.definition.type.Label("Sum Assured")
	private java.lang.Double sumAssured;
	@org.kie.api.definition.type.Label("Base Premium")
	private java.lang.Double basePremium;
	@org.kie.api.definition.type.Label("Total Premium")
	private java.lang.Double totalPremium;
	@org.kie.api.definition.type.Label("Premium Paying Term")
	private java.lang.Integer premiumPayingTerm;

	@org.kie.api.definition.type.Label(value = "Client Details")
	private java.util.List<com.myspace.reinsuranceworkflow.ClientDetails> clientDetails;

	@org.kie.api.definition.type.Label(value = "Nominee Details")
	private java.util.List<com.myspace.reinsuranceworkflow.NomineeDetails> nomineeDetails;

	@org.kie.api.definition.type.Label(value = "Product Details")
	private com.myspace.reinsuranceworkflow.RiderDetails productDetails;

	@org.kie.api.definition.type.Label(value = "Reinsurer Policy Decision")
	private com.myspace.reinsuranceworkflow.ReinsurerDecision reinsurerPolicyDecision;

	public PolicyDetails() {
	}

	public java.lang.String getPolicyNumer() {
		return this.policyNumer;
	}

	public void setPolicyNumer(java.lang.String policyNumer) {
		this.policyNumer = policyNumer;
	}

	public java.lang.String getApplicationNumber() {
		return this.applicationNumber;
	}

	public void setApplicationNumber(java.lang.String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public java.lang.String getProductName() {
		return this.productName;
	}

	public void setProductName(java.lang.String productName) {
		this.productName = productName;
	}

	public java.lang.Integer getPolicyTerm() {
		return this.policyTerm;
	}

	public void setPolicyTerm(java.lang.Integer policyTerm) {
		this.policyTerm = policyTerm;
	}

	public java.lang.Double getSumAssured() {
		return this.sumAssured;
	}

	public void setSumAssured(java.lang.Double sumAssured) {
		this.sumAssured = sumAssured;
	}

	public java.lang.Double getBasePremium() {
		return this.basePremium;
	}

	public void setBasePremium(java.lang.Double basePremium) {
		this.basePremium = basePremium;
	}

	public java.lang.Double getTotalPremium() {
		return this.totalPremium;
	}

	public void setTotalPremium(java.lang.Double totalPremium) {
		this.totalPremium = totalPremium;
	}

	public java.lang.Integer getPremiumPayingTerm() {
		return this.premiumPayingTerm;
	}

	public void setPremiumPayingTerm(java.lang.Integer premiumPayingTerm) {
		this.premiumPayingTerm = premiumPayingTerm;
	}

	public java.util.List<com.myspace.reinsuranceworkflow.ClientDetails> getClientDetails() {
		return this.clientDetails;
	}

	public void setClientDetails(
			java.util.List<com.myspace.reinsuranceworkflow.ClientDetails> clientDetails) {
		this.clientDetails = clientDetails;
	}

	public java.util.List<com.myspace.reinsuranceworkflow.NomineeDetails> getNomineeDetails() {
		return this.nomineeDetails;
	}

	public void setNomineeDetails(
			java.util.List<com.myspace.reinsuranceworkflow.NomineeDetails> nomineeDetails) {
		this.nomineeDetails = nomineeDetails;
	}

	public com.myspace.reinsuranceworkflow.RiderDetails getProductDetails() {
		return this.productDetails;
	}

	public void setProductDetails(
			com.myspace.reinsuranceworkflow.RiderDetails productDetails) {
		this.productDetails = productDetails;
	}

	public com.myspace.reinsuranceworkflow.ReinsurerDecision getReinsurerPolicyDecision() {
		return this.reinsurerPolicyDecision;
	}

	public void setReinsurerPolicyDecision(
			com.myspace.reinsuranceworkflow.ReinsurerDecision reinsurerPolicyDecision) {
		this.reinsurerPolicyDecision = reinsurerPolicyDecision;
	}

	public PolicyDetails(
			java.lang.String policyNumer,
			java.lang.String applicationNumber,
			java.lang.String productName,
			java.lang.Integer policyTerm,
			java.lang.Double sumAssured,
			java.lang.Double basePremium,
			java.lang.Double totalPremium,
			java.lang.Integer premiumPayingTerm,
			java.util.List<com.myspace.reinsuranceworkflow.ClientDetails> clientDetails,
			java.util.List<com.myspace.reinsuranceworkflow.NomineeDetails> nomineeDetails,
			com.myspace.reinsuranceworkflow.RiderDetails productDetails,
			com.myspace.reinsuranceworkflow.ReinsurerDecision reinsurerPolicyDecision) {
		this.policyNumer = policyNumer;
		this.applicationNumber = applicationNumber;
		this.productName = productName;
		this.policyTerm = policyTerm;
		this.sumAssured = sumAssured;
		this.basePremium = basePremium;
		this.totalPremium = totalPremium;
		this.premiumPayingTerm = premiumPayingTerm;
		this.clientDetails = clientDetails;
		this.nomineeDetails = nomineeDetails;
		this.productDetails = productDetails;
		this.reinsurerPolicyDecision = reinsurerPolicyDecision;
	}

}