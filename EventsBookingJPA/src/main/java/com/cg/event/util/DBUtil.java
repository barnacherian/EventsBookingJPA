package com.cg.event.util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil 
{
	public static EntityManager getConnection() {
		EntityManager em=null;
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("eventsbookingsystem");
		em=entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		return em;
	}	
}
