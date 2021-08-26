package com.OPPs2;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw Materials");
		System.out.println("Get the Utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("do the dish");

	}

	@Override
	void claenup() {
		System.out.println("Claenup the Utensils");

	}

}
