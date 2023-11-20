package org.array;

import java.util.LinkedList;
import java.util.List;

public class Ques5A {
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		int ind = l.indexOf(10);
		System.out.println(ind);
	}

}
