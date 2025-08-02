package com.dyashin.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//		Vehicle vehicle = context.getBean("car", Vehicle.class);
//		System.out.println(vehicle.milage());
		
		//student info when multiple implementation by bean use qualified or primary
		StudentInfo studentInfo = context.getBean("studentInfo", StudentInfo.class);
		studentInfo.doStaff();
		
		//using autowire for bike and engine
//		Bike bike=context.getBean("bike",Bike.class);
//		bike.start();
	
		//after using has a relationship no need this  with help of autowire
//		Engine engine=context.getBean("engine",Engine.class);
//		engine.stop();

		context.close();
	}
}
