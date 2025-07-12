package com.dyashin.lambda;

import java.util.Optional;

public class OptionalTest {
	String name;
	Optional<String> email;

	public OptionalTest(String name, String email) {
		super();
		this.name = name;
		this.email = Optional.ofNullable(email);
	}

	public String getName() {
		return name;
	}

	public Optional<String> getEmail() {
		return email;
	}

	public static void main(String[] args) {
		OptionalTest ot = new OptionalTest("akshay", "akshay@gmail.com");
		OptionalTest ot1 = new OptionalTest("virat", null);
		System.out.println(ot.getName() + " " + ot.getEmail());
		System.out.println(ot1.getName() + " " + ot1.getEmail());
		System.out.println(ot1.getEmail().orElse("email id is not present"));

	}
}
