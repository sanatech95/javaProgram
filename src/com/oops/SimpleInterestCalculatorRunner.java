package com.oops;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");

		BigDecimal totalValue =calculator.calculateTotalValue(new BigDecimal(5)); //5 years
		
		System.out.println(totalValue);



	}

	

	
	}

