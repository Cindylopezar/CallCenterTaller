package com.callcenter.util;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Call.
 *
 * @author Cindy Sarahi Lopez Argueta <mailto:csargueta@stefanini.com />
 * @version 
 * @see 
 * @since 02-04-2019 10:49:28 AM 2019
 */
@Entity
public class Call {
	
	/** Attribute that determine idCall. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCall;
	
	/** Attribute that determine duration. */
	private Date duration;
	
	/** Attribute that determine phoneNumber. */
	private String phoneNumber;

	/**
	 * Instantiates a new call.
	 *
	 * @param idCall the id call
	 * @param duration the duration
	 * @param phoneNumber the phone number
	 */
	public Call(int idCall, Date duration, String phoneNumber) {
	
		this.idCall = idCall;
		this.duration = duration;
		this.phoneNumber = phoneNumber;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + idCall;
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Call other = (Call) obj;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (idCall != other.idCall)
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}


	/**
	 * Gets the id call.
	 *
	 * @return the id call
	 */
	public int getIdCall() {
		return idCall;
	}

	/**
	 * Sets the id call.
	 *
	 * @param idCall the new id call
	 */
	public void setIdCall(int idCall) {
		this.idCall = idCall;
	}

	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public Date getDuration() {
		return duration;
	}

	/**
	 * Sets the duration.
	 *
	 * @param duration the new duration
	 */
	public void setDuration(Date duration) {
		this.duration = duration;
	}

	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	/**
	 * Instantiates a new call.
	 */
	public Call() {
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CallLost [idCall=" + idCall + ", duration=" + duration + ", phoneNumber=" + phoneNumber + "]";
	}

}
