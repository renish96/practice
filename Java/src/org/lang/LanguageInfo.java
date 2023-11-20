package org.lang;

public class LanguageInfo {
	private void tamilLanguage() {
		System.out.println("tamil is a mother of all language");
	}

	private void englishlLanguage() {
		System.out.println("english is a connecting language");
	}

	private void hindilLanguage() {
		System.out.println("hindi is a largest spoken language in india");
	}

	public static void main(String[] args) {
		LanguageInfo e = new LanguageInfo();
		e.tamilLanguage();
		e.englishlLanguage();
		e.hindilLanguage();
		StateDetails s = new StateDetails();
		s.southIndia();
		s.northIndia();
	}
}
