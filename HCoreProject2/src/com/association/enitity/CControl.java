package com.association.enitity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="ctrl")
public class CControl {
	
	@Id
	private int cid;
	
	private String name;
	
	@Version
	private int version;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date tstamp;

	public CControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CControl(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getTstamp() {
		return tstamp;
	}

	public void setTstamp(Date tstamp) {
		this.tstamp = tstamp;
	}

	

}
