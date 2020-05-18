package com.gcg.app.beans;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Event {

	private int eventId;
	private String eventName;
	private String description;
	private String artistId;
	private float price;
	private String isPaid;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	private int venueId;
	private String galleryPath;
	private int categoryId;
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getArtistId() {
		return artistId;
	}
	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getIsPaid() {
		return isPaid;
	}
	public void setIsPaid(String isPaid) {
		this.isPaid = isPaid;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	public String getGalleryPath() {
		return galleryPath;
	}
	public void setGalleryPath(String galleryPath) {
		this.galleryPath = galleryPath;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
}
