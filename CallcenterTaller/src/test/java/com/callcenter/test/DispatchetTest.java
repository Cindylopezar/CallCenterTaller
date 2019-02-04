package com.callcenter.test;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;



public class DispatchetTest extends MasterTest {
	@Test
	public void entityManagerFactoryOK() {
		
		assertNotNull(emf);
	}
	
	@Test
	public void entityManagerOK() {
		
		assertNotNull(em);
	}
}
