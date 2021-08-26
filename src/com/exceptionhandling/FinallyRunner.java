package com.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
		int[] numbers = { 12, 3, 5, 7, 9 };
		int number = numbers[12];
		

	} catch (Exception ex) {
		ex.printStackTrace();
	} finally {
		System.out.println("Before Scanner close");
		if (scanner != null) {
			scanner.close();
		}

	}
	System.out.println("Just before closing out main");
	}

}
