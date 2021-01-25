package com.healthcare.enrollment.controllers;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.healthcare.enrollment.model.Enrollee;
import com.healthcare.enrollment.repo.EnrolleeService;

@RestController
@RequestMapping("/enrollee")
public class EnrolleeController {
	
	private static final Logger log = Logger.getLogger(EnrolleeController.class.getName());

	@Autowired
	private EnrolleeService service;
	
	@GetMapping("/getAll")
	public List<Enrollee> list() {
		log.info("Getting all Enrollees");
	    return service.listAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Enrollee> get(@PathVariable Long id) {
	    try {
	        Enrollee enrollee = service.get(id);
	        return new ResponseEntity<Enrollee>(enrollee, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Enrollee>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@PostMapping("/addEnrollee")
	public ResponseEntity<Enrollee> add(@RequestBody Enrollee enrollee) {
		try {
			service.save(enrollee);
	        return new ResponseEntity<Enrollee>(enrollee, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Enrollee>(HttpStatus.INTERNAL_SERVER_ERROR);
	    } 
	}
	
	@PutMapping("/updateEnrollee/{id}")
	public ResponseEntity<?> update(@RequestBody Enrollee enrollee, @PathVariable Long id) {
	    try {
	    	Enrollee existEnrollee = service.get(id);//checking if the enrollee exists in the DB or not.
	        service.save(enrollee);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@DeleteMapping("/deleteEnrollee/{id}")
	public void delete(@PathVariable Long id) {
	    service.delete(id);
	}
	
}
