package org.array;

import java.util.ArrayList;
import java.util.List;

public class Ques10C {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		List l1 = new ArrayList();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);
		l1.add(600);
		l1.add(700);
		l1.add(8000);
		l.retainAll(l1);
		System.out.println(l);
	}
}
