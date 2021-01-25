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

import com.healthcare.enrollment.model.Dependent;
import com.healthcare.enrollment.repo.DependentService;

@RestController
@RequestMapping("/dependent")
public class DependentController {
	private static final Logger log = Logger.getLogger(DependentController.class.getName());
	@Autowired
	private DependentService service;
	
	@GetMapping("/getAllDependent/{Id}")
	public List<Dependent> list(@PathVariable Long id) {
		log.info("Getting all dependents");
	    return service.listAll(id);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Dependent> get(@PathVariable Long id) {
	    try {
	    	Dependent dependent = service.get(id);
	        return new ResponseEntity<Dependent>(dependent, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Dependent>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@PostMapping("/addDependent")
	public ResponseEntity<Dependent> add(@RequestBody Dependent dependent) {
		try {
			service.save(dependent);
	        return new ResponseEntity<Dependent>(dependent, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Dependent>(HttpStatus.INTERNAL_SERVER_ERROR);
	    } 
	}
	
	@PutMapping("/updateDependent/{id}")
	public ResponseEntity<?> update(@RequestBody Dependent dependent, @PathVariable Long id) {
	    try {
	    	Dependent existEnrollee = service.get(id);//checking if the enrollee exists in the DB or not.
	        service.save(dependent);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@DeleteMapping("/deleteDependent/{id}")
	public void delete(@PathVariable Long id) {
	    service.delete(id);
	}
}
