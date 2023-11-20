package org.array;

public interface TwoDimensional {
	public static void main(String[] args) {
		int a[][] = new int[5][3];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		a[2][0] = 70;
		a[2][1] = 80;
		a[2][2] = 90;
		a[3][0] = 100;
		a[3][1] = 110;
		a[3][2] = 120;
		a[4][0] = 130;
		a[4][1] = 140;
		a[4][2] = 150;
		for (int i = 4; i >= 0; i--) {
			for (int j = 2; j >= 0; j--) {
				System.out.println(a[i][j]);

			}

		}
		System.out.println("---------");
		for (int[] x : a) {
			for (int y : x) {
				System.out.println(y);

			}

		}
	}

}
