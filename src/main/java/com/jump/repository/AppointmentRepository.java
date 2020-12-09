package com.jump.repository;

import org.springframework.data.repository.CrudRepository;

import com.jump.model.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
	
	public Appointment findByVisitId(int visitId);

}
