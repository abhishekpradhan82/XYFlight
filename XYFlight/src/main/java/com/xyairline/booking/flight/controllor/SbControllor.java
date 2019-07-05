package com.xyairline.booking.flight.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyairline.booking.flight.businesslayer.BusinessLayerImpl;
import com.xyairline.booking.flight.model.FlightListModel;
import com.xyairline.booking.flight.model.PlaneModel;
import com.xyairline.booking.flight.model.SeatAvailabilityModel;


@RestController
@RequestMapping("/XYAirlines/Flight")
public class SbControllor {
	
	@Autowired
	BusinessLayerImpl blService;
	
	@RequestMapping("/")
	public String home()
	{
		return "Welcome";
	}
	
	
	@RequestMapping("/getFlightDetails/{flid}")
	public FlightListModel getFlightDetails(@PathVariable("flid") int flid)
	{	
		return blService.getFlightDetails(flid);
		
	}
	
	@RequestMapping("/getAvailableSeats/{flid}")
	public SeatAvailabilityModel findAvailableSeats(@PathVariable("flid") int flid)
	{	
		return blService.findAvailableSeats(flid);
		
	}
	
	@RequestMapping("/getFlightsByRoute/{routeid}")
	public FlightListModel getFlightsByRoute(@PathVariable("routeid") int rid)
	{	
		return blService.getFlightsByRoute(rid);
		
	}
	
	@RequestMapping("/getPlaneDetails/{planeid}")
	public PlaneModel getPlaneDetails(@PathVariable("planeid") int pid)
	{	
		return blService.getPlaneDetails(pid);
		
	}
	
}
