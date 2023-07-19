package com.xworkz.overriding;

public class SupremeCourt extends Court {

	void importantCase()
	{
		System.out.println("\nInvoking ImportantCase in SupremeCourt...");
	}
	
	@Override
	void justice()
	{
		System.out.println("Overriding Justice in SupremeCourt...");
	}

}
