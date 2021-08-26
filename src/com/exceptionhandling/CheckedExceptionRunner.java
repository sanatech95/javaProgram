package com.exceptionhandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		/*
		 * try { SomeOtherMethod(); Thread.sleep(2000); } catch (InterruptedException e)
		 * { e.printStackTrace(); }
		 */
		SomeOtherMethod2();

	}

	private static void SomeOtherMethod2() throws RuntimeException {

	}

	private static void SomeOtherMethod() throws InterruptedException {
		Thread.sleep(2000);

	}

}
