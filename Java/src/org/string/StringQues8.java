package org.string;

public class StringQues8 {
	public static void main(String[] args) {
		String a = "NISHANTHI";
		String s = a.toLowerCase();
		System.out.println(s);
		String b = "nishanthi";
		String j = b.toUpperCase();
		System.out.println(j);
		String c = "WelcomE";
		String d = c.replaceAll("W", "w").replaceAll("E", "e").replaceAll("elcom", "ELCOM");
		System.out.println(d);

	}

}
