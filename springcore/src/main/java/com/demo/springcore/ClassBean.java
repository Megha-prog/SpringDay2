package com.demo.springcore;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan;
@Configuration
@ComponentScan("basePackage = com.demo.springcore")


public class ClassBean {
	@Bean("velBean")
	public Car CarBean() {
		return new Car();
		
	}
	@Bean("EngineBean")
	public Engine EngineBean() {
		return new Engine();
		
	}
	
}
