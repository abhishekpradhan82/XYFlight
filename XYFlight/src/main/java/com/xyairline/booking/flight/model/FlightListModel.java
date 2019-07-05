package com.xyairline.booking.flight.model;

import java.util.List;

import com.xyairline.booking.flight.jpa.model.Flight;



public class FlightListModel{
	
	private List<Flight> flights;

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	@Override
	public String toString() {
		return "FlightModel [flights=" + flights + "]";
	}
	
	
	
}
