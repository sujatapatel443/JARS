package com.india.spring.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/course.do")
	public String getCourses(HttpServletRequest req)throws Exception {
		 System.out.println(req.getRequestURI());
		ArrayList<String> courseList=courseService.getCourses();
		
		 req.setAttribute("AL", courseList);
		 
		 req.setAttribute("MSG", "Course list successfully found");
		 
		return "show";
	}
	
	@RequestMapping(value="/hai.do")
	public String getHai(HttpServletRequest req)throws Exception {
		
		req.setAttribute("HMSG", "Hello everyone in Current class.."); 
		return "hai";
	}
	

}
