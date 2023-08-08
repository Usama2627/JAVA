package com.xworkz.abstraction.app.Elevator;

public class People {

	private Elevator elevator;

	public People(Elevator elevator) {
		super();
		this.elevator = elevator;
	}

	public void getCarryLuggage() {
		if (elevator != null) {

			System.out.println("elevator is not null, can proceed");
			this.elevator.carryLuggage();
		}
		else {
			System.err.println("elevator is null, stop");
		}
	}

}
