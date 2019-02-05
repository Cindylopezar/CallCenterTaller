package com.callcenter.test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.callcenter.manager.Dispatcher;
import com.callcenter.util.Call;
import com.callcenter.util.Employees;



public class DispatchetTest extends MasterTest {
	@Test
	public void entityManagerFactoryOK() {
		
		assertNotNull(emf);
	}
	
	@Test
	public void entityManagerOK() {
		
		assertNotNull(em);
	}
	
	@Test
	public void dispatcherTest() {
		generatedCall("9378-8990");
		generatedCall("9378-8098");
		generatedCall("9378-8778");
		generatedCall("9801-1237");
		generatedCall("9889-2918");
		generatedCall("9378-8990");
		generatedCall("9867-1092");
		generatedCall("9458-9872");
		generatedCall("9878-0065");
		generatedCall("9662-3224");

	}

	public void generatedCall(String phoneNumber) {
		Date dateFirst = new Date();
		Call call = new Call(1, dateFirst, phoneNumber);
		Dispatcher dispatcher = new Dispatcher(call);
		dispatcher.dispatchCall(call);
	}
	
}
