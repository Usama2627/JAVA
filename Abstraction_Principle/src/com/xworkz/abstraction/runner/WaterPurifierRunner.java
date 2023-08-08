package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.WaterPurifier.Antman;
import com.xworkz.abstraction.app.WaterPurifier.GoldWaterPurifier;
import com.xworkz.abstraction.app.WaterPurifier.WaterPurifier;

public class WaterPurifierRunner {

	public static void main(String[] args) {

		System.out.println("Running main...\n");

		WaterPurifier waterPurifier = new GoldWaterPurifier();

		Antman a =new Antman(waterPurifier);
		a.getFilter();
	}

}
