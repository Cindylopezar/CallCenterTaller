package com.callcenter.test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import com.callcenter.manager.Dispatcher;
import com.callcenter.util.Call;
import com.callcenter.util.Employees;


public class DispatchetTest {
	@Test
	public void DispatcherTest() {
		Date dateFirst = new Date();
		Call call = new Call(1, dateFirst, "9378-8990");
		Call call2 = new Call(2, dateFirst, "9458-9872");
		Call call3 = new Call(3, dateFirst, "9867-1092");
		Call call4 = new Call(4, dateFirst, "9889-2918");
		Call call5 = new Call(5, dateFirst, "9801-1237");
		Call call10 = new Call(10, dateFirst, "9348-8798");
		Call call9 = new Call(9, dateFirst, "9567-8798");
		Call call8 = new Call(8, dateFirst, "9908-8798");
		Call call6 = new Call(6, dateFirst, "9090-8798");
		Call call7 = new Call(7, dateFirst, "9098-8798");
		List<Employees> employee = new ArrayList<Employees>();
		Employees employeeTest = new Employees(1, "Manuel", "Lopez", "9878-1234", "operator", true);
		Employees employeeTest2 = new Employees(2, "Jose", "Rodriguez", "9878-1221", "operator", false);
		Employees employeeTest3 = new Employees(3, "Leonardo", "Herrera", "9909-1234", "operator", false);
		Employees employeeTest4 = new Employees(4, "Joel", "Osorio", "9098-0980", "operator", true);
		Employees employeeTest5 = new Employees(5, "Felipe", "Calderon", "9456-9876", "supervisor", false);
		Employees employeeTest6 = new Employees(6, "Maximiliano", "Perez", "9908-0000", "director", true);

		employee.add(0, employeeTest);
		employee.add(1, employeeTest2);
		employee.add(2, employeeTest3);
		employee.add(3, employeeTest6);
		employee.add(4, employeeTest5);
		employee.add(5, employeeTest4);

		Dispatcher dispatcher2 = new Dispatcher(call2, employee);
		Dispatcher dispatcher = new Dispatcher(call, employee);
		Dispatcher dispatcher3 = new Dispatcher(call3, employee);
		Dispatcher dispatcher4 = new Dispatcher(call4, employee);
		Dispatcher dispatcher5 = new Dispatcher(call5, employee);
		Dispatcher dispatcher10 = new Dispatcher(call10, employee);
		Dispatcher dispatcher8 = new Dispatcher(call8, employee);
		Dispatcher dispatcher6 = new Dispatcher(call6, employee);
		Dispatcher dispatcher9 = new Dispatcher(call9, employee);
		Dispatcher dispatcher7 = new Dispatcher(call7, employee);

		dispatcher2.start();
		dispatcher5.start();
		dispatcher3.start();
		dispatcher4.start();
		dispatcher.start();
		dispatcher7.start();
		dispatcher6.start();
		dispatcher9.start();
		dispatcher8.start();
		dispatcher10.start();
	}
}
