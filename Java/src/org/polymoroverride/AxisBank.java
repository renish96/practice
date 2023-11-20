package org.polymoroverride;

public class AxisBank extends BankInfo {
	public void deposit(int amount) {
		System.out.println(amount);
		super.saving(256000);
		super.fixed(5670000);
		super.deposit(6780000);
	}

	public static void main(String[] args) {
		AxisBank g = new AxisBank();
		g.deposit(450000);

	}

}
