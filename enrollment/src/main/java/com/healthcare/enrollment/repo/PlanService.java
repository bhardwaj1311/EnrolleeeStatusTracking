package com.healthcare.enrollment.repo;

import java.util.List;
import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.healthcare.enrollment.iRepo.IPlan;
import com.healthcare.enrollment.model.Plan;

@Service
@Transactional
public class PlanService {
	private static final Logger log = Logger.getLogger(PlanService.class.getName());
	private IPlan repo;
	
	public List<Plan> listAll() {
        return repo.findAll();
    }
     
    public void save(Plan plan) {
        repo.save(plan);
    }
     
    public Plan get(Long id) {
        return repo.findById(id).get();
    }
     
    public void delete(Long id) {
        repo.deleteById(id);
    }

}
