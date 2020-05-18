package com.gcg.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gcg.app.beans.Category;
import com.gcg.app.beans.Event;
import com.gcg.app.beans.Venue;
import com.gcg.app.service.CategoryService;
import com.gcg.app.service.EventsService;
import com.gcg.app.service.VenueService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
@RestController
public class MainRestController {

	/*@Autowired
	private EventsService eventsService;
	@Autowired
	private CategoryService categoryService; 
	@Autowired
	private VenueService venueService;
	
	@RequestMapping("/home")
	public String home(){
		return "you are at home";
	}
	@RequestMapping(value="/getAllEvents", method=RequestMethod.GET)
	public List<Event> getEvents(){
		return eventsService.getAllEvents();
	}
	@RequestMapping(value="/addEvent", method=RequestMethod.POST)
	public void addEvent(@RequestBody Event event){
		eventsService.addEvent(event);
	}
	
	@RequestMapping(value="/addCategory", method=RequestMethod.POST)
	public void addCategory(@RequestBody Category category){
		categoryService.addCategory(category);
	}
	
	@RequestMapping(value="/getAllCategories", method=RequestMethod.GET)
	public List<Category> getAllCategories(){
		return categoryService.getAllCategories();
	}
	
	@RequestMapping(value="addVenue", method=RequestMethod.POST)
	public void addVenue(@RequestBody Venue venue){
		 venueService.addVenue(venue);
	}*/
		
	}
