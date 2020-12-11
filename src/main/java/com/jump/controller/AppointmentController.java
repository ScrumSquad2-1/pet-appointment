package com.jump.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jump.exception.AppointmentIdMismatchException;
import com.jump.model.Appointment;
import com.jump.service.AppointmentService;

@RestController
//@RequestMapping("appt")
public class AppointmentController {

	@Autowired
	AppointmentService apptServ;
	
	@GetMapping
	public ResponseEntity<List<Appointment>> getAppts() {
		return ResponseEntity.ok(apptServ.getAllAppts());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Appointment> getApptById (@PathVariable int id) {
		return ResponseEntity.ok(apptServ.getApptById(id));
	}
	
	@GetMapping("/visit/{id}")
	public ResponseEntity<Appointment> getApptByVisitId (@PathVariable int id) {
		return ResponseEntity.ok(apptServ.getApptByVisitId(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAppt(@PathVariable int id, @Valid @RequestBody Appointment appt) {
		if (id == appt.getAppointmentId()) {
			apptServ.updateAppt(appt);
			return ResponseEntity.ok("Appointment successfully updated");
		} else {
			throw new AppointmentIdMismatchException();
		}
	}
	
	@PostMapping
	public ResponseEntity<Appointment> addAppt(@RequestBody Appointment appt) throws URISyntaxException {
		Appointment target = apptServ.addAppt(appt);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(target.getAppointmentId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
}
