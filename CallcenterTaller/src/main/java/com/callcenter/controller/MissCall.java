package com.callcenter.controller;

import java.util.Date;

public class MissCall {
	private int id;
	private Date dateMissCall;
	
	public MissCall(int id) {
		super();
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateMissCall() {
		return dateMissCall;
	}
	public void setDateMissCall(Date dateMissCall) {
		this.dateMissCall = dateMissCall;
	}
	
 
}
