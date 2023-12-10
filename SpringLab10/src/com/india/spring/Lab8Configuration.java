package com.india.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.india.spring"})

public class Lab8Configuration {
	
	@Bean
	public A getA() {
		
		return new A(100,"Raj");
	}
	
	@Bean
	public B getB() {
		
		return new B(999,"Helo Guys");
		
	}
	
	@Bean
	public StringBuffer getSBObject() {
		return new StringBuffer("HHGHGKKKJKJKJJJ");
	}

}
