
package com.dyashincollectionfm.list;

public class JavaNewClass implements JavaNewFeDefultMeInInterFace {

	@Override
	public void doStaff() {
		System.out.println("ok - doStaff");
	}

	@Override
	public void doStaff1() {
		System.out.println("ok - doStaff1");
	}

	@Override
	public void doStaff2() {
		System.out.println("ok - doStaff2");
	}

	public static void main(String[] args) {
		JavaNewClass javaNewClass = new JavaNewClass();

		// Calling implemented methods
		javaNewClass.doStaff();
		javaNewClass.doStaff1();
		javaNewClass.doStaff2();

		// ✅ Calling default methods
		javaNewClass.eat();
		javaNewClass.eat2();

		// ✅ Calling static method from interface
		JavaNewFeDefultMeInInterFace.drink();
	}
}
