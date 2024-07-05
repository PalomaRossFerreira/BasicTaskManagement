package com.paloma.taskmanagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TaskmanagementApplication {

	public static void main(String[] args) {
		//Task t1 = new Task(null, "Criar Entity Manager", 0607, "Doing");.//
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Task t = em.find(Task.class, 1);
		
		System.out.println(t);
		
		//em.getTransaction().begin();//
		//em.persist(t1);//
		//em.getTransaction().commit();//
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
