package com.ghtk.qlxe;

public class Car {
	private Wheel wheel;
	private Engine engine;
	private String nameCar;
	private int price;

	public Car() {
	}

	public Car(Wheel wheel, Engine engine, String nameCar, int price) {
		this.wheel = wheel;
		this.engine = engine;
		this.nameCar = nameCar;
		this.price = price;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getNameCar() {
		return nameCar;
	}

	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void run() {
		System.out.println("Name: " + nameCar);
		System.out.println("Price: " + price);
		System.out.print("Wheel: ");
		wheel.display();
		System.out.println();
		System.out.print("Engine: ");
		engine.display();
	}
}
