package org.constructor;

public class Class3 extends Class2 {
	public Class3() {
		super("rose@543");
		System.out.println("student name:kumar");
	}

	public Class3(int age) {
		this();
		System.out.println(age);
	}

	public Class3(String email) {
		this(22);
		System.out.println(email);
	}

}
