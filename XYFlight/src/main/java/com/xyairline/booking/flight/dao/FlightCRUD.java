package com.xyairline.booking.flight.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.xyairline.booking.flight.jpa.model.Flight;

@Repository
public interface FlightCRUD extends JpaRepository<Flight, Integer> {
	
	@Query("select f from Flight f where f.routeId = ?1")
	List<Flight> getFlightsByRoute(int rid);


}
