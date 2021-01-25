package com.healthcare.enrollment.iRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.enrollment.model.Enrollee;

public interface IEnrollee extends JpaRepository<Enrollee, Long>{

}
