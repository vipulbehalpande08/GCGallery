package com.gcg.app.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gcg.app.beans.Event;
import com.gcg.app.beans.User;
import com.gcg.app.beans.Venue;

public class EventModel {
	private Event event;
	private User user;
	private Venue venue;
	public EventModel(){
		
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	
}
