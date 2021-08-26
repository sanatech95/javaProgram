package com.OPPs2;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw Materials");
		System.out.println("Switch on the microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("get stuff ready");
		System.out.println("put it the dish in microwave");

	}

	@Override
	void claenup() {
		System.out.println("Claenup the Utensils");
		System.out.println("Switch off the microwave");
	}

}
