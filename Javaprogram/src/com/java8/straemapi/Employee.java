package com.java8.straemapi;

public class Employee {
	
	int eid;
	String name;
	long mob;
	String address;
	float salary;
	public Employee() {
		
	}
	public Employee(int eid, String name, long mob, String address,float salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.mob = mob;
		this.address = address;
		this.salary = salary;
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
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return eid+" "+name+" "+mob+" "+address+" "+salary;
	}
	

}
