package com.spring.india.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.india.dto.EmployeeDTO;

@RestController
public class RegisterController {
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ResponseEntity<Object> registerEmpInfo(@RequestParam("eid") int eid, @RequestParam("name") String name, 
			@RequestParam("email") String email,@RequestParam("phone") long phone) {
		System.out.println("RegisterController---registerEmpInfo()");
		System.out.println(eid+"\t"+name+"\t"+email+"\t"+phone);
		
		return null;
	}
	
	@RequestMapping(value="/register1",method=RequestMethod.POST)
	public ResponseEntity<EmployeeDTO> registerEmpInfo1(@RequestBody EmployeeDTO body) {
		System.out.println("RegisterController---registerEmpInfo1()");
		System.out.println(body.getEid()+"\t"+body.getName()+"\t"+body.getEmail()+"\t"+body.getPhone());
		
		return new ResponseEntity<>(body,HttpStatus.CREATED);
	}

}
