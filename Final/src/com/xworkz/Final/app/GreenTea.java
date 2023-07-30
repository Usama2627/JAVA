package com.xworkz.Final.app;

public class GreenTea extends Tea {

	private String flavor;

	public GreenTea(String name, int steepingTime, String flavor) {
		super(name, steepingTime);
		this.flavor = flavor;
	}

	public String getFlavor() {
		return flavor;
	}

	@Override
	public void displayInfo() {
		System.out.println("Brewing " + getName() + " tea for " + getSteepingTime() + " minutes. Flavor: " + flavor);
	}
}