package org.conditions;

public class Question1 {
	private void votingEligibility(int age) {
		if (age >= 18) {
			System.out.println("eligible to vote");
		} else {
			System.out.println("not eligible to vote");
		}

	}

	public static void main(String[] args) {
		Question1 a = new Question1();
		a.votingEligibility(10);
	}

}
