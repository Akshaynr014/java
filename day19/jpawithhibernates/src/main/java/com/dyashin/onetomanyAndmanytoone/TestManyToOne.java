package com.dyashin.onetomanyAndmanytoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestManyToOne {
    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        
        PencilBox box = new PencilBox();
        box.setId(112);
        box.setName("apsara");
        
        Pencil pencil1 = new Pencil();
        pencil1.setId(5);
        pencil1.setName("ccc");
        pencil1.setPencilBox(box);

        try {
            emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
            manager = emf.createEntityManager();
            transaction = manager.getTransaction();
//            PencilBox box1 =manager.find(PencilBox.class, 111);
            transaction.begin();
          
//            pencil1.setPencilBox(box1);
          manager.persist(pencil1);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            if (manager != null) {
                manager.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }
}
