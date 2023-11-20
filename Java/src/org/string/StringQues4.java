package org.string;

public class StringQues4 {
	public static void main(String[] args) {
		String a = "Java";
		String b = "Java";
		boolean equals = a.equals(b);
		System.out.println(equals);
		String c = "Java";
		String d = "java";
		boolean equals2 = c.equals(d);
		System.out.println(equals2);
		String e = "Green Technology";
		String f = "GreenTechnology.";
		boolean equals3 = e.equals(f);
		System.out.println(equals3);
		String g = "Java";
		String h = "java";
		boolean j = g.equalsIgnoreCase(h);
		System.out.println(j);
		String i = "Nisha";
		String k = "nisha";
		boolean l = i.equalsIgnoreCase(k);
		System.out.println(l);

	}
}
