package com.akshay.app;

import com.akshay.model.User;
import com.akshay.util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class MainApp {

	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			 // ✅ CREATE
			User user1=new User("akshay", "akshaynr@gmail.com");
			User user2=new User("virat", "virat@gmail.com");
			em.persist(user1);
			em.persist(user2);
			
			// ✅ READ
			User FoundUser = em.find(User.class, user1.getId());
			System.out.println("Found User: " + FoundUser.getName() + ", " + FoundUser.getEmail());
		
			  // ✅ UPDATE
			  FoundUser.setEmail("akshay_updated@gmail.com");
	            em.merge(FoundUser);
	            
	            // ✅ DELETE
	           em.remove(FoundUser); // This deletes the user from DB
	           tx.commit();
		}catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
            JpaUtil.close();
	}

}
}
