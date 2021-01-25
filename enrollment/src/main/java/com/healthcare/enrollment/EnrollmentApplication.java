package com.healthcare.enrollment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
 * @EnableAutoConfiguration
 * 
 * @ComponentScan(basePackages={"com.healthcare.erollment.controllers"})
 * 
 * @EnableJpaRepositories(basePackages ={"com.healthcare.enrollment.repo"})
 * 
 * @EntityScan(basePackages = {"com.healthcare.enrollment.model"})
 */
public class EnrollmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnrollmentApplication.class, args);
	}

}
