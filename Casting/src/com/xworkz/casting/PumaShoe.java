package com.xworkz.casting;

public class PumaShoe extends Shoe {

	int model;
	String origin;

	PumaShoe(int model,String origin, double price, ShoeSize size, ShoeColor color)
	{
		super(price, size, color);
		this.model = model;
		this.origin = origin;
	}

	void printInfo()
	{
		System.out.println("Invoking printInfo method in PumaShoe...");
		System.out.println("Model : "+this.model);
		System.out.println("Origin : "+this.origin);
		System.out.println("Price : "+this.price);
		System.out.println("Size : "+this.size);
		System.out.println("Color : "+this.color);

	}

}
