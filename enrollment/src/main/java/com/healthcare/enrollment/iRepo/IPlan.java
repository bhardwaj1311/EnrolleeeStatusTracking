package com.healthcare.enrollment.iRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.enrollment.model.Plan;

public interface IPlan extends JpaRepository<Plan, Long> {

}
