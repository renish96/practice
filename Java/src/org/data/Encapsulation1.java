package org.data;

public class Encapsulation1 {
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setUsername("johny");
		e.setPassword(45667);
		String username = e.getUsername();
		System.out.println(username);
		int password = e.getPassword();
		System.out.println(password);
	}

}
