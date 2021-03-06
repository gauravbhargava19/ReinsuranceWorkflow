package com.myspace.reinsuranceworkflow;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ReinsurerDecision implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Reinsurer Decision")
	private java.lang.String reinsurerDecision;
	@org.kie.api.definition.type.Label(value = "Reinsurer Name")
	private java.lang.String reinsurerName;
	@org.kie.api.definition.type.Label(value = "Additional Requirements")
	private java.lang.String additionalRequirements;
	@org.kie.api.definition.type.Label(value = "Reinsurer Comments")
	private java.lang.String reinsurerComments;

	public ReinsurerDecision() {
	}

	public java.lang.String getReinsurerDecision() {
		return this.reinsurerDecision;
	}

	public void setReinsurerDecision(java.lang.String reinsurerDecision) {
		this.reinsurerDecision = reinsurerDecision;
	}

	public java.lang.String getReinsurerName() {
		return this.reinsurerName;
	}

	public void setReinsurerName(java.lang.String reinsurerName) {
		this.reinsurerName = reinsurerName;
	}

	public java.lang.String getAdditionalRequirements() {
		return this.additionalRequirements;
	}

	public void setAdditionalRequirements(
			java.lang.String additionalRequirements) {
		this.additionalRequirements = additionalRequirements;
	}

	public java.lang.String getReinsurerComments() {
		return this.reinsurerComments;
	}

	public void setReinsurerComments(java.lang.String reinsurerComments) {
		this.reinsurerComments = reinsurerComments;
	}

	public ReinsurerDecision(java.lang.String reinsurerDecision,
			java.lang.String reinsurerName,
			java.lang.String additionalRequirements,
			java.lang.String reinsurerComments) {
		this.reinsurerDecision = reinsurerDecision;
		this.reinsurerName = reinsurerName;
		this.additionalRequirements = additionalRequirements;
		this.reinsurerComments = reinsurerComments;
	}

}