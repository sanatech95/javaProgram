package com.OPPs2;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line 1", "Delhi", "870009");
		Customer customer = new Customer("sara", homeAddress);
		System.out.println(customer);
		
		Address workAddress = new Address("line 1 for work", "Delhi", "870018");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);

	}

}
