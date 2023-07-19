package com.xworkz.overriding;

public class CivilCourt extends HighCourt {

	void propertyCase()
	{
		System.out.println("\nInvoking PropertyCase in CivilCourt...");
	}

	void theftCase()
	{
		System.out.println("Invoking TheftCase in CivilCourt...");
	}
	
	@Override
	void justice()
	{
		System.out.println("Overriding Justice in CivilCourt...");
	}
	
	@Override
	void importantCase()
	{
		System.out.println("Overriding ImportantCase in CivilCourt...");
	}
	
	@Override
	void criminalCase()
	{
		System.out.println("Overriding CriminalCase in CivilCourt...");
	}
	
	@Override
	void forgeryCase()
	{
		System.out.println("Overriding ForgeryCase in CivilCourt...");
	}
}
