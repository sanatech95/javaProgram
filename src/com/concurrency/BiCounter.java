package com.concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;

	public void incrementI() {
		i++;
		// get i
		// increment
		// set i

	}

	public int getI() {
		return i;
	}

	public void incrementJ() {
		j++;
		// get i
		// increment
		// set i

	}

	public int getJ() {
		return j;
	}
}

