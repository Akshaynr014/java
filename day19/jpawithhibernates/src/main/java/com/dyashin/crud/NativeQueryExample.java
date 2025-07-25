package com.dyashin.crud;

import com.dyashin.dto.Student;

import jakarta.persistence.*;
import java.util.List;

public class NativeQueryExample {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        // Native SQL query (hardcoded)
        String sql = "SELECT * FROM student WHERE stud_name = ?";

        Query nativeQuery = em.createNativeQuery(sql, Student.class);
        nativeQuery.setParameter(1, "whitey");  // index-based parameter

        List<Student> students = nativeQuery.getResultList();

        for (Student s : students) {
            System.out.println("ID   : " + s.getId());
            System.out.println("Name : " + s.getName());
            System.out.println("Age  : " + s.getAge());
            System.out.println("---------------");
        }

        em.close();
        emf.close();
    }
}
