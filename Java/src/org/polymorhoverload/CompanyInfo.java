package org.polymorhoverload;

public class CompanyInfo {
	private void compnayName(String name, int year, long contactNo, float profit) {
		System.out.println(name+"\n"+year + "\n" + contactNo + "\n" + profit);

	}
	private void compnayName(double salary, char rank, boolean s) {
		System.out.println(salary + "\n" + rank + "\n" + s);
		
	}
public static void main(String[] args) {
	CompanyInfo h = new CompanyInfo();
	h.compnayName("abc Ltd", 1996, 9876543321l, 37.5f);
	h.compnayName(34252.25267d, 's', true);
}
}
