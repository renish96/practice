package org.scanner;

import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("student id is");
		int studentId = s.nextInt();
		System.out.println(studentId);
		System.out.println("student name is");
		String name = s.next();
		System.out.println(name);
		System.out.println("student email is");
		String email = s.next();
		System.out.println(email);
		System.out.println("student mobile is");
		long mobileNo = s.nextLong();
		System.out.println(mobileNo);
		System.out.println("student dept is");
		String dept = s.next();
		System.out.println(dept);
		System.out.println("student gender is");
		String gender = s.next();
		System.out.println(gender);
		System.out.println("student city is");
		String city = s.next();
		System.out.println(city);

	}
}
