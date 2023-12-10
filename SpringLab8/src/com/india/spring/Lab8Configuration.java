package com.india.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Lab8Configuration {
	
	@Bean(name="a")
	public A getA() {
		
		return new A(100,"Raj");
	}
	
	@Bean
	public A getA1() {
		
		return new A(1001,"Raj Patel");
	}
	
	@Bean
	public B getB() {
		
		return new B(999,"Helo Guys");
		
	}

}
