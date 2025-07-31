package com.dyashin.configure;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApp {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	StudentInfo student = context.getBean("studentInfo",StudentInfo.class);
	student.doStaff();
	context.close();
}
}
