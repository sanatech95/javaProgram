package com.OPPs2.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		// Student student = new Student();
		// student.setName("Sara");
		// student.setEmail("in28minutes@gmail.com");

		/*
		 * Person person = new Person(); person.setName("Sara");
		 * person.setEmail("Sara18@gmail.com"); person.setPhoneNumber("7879777788");
		 * String value = person.toString(); System.out.println(value);
		 * System.out.println(person);
		 */

		Employee employee = new Employee("Sara", "Programmer Analyst");
		// employee.setName("Sara");
		employee.setEmail("Sara18@gmail.com");
		employee.setPhoneNumber("7879777788");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");

		System.out.println(employee);
	}

}
