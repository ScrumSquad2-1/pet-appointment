package com.jump;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.jump.model.Appointment;
import com.jump.repository.AppointmentRepository;

@EnableEurekaClient
@SpringBootApplication
public class AppointmentServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentServiceApplication.class, args);
	}
	
	@Autowired
	AppointmentRepository apptRepo;

	@Override
	public void run(String... args) throws Exception {
		// initialize db with test entries for frontend testing
		
		apptRepo.save(new Appointment(1));
		apptRepo.save(new Appointment(2));
		apptRepo.save(new Appointment(3));
		apptRepo.save(new Appointment(4));
		apptRepo.save(new Appointment(5));
		apptRepo.save(new Appointment(6));
		
	}
	
	

}
