package com.xworkz.Final.runner;

import com.xworkz.Final.app.FinalGamingDesk;

public class GamingDeskRunner {

	public static void main(String[] args) {
		System.out.println("Running main in GamingDeskRunner\n");

		FinalGamingDesk finalgamingDesk = new FinalGamingDesk("Modern", 60, 30);
		finalgamingDesk.assemble();

	}
}
