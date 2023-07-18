package com.xworkz.casting;

public class NikeShoe extends Shoe {

	String ceo;
	String brandAmbassador;

	NikeShoe(String ceo, String brandAmbassador, double price, ShoeSize size, ShoeColor color)
	{
		super(price, size, color);
		this.ceo = ceo;
		this.brandAmbassador = brandAmbassador;
	}

	void printInfo()
	{
		System.out.println("Invoking printInfo method in NikeShoe...");
		System.out.println("Ceo : "+this.ceo);
		System.out.println("BrandAmbassador : "+this.brandAmbassador);
		System.out.println("Price : "+this.price);
		System.out.println("Size : "+this.size);
		System.out.println("Color : "+this.color);

	}


}
