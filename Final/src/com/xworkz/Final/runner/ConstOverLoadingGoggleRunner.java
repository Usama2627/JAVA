package com.xworkz.Final.runner;

import com.xworkz.Final.app.Goggle;

public class ConstOverLoadingGoggleRunner {

	public static void main(String[] args) {
		System.out.println("Running main.....");

		Goggle goggle1 = new Goggle();
		System.out.println(goggle1);

		Goggle goggle2 = new Goggle("Oakley", "Black", "Gray");
		System.out.println(goggle2);

		Goggle goggle3 = new Goggle("Ray-Ban", "Brown", "Green", 2000, true, 'M');
		System.out.println(goggle3);
	}

}
