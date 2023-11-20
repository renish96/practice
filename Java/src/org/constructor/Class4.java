package org.constructor;

public class Class4 extends Class3 {
	public Class4() {
		super("kumar@246");
		System.out.println("student name:gopal");
	}

	public Class4(int age) {
		this();
		System.out.println(age);
	}

	public Class4(String email) {
		this(23);
		System.out.println(email);
	}

	public static void main(String[] args) {
		Class4 a = new Class4("gopal@864");
	}
}
