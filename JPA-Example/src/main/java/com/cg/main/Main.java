package com.cg.main;

import java.util.List;
import java.time.LocalDate;

import com.cg.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main {
	
	public static void main(String[] args) {
		Product p = new Product(101, "Iphone 17" , 125000 , 5 , LocalDate.of(2025, 11, 16));
		Product p1 = new Product(102, "Dell" , 127000 , 2 , LocalDate.of(2025, 9, 16));
		Product p2 = new Product(103, "HP" , 175000 , 6 , LocalDate.of(2025, 12, 16));
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
//		tx.begin();
//		em.persist(p2);
//		tx.commit();
//		System.out.println("created");
		
		Query q = em.createQuery("select p from Product p");
		
		List<Product> l = q.getResultList();
		
		System.out.println(l);
		
	}
}
