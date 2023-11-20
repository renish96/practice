package org.polymoroverride;

public class College extends University {
	public void ug() {
		super.ug();
		System.out.println("ug courses are BE,B.Com,BSc,...");

	}

	public void pg() {
		super.pg();
		System.out.println("pg courses are ME,M.Com,MSc,...");

	}

	public static void main(String[] args) {
		College k = new College();
		k.ug();
		k.pg();
	}
}
