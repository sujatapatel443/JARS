package com.india.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.india.spring.component.Hello;

public class Lab1 {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Lab8Configuration.class);
		System.out.println("Spring Container is ready...");
		
		Hello ref=(Hello)ctx.getBean(Hello.class);
		ref.show();
	}

}
