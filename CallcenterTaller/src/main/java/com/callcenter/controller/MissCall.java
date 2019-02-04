package com.callcenter.controller;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.callcenter.util.Call;

/**
 * MissCall.
 *
 * @author Cindy Sarahi Lopez Argueta <mailto:csargueta@stefanini.com />
 * @version 
 * @see 
 * @since 02-04-2019 10:49:17 AM 2019
 */
@Entity
public class MissCall {
	
	/** Attribute that determine idMissCall. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMissCall;
	
	/** Attribute that determine dateMissCall. */
	private Date dateMissCall;
	
	/** Attribute that determine call. */
	@ManyToOne
	@JoinColumn(name="idCall")
	private Call call;
	
	/**
	 * Instantiates a new miss call.
	 *
	 * @param idMissCall the id miss call
	 */
	public MissCall(int idMissCall) {
		super();
		this.idMissCall = idMissCall;
	}
	

	/**
	 * Gets the id miss call.
	 *
	 * @return the id miss call
	 */
	public int getIdMissCall() {
		return idMissCall;
	}

	/**
	 * Sets the id miss call.
	 *
	 * @param idMissCall the new id miss call
	 */
	public void setIdMissCall(int idMissCall) {
		this.idMissCall = idMissCall;
	}

	/**
	 * Gets the date miss call.
	 *
	 * @return the date miss call
	 */
	public Date getDateMissCall() {
		return dateMissCall;
	}

	/**
	 * Sets the date miss call.
	 *
	 * @param dateMissCall the new date miss call
	 */
	public void setDateMissCall(Date dateMissCall) {
		this.dateMissCall = dateMissCall;
	}

	/**
	 * Gets the call.
	 *
	 * @return the call
	 */
	public Call getCall() {
		return call;
	}

	/**
	 * Sets the call.
	 *
	 * @param call the new call
	 */
	public void setCall(Call call) {
		this.call = call;
	}
	
	/**
	 * Instantiates a new miss call.
	 */
	public MissCall() {
		super();
	}
 
}
