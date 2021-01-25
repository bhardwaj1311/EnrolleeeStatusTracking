package com.healthcare.enrollment.repo;

import java.util.List;
import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.healthcare.enrollment.controllers.DependentController;
import com.healthcare.enrollment.iRepo.IDependent;
import com.healthcare.enrollment.model.Dependent;

@Service
@Transactional
public class DependentService {
	
	private static final Logger log = Logger.getLogger(DependentService.class.getName());
	private IDependent repo;
	
	public List<Dependent> listAll(Long Id) {
        return repo.findAllDependentsForEnrollee(Id);
    }
     
    public void save(Dependent dependent) {
        repo.save(dependent);
    }
     
    public Dependent get(Long id) {
        return repo.findById(id).get();
    }
     
    public void delete(Long id) {
        repo.deleteById(id);
    }

}
