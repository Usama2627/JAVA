package com.xworkz.methodchaining;

public class FarmChicken extends Chicken {

	int noOfDays;
	String careTaker;

	public FarmChicken(double price, String location, int noOfDays, String careTaker)
	{
		super(price, location);
		this.noOfDays = noOfDays;
		this.careTaker = careTaker;
	}

	@Override
	void printInfo()
	{
		System.out.println("Running printInfo in FarmChicken");
		super.printInfo();
		System.out.println("NoOfDays : "+noOfDays);
		System.out.println("CareTaker : "+careTaker);
	}

}
