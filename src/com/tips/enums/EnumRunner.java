package com.tips.enums;

import java.util.Arrays;

public class EnumRunner {

	public static void main(String[] args) {
		Season season = Season.WINTER;
		System.out.println(season);

		Season season1 = Season.valueOf("SPRING");
		System.out.println(season1);

		System.out.println(Season.FALL.ordinal());
		System.out.println(Arrays.toString(Season.values()));
		System.out.println(Season.SPRING.getValue());

	}

}
