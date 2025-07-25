package com.dyashin.crud;


import com.dyashin.dto.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateStudent {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Step 1: Fetch the existing student record
        Student student = em.find(Student.class, 5);  // Existing ID

        if (student != null) {
            // Step 2: Modify the fields
            student.setName("Updated Whitey");
            student.setAge(22);

            // No need to explicitly call `em.merge()` if you're inside a transaction
            // and the entity is managed (like from find()).
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }

        tx.commit();
        em.close();
        emf.close();
    }
}

