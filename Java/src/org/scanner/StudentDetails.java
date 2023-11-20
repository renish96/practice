package org.scanner;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("student id is");
		short id = s.nextShort();
		System.out.println(id);
		System.out.println("student name is");
		String name = s.next();
		System.out.println(name);
		System.out.println("student mark1 is");
		int mark1 = s.nextInt();
		System.out.println(mark1);
		System.out.println("student mark2 is");
		int mark2 = s.nextInt();
		System.out.println(mark2);
		System.out.println("student mark3 is");
		int mark3 = s.nextInt();
		System.out.println(mark3);
		System.out.println("student mark4 is");
		int mark4 = s.nextInt();
		System.out.println(mark4);
		System.out.println("student mark5 is");
		int mark5 = s.nextInt();
		System.out.println(mark5);
		System.out.println("student total mark is");
		int total = mark1 + mark2 + mark3 + mark4 + mark5;
		System.out.println(total);
		System.out.println("student average mark is");
		int average = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;
		System.out.println(average);

	}

}
