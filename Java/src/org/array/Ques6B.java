package org.array;

import java.util.LinkedList;
import java.util.List;

public class Ques6B {
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(700);
		Object object = l.get(4);
		System.out.println(object);
	}

}
