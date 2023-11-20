package org.exception;

public class Exception {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (NullPointerException e) {
			String message = e.getMessage();
			System.out.println(message);

		} finally {
			System.out.println(10 / 2);
		}
	}

}
