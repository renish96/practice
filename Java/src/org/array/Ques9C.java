package org.array;

import java.util.LinkedList;
import java.util.List;

public class Ques9C {
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(30);

		l.set(0, 100);
		l.set(4, 100);
		l.set(5, 100);
		System.out.println(l);
	}
}
