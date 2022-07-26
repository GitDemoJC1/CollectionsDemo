package com.jc.model;

public class LuckyDrawModel {
	private String fristName;
	private String lastName;
	private String emailAddress;
	private String place;
	private String gender;
	private int id;

	public LuckyDrawModel() {
	}

	public LuckyDrawModel(String fristName, String lastName, String emailAddress, String place, String gender) {
		this.fristName = fristName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.place = place;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "LuckyDrawModel [fristName=" + fristName + ", lastName=" + lastName + ", emailAddress=" + emailAddress
				+ ", place=" + place + ", gender=" + gender + ", id=" + id + "]";
	}

}
