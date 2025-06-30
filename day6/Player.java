package com.dyashincollection.cursor;

public class Player implements Comparable<Player> {
	String name;
	int ranking;
	int age;
	public Player(String name, int ranking, int age) {
		super();
		this.name = name;
		this.ranking = ranking;
		this.age = age;
	}
	@Override
	public String toString() {
		return " name=" + name + ", ranking=" + ranking + ", age=" + age ;
	}
	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return this.ranking-o.ranking;
	}
	


}
