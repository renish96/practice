package org.polymoroverride;

public class Ktm extends Bike {
	public void cost() {
		super.cost();
		System.out.println("Ktm bike cost varies from 200000 to 900000");
	}

	public void speed() {
		super.speed();
		System.out.println("speed of the Ktm varies from 100km/hr to 200km/hr");
	}

	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}
}
