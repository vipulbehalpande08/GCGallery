package com.gcg.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import com.gcg.app.beans.Venue;

@Transactional
@Mapper
public interface VenueDao {
	public int addVenue(Venue venue);
	public int updateVenue(Venue venue);
	public int updateAvailability(String availability);
	public List<Venue> getAllVenue();
	public void removeVenueById(@Param("venueId") int venueId);
	
}
