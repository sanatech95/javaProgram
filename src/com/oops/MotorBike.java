package com.oops;

public class MotorBike {

	// State
	private int speed; // member variable
	// Behaviour
	// method
	// input - int speed
	// output - void
	// name - setSpeed
	// void setSpeed(int speed) { // local variable
	// this.speed = speed;
	// System.out.println(speed);
	// System.out.println(this.speed);

	// }

	// int getSpeed() {
	// return this.speed;
	// }


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			// System.out.println(speed);// 100
			// System.out.println(this.speed);// 0
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		this.speed = this.speed - howMuch;
	}

	void start() {
		System.out.println("Bike Started");
	}

}
