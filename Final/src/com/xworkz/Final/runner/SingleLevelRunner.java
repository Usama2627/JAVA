package com.xworkz.Final.runner;

import com.xworkz.Final.app.Vehicle;
import com.xworkz.Final.app.Car;

public class SingleLevelRunner {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle("Toyota", "Camry");
		vehicle.displayInfo();


		Car car = new Car("Honda", "Accord", 4);
		car.displayInfo();
	}
}

