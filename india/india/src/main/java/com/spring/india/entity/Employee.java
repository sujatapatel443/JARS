package com.spring.india.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee1")
public class Employee {
	
	@Id
	Integer eid;
	String name;
	String email;
	long phone;
	
	
	public Employee() {
	}


	public Employee(int eid, String name, String email, long phone) {
		super();
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "EmployeeDTO [eid=" + eid + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	

}
