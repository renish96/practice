package org.array;

public interface Student {
	public static void main(String[] args) {
		int a[] = new int[10];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		a[6] = 70;
		a[7] = 80;
		a[8] = 90;
		a[9] = 100;
		int length = a.length;
		System.out.println("length is" + " " + length);
		for (int i = 9; i >= 0; i--) {
			System.out.println(a[i]);
		}
		System.out.println("---------");
		for (int x : a) {
			System.out.println(x);
		}
	}

}
