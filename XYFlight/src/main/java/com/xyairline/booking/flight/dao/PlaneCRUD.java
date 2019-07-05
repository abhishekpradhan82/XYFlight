package com.xyairline.booking.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyairline.booking.flight.jpa.model.Plane;

@Repository
public interface PlaneCRUD extends JpaRepository<Plane, Integer> {


}
