package com.india.spring;

public class Hello {
	
	private A aobj; //SI
	
	private B bobj; //CI


	public void setAobj(A aobj) {
		this.aobj = aobj;
	}


	public Hello(B bobj) {
		
		this.bobj = bobj;
	}
	
	public void show() {
		aobj.showA();
		bobj.showB();
		
	}
	
	

}
