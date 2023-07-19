package com.xworkz.overriding;

public class FamilyCourt extends CivilCourt {

	void divorceCase()
	{
		System.out.println("\nInvoking DivorceCase in FamilyCourt...");
	}
	
	@Override
	void justice()
	{
		System.out.println("Overriding Justice in FamilyCourt...");
	}
	
	@Override
	void importantCase()
	{
		System.out.println("Overriding ImportantCase in FamilyCourt...");
	}
	
	@Override
	void criminalCase()
	{
		System.out.println("Overriding CriminalCase in FamilyCourt...");
	}
	
	@Override
	void forgeryCase()
	{
		System.out.println("Overriding ForgeryCase in FamilyCourt...");
	}
	
	@Override
	void propertyCase()
	{
		System.out.println("Overriding PropertyCase in FamilyCourt...");

	}
	
	@Override
	void theftCase()
	{
		System.out.println("Overriding TheftCase in FamilyCourt...");
	}

}
