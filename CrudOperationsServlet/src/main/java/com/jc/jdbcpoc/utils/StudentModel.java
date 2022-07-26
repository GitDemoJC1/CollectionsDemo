package com.jc.jdbcpoc.utils;

public class StudentModel {
	private String studentFName;
	private String studentLName;
	private String studentGender;
	private String studentPlace;
	private String studentEmail;
	private String studentPhone;

	public String getStudentFName() {
		return studentFName;
	}

	public void setStudentFName(String studentFName) {
		this.studentFName = studentFName;
	}

	public String getStudentLName() {
		return studentLName;
	}

	public void setStudentLName(String studentLName) {
		this.studentLName = studentLName;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentPlace() {
		return studentPlace;
	}

	public void setStudentPlace(String studentPlace) {
		this.studentPlace = studentPlace;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	@Override
	public String toString() {
		return "StudentModel [studentFName=" + studentFName + ", studentLName=" + studentLName + ", studentGender="
				+ studentGender + ", studentPlace=" + studentPlace + ", studentEmail=" + studentEmail
				+ ", studentPhone=" + studentPhone + "]";
	}

}
