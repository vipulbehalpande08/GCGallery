package com.gcg.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gcg.app.beans.Event;
import com.gcg.app.service.EventsService;
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/api/event")
@RestController
public class EventController {
	
	@Autowired
	private EventsService eventService;
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Event> getAllEvents(){
		return eventService.getAllEvents();
	}
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public int addEvent(@RequestBody Event event){
		return eventService.addEvent(event).getId();
	}
	@RequestMapping(value="/getUpcomingEvents", method=RequestMethod.GET)
		public List<Event> getUpcomingEvents(){
			return eventService.getUpcomingEvents();
		}
	@RequestMapping(value="/getCurrentEvents", method=RequestMethod.GET)
	public List<Event> getCurrentEvents(){
		return eventService.getCurrentEvents();
	}
	@RequestMapping(value="/getPastEvents", method=RequestMethod.GET)
	public List<Event> getUpPastEvents(){
		return eventService.getPastEvents();
	}
	@RequestMapping(value="/remove/{eventId}", method=RequestMethod.DELETE)
	public void removeEventById(@PathVariable int eventId){
		eventService.removeEventById(eventId);
	}
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateEventById(@RequestBody Event event){
		eventService.updateEvent(event);
	}
	@RequestMapping(value="/searchEvent/{sortOrder}", method=RequestMethod.POST)
	public List<Event> getFilteredEvents(@RequestBody Event event, @PathVariable int sortOrder){
		return eventService.getFilteredEvents(event, sortOrder);
	}
}
