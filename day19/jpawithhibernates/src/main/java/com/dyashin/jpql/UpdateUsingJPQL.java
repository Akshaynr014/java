package com.dyashin.jpql;

import jakarta.persistence.*;

public class UpdateUsingJPQL {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        String jpql = "UPDATE StudentInfo s SET s.age = :age WHERE s.id = :id";
        Query query = em.createQuery(jpql);
        query.setParameter("age", 30);
        query.setParameter("id", 5);
        int updated = query.executeUpdate();

        System.out.println(updated + " record(s) updated");
        tx.commit();
        em.close();
        emf.close();
    }
}
