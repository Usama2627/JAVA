package com.xworkz.Final.app;

public final class Goggle {

	private String brandName;
	private String frameColor;
	private String lensColor;
	private double price;
	private boolean polarized;
	private char size;

	public Goggle() {
		System.out.println("Running no-argument const of Goggle");
	}

	public Goggle(String brandName, String frameColor, String lensColor)
	{
		System.out.println("Running String,String,String const of Goggle...");
		this.brandName = brandName;
		this.frameColor = frameColor;
		this.lensColor = lensColor;
	}

	public Goggle(String brandName, String frameColor, String lensColor, double price, boolean polarized, char size)
	{
		this(brandName, frameColor, lensColor);
		System.out.println("Running String,String,String,double,boolean,char const of Goggle...");
		this.price = price;
		this.polarized = polarized;
		this.size = size;
	}

	@Override
	public String toString()
	{
		return "Brand Name: " + brandName +
				"Frame Color: " + frameColor +
				"Lens Color: " + lensColor +
				"Price: " + price +
				"Polarized: " + polarized +
				"Size: " + size;
	}
}
