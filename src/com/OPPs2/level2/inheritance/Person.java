package com.OPPs2.level2.inheritance;

public class Person extends Object {
	private String name;
	private String email;
	private String phoneNumber;

	public Person(String name) {
		System.out.println("Person Constructor");
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		// return getClass().getName() + "#" + Integer.toHexString(hashCode());
		return name + "#" + email + "#" + phoneNumber;
	}

}
