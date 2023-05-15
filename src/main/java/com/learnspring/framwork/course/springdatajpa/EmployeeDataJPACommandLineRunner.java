package com.learnspring.framwork.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class EmployeeDataJPACommandLineRunner implements CommandLineRunner {

	@Autowired
	private EmployeeSpringDataJPARrepository dataJPARrepository;
	@Override
	public void run(String... args) throws Exception {
		
		
		dataJPARrepository.save(new Employee(1, "Hemachandiran", "Software Engineer"));
		dataJPARrepository.save(new Employee(2, "John", "Engineering Manager"));
		dataJPARrepository.save(new Employee(3, "Rohit", "Software Engineer 2" ));
		dataJPARrepository.save(new Employee(4, "Telusko", "Project Manager"));
		
		
		dataJPARrepository.deleteById(2);
		System.out.println(dataJPARrepository.findAll());
	}
	
	

}
