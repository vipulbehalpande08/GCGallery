package com.gcg.app.beans;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Donation {

	private int donationId;
	private String firstName;
	private String lastName;
	private String emailId;
	private float donationAmount;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date donationDate;
	private String status;
	public int getDonationId() {
		return donationId;
	}
	public void setDonationId(int donationId) {
		this.donationId = donationId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public float getDonationAmount() {
		return donationAmount;
	}
	public void setDonationAmount(float donationAmount) {
		this.donationAmount = donationAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
}
