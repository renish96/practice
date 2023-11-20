package org.conditions;

public class Height {
	private void personsHeight(int a, int b, int c, int d, int e, int f, int g, int h) {

		if (a > b && a > c && a > d && a > e && a > f && a > g && a > h) {
			System.out.println("a is the tallest");
		} else if (b > a && b > c && b > d && b > e && b > f && b > g && b > h) {
			System.out.println("b is the tallest");
		} else if (c > a && c > b && c > d && c > e && c > f && c > g && c > h) {
			System.out.println("c is the tallest");
		} else if (d > a && d > b && d > c && d > e && d > f && d > g && d > h) {
			System.out.println("d is the tallest");
		} else if (e > a && e > b && e > c && e > d && e > f && e > g && e > h) {
			System.out.println("e is the tallest");

		} else if (f > a && f > b && f > c && f > d && f > e && f > g && f > h) {
			System.out.println("f is the tallest");
		} else if (g > a && g > b && g > c && g > d && g > e && g > f && g > h) {
			System.out.println("g is the tallest");
		} else if (h > a && h > b && h > c && h > d && h > e && h > f && h > g) {
			System.out.println("h is the tallest");
		} else {
			System.out.println("no one is the tallest");
		}

	}

	public static void main(String[] args) {
		Height h = new Height();
		h.personsHeight(180, 188, 175, 169, 177, 170, 173, 165);
	}
}
