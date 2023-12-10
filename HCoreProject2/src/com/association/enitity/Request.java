package com.association.enitity;

import javax.persistence.*;

@Entity
@Table(name="testrequest")
public class Request {
	
	@Id
	private int reqId;
	
	private String reqDate;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name="cid", referencedColumnName="cid")
	private MYCustomer customer;

	public Request() {
	}

	public Request(int reqId, String reqDate, String description) {
		super();
		this.reqId = reqId;
		this.reqDate = reqDate;
		this.description = description;
	}

	public int getReqId() {
		return reqId;
	}

	public void setReqId(int reqId) {
		this.reqId = reqId;
	}

	public String getReqDate() {
		return reqDate;
	}

	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MYCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(MYCustomer customer) {
		this.customer = customer;
	}
	
	
	

}
