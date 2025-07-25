package com.dyashin.jpql;

import jakarta.persistence.*;

public class DeleteUsingJPQL {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        String jpql = "DELETE FROM StudentInfo s WHERE s.id = :id";
        Query query = em.createQuery(jpql);
        query.setParameter("id", 5);
        int deleted = query.executeUpdate();

        System.out.println(deleted + " record(s) deleted");
        tx.commit();
        em.close();
        emf.close();
    }
}
