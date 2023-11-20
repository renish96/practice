package org.transport;
import org.road.Road;
import org.air.Air;
import org.water.Water;
public class Transport {
	private void transportForm() {
	System.out.println("The available transport forms are");
	}
	public static void main(String[] args) {
		Transport f = new Transport();
		f.transportForm();
		Road j = new Road();
		j.bike();
		j.cycle();
		j.car();
		j.bus();
		Air k = new Air();
		k.aeroPlane();
		k.heliCopter();
		Water b = new Water();
		b.boat();
		b.ship();
	}

}
