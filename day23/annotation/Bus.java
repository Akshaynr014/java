package com.dyashin.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bus")
@Primary
public class Bus implements Vehicle {

	@Override
	public String milage() {
		return "Bus mileage is 25 km/l";
	}

}
