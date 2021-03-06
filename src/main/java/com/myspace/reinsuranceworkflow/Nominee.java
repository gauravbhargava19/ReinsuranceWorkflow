package com.myspace.reinsuranceworkflow;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Nominee implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Nominee Name")
	private java.lang.String nomineeName;
	@org.kie.api.definition.type.Label("Date of Birth")
	private java.util.Date dob;
	@org.kie.api.definition.type.Label("Relationship with Nominee")
	private java.lang.String relationship;
	@org.kie.api.definition.type.Label("Percentage Share")
	private java.lang.Double percentShare;
	@org.kie.api.definition.type.Label("Gender")
	private java.lang.String gender;

	public Nominee() {
	}

	public java.lang.String getNomineeName() {
		return this.nomineeName;
	}

	public void setNomineeName(java.lang.String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public java.util.Date getDob() {
		return this.dob;
	}

	public void setDob(java.util.Date dob) {
		this.dob = dob;
	}

	public java.lang.String getRelationship() {
		return this.relationship;
	}

	public void setRelationship(java.lang.String relationship) {
		this.relationship = relationship;
	}

	public java.lang.Double getPercentShare() {
		return this.percentShare;
	}

	public void setPercentShare(java.lang.Double percentShare) {
		this.percentShare = percentShare;
	}

	public java.lang.String getGender() {
		return this.gender;
	}

	public void setGender(java.lang.String gender) {
		this.gender = gender;
	}

	public Nominee(java.lang.String nomineeName, java.util.Date dob,
			java.lang.String relationship, java.lang.Double percentShare,
			java.lang.String gender) {
		this.nomineeName = nomineeName;
		this.dob = dob;
		this.relationship = relationship;
		this.percentShare = percentShare;
		this.gender = gender;
	}

}