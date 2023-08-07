package com.xworkz.daimond.runner;

import com.xworkz.daimond.colddrink.AwesomeDrink;
import com.xworkz.daimond.colddrink.Drink;
import com.xworkz.daimond.colddrink.PepsiColdDrink;
import com.xworkz.daimond.colddrink.SpriteColdDrink;

public class DrinkRunner{

	public static void main(String[] args) {

		System.out.println("Running main in DrinkRunner.....\n");

		PepsiColdDrink pcd = new Drink();
		pcd.coldDrink();
		pcd.energyDrink();
		System.out.println("----------------------------------");

		SpriteColdDrink scd = new Drink();
		scd.coldDrink();
		scd.staminaDrink();
		System.out.println("----------------------------------");


		AwesomeDrink ad = new Drink();
		ad.coldDrink();
		ad.energyDrink();
		ad.staminaDrink();
		System.out.println("----------------------------------");


		Drink d = new Drink();
		d.coldDrink();
		d.energyDrink();
		d.staminaDrink();

	}

}
