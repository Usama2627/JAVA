package com.xworkz.overriding;

public class CourtRunner {

	public static void main(String[] args) {

		System.out.println("Running main.....\n");
		
		Court court = new Court();
		court.justice();
		
		SupremeCourt sc = new SupremeCourt();
		sc.importantCase();
		sc.justice();
		
		HighCourt hc = new HighCourt();
		hc.criminalCase();
		hc.forgeryCase();
		hc.importantCase();
		hc.justice();
		
		CivilCourt cc = new CivilCourt();
		cc.propertyCase();
		cc.theftCase();
		cc.criminalCase();
		cc.forgeryCase();
		cc.importantCase();
		cc.justice();
		
		FamilyCourt fc = new FamilyCourt();
		fc.divorceCase();
		fc.propertyCase();
		fc.theftCase();
		fc.criminalCase();
		fc.forgeryCase();
		fc.importantCase();
		fc.justice();
		
	}

}
