package com.jump.controller.advice;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jump.exception.AppointmentIdMismatchException;
import com.jump.exception.AppointmentNotFoundException;

@RestControllerAdvice
public class AppointmentControllerAdvice {

	@ExceptionHandler(AppointmentNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleAppointmentNotFound(AppointmentNotFoundException e) {
		ExceptionResponse response = new ExceptionResponse("Appointment not found", "Appointment-404", LocalDate.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	
	@ExceptionHandler(AppointmentIdMismatchException.class)
	public ResponseEntity<ExceptionResponse> handleAppointmentIdMismatch(AppointmentIdMismatchException e) {
		ExceptionResponse response = new ExceptionResponse("Path ID and appointment body ID do not match", "Appointment-400", LocalDate.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}
	
}
