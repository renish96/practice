package org.conditions;

public class OddAndEven {
	public static void main(String[] args) {
		System.out.println("odd numbers are");
		for (int j = 100; j >= 0; j--) {
			if (j % 2 == 0) {
				continue;

			}
			System.out.println(j);
		}
		System.out.println("even numbers are");
		for (int i = 100; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
