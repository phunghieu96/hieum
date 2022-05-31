package com.ghtk.qlxe;

public class Wheel {
	private String nameWheel;
	
	public Wheel(String nameWheel) {
		this.nameWheel = nameWheel;	
	}
	public Wheel() {
	}

	public String getNameWheel() {
		return nameWheel;
	}

	public void setNameWheel(String nameWheel) {
		this.nameWheel = nameWheel;
	}
	
	public void display() {
		System.out.print(nameWheel + " ");
	}
}
	
	
