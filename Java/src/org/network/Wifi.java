package org.network;

public class Wifi {
	private void wifiName() {
		System.out.println("wifi name is onepiece");
	}

	public static void main(String[] args) {
		Wifi d = new Wifi();
		d.wifiName();
		MobileData v = new MobileData();
		v.dataName();
		Lan u = new Lan();
		u.lanName();
		Wireless x = new Wireless();
		x.modamName();
	}
}
