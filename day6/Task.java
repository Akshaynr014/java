package com.dyashincollectionfm.list;

public abstract class Task {
	private String name;
	private String number;

	public Task(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", number=" + number + "]";
	}

	abstract  void hello() ;

	
}
