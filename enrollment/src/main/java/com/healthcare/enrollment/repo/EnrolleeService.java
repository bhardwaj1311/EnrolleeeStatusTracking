package com.healthcare.enrollment.repo;

import java.util.List;
import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.enrollment.iRepo.IEnrollee;
import com.healthcare.enrollment.model.Enrollee;

@Service
@Transactional
public class EnrolleeService {
	
	private static final Logger log = Logger.getLogger(EnrolleeService.class.getName());

	@Autowired
	private IEnrollee repo;
	
	public List<Enrollee> listAll(){
		return repo.findAll();
	}
	
	public void save(Enrollee enrollee) {
		repo.save(enrollee);
	}
	
	public Enrollee get(Long id) {
	    return repo.findById(id).get();
	}
	     
	 public void delete(Long id) {
	    repo.deleteById(id);
	}

}
