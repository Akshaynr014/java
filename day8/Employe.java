package com.dyashincollection.map;

public class Employe  {
	String name;
	int id;
	String address;
	

	public Employe(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}


	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", address=" + address;
	}
	
	

}
