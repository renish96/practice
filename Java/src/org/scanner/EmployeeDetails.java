package org.scanner;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("employee id is");
		int empId = s.nextInt();
		System.out.println(empId);
		System.out.println("employee name is");
		String name = s.next();
		System.out.println(name);
		System.out.println("employee email is");
		String email = s.next();
		System.out.println(email);
		System.out.println("employee mobile is");
		long mobileNo = s.nextLong();
		System.out.println(mobileNo);
		System.out.println("employee salary is");
		int salary = s.nextInt();
		System.out.println(salary);
		System.out.println("employee gender is");
		String gender = s.next();
		System.out.println(gender);
		System.out.println("employee city is");
		String city = s.next();
		System.out.println(city);

	}
}
