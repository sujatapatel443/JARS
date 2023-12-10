package com.india.hibernate.entity;

import javax.persistence.*;


@Entity
@Table(name="csttest")
public class Customer2 {
	
	@Id
	@Basic
	private Integer cid;
	
	private String fname;
	
	private String lname;
	
	private String email;
	
	private String phone;
	
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date tstamp;
	
	@Version
	private int version;
	
	
	public java.util.Date getTstamp() {
		return tstamp;
	}

	public void setTstamp(java.util.Date tstamp) {
		this.tstamp = tstamp;
	}

	@OneToOne
	@JoinColumn(name="aid")
	private Address2 address;

	public Customer2() {
		
	}

	public Customer2(Integer cid, String fname, String lname, String email, String phone) {
		super();
		this.cid = cid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address2 getAddress() {
		return address;
	}

	public void setAddress(Address2 address) {
		this.address = address;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	
	

}
