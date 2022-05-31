package com.ghtk.qlxe;

public class Engine {
	private String nameEngine;

	public Engine(String nameEngine) {
		this.nameEngine = nameEngine;
	}

	public Engine() {
	}

	public String getNameEngine() {
		return nameEngine;
	}

	public void setNameEngine(String nameEngine) {
		this.nameEngine = nameEngine;
	}
	
	public void display() {
		System.out.print(nameEngine + " ");
	}
}
