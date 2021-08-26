package com.OPPs2;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {
	@Override
	public void bark() {
		System.out.println("Meow Meow");
	}
}

public class AnimalRunnerWithAbstract {

	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat() };
		for (Animal animal : animals) {
			animal.bark();
		}
	}

}
