package com.callcenter.util;

import java.util.Date;

public class Call {
	private int idCall;
	private Date duration;
	private String phoneNumber;

	public Call(int idCall, Date duration, String phoneNumber) {
	
		this.idCall = idCall;
		this.duration = duration;
		this.phoneNumber = phoneNumber;
	}

	public int getIdCall() {
		return idCall;
	}

	public void setIdCall(int idCall) {
		this.idCall = idCall;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "CallLost [idCall=" + idCall + ", duration=" + duration + ", phoneNumber=" + phoneNumber + "]";
	}

}
