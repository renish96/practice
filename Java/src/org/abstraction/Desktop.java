package org.abstraction;

public class Desktop implements HardWare, SoftWare {

	public void softWareResources() {
		System.out.println("eclipse is a software");

	}

	public void hardWareResources() {
		System.out.println("motherboard is a hardware");

	}

	public void desktopModel() {
		System.out.println("inspiron 14 3420");

	}

	public static void main(String[] args) {
		Desktop h = new Desktop();
		h.softWareResources();
		h.hardWareResources();
		h.desktopModel();
	}

}
