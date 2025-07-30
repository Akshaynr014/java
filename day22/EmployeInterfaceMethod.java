package com.dyashin.spcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//interface method
public class EmployeInterfaceMethod implements InitializingBean,DisposableBean {
	private String name;
	private int age;

//    public Employe(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
	public EmployeInterfaceMethod() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name='" + name + "', age=" + age;
	}
//public void init() throws Exception{
//	System.out.println("init");
//}
//public void destroy() throws Exception{
//	System.out.println("Destr");
//}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialize");
		
	}

}
