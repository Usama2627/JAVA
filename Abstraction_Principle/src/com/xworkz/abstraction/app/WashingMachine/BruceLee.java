package com.xworkz.abstraction.app.WashingMachine;

public class BruceLee {

	private WashingMachine washingMachine;

	public BruceLee(WashingMachine washingMachine) {
		super();
		this.washingMachine = washingMachine;
	}

	public void getWash() {
		if (washingMachine != null) {
			System.out.println("washingMachine is not null, can proceed");
			this.washingMachine.wash();	
		}
		else {
			System.err.println("washingMachie is null, stop");
		}
	}

}
