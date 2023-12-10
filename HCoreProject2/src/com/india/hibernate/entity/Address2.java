package com.india.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name="adrtest")
public class Address2 {
	@Id
	private Integer aid;
	
	private String street;
	
	private String city;
	
	private String state;
	
	@OneToOne(mappedBy="address")
	private Customer2 cst;


	public Address2(Integer aid, String street, String city, String state) {
		
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.state=state;
	}

	public Address2() {
		
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Customer2 getCst() {
		return cst;
	}

	public void setCst(Customer2 cst) {
		this.cst = cst;
	}
	

}
