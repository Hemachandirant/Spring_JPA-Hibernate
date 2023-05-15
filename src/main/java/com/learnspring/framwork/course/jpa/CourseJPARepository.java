package com.learnspring.framwork.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learnspring.framwork.course.jdbc.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void removeByID(long id) {
		Course find =  entityManager.find(Course.class, id);
		entityManager.remove(find);
	}
}
