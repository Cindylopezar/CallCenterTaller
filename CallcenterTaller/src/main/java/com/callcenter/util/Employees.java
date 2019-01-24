package com.callcenter.util;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.callcenter.controller.AnsweredCalls;

@Entity
public class Employees {
	@Id
	private int idEmployees;
	private String firstName;
	private String secondName;
	private String phonenumber;
	private String typeEmployee;
	private boolean disponibility;
	
	@OneToMany(mappedBy="employees")
	private List<AnsweredCalls> answeredCalls;

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
	
	public Employees() {
		super();

	}

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



	public int getId() {
		return idEmployees;
	}

	public void setId(int id) {
		this.idEmployees = idEmployees;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getTypeEmployee() {
		return typeEmployee;
	}

	public void setTypeEmployee(String typeEmployee) {
		this.typeEmployee = typeEmployee;
	}

	public boolean isdisponibility() {
		return disponibility;
	}

	public void setdisponibility(boolean disponibility) {
		this.disponibility = disponibility;
	}



	public List<AnsweredCalls> getAnsweredCalls() {
		return answeredCalls;
	}

	public void setAnsweredCalls(List<AnsweredCalls> answeredCalls) {
		this.answeredCalls = answeredCalls;
	}


}
