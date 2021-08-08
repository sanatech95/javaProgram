package com.primitive.datatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;

	}

	public Boolean isVowel() {
		if (ch == 'a' || ch == 'A') {
			return true;
		}

		if (ch == 'e' || ch == 'E') {
			return true;
		}
		if (ch == 'i' || ch == 'I') {
			return true;
		}
		if (ch == 'o' || ch == 'O') {
			return true;
		}
		if (ch == 'u' || ch == 'U') {
			return true;
		}


		return false;
	}

	public Boolean isNumber() {
      if (ch>=48 && ch<=57) {
		return true;
	}
		
		return false;
	}

	public boolean isAlphabet() {

		if (ch>=97 && ch<=122 ) {
			return true;
		}
		
		if (ch>=65 && ch<=90 ) {
			return true;
		}
		
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel()) {
			return true;
		}

		return false;
	}

	public static void printLowerCaseAlphabets() {

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}

	}

	public static void printUpperCaseAlphabets() {

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

}
//|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 