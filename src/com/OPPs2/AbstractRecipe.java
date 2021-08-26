package com.OPPs2;

public abstract class AbstractRecipe {
	
	public void execute() {
		getReady();
		doTheDish();
		claenup();
	}
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void claenup();
	

}
