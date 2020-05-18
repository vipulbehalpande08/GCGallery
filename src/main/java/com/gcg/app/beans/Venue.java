package com.gcg.app.beans;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Venue {

	private int venueId;
	private String venueName;
	private String description;
	private String contact;
	private String emailId;
	private String street;
	private String area;
	private String city;
	private String region;
	private String country;
	private String pin;
	private String isAvailable;
	private String galleryPath;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fromDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date toDate;
	private String isStall;
	private int availableStalls;
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getGalleryPath() {
		return galleryPath;
	}
	public void setGalleryPath(String galleryPath) {
		this.galleryPath = galleryPath;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public String getIsStall() {
		return isStall;
	}
	public void setIsStall(String isStall) {
		this.isStall = isStall;
	}
	public int getAvailableStalls() {
		return availableStalls;
	}
	public void setAvailableStalls(int availableStalls) {
		this.availableStalls = availableStalls;
	}
	
}
