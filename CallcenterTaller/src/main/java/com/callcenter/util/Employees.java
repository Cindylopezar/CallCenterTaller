package com.callcenter.util;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.callcenter.controller.AnsweredCalls;

/**
 * Employees.
 *
 * @author Cindy Sarahi Lopez Argueta <mailto:csargueta@stefanini.com />
 * @version 
 * @see 
 * @since 02-04-2019 10:49:33 AM 2019
 */
@Entity
public class Employees {
	
	/** Attribute that determine idEmployees. */
	@Id
	private int idEmployees;
	
	/** Attribute that determine firstName. */
	private String firstName;
	
	/** Attribute that determine secondName. */
	private String secondName;
	
	/** Attribute that determine phonenumber. */
	private String phonenumber;
	
	/** Attribute that determine typeEmployee. */
	private String typeEmployee;
	
	/** Attribute that determine disponibility. */
	private boolean disponibility;
	
	/** Attribute that determine answeredCalls. */
	@OneToMany(mappedBy="employees")
	private List<AnsweredCalls> answeredCalls;

	/**
	 * Instantiates a new employees.
	 *
	 * @param idEmployees the id employees
	 * @param firstName the first name
	 * @param secondName the second name
	 * @param phonenumber the phonenumber
	 * @param typeEmployee the type employee
	 * @param disponibility the disponibility
	 */
	public Employees(int idEmployees, String firstName, String secondName, String phonenumber, String typeEmployee,
			boolean disponibility) {
		super();
		this.idEmployees = idEmployees;
		this.firstName = firstName;
		this.secondName = secondName;
		this.phonenumber = phonenumber;
		this.typeEmployee = typeEmployee;
		this.disponibility = disponibility;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (disponibility ? 1231 : 1237);
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + idEmployees;
		result = prime * result + ((phonenumber == null) ? 0 : phonenumber.hashCode());
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
		result = prime * result + ((typeEmployee == null) ? 0 : typeEmployee.hashCode());
		return result;
	}
	
	/**
	 * Instantiates a new employees.
	 */
	public Employees() {
		super();

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
		Employees other = (Employees) obj;
		if (disponibility != other.disponibility)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (idEmployees != other.idEmployees)
			return false;
		if (phonenumber == null) {
			if (other.phonenumber != null)
				return false;
		} else if (!phonenumber.equals(other.phonenumber))
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		if (typeEmployee == null) {
			if (other.typeEmployee != null)
				return false;
		} else if (!typeEmployee.equals(other.typeEmployee))
			return false;
		return true;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getIdEmployees() {
		return idEmployees;
	}

	/**
	 * Sets the id employees.
	 *
	 * @param idEmployees the new id employees
	 */
	public void setIdEmployees(int idEmployees) {
		this.idEmployees = idEmployees;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the second name.
	 *
	 * @return the second name
	 */
	public String getSecondName() {
		return secondName;
	}

	/**
	 * Sets the second name.
	 *
	 * @param secondName the new second name
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/**
	 * Gets the phonenumber.
	 *
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * Sets the phonenumber.
	 *
	 * @param phonenumber the new phonenumber
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * Gets the type employee.
	 *
	 * @return the type employee
	 */
	public String getTypeEmployee() {
		return typeEmployee;
	}

	/**
	 * Sets the type employee.
	 *
	 * @param typeEmployee the new type employee
	 */
	public void setTypeEmployee(String typeEmployee) {
		this.typeEmployee = typeEmployee;
	}

	/**
	 * Checks if is disponibility.
	 *
	 * @return true, if is disponibility
	 */
	public boolean isdisponibility() {
		return disponibility;
	}

	/**
	 * Sets the disponibility.
	 *
	 * @param disponibility the new disponibility
	 */
	public void setDisponibility(boolean disponibility) {
		this.disponibility = disponibility;
	}



	/**
	 * Gets the answered calls.
	 *
	 * @return the answered calls
	 */
	public List<AnsweredCalls> getAnsweredCalls() {
		return answeredCalls;
	}

	/**
	 * Sets the answered calls.
	 *
	 * @param answeredCalls the new answered calls
	 */
	public void setAnsweredCalls(List<AnsweredCalls> answeredCalls) {
		this.answeredCalls = answeredCalls;
	}


}
