package com.xworkz.daimond.runner;

import com.xworkz.daimond.laptop.AwesomeLaptop;
import com.xworkz.daimond.laptop.Asus;
import com.xworkz.daimond.laptop.GamingLaptop;
import com.xworkz.daimond.laptop.Ultrabook;

public class LaptopRunner {

	public static void main(String[] args) {

		System.out.println("Running main in LaptopRunner.....\n");

		Ultrabook ub = new Asus();
		ub.powerOn();
		ub.lightweight();
		System.out.println("----------------------------------");

		GamingLaptop gl = new Asus();
		gl.powerOn();
		gl.highPerformance();
		System.out.println("----------------------------------");

		AwesomeLaptop al = new Asus();
		al.powerOn();
		al.lightweight();
		al.highPerformance();
		System.out.println("----------------------------------");

		Asus as = new Asus();
		as.powerOn();
		as.lightweight();
		as.highPerformance();
	}
}
