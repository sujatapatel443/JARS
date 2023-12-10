package com.india.spring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.india.spring.A;
import com.india.spring.B;

@Component
public class Hello {
	
	@Autowired
	private A getA; 
	
	@Autowired
	private B getB;
	
	@Autowired
	StringBuffer sb;
	
	
	
	public void show() {
		getA.showA();
		getB.showB();
		System.out.println("***********8");
		System.out.println(sb);
		System.out.println("***********8");
		
	}




	

}
