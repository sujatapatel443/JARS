package com.sp.util;

public class Employee implements Comparable<Employee>{
	private int eid;
	private String name;
	private long salary;
	Employee(){
		
	}
	public Employee(int eid, String name, long salary) {
		super();
		this.eid = eid;
		this.name = name;
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if(this.eid<o.eid) {
			return -1;
		}
		else if(this.eid>o.eid) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

	

}
