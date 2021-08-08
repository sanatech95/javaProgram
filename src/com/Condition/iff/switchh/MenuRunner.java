package com.Condition.iff.switchh;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		// Type obj = new Type(argument);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int Number1 = scanner.nextInt();
		// System.out.println("You are the Entered number is : " + Number1);

		System.out.print("Enter Number2: ");
		int Number2 = scanner.nextInt();

		System.out.println("choice is available: ");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");

		System.out.print("Enter choice: ");
		int choice = scanner.nextInt();

		System.out.println("Number1: " + Number1);
		System.out.println("Number2: " + Number2);
		System.out.println("choice: " + choice);

		performOperationUsingSwitch(Number1, Number2, choice);
	}

	private static void performOperationUsingNestedIfElse(int Number1, int Number2, int choice) {
		if (choice == 1) {
			System.out.println("Result =" + (Number1 + Number2));
		} else if (choice == 2) {
			System.out.println("Result =" + (Number1 - Number2));
		} else if (choice == 3) {
			System.out.println("Result =" + (Number1 / Number2));
		} else if (choice == 4) {
			System.out.println("Result =" + (Number1 * Number2));
		} else {
			System.out.println("Invalid Operation");
		}
	}

	private static void performOperationUsingSwitch(int Number1, int Number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("Result =" + (Number1 + Number2));
			break;
		case 2:
			System.out.println("Result =" + (Number1 - Number2));
			break;
		case 3:
			System.out.println("Result =" + (Number1 / Number2));
			break;
		case 4:
			System.out.println("Result =" + (Number1 * Number2));
			break;
		default:
			System.out.println("Invalid Operation");
			break;

		}

	}

}
