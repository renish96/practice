package org.overall;

public class Class3 extends Class2 {
	public void studentId() {
		System.out.println("student id is ECE7653");
		super.hodName();
		this.studentClass();
	}

	public void studentClass() {
		System.out.println("class is A");

	}

	public static void main(String[] args) {
		Class3 h = new Class3();
		h.studentId();
	}
}
 