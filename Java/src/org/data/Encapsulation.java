package org.data;

public class Encapsulation {
	private String username;
	private int password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if (username.equals("jack")) {
			this.username = "jack's account";

		} else if (username.equals("johny")) {
			this.username = "johny's account";

		} else {
			this.username = "Invalid username";
		}
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		if (password == 1234) {
			this.password = 1;

		} else if (password == 45667) {
			this.password = 1;

		} else {
			this.password = 0;
		}
	}
}
