package org.allvehicle;

import org.twowheeler.TwoWheeler;
import org.threewheeler.ThreeWheeler;
import org.fourwheeler.FourWheeler;

public class Vehicle {
	private void vehicleNecessary() {
		System.out.println("what is your necessity?");
	}

	public static void main(String[] args) {
		Vehicle j = new Vehicle();
		j.vehicleNecessary();
		TwoWheeler h = new TwoWheeler();
		h.bike();
		h.cycle();
		ThreeWheeler f = new ThreeWheeler();
		f.auto();
		FourWheeler d = new FourWheeler();
		d.car();
		d.bus();
		d.lorry();

	}

}
