package com.india.spring;

public class Hello {
	
	private A ao; //CI
	
	private B bo; //CI

	
	
	public Hello(A ao, B bo) {
		super();
		this.ao = ao;
		this.bo = bo;
	}



	public void show() {
		ao.showA();
		bo.showB();
		
	}

}
