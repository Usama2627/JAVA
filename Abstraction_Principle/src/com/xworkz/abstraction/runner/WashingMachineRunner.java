package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.WashingMachine.BruceLee;
import com.xworkz.abstraction.app.WashingMachine.ChinaWashingMachine;
import com.xworkz.abstraction.app.WashingMachine.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {

		System.out.println("Running main...\n");

		WashingMachine washingMachine = new ChinaWashingMachine();

		BruceLee b =new BruceLee(washingMachine);
		b.getWash();
	}

}
