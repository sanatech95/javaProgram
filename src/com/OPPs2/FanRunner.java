package com.OPPs2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.2345, "Black");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);

	}

}
