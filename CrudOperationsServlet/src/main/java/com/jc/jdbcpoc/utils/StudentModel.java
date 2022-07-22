package com.jc.jdbcpoc.utils;

public class StudentModel {
	private String studentName;
	private String studentAge;
	private String studentGender;
	private String studentCourse;
	private String studentPhone;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	@Override
	public String toString() {
		return "StudentModel [studentName=" + studentName + ", studentAge=" + studentAge + ", studentGender="
				+ studentGender + ", studentCourse=" + studentCourse + ", studentPhone=" + studentPhone + "]";
	}

}
