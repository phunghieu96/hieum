package com.ghtk.qlxe;

public class Main {

	public static void main(String[] args) {
	Wheel w = new Wheel("yokohama");
	Engine e = new Engine("BMW");
	Car c = new Car(w, e, "VinFast", 100000);
	c.run();
	}

}
