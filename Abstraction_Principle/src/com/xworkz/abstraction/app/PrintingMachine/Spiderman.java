package com.xworkz.abstraction.app.PrintingMachine;

public class Spiderman {

	private PrintingMachine printingMachine;

	public Spiderman(PrintingMachine printingMachine) {
		super();
		this.printingMachine = printingMachine;
	}

	public void getPrint() {
		if (printingMachine != null) {
			System.out.println("PrintinMachine is not null, can proceed");
			this.printingMachine.print();
		}
		else {
			System.err.println("printingMachine is null, stop");
		}
	}

}
