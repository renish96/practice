package org.logicalprograms;

public class Swapping {

	public static void main(String[] args) {
		int a = 10, b = 20; // c = 0;
		// cheat
		// System.out.println("after swapping a:" + b);
		// System.out.println("after swapping b:" + a);

		// with 3rd variable
		// c = a;
		// a = b;
		// b = c;
		// System.out.println("after swapping a:" + a);
		// System.out.println("after swapping b:" + b);

		// without 3rd variable
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping a:" + a);
		System.out.println("after swapping b:" + b);

	}
}
