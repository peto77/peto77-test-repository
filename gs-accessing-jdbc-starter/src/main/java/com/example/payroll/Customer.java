package com.example.payroll;

public class Customer {
	private long id;
	private String firstName, lastName;

	public Customer(long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
	  return String.format(
	      "Customer[id=%d, firstName='%s', lastName='%s']",
	      id, firstName, lastName);
	}

	long getId() {
		return id;
	}

	void setId(long id) {
		this.id = id;
	}

	String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
