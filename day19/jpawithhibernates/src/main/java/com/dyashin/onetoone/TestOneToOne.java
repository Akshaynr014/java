package com.dyashin.onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestOneToOne {
public static void main(String[] args) {
	VoterCard card = new VoterCard();
	card.setId(1222);
	card.setName("Akshay voter card");
	
	User user = new User();
	user.setId(2);
	user.setName("Akshayaaaa");
	
	user.setVcard(card);
	
	

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
	EntityManager entityManager = emf.createEntityManager();
	
	//bidirection
	VoterCard vcard=entityManager.find(VoterCard.class, 1222);
	System.out.println(vcard.getId());
	System.out.println(vcard.getName());
	System.out.println(vcard.getUser().getId());
	System.out.println(vcard.getUser().getName());
	
	
	//uni directional
//	EntityTransaction transaction= entityManager.getTransaction();
//	transaction.begin();
//	
//	entityManager.persist(user);
//	
//	System.out.println("user Record inserted sucessfully");
//	transaction.commit();
	entityManager.close();
	emf.close();

}
}
