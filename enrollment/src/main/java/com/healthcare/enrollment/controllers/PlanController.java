package com.healthcare.enrollment.controllers;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.enrollment.model.Plan;
import com.healthcare.enrollment.repo.PlanService;

@RestController
@RequestMapping("/HealthcarePlan")
public class PlanController {
	private static final Logger log = Logger.getLogger(PlanController.class.getName());
	@Autowired
	private PlanService service;
	
	@GetMapping("/getAllPlans")
	public List<Plan> list() {
	    return service.listAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Plan> get(@PathVariable Long id) {
	    try {
	    	Plan plan = service.get(id);
	        return new ResponseEntity<Plan>(plan, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Plan>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@PostMapping("/addPlan")
	public ResponseEntity<Plan> add(@RequestBody Plan plan) {
		try {
			service.save(plan);
	        return new ResponseEntity<Plan>(plan, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Plan>(HttpStatus.INTERNAL_SERVER_ERROR);
	    } 
	}
	
	@PutMapping("/updatePlan/{id}")
	public ResponseEntity<?> update(@RequestBody Plan plan, @PathVariable Long id) {
	    try {
	    	Plan existplan = service.get(id);
	        service.save(plan);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@DeleteMapping("/deletePlan/{id}")
	public void delete(@PathVariable Long id) {
	    service.delete(id);
	}
}
