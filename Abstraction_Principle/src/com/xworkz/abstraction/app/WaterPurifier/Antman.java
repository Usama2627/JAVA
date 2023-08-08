package com.xworkz.abstraction.app.WaterPurifier;

public class Antman {

	private WaterPurifier waterPurifier;

	public Antman(WaterPurifier waterPurifier) {
		super();
		this.waterPurifier = waterPurifier;
	}

	public void getFilter() {
		if (waterPurifier != null) {
			System.out.println("waterPurifier is not null, can proceed");
			this.waterPurifier.filter();
		}
		else {
			System.err.println("waterPurifier is null, stop");
		}
	}

}
