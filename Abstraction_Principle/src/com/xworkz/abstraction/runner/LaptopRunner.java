package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Laptop.AsusLaptop;
import com.xworkz.abstraction.app.Laptop.Ironman;
import com.xworkz.abstraction.app.Laptop.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {

		System.out.println("Running main...\n");

		Laptop laptop = new AsusLaptop();

		Ironman i = new Ironman(laptop);
		i.getDisplay();
	}

}
