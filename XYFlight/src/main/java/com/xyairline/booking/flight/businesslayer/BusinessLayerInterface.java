package com.xyairline.booking.flight.businesslayer;


import com.xyairline.booking.flight.model.FlightListModel;
import com.xyairline.booking.flight.model.PlaneModel;
import com.xyairline.booking.flight.model.SeatAvailabilityModel;

public interface BusinessLayerInterface {
	
	FlightListModel getFlightDetails(int flid) ;
	SeatAvailabilityModel findAvailableSeats(int flid);
	FlightListModel getFlightsByRoute(int rid);
	PlaneModel getPlaneDetails(int pid);

}
