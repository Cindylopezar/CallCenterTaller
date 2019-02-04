package com.callcenter.controller;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.callcenter.util.Call;
import com.callcenter.util.Employees;

/**
 * AnsweredCalls.
 *
 * @author Cindy Sarahi Lopez Argueta <mailto:csargueta@stefanini.com />
 * @version 
 * @see 
 * @since 02-04-2019 10:49:07 AM 2019
 */
@Entity
public class AnsweredCalls {
	
	/** Attribute that determine idAnsweredCall. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAnsweredCall;
	
	/** Attribute that determine dateAnsweredCall. */
	private Date dateAnsweredCall;
	
	/** Attribute that determine employees. */
	@ManyToOne
	@JoinColumn(name="idEmployees")
	private Employees employees;
	
	/** Attribute that determine call. */
	@ManyToOne
	@JoinColumn(name="idCall")
	private Call call;
	
	/**
	 * Instantiates a new answered calls.
	 *
	 * @param idAnsweredCall the id answered call
	 */
	public AnsweredCalls(int idAnsweredCall) {
		super();
		this.idAnsweredCall = idAnsweredCall;
	}
	
	/**
	 * Gets the id answered call.
	 *
	 * @return the id answered call
	 */
	public int getIdAnsweredCall() {
		return idAnsweredCall;
	}
	
	/**
	 * Sets the id answered call.
	 *
	 * @param idAnsweredCall the new id answered call
	 */
	public void setIdAnsweredCall(int idAnsweredCall) {
		this.idAnsweredCall = idAnsweredCall;
	}
	
	/**
	 * Gets the date answered call.
	 *
	 * @return the date answered call
	 */
	public Date getDateAnsweredCall() {
		return dateAnsweredCall;
	}
	
	/**
	 * Sets the date answered call.
	 *
	 * @param dateAnsweredCall the new date answered call
	 */
	public void setDateAnsweredCall(Date dateAnsweredCall) {
		this.dateAnsweredCall = dateAnsweredCall;
	}
	 	
	/**
	 * Gets the employees.
	 *
	 * @return the employees
	 */
	public Employees getEmployees() {
		return employees;
	}

	/**
	 * Sets the employees.
	 *
	 * @param employees the new employees
	 */
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	/**
	 * Instantiates a new answered calls.
	 *
	 * @param dateAnsweredCall the date answered call
	 * @param employees the employees
	 */
	public AnsweredCalls(Date dateAnsweredCall, Employees employees) {
		super();
		this.dateAnsweredCall = dateAnsweredCall;
		this.employees = employees;
	}

	/**
	 * Instantiates a new answered calls.
	 */
	public AnsweredCalls() {
		super();
	}

}
