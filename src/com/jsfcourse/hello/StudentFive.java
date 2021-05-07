package com.jsfcourse.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentFive {

	private String firstName;
	private String lastName;
	private String language;

	public StudentFive() {
		firstName = "Mary";
		lastName = "Public";
		language = "Java";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getlanguage() {
		return language;
	}

	public void setlanguage(String language) {
		this.language = language;
	}

}
