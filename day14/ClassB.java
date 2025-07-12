package com.dyashin.myjdbcapp.abstraction1;

public class ClassB implements Connection {

	@Override
	public Statement createStatement() {
		// TODO Auto-generated method stub
		System.out.println("class B implements class");
		return new ClassY();
		
		
	}

}
