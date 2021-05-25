package com.newskyindia.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newskyindia.model.Flights;
import com.newskyindia.model.User;
import com.newskyindia.repo.SearchRepository;
import com.newskyindia.service.RegistrationService;
import com.newskyindia.service.SearchService;

@RestController
public class SearchController {


	
	@Autowired
	private SearchRepository searchRepository;
	
	
	@Autowired
	private SearchService searchService;
	

    
    @PostMapping("/browse")
    @CrossOrigin(origins="http://localhost:4200")
    public List<Flights> browseFlights(@RequestBody Flights flights) throws Exception {
  	  String tempSource = flights.getSource();
  	  String tempDest = flights.getDest();
  	  
  	  List<Flights> flightsObj=null;
  	  if(tempSource!=null && tempDest!=null) {
  		  flightsObj = searchService.fetchFlightsBySourceAndDest(tempSource, tempDest);
  		  }
  	  
  	  if(flightsObj==null) {
  		  throw new Exception("No Flights Available");
  	  }
  	  return flightsObj;
  	  
    }
    
    
    
    
	
}
