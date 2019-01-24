package com.callcenter.test;

import static org.junit.Assert.assertNotNull;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;


public class EmployeesTest {
	EntityManagerFactory emf;
	EntityManager em;
	
	@Before
	 public void iniciar() {
		 Persistence.generateSchema("callcenter", null);
		 emf= Persistence.createEntityManagerFactory("callcenter");
	 }
	@Test
	public void entityManagerFactoryOK() {
		assertNotNull(emf);
	}
	
}
