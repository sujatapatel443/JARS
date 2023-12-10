package com.india.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	
	@Autowired
	private A ao; 
	
	@Autowired
	private B bo; 
	
	public void show() {
		ao.showA();
		bo.showB();
		
	}

}
