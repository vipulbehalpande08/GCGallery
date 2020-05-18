package com.gcg.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gcg.app.beans.Message;
import com.gcg.app.beans.Venue;
import com.gcg.app.service.VenueService;
import com.gcg.app.util.Constants;
import com.gcg.app.util.Utils;
@RequestMapping(value="/api/venue")
@RestController
public class VenueController {

	@Autowired
	private VenueService venueService;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Message addVenue(@RequestBody Venue venue){
		return venueService.addVenue(venue);
	}
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Venue> getAllVenue(){
		return venueService.getAllVenue();
	}
	@RequestMapping(value="/removeById/{venueId}", method=RequestMethod.DELETE)
	public void removeVenueById(@PathVariable int venueId){
		venueService.removeVenueById(venueId);
	}
	@RequestMapping(value="/uploadFile/{venueId}", method=RequestMethod.POST)
	public void uploadFiles(@RequestParam("file") MultipartFile file, @PathVariable String venueId){
		
		Utils.uploadFile(Constants.VENUE_UPLOAD_PATH+venueId+"/", file, "venue");
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void updateVenue(@RequestBody Venue venue){
		venueService.updateVenue(venue);
	}
}
