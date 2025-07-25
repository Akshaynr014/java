package com.dyashin.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;




@Entity
@Table(name="student")
@NamedQuery(
	    name = "Student.findByName",
	    query = "SELECT s FROM Student s WHERE s.name = :name"
	)
public class Student {
	@Id
	@Column(name="stud_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="stud_name")
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
