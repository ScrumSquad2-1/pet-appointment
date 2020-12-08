package com.jump.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jump.repository.AppointmentRepository;
import com.jump.exception.AppointmentNotFoundException;
import com.jump.model.Appointment;

@Service
public class AppointmentService {
	
	@Autowired
	AppointmentRepository apptRepo;
	
	public List<Appointment> getAllAppts() {
		return (List<Appointment>) apptRepo.findAll();
	}
	
	public Appointment getApptById(int id) {
		return apptRepo.findById(id)
				.orElseThrow(AppointmentNotFoundException::new);
	}
	
	public List<Appointment> getApptsByDoctorId(int doctorId) {
		return apptRepo.findByDoctorId(doctorId);
	}
	
	public List<Appointment> getApptsByAppointmentCustomer(int appointmentCustomer) {
		return apptRepo.findByAppointmentCustomer(appointmentCustomer);
	}
	
	public List<Appointment> getApptsByPetId(int petId) {
		return apptRepo.findByPetId(petId);
	}
	
	public Appointment addAppt(@Valid Appointment appt) {
		return apptRepo.save(appt);
	}
	
	public Appointment updateAppt(@Valid Appointment appt) {
		getApptById(appt.getAppointmentId());
		return apptRepo.save(appt);
	}

}
