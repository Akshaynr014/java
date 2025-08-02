package com.dyashin.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.dyashin.configure")
public class Config {
    @Bean
	public StudentInfo studentInfo() {
    	 StudentInfo student = new StudentInfo();
         student.setAddress(address()); // Setter injection
         return student;
         
		//return new StudentInfo(address());
	}
    
    @Bean
    public Address address() {
		return new Address();
    	
    }
}
