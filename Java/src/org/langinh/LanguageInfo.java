package org.langinh;

public class LanguageInfo extends StateDetails {
	private void tamilLanguage() {
		System.out.println("most of the south india people speaks tamil");
	}
	private void englishLanguage() {
		System.out.println("most of the indian people speaks english");
	}
	private void hindiLanguage() {
		System.out.println("most of the north indian people speaks hindi");
	}
	public static void main(String[] args) {
		LanguageInfo h = new LanguageInfo();
		h.southIndia();
		h.northIndia();
		h.tamilLanguage();
		h.englishLanguage();
		h.hindiLanguage();
	}
	
	

}
