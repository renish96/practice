package org.array;

import java.util.LinkedList;
import java.util.List;

public class Ques7C {
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		Object remove = l.remove(5);
		System.out.println(remove);
		System.out.println(l);
	}
}
