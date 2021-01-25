package com.healthcare.enrollment.iRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.healthcare.enrollment.model.Dependent;


public interface IDependent extends JpaRepository<Dependent, Long> {
	
	@Query("FROM user_enrollee_dependents WHERE enrollee_master_Id = ?1")
	List<Dependent> findAllDependentsForEnrollee(Long Id);

}
