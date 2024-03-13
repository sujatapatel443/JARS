package com.spring.india.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.india.dto.EmployeeDTO;
import com.spring.india.service.RegitserService;

@RestController
public class RegisterController {
	
	@Autowired
	private RegitserService regitserService;
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ResponseEntity<EmployeeDTO> registerEmpInfo(@RequestParam("eid") int eid, @RequestParam("name") String name, 
			@RequestParam("email") String email,@RequestParam("phone") long phone) {
		System.out.println("RegisterController---registerEmpInfo()");
		
		EmployeeDTO employeeDTO=regitserService.registerEmpInfo(null);
		System.out.println(eid+"\t"+name+"\t"+email+"\t"+phone);
		
		return null;
	}
	
	@RequestMapping(value="/register1",method=RequestMethod.POST)
	public ResponseEntity<EmployeeDTO> registerEmpInfo1(@RequestBody EmployeeDTO body) {
		System.out.println("RegisterController---registerEmpInfo1()");
		System.out.println(body.getEid()+"\t"+body.getName()+"\t"+body.getEmail()+"\t"+body.getPhone());
		
		EmployeeDTO employeeDTO=regitserService.registerEmpInfo1(body);
		
		return new ResponseEntity<>(employeeDTO,HttpStatus.CREATED);
	}

}
