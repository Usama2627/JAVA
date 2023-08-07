package com.xworkz.daimond.colddrink;

public class Drink implements AwesomeDrink{

	@Override
	public void energyDrink() {
		System.out.println("invoking energyDrink in Drink");
	}

	@Override
	public void staminaDrink() {
		System.out.println("invoking staminaDrink in Drink");

	}

	@Override
	public void coldDrink() {
		System.out.println("invoking coldDrink in Drink");

	}

}
