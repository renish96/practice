package org.string;

public class StringQues11 {
	public static void main(String[] args) {
		// 11.1
		String z = "Nisha";
		System.out.println(z);
		int id1 = System.identityHashCode(z);
		System.out.println(id1);

		String y = "Nisha";
		System.out.println(y);
		System.out.println(System.identityHashCode(y));

		// 11.2
		String a = new String("Nisha");
		int id = System.identityHashCode(a);
		System.out.println(a);
		System.out.println(id);

		String b = new String("Nisha");
		System.out.println(b);
		System.out.println(System.identityHashCode(b));

		// 11.3
		String c = new String("Nisha");
		String d = new String("Rengan");
		String e = new String("NishaRengan");

		System.out.println(c);
		int id2 = System.identityHashCode(c);
		System.out.println(id2);

		System.out.println(d);
		System.out.println(System.identityHashCode(d));

		System.out.println(e);
		System.out.println(System.identityHashCode(e));

		// 11.4
		String f = "Nisha";
		String g = "Rengan";
		String h = "NishaRengan";

		System.out.println(f);
		int id3 = System.identityHashCode(f);
		System.out.println(id3);

		System.out.println(g);
		System.out.println(System.identityHashCode(g));

		System.out.println(h);
		System.out.println(System.identityHashCode(h));

	}

}
