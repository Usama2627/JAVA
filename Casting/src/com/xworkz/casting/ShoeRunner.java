package com.xworkz.casting;

public class ShoeRunner {

	public static void main(String[] args) {

		PumaShoe pumaShoe = new PumaShoe(123, "Germany", 200, ShoeSize.A9, ShoeColor.BLACK);
		NikeShoe nikeShoe = new NikeShoe("John", "Jordan", 220, ShoeSize.A8, ShoeColor.WHITE);

		System.out.println("Puma Shoe Info: ");
		ShoeUtil.buy(pumaShoe);
		//pumaShoe.printInfo();

		System.out.println("\nNike Shoe Info: ");
		ShoeUtil.buy(nikeShoe);
		//nikeShoe.printInfo();

	}

}
