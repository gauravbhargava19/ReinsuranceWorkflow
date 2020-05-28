package com.myspace.reinsuranceworkflow;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MedicalDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Medical Id")
	private java.lang.String medicalId;
	@org.kie.api.definition.type.Label(value = "Test Name")
	private java.lang.String testName;
	@org.kie.api.definition.type.Label(value = "Test Conducted Date")
	private java.util.Date testConductedDate;
	@org.kie.api.definition.type.Label(value = "BMI")
	private java.lang.String BMI;
	@org.kie.api.definition.type.Label(value = "Reading")
	private java.lang.String reading;
	@org.kie.api.definition.type.Label(value = "Result")
	private java.lang.String result;

	public MedicalDetails() {
	}

	public java.lang.String getMedicalId() {
		return this.medicalId;
	}

	public void setMedicalId(java.lang.String medicalId) {
		this.medicalId = medicalId;
	}

	public java.lang.String getTestName() {
		return this.testName;
	}

	public void setTestName(java.lang.String testName) {
		this.testName = testName;
	}

	public java.util.Date getTestConductedDate() {
		return this.testConductedDate;
	}

	public void setTestConductedDate(java.util.Date testConductedDate) {
		this.testConductedDate = testConductedDate;
	}

	public java.lang.String getBMI() {
		return this.BMI;
	}

	public void setBMI(java.lang.String BMI) {
		this.BMI = BMI;
	}

	public java.lang.String getReading() {
		return this.reading;
	}

	public void setReading(java.lang.String reading) {
		this.reading = reading;
	}

	public java.lang.String getResult() {
		return this.result;
	}

	public void setResult(java.lang.String result) {
		this.result = result;
	}

	public MedicalDetails(java.lang.String medicalId,
			java.lang.String testName, java.util.Date testConductedDate,
			java.lang.String BMI, java.lang.String reading,
			java.lang.String result) {
		this.medicalId = medicalId;
		this.testName = testName;
		this.testConductedDate = testConductedDate;
		this.BMI = BMI;
		this.reading = reading;
		this.result = result;
	}

}