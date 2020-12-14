package com.jump.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jump.model.Visit;

@FeignClient(name = "pet-visit")
@Service
public interface VisitService {
	
	@GetMapping("/{id}")
	Visit getVisitById(@PathVariable int id);
	
}
