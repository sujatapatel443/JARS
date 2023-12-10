package com.india.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	
	@Autowired
	@Qualifier("aobj1")
	private A ao; 
	
	@Resource
	private B bo; 
	
	public void show() {
		ao.showA();
		bo.showB();
		
	}

}
