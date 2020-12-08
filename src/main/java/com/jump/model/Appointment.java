package com.jump.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;
	private int doctorId;
	private int appointmentCustomer;
	private int petId;
	
	public Appointment(int doctorId, int appointmentCustomer, int petId) {
		super();
		this.doctorId = doctorId;
		this.appointmentCustomer = appointmentCustomer;
		this.petId = petId;
	}
	
}
