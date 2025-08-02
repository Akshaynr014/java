package com.dyashin.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentInfo {

	Address address;
public  StudentInfo() {
	
}
	//constructor
//	public StudentInfo(Address address) {
//		
//		this.address = address;
//	}

//setter
	public void setAddress(Address address) {
		this.address = address;
	}


	public void doStaff() {
		System.out.println("StudentInfo");
         address.home();
	}
}
