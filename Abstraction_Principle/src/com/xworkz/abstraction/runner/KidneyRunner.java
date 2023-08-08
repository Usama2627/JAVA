package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Kidney.AnimalKidney;
import com.xworkz.abstraction.app.Kidney.Cat;
import com.xworkz.abstraction.app.Kidney.Kidney;

public class KidneyRunner {

	public static void main(String[] args) {

		System.out.println("Running main...\n");

		Kidney kidney = new AnimalKidney();

		Cat c = new Cat(kidney);
		c.getClean();
	}

}
