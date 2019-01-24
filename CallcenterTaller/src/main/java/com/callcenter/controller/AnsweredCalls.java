package com.callcenter.controller;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.callcenter.util.Employees;

@Entity
public class AnsweredCalls {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAnsweredCall;
	private Date dateAnsweredCall;
	
	@ManyToOne
	@JoinColumn(name="idEmployees")
	private Employees employees;
	
	public AnsweredCalls(int idAnsweredCall) {
		super();
		this.idAnsweredCall = idAnsweredCall;
	}
	
	public int getIdAnsweredCall() {
		return idAnsweredCall;
	}
	public void setIdAnsweredCall(int idAnsweredCall) {
		this.idAnsweredCall = idAnsweredCall;
	}
	public Date getDateAnsweredCall() {
		return dateAnsweredCall;
	}
	public void setDateAnsweredCall(Date dateAnsweredCall) {
		this.dateAnsweredCall = dateAnsweredCall;
	}
	 	
	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public AnsweredCalls(Date dateAnsweredCall, Employees employees) {
		super();
		this.dateAnsweredCall = dateAnsweredCall;
		this.employees = employees;
	}

	public AnsweredCalls() {
		super();
	}

}
