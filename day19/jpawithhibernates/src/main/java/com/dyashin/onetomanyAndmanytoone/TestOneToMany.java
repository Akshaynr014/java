package com.dyashin.onetomanyAndmanytoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestOneToMany {
public static void main(String[] args) {
	  EntityManagerFactory emf = null;
      EntityManager manager = null;
      EntityTransaction transaction = null;
      
     try {
    	  emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
          manager = emf.createEntityManager();
          transaction = manager.getTransaction();
          PencilBox box1 =manager.find(PencilBox.class, 112);
          System.out.println("box{}"+box1.getPencil().get(0).getId());
          
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
