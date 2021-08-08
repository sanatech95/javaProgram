package com.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike honda = new MotorBike();
		MotorBike yamaha = new MotorBike();

		honda.start();
		yamaha.start();

		honda.setSpeed(100);

		honda.increaseSpeed(100);
		yamaha.increaseSpeed(100);

		honda.decreaseSpeed(50);
		yamaha.decreaseSpeed(50);

		System.out.println(honda.getSpeed());
		
		// yamaha.setSpeed(70);
		System.out.println(yamaha.getSpeed());

		//honda.setSpeed(20);
		// yamaha.setSpeed(0);

	}

}
