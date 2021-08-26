package com.tips.access.package1;

public class MethodAccessRunnerinsideSamePackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExampleClass exampleClass = new ExampleClass();

		// exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.publicMethod();
		exampleClass.defaultMethod();

	}

}
