package com.tips.enums;

public enum Season {
	WINTER(1), SUMMER(2), SPRING(5), RAINY(3), FALL(4);
	// 0,1,2,3,4
	
	private int value;
	private Season (int value){
	this.value = value;
	}

	public int getValue() {
		return value;
	}
}
