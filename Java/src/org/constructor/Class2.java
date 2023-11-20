package org.constructor;

public class Class2 extends Class1 {
	public Class2() {
		super("jack@123");
		System.out.println("student name:rose");
	}

	public Class2(int age) {
		this();
		System.out.println(age);
	}

	public Class2(String email) {
		this(21);
		System.out.println(email);
	}

}
