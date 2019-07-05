package com.xyairline.booking.flight.businesslayer;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xyairline.booking.flight.dao.FlightCRUD;
import com.xyairline.booking.flight.dao.PlaneCRUD;
import com.xyairline.booking.flight.jpa.model.Flight;
import com.xyairline.booking.flight.jpa.model.Plane;
import com.xyairline.booking.flight.model.FlightListModel;
import com.xyairline.booking.flight.model.PlaneModel;
import com.xyairline.booking.flight.model.SeatAvailabilityModel;



@Service
public class BusinessLayerImpl implements BusinessLayerInterface {
	
	
	@Autowired
	FlightCRUD flightDao;
	
	@Autowired
	PlaneCRUD planeDao;
	
	@Override
	public FlightListModel getFlightDetails(int flid) {
		
		FlightListModel fv = new FlightListModel();
		
		Flight fl = flightDao.findById(flid).orElse(new Flight());
		
		fv.setFlights(Arrays.asList(fl));
		
		// TODO Auto-generated method stub
		return fv;
	}


	@Override
	public SeatAvailabilityModel findAvailableSeats(int flid) {
		// TODO Auto-generated method stub
		
		SeatAvailabilityModel sam = new  SeatAvailabilityModel();
		
		Flight fl = flightDao.findById(flid).orElse(new Flight());
		Plane p = planeDao.findById(fl.getPlaneid()).orElse(new Plane());
		int totalSeats = p.getNoOfSeats();
		//int bookedSeats = ticketDao.getBookedSeatCount(flid);
		
		//int totalSeats = 0;
		int bookedSeats = 0;
		
		sam.setFlt(fl);
		sam.setAsofDt(LocalDateTime.now());
		sam.setNoOfOpenSeats(totalSeats-bookedSeats);
		sam.setNoOfTotalSeats(totalSeats);
		
		return sam;
	}


	@Override
	public FlightListModel getFlightsByRoute(int rid) {
		// TODO Auto-generated method stub
		
		List<Flight> flts = flightDao.getFlightsByRoute(rid);
		FlightListModel fv = new FlightListModel();
		
		fv.setFlights(flts);
		
		return fv;
	}


	public PlaneModel getPlaneDetails(int pid) {
		// TODO Auto-generated method stub
		
		Plane p = planeDao.findById(pid).orElse(new Plane());
		
		PlaneModel pm = new PlaneModel(p.getPlaneid(),p.getPlaneName(),p.getCarearName(),p.getNoOfSeats());
		
		return pm;
	}
	
	

	
}
