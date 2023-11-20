package org.emp;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("oneplus 7t");
	}

	private void phoneMieiNum() {
		System.out.println("sdsfd21132243564556576");
	}

	private void camera() {
		System.out.println("48mb");
	}

	private void storage() {
		System.out.println("256 GB");
	}

	private void osName() {
		System.out.println("Oxygen Os");
	}

	public static void main(String[] args) {
		PhoneInfo s = new PhoneInfo();
		s.phoneName();
		s.phoneMieiNum();
		s.camera();
		s.storage();
		s.osName();
	}
}
