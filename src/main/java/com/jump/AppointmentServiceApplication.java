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
		
//		apptRepo.save(new Appointment(7));
//		apptRepo.save(new Appointment(8));
//		apptRepo.save(new Appointment(9));
//		apptRepo.save(new Appointment(10));
//		apptRepo.save(new Appointment(11));
//		apptRepo.save(new Appointment(12));
		
	}
	
	

}
