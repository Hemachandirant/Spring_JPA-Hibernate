package com.learnspring.framwork.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CourseJDBCRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	private String INSERT_QUERY = """
//			insert into course(id,name,author)
//			values(1,'AWS','Jeffbezos');
//			
//			""";
	
	private String UPDATE_QUERY = """
			 insert into course(id,name,author)
			 values(?,?,?);
			""";
	
	private String DELETE_QUERY = """
			 delete from course
			 where id=?;
			""";
	
//	public void insert() {
//		jdbcTemplate.update(INSERT_QUERY);
//	}
	
	public void insert(Course course) {
		jdbcTemplate.update(UPDATE_QUERY,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void delete(long id) {
		jdbcTemplate.update(DELETE_QUERY,id);
		}
}
