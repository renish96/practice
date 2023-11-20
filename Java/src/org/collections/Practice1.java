package org.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Practice1 {
	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add("rose");
		s.add(2344);
		s.add(null);
		s.add(true);
		s.add("rose");
		for (Object x : s) {
			System.out.println(x);
		}
		int size = s.size();
		System.out.println(size);
		s.add("mugan");
		System.out.println(s);
		s.remove('A');
		System.out.println(s);
		Set s1 = new HashSet();
		s1.add("kumar");
		s1.add(877);
		s1.add('S');
		s1.add(9867454523l);
		s1.add("madurai");

		s.addAll(s1);
		System.out.println(s);
		s.retainAll(s1);
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
	}
}
