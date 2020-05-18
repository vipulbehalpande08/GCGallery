package com.gcg.app.service;

import java.util.List;

import com.gcg.app.beans.Message;
import com.gcg.app.beans.Venue;

public interface VenueService {

	public Message addVenue(Venue venue);
	public Message updateVenue(Venue venue);
	public Message updateAvailability(String availability);
	public List<Venue> getAllVenue();
	public void removeVenueById(int venueId);
}
