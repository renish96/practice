package org.phone;

public class ExternalStorage {
	private void size() {
	System.out.println("external storage 256gb");
	}
	public static void main(String[] args) {
		ExternalStorage f = new ExternalStorage();
		f.size();
		InternalStorage h = new InternalStorage();
		h.processorName();
		h.ramSize();
	}

}
