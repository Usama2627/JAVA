package com.xworkz.Final.app;

public final class FinalGamingDesk {

	private final String deskType;
	private final int deskWidth;
	private final int deskHeight;

	public FinalGamingDesk(String deskType, int deskWidth, int deskHeight)
	{
		this.deskType = deskType;
		this.deskWidth = deskWidth;
		this.deskHeight = deskHeight;
	}

	public final void assemble()
	{
		System.out.println("Assembling the " + deskType + " gaming desk.");
		System.out.println("Desk Width: " + deskWidth + " inches");
		System.out.println("Desk Height: " + deskHeight + " inches");
	}
}
