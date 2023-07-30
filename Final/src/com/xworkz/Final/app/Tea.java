package com.xworkz.Final.app;

public class Tea {

	private String name;
	private int steepingTime;

	public Tea(String name, int steepingTime)
	{
		this.name = name;
		this.steepingTime = steepingTime;
	}

	public String getName() {
		return name;
	}

	public int getSteepingTime() {
		return steepingTime;
	}

	public void displayInfo() {
		System.out.println("Brewing " + name + " tea for " + steepingTime + " minutes.");
	}
}
