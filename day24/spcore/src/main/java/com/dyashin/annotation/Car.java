package com.dyashin.annotation;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {

	@Override
	public String milage() {
		return "Car mileage is 15 km/l";
	}

}
