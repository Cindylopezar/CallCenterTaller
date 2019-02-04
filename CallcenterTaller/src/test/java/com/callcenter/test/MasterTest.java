package com.callcenter.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class MasterTest {
	static EntityManagerFactory emf;
	protected EntityManager em;

	@BeforeClass
	public static void setupStatic() {
		Persistence.generateSchema("callcenter", null);
		emf = Persistence.createEntityManagerFactory("callcenter");
	}

	@Before
	public void setup() {
	
		
		em = emf.createEntityManager();
	}

	@After
	public void tearDown() {
		em.clear();
		em.close();
	
	}

	@AfterClass
	public static void tearDownStatic() {
		
		emf.close();
	}
}
