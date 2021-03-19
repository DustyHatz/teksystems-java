package jpa.service;

import java.util.List;

import javax.persistence.TypedQuery;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

public class CourseService extends HelpersService implements CourseDAO {

	@Override
	public List<Course> getAllCourses() {
		
		List<Course> courses = null;
		
		connect();
		
		String getAllCourses = "SELECT c FROM Course c";
		
		TypedQuery<Course> query = em.createQuery(getAllCourses, Course.class);
		
		courses = query.getResultList();
		
		return courses;
	}
	
}
