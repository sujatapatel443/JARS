package com.india.spring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.india.spring.A;
import com.india.spring.B;

@Component
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
