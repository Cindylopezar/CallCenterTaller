package com.callcenter.persistence;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.callcenter.controller.AnsweredCalls;
import com.callcenter.controller.MissCall;
import com.callcenter.util.Call;
import com.callcenter.util.Employees;

/**
 * PersistenceManager.
 *
 * @author Cindy Sarahi Lopez Argueta <mailto:csargueta@stefanini.com />
 * @version 
 * @see 
 * @since 02-05-2019 11:40:23 AM 2019
 */
public class PersistenceManager {

/** Attribute that determine factory. */
private EntityManagerFactory factory = Persistence.createEntityManagerFactory("callcenter");
	
	/** Attribute that determine manager. */
	private EntityManager manager = factory.createEntityManager();

	/**
	 * Insert calls answered.
	 *
	 * @param call the call
	 * @param date the date
	 * @param employees the employees
	 */
	public void insertAnsweredCalls(Call call, Date date, Employees employees) {

		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		manager.persist(new AnsweredCalls(call, date, employees));
		tx.commit();

	}

	/**
	 * Insert incoming calls.
	 *
	 * @param call the call
	 * @param date the date
	 */
	public void insertCall(Call call, Date date) {

		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		manager.persist(new Call());
		tx.commit();
	}
	

	/**
	 * Insert call lost.
	 *
	 * @param call the call
	 */
	public void insertMissCall(Call call) {

		EntityTransaction tx = manager.getTransaction();
		Date dateTimeout = new Date();
		tx.begin();

		manager.persist(new MissCall(call, dateTimeout));
		tx.commit();

	}

	/**
	 * List employees.
	 *
	 * @return the list
	 */
	public List<Employees> listEmployees() {

		List<Employees> resultList = manager.createQuery("Select a From Employees a", Employees.class)
				.getResultList();
		return resultList;
	}

	/**
	 * Modify disponibility.
	 *
	 * @param employees the employees
	 */
	public void modifyDisponibility(Employees employees) {

		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		Employees anEmployees= manager.find(Employees.class, employees.getIdEmployees());
		anEmployees.setDisponibility(false);
		manager.persist(anEmployees);
		tx.commit();
		
	} 

}
