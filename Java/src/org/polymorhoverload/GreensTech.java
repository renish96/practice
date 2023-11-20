package org.polymorhoverload;

public class GreensTech {
	private void greensOmr(int pin, long conNO, float rating) {
		System.out.println(pin + "\n" + conNO + "\n" + rating);

	}

	private void greensOmr(float mark, double salary, int id) {
		System.out.println(mark + "\n" + salary + "\n" + id);

	}

	private void greensOmr(char Grade, boolean s) {
		System.out.println(Grade + "\n" + s);

	}

	public static void main(String[] args) {
		GreensTech k = new GreensTech();
		k.greensOmr(600097, 9868766534l, 4.5f);
		k.greensOmr(97.67f, 45678.43526d, 123456);
		k.greensOmr('A', true);
	}
}
