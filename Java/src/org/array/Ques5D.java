package org.array;

import java.util.LinkedList;
import java.util.List;

public class Ques5D {
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
		int lastIndexOf = l.lastIndexOf(90);
		System.out.println(lastIndexOf);
	}

}
