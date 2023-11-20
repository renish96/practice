package org.constructor;

public class Class1 {
	public Class1() {

		System.out.println("student name:jack");
	}

	public Class1(int age) {
		this();
		System.out.println(age);
	}

	public Class1(String email) {
		this(20);
		System.out.println(email);
	}

}
