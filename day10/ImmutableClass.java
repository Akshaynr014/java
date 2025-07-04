package com.dyashincollection.map;

public final class ImmutableClass {
	private final String name;
	private final int id;

	public ImmutableClass(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

}
