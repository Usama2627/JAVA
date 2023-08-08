package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Elevator.Elevator;
import com.xworkz.abstraction.app.Elevator.MetroElevator;
import com.xworkz.abstraction.app.Elevator.People;

public class ElevatorRunner {

	public static void main(String[] args) {

		System.out.println("Running main...\n");

		Elevator elevator = new MetroElevator();

		People p = new People(elevator);
		p.getCarryLuggage();
	}

}
