package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.PrintingMachine.PrintingMachine;
import com.xworkz.abstraction.app.PrintingMachine.SamsungPrintingMachine;
import com.xworkz.abstraction.app.PrintingMachine.Spiderman;

public class PrintingMachineRunner {

	public static void main(String[] args) {

		System.out.println("Running main...\n");

		PrintingMachine printingMachine = new SamsungPrintingMachine();

		Spiderman s = new Spiderman(printingMachine);
		s.getPrint();
	}

}
