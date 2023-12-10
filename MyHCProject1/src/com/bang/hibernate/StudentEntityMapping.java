package com.bang.hibernate;


import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="studreslt")
public class StudentEntityMapping {
	
	@Id
	private int sid;
	private String name;
	private String dob;
	private String qualification;
	
	@CollectionOfElements
	@JoinTable(name="cousrestest",joinColumns=@JoinColumn(name="sid"))
	@IndexColumn(name="idx")
	private String[] cousres;
	
	@CollectionOfElements
	@JoinTable(name="emailtest",joinColumns=@JoinColumn(name="sid"))
	@IndexColumn(name="idx")
	private List <String> email;
	
	@CollectionOfElements
	@JoinTable(name="markstest",joinColumns=@JoinColumn(name="sid"))
	private List<Integer> marks;
	
	@CollectionOfElements
	@JoinTable(name="phonetest",joinColumns=@JoinColumn(name="sid"))
	private Set<Long> phone;
	public StudentEntityMapping() {
		
	}
	public StudentEntityMapping(int sid, String name, String dob, String qualification, String[] cousres,
			List <String> email, List<Integer> marks, Set<Long> phone) {
		this.sid = sid;
		this.name = name;
		this.dob = dob;
		this.qualification = qualification;
		this.cousres = cousres;
		this.email=email;
		this.marks = marks;
		this.phone = phone;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String[] getCousres() {
		return cousres;
	}
	public void setCousres(String[] cousres) {
		this.cousres = cousres;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public Set<Long> getPhone() {
		return phone;
	}
	public void setPhone(Set<Long> phone) {
		this.phone = phone;
	}
	
	
	
	

}
