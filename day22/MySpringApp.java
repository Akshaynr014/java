package com.dyashin.spcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
	public static void main(String[] args) {

		// Load Spring context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Get two instances of the 'myvehicle' bean
		Vehicle vehicle = context.getBean("myvehicle", Vehicle.class);
		Vehicle vehicle1 = context.getBean("myvehicle", Vehicle.class);

		// Compare scope (singleton vs prototype)
		System.out.println("Are both vehicle beans the same? " + (vehicle == vehicle1));

		// Print vehicle info
		System.out.println("Vehicle milage: " + vehicle.milage());
		System.out.println("Vehicle discount: " + vehicle.getDiscount());

		// Get and print Employe bean
		EmployeInterfaceMethod emp = context.getBean("employee", EmployeInterfaceMethod.class);
		System.out.println("Employee: " + emp); // Requires toString() method in Employe class

		EmployeeXmlMethod bean = context.getBean("Bean", EmployeeXmlMethod.class);
		System.out.println("Bean is Excecuted"+bean);

		context.close();
	}
}
