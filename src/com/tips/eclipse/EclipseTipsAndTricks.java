package com.tips.eclipse;

import java.math.BigDecimal;

class Test implements Comparable<String> {

	@Override
	public int compareTo(String o) {
		return 0;
	}

}

public class EclipseTipsAndTricks {

	public static void main(String[] args) throws InterruptedException {

		DummyForTest dt = new DummyForTest();
		dt.doSomething();

		BigDecimal bd = new BigDecimal(24);
		Thread.sleep(returnSomething());
	}

	private static int returnSomething() {
		return 1000 * 20 * 15;
	}

}
