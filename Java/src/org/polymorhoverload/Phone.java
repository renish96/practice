package org.polymorhoverload;

public class Phone {
	private void phoneInfo(String name, int model, long imeiNo, float salesrate) {
		System.out.println(name + "\n" + model + "\n" + imeiNo + "\n" + salesrate);

	}

	private void phoneInfo(int ram, float performance, String poweredby, long cpuno) {
		System.out.println(ram + "\n" + performance + "\n" + poweredby + "\n" + cpuno);

	}

	public static void main(String[] args) {
		Phone j = new Phone();
		j.phoneInfo("onePlus", 7, 53254356465876l, 45.7f);
		j.phoneInfo(256, 78.67f, "OppO", 4365755542467l);
	}
}
