package com.xworkz.methodchaining;

public class ChickenRunner {

	public static void main(String[] args) {

		System.out.println("Running main..........................\n");

		Chicken ref1 = new Chicken(200, "Banglore\n");
		ref1.printInfo();

		Chicken ref2 = new FarmChicken(300, "Manglore", 20, "Spiderman\n");
		ref2.printInfo();

		Chicken ref3 = new BroilerChicken(400, "Hubli", false, 4);
		ref3.printInfo();


	}

}
