package com.tips.access.package2;

import com.tips.access.package1.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExampleClass exampleClass = new ExampleClass();

		// exampleClass.privateMethod();
		// exampleClass.protectedMethod();
		exampleClass.publicMethod();
		// exampleClass.defaultMethod();

	}

}
