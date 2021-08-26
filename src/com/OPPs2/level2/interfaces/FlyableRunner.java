package com.OPPs2.level2.interfaces;

interface Flyable {
	void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Bird with wings");
	}
}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("Aeroplane with fuel");
	}
}

public class FlyableRunner {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable object : flyingObjects) {
			object.fly();
		}

	}
}

