package com.xworkz.abstraction.app.Laptop;

public class Ironman {

	private Laptop laptop;

	public Ironman(Laptop laptop) {
		super();
		this.laptop = laptop;
	}

	public void getDisplay() {
		if (laptop != null) {
			System.out.println("laptop is not null, can proceed");
			this.laptop.display();	
		}
		else {
			System.err.println("laptop is null, stop");
		}
	}

}
