package com.demo.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("velBean")
public class Car implements Vehichle {
	@Autowired
	@Value("bmw")
	Engine engine;
	public void drive() {
		System.out.println("Driving Car");
		engine.getBrand();
	}
	public void engine() {
		// TODO Auto-generated method stub
		
	}
}






