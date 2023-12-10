package com.india.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
	@Id
	private Integer aid;
	
	private String street;
	
	private String city;
	
	private String state;

	public Address(Integer aid, String street, String city, String state) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public Address() {
		
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
	
	
	

}
