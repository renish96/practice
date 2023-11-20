package org.bank;

public class BankInfo extends AxisBank {
	private void savings() {
		System.out.println("savings limit is 10000000");

	}

	private void fixed() {
		System.out.println("fixed limit is 1000000000");

	}

	public static void main(String[] args) {
		BankInfo j = new BankInfo();
		j.savings();
		j.fixed();
		j.deposit();
	}
}
