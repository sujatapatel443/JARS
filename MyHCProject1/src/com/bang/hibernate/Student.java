package com.bang.hibernate;

import javax.persistence.*;

@Entity
@Table(name="studenttest")
public class Student {
	
	@Id
	@Column(name="sid")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="course")
	private String course;
	
	@Column(name="college")
	private String college;

	public Student(int id, String name, String address, String course, String college) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.course = course;
		this.college = college;
	}

	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	

}
