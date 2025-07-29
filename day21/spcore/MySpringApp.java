package com.dyashin.spcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

       
        Vehicle vehicle = context.getBean("myvehicle", Vehicle.class);
        Vehicle vehicle1 = context.getBean("myvehicle", Vehicle.class);

       System.out.println(vehicle==vehicle1);
        System.out.println(vehicle.milage());
        
        System.out.println(vehicle.getDiscount());

       
        context.close();
    }
}
