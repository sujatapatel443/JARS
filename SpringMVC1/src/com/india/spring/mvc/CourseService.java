package com.india.spring.mvc;

import java.util.ArrayList;

public class CourseService {
	
	public ArrayList<String> getCourses(){
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");al.add("JSP");al.add("Servlet");al.add("JDBC");
		return al;
	}

}
