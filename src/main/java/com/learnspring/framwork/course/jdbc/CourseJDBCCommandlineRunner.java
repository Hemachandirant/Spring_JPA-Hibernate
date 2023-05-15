//package com.learnspring.framwork.course.jdbc;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class CourseJDBCCommandlineRunner implements CommandLineRunner{
//	
//	@Autowired
//	private CourseJDBCRepository repository;
//
//	
//	
//	
//	@Override
//	public void run(String... args) throws Exception {
//		repository.insert(new Course(1,"AWS","Hemachandiran"));
//		repository.insert(new Course(2,"AWS","Hemachandiran"));
//		repository.insert(new Course(3,"AWS","Hemachandiran"));
//		repository.insert(new Course(4,"AWS","Hemachandiran"));
//		repository.insert(new Course(5,"AWS","Hemachandiran"));
//		repository.insert(new Course(6,"AWS","Hemachandiran"));
//		repository.insert(new Course(7,"AWS","Hemachandiran"));
//		repository.insert(new Course(8,"AWS","Hemachandiran"));
//		repository.insert(new Course(9,"AWS","Hemachandiran"));
//		
//		repository.delete(1);
//		
//	}
//
//}
