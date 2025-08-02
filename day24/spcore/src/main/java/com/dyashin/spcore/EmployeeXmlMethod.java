package com.dyashin.spcore;



public class EmployeeXmlMethod {
	private String name;
	private int age;

	private EmployeeXmlMethod() {
		System.out.println("instatiation");
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

	public void init() {
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("Destr");
	}

}
