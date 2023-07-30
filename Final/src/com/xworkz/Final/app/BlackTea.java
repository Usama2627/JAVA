package com.xworkz.Final.app;

public class BlackTea extends Tea {

	private boolean isStrong;

	public BlackTea(String name, int steepingTime, boolean isStrong) {
		super(name, steepingTime);
		this.isStrong = isStrong;
	}

	public boolean isStrong() {
		return isStrong;
	}

	@Override
	public void displayInfo() {
		System.out.println("Brewing " + getName() + " tea for " + getSteepingTime() + " minutes. Strength: " + (isStrong ? "Strong" : "Regular"));
	}
}