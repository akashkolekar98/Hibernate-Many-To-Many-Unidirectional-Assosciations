package com.jsp.person.cab;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TestController {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AKASH");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person=new Person();
		
		Cab cab=new Cab();
		
		Cab c1=new Cab();
		c1.setName("TATA");
		c1.setType("RED");
		
		Cab c2=new Cab();
		c2.setName("MARUTI");
		c2.setType("Normal");
		
		Cab c3=new Cab();
		c3.setName("MAH");
		c3.setType("BIG");
		
		ArrayList< Cab>a1=new ArrayList();
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		
		person.setName("Akash");
		person.setEmail("akash@gmail.com");
		person.setC_no(9892195830l);
		person.setCabs(a1);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
	

		entityTransaction.commit();
		System.out.println("all good");
		
		
		


	}
}
