package com.dyashin.jpql;

import com.dyashin.dto.Student;
import jakarta.persistence.*;

public class SelectUsingJPQL {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        String jpql = "SELECT s FROM StudentInfo s WHERE s.id = :id";
        TypedQuery<Student> query = em.createQuery(jpql, Student.class);
        query.setParameter("id", 5);

        Student student = query.getSingleResult();
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        em.close();
        emf.close();
    }
}

