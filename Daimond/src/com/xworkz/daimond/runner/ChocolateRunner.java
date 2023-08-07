package com.xworkz.daimond.runner;

import com.xworkz.daimond.chocolate.AwesomeChocolate;
import com.xworkz.daimond.chocolate.ChocolateBar;
import com.xworkz.daimond.chocolate.DarkChocolate;
import com.xworkz.daimond.chocolate.MilkChocolate;

public class ChocolateRunner {

	public static void main(String[] args) {

		System.out.println("Running main in ChocolateRunner.....\n");

		DarkChocolate dc = new ChocolateBar();
		dc.eat();
		dc.richTaste();
		System.out.println("----------------------------------");

		MilkChocolate mc = new ChocolateBar();
		mc.eat();
		mc.smoothTexture();
		System.out.println("----------------------------------");

		AwesomeChocolate ac = new ChocolateBar();
		ac.eat();
		ac.richTaste();
		ac.smoothTexture();
		System.out.println("----------------------------------");

		ChocolateBar cb = new ChocolateBar();
		cb.eat();
		cb.richTaste();
		cb.smoothTexture();
	}
}
