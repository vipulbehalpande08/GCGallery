package com.gcg.app.service;

import java.util.Date;
import java.util.List;

import com.gcg.app.beans.Event;
import com.gcg.app.beans.Message;

public interface EventsService {

	public Message addEvent(Event event);
	public void updateEvent(Event event);
	public void removeEventById(int eventId);
	public List<Event> getAllEvents();
	public List<Event> getPastEvents();
	public List<Event> getUpcomingEvents();
	public List<Event> getCurrentEvents();
	public void updateGalleryPathById(int eventId, String galleryPath);
	public List<Event> getFilteredEvents(Event event, int sortingOrder);
	public List<Event> getEventsByCategoryIds(String categories);
	public List<Event> getEventsByArtistId(String artistId);
	public List<Event> getEventsByDate(Date date);
	public List<Event> getEventsByYear(String year);
}
