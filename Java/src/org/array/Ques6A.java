package org.array;

import java.util.LinkedList;
import java.util.List;

public class Ques6A {
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		Object object = l.get(2);
		System.out.println(object);
	}
}
