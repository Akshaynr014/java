package com.dyashin.crud;


import com.dyashin.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Display {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = emf.createEntityManager();
		Student info = entityManager.find(Student.class, 5);
		System.out.println("Student Id : " + info.getId());
		System.out.println("Student Name : " + info.getName());
		System.out.println("Student Age : " + info.getAge());

		entityManager.close();
		emf.close();

	}

}