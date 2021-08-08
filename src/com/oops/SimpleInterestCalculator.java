package com.oops;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {

		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));

	}

	public BigDecimal calculateTotalValue(BigDecimal noOfYears) {

		// total value= principal + principal * interest * noOfYears

		// BigDecimal principal;
		// BigDecimal interest;
		BigDecimal totalValue = (principal).add(principal.multiply(interest).multiply(noOfYears));

		return totalValue;
	}

}
