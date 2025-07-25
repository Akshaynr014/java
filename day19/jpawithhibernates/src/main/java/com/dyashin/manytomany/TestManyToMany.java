package com.dyashin.manytomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestManyToMany {
public static void main(String[] args) {
	StudentInfo sInfo = new StudentInfo();
	sInfo.setSid(1);
	sInfo.setSname("akshay");
	
	StudentInfo sInfo1 = new StudentInfo();
	sInfo1.setSid(2);
	sInfo1.setSname("virat");
	
	ArrayList<StudentInfo> arrayList = new ArrayList<StudentInfo>();
	arrayList.add(sInfo);
	arrayList.add(sInfo1);
	
	CourseInfo cInfo = new CourseInfo();
	cInfo.setCid(111);
	cInfo.setCname("Java");
	cInfo.setStudentInfo(arrayList);
	
	 List<CourseInfo> courseList = new ArrayList<>();
     courseList.add(cInfo);
     sInfo.setCourseInfo(courseList);   
     sInfo.setCourseInfo(courseList);
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
	EntityManager entityManager = emf.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	
	CourseInfo course = entityManager.find(CourseInfo.class, 111);
	System.out.println("Course: " + course.getCname());
	for (StudentInfo s : course.getStudentInfo()) {
	    System.out.println("Student: " + s.getSname());
	}
	
	
	
	transaction.begin();
//	entityManager.persist(cInfo);
	transaction.commit();
	entityManager.close();
	emf.close();
}
}
