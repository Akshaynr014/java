package com.akshay.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
private static final EntityManagerFactory emf;
static {
	try {
		emf=Persistence.createEntityManagerFactory("myPersistenceUnit");
		
	}catch(Throwable ex) {
		System.out.println("Initial EntityManagerFactory creation failed." + ex);
		 throw new ExceptionInInitializerError(ex);
	}
}
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	public static void close() {
		emf.close();
	}
}

