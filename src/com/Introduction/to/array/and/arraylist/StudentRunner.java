package com.Introduction.to.array.and.arraylist;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		// int[] marks = { 100, 90, 70 };
		Student student = new Student("sara", 100, 87, 50, 90, 70);


		int number = student.getNumberOfMarks();
		System.out.println("Number of Marks : " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of Marks : " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum of Marks : " + maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum of Marks : " + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("Average : " + average);

		System.out.println(student);

		student.addNewMark(35);
		System.out.println(student);

		student.removeMarkAtIndex(4);
		System.out.println(student);
	}

}
