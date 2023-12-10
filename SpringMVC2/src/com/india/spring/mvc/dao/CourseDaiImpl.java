/*package com.india.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDaiImpl {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public List<String> getCourses(){
		
		return(List<String>) hibernateTemplate.loadAll(Course.class);
	}
	
	public void register(Course c) {
		
		hibernateTemplate.save(c);
	}

}
*/