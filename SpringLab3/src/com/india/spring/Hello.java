package com.india.spring;

public class Hello {
	
	private A ao; //SI
	
	private B bo; //SI

	public void setAo(A ao) {
		this.ao = ao;
	}

	public void setBo(B bo) {
		this.bo = bo;
	}
	
	
	public void show() {
		ao.showA();
		bo.showB();
		
	}

}
