package com.loops;

//import com.loops.MyNumber;

public class myNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(8);
		
		Boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);

		int sum= number.sumUpToN();
		System.out.println(" sumUpToN " + sum);
		
		int sumOfDivisiors = number.sumOfDivisiors();
		System.out.println("sumOfDivisiors  " + sumOfDivisiors);
		
		number.printNumberTraingle();
		
	}

}
