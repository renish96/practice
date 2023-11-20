package org.string;

public class StringQues7 {
	public static void main(String[] args) {
		String a = "Welcome to class java";
		String d = a.replaceAll("java", "sql");
		System.out.println(d);
		String b = "Greens Adayar";
		String c = b.replaceAll("Adayar", "Omr");
		System.out.println(c);
		String v = "Welcome to java class";
		String m = v.replaceAll(" ", "#");
		System.out.println(m);
		String q = "Nishakerala24@gmail.com";
		boolean n = q.contains("gmail");
		System.out.println(n);
		String x = q.replaceAll("gmail", "yahoo");
		System.out.println(x);
		String g = "5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		boolean k = g.contains("pincode");
		System.out.println(k);
		String l = g.replaceAll(",pincode-626101", " ");
		System.out.println(l);
	}

}
