package com.jump.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Visit {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="VISITDATE")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date visitDate;
	
	private String service;
	
	@Column(name="PETID")
	private int petId;
	
	@Column(name="CUSTOMERID")
	private int customerId;
	
	@Column(name="DOCTORID")
	private int doctorId;
}
