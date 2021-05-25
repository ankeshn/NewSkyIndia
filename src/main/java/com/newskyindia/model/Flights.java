package com.newskyindia.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


	

@Document(collection="flights")
public class Flights {
	@Id
	private String fId;
	private String flightno;
	private String source;
	private String dest;
	private String departure;
	private String arrival;
	
	public Flights() {}

	public String getfId() {
		return fId;
	}

	public void setfId(String fId) {
		this.fId = fId;
	}

	public String getFlightno() {
		return flightno;
	}

	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public Flights(String fId, String flightno, String source, String dest, String departure, String arrival) {
		super();
		this.fId = fId;
		this.flightno = flightno;
		this.source = source;
		this.dest = dest;
		this.departure = departure;
		this.arrival = arrival;
	}

	@Override
	public String toString() {
		return "Domestic [fId=" + fId + ", flightno=" + flightno + ", source=" + source + ", dest=" + dest
				+ ", departure=" + departure + ", arrival=" + arrival + "]";
	}

	
	
	
	
}

