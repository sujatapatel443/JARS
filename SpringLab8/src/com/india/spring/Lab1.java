package com.india.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Lab8Configuration.class);
		System.out.println("Spring Container is ready...");
		//A a=(A)ctx.getBean(A.class);
		A a=(A)ctx.getBean("getA1");
		a.showA();
		
		B b=(B)ctx.getBean(B.class);
		b.showB();
	}

}
