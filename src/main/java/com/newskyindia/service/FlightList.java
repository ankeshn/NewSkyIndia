package com.newskyindia.service;

import java.util.List;

import com.newskyindia.model.Flights;



public class FlightList {
	
	
	private List<Flights> flights;
	public List<Flights> getAllFlights(){
		return flights;
	}

	
	
	public void setFlights(List<Flights> flights) {
	       this.flights=flights;
	}
}
