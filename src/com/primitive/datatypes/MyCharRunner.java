package com.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {

		MyChar myChar = new MyChar('v');
		System.out.println(myChar.isVowel()); // 'a', 'e', 'i', 'o', 'u'
		// 'a', 'e', 'i', 'o', 'u' and Capitals

		System.out.println(myChar.isNumber()); // 0 to 9
		System.out.println(myChar.isAlphabet()); // a to z, A to Z

		System.out.println(myChar.isConsonant());

		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
