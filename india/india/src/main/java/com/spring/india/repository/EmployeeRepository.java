package com.spring.india.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.india.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
