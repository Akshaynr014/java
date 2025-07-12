package com.dyashin.myjdbcapp.abstraction1;

public class ClassA implements Connection {

	@Override
	public Statement createStatement() {
		System.out.println("class A implements class");
		return  new ClassX();
		
	}

}
