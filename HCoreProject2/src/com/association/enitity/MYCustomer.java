package com.association.enitity;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="testcustomer")
public class MYCustomer {
	
	@Id
	private int cid;
	
	private String fname;
	
	private String lname;
	
	@OneToMany(mappedBy="customer")
	private Collection<Request> requests;

	public MYCustomer() {
	}

	public MYCustomer(int cid, String fname, String lname) {
		this.cid = cid;
		this.fname = fname;
		this.lname = lname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Collection<Request> getRequests() {
		return requests;
	}

	public void setRequests(Collection<Request> requests) {
		this.requests = requests;
	}
	
	

}
