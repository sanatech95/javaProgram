package com.tips.nonaccess.package1;

final class FinalClass {

}

//class SomeClass extends FinalClass{
//}

class SomeClass {
	final public void doSomeThing() {
	}

	public void doSomeThingElse(final int arg) {
		// arg = 6;
	}
}

class ExtendingClass extends SomeClass {
	// public void doSomeThing() {}
}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		final int i;
		i = 5;
		// i = 7;
	}

}
