package com.jump.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jump.model.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
	
	public List<Appointment> findByAppointmentCustomer(int appointmentCustomer);
	
	public List<Appointment> findByPetId(int petId);
	
	public List<Appointment> findByDoctorId(int doctorId);

}
