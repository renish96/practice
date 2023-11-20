package org.companyinh;
import org.clientinh.Client;
public class Company extends Client{
	private void companyName() {
		System.out.println("company name is kys Ltd");
	}
	public static void main(String[] args) {
		Company g = new Company();
		g.companyName();
		g.clientName();
	}
}
