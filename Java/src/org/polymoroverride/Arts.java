package org.polymoroverride;

public class Arts extends Education {
	public void bSc() {
		super.ug();
		super.pg();
		System.out.println("Bachelor of Science");
	}

	public void bEd() {
		System.out.println("Bachelor of Education");
	}

	public void bA() {
		System.out.println("Bachelor of Arts");
	}

	public void bBa() {
		System.out.println("Bachelor of business administration");
	}

	public void ug() {
		System.out.println("ug is a base level education");
	}

	public void pg() {
		System.out.println("pg is a master level education");
	}

	public static void main(String[] args) {
		Arts h = new Arts();
		h.ug();
		h.pg();
		h.bSc();
		h.bEd();
		h.bA();
		h.bBa();
	}
}
