package com.association.enitity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="raccount")
public class TAccount {
	
	@Id
	private int reqId;
	
	private String reqDate;
	
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date tstamp;
	
	public Date getTstamp() {
		return tstamp;
	}

	public void setTstamp(Date tstamp) {
		this.tstamp = tstamp;
	}

	@ManyToMany(mappedBy="accounts")
	private Collection<TCustomer> customeres;

	public TAccount() {
	}

	public TAccount(int reqId, String reqDate, String description) {
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

	public Collection<TCustomer> getCustomeres() {
		return customeres;
	}

	public void setCustomeres(Collection<TCustomer> customeres) {
		this.customeres = customeres;
	}

	
	
	
	

}
