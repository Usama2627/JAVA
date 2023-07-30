package com.xworkz.Final.app;

public class HerbalTea extends Tea {

	private String herbalBlend;

	public HerbalTea(String name, int steepingTime, String herbalBlend) {
		super(name, steepingTime);
		this.herbalBlend = herbalBlend;
	}

	public String getHerbalBlend() {
		return herbalBlend;
	}

	@Override
	public void displayInfo() {
		System.out.println("Brewing " + getName() + " tea for " + getSteepingTime() + " minutes. Herbal Blend: " + herbalBlend);
	}
}