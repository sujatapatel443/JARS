package com.spring.india.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.india.dto.EmployeeDTO;
import com.spring.india.entity.Employee;
import com.spring.india.repository.EmployeeRepository;
import com.spring.india.service.RegitserService;

@Service
public class RegitserServiceImpl implements RegitserService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeDTO registerEmpInfo(EmployeeDTO employeeDTO) {
		
		Employee employee=new Employee(employeeDTO.getEid(),employeeDTO.getName(),
				employeeDTO.getEmail(),employeeDTO.getPhone());
		Employee empl=employeeRepository.save(employee);
		EmployeeDTO emDTO=new EmployeeDTO(empl.getEid(),empl.getName(),empl.getEmail(),empl.getPhone());
		return emDTO;
	}

	@Override
	public EmployeeDTO registerEmpInfo1(EmployeeDTO employeeDTO) {
		Employee employee=new Employee(employeeDTO.getEid(),employeeDTO.getName(),
				employeeDTO.getEmail(),employeeDTO.getPhone());
		Employee empl=employeeRepository.save(employee);
		EmployeeDTO emDTO=new EmployeeDTO(empl.getEid(),empl.getName(),empl.getEmail(),empl.getPhone());
		return emDTO;
	}

}
