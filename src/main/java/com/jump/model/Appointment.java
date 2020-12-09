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
	
	private int visitId;
	
	private boolean completed;
	private boolean paid;
	private boolean cancelled;
	private String notes;
	
	public Appointment(int visitId) {
		super();
		this.visitId = visitId;
		this.completed = false;
		this.paid = false;
		this.cancelled = false;
		this.notes = "";
	}
	
}
