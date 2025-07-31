package com.dyashin.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StudentInfo {
	@Autowired
	//@Qualifier("car")
	Vehicle vehicle;

	public void doStaff() {
		System.out.println("StudentInfo");
		System.out.println(vehicle.milage());
	}
}
