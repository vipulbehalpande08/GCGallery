package com.gcg.app.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import com.gcg.app.beans.Event;
@Transactional
@Mapper
public interface EventDao {

	public int addEvent( Event event);
	public void updateEvent(Event event);
	public void removeEventById(int eventId);
	public List<Event> getAllEvents();
	public List<Event> getPastEvents();
	public List<Event> getupcomingEvents();
	public List<Event> getCurrentEvents();
	public List<Event> getEventsByCategoryIds(String categories);
	public List<Event> getEventsByArtistId(String artistId);
	public List<Event> getEventsByDate(Date date);
	public List<Event> getEventsByYear(String year);
	public List<Event> getFilteredEvents(@Param("eventName") String eventName,@Param("startDate")Date startDate, @Param("endDate")Date endStart, @Param("sortingKey") int sortingOrder);
	public void updateGalleryPathById(@Param("eventId") int eventId,@Param("galleryPath") String galleryPath);
}
