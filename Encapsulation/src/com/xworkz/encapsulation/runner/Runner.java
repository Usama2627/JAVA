package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.app.*;

public class Runner {

	public static void main(String[] args) {

		System.out.println("Running main.....\n");

		Calculator cal = new Calculator();
		System.out.println(cal.toString());
		cal.setResult(5);
		cal.setMemory(12);
		cal.setOperand1(2);
		cal.setOperand2(4);
		cal.setCurrentOperator('+');
		System.out.println(cal.toString());
		System.out.println("");

		Dosa dosa = new Dosa();
		System.out.println(dosa.toString());
		dosa.setName ("Special Dosa");
		dosa.setColor ("Colourful");
		dosa.setTaste ("Tasty");
		dosa.setPrice (20);
		dosa.setShape ("Round");
		System.out.println(dosa.toString());
		System.out.println("");

		Grinder grinder = new Grinder();
		System.out.println(grinder.toString());
		grinder.setName ("GGG");
		grinder.setCapacity (1.25);
		grinder.setBrand ("MI");
		grinder.setPrice (1500);
		grinder.setShape ("round");
		System.out.println(grinder.toString());
		System.out.println("");

		HeadSet headSet = new HeadSet();
		System.out.println(headSet.toString());
		headSet.setName ("HHH");
		headSet.setColor ("Blue");
		headSet.setBrand ("Parle");
		headSet.setPrice (1000);
		headSet.setShape ("Round");
		System.out.println(headSet.toString());
		System.out.println("");

		Helmet helmet = new Helmet();
		System.out.println(helmet.toString());
		helmet.setName ("studds");
		helmet.setColor ("black");
		helmet.setBrand ("bell helmet");
		helmet.setPrice (500);
		helmet.setShape ("round oval");
		System.out.println(helmet.toString());
		System.out.println("");

		Mixture mixture = new Mixture();
		System.out.println(mixture.toString());
		mixture.setName ("MMM");
		mixture.setColor ("Black");
		mixture.setTaste ("TTT");
		mixture.setPrice (30);
		mixture.setQuantity (250);
		System.out.println(mixture.toString());
		System.out.println("");

		NewsPaper newsPaper = new NewsPaper();
		System.out.println(newsPaper.toString());
		newsPaper.setName ("Indian");
		newsPaper.setNoOfPages(10);
		newsPaper.setPrice (3);
		newsPaper.setTypes ("English");
		newsPaper.setShape ("Rectangle");
		System.out.println(newsPaper.toString());
		System.out.println("");

		Satellite satellite = new Satellite();
		System.out.println(satellite.toString());
		satellite.setType("Navigation");
		satellite.setName("Chandrayana 2");
		satellite.setColor("White");
		satellite.setUses("Data");
		satellite.setOrbit_altitude(0);
		System.out.println(satellite.toString());
		System.out.println("");

		Tap tap = new Tap();
		System.out.println(tap.toString());
		tap.setName ("TTT");
		tap.setColor ("Gold");
		tap.setBrand ("BBB");
		tap.setPrice (150);
		tap.setShape ("SSS");
		System.out.println(tap.toString());

	}

}
