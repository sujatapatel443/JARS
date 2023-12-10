package com.association.enitity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="rcustomer")
public class TCustomer {
	
	@Id
	private int cid;
	
	private String fname;
	
	private String lname;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date tstamp;
	
	@ManyToMany
	@JoinTable(name="rcust_account", joinColumns=@JoinColumn(name="cid", referencedColumnName="cid"),
	                                inverseJoinColumns=@JoinColumn(name="reqId",referencedColumnName="reqId") 
			
			)
	private Collection<TAccount> accounts;

	public TCustomer() {
	}

	public TCustomer(int cid, String fname, String lname) {
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

	public Collection<TAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(Collection<TAccount> accounts) {
		this.accounts = accounts;
	}

	public Date getTstamp() {
		return tstamp;
	}

	public void setTstamp(Date tstamp) {
		this.tstamp = tstamp;
	}

	
	
	

}
