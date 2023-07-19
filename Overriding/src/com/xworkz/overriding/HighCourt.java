package com.xworkz.overriding;

public class HighCourt extends SupremeCourt {

	void criminalCase()
	{
		System.out.println("\nInvoking CriminalCase in HighCourt...");
	}

	void forgeryCase()
	{
		System.out.println("Invoking ForgeryCase in HighCourt...");
	}
	
	@Override
	void justice()
	{
		System.out.println("Overriding Justice in HighCourt...");
	}
	
	@Override
	void importantCase()
	{
		System.out.println("Overriding ImportantCase in HighCourt...");
	}

}
