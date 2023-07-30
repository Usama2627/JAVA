package com.xworkz.Final.runner;

import com.xworkz.Final.app.Tea;
import com.xworkz.Final.app.GreenTea;
import com.xworkz.Final.app.BlackTea;
import com.xworkz.Final.app.HerbalTea;

public class HierarchyRunner {

	public static void main(String[] args) {

		Tea regularTea = new Tea("Regular Tea", 3);
		regularTea.displayInfo();

		GreenTea greenTea = new GreenTea("Green Tea", 2, "Jasmine");
		greenTea.displayInfo();

		BlackTea blackTea = new BlackTea("Black Tea", 4, true);
		blackTea.displayInfo();

		HerbalTea herbalTea = new HerbalTea("Herbal Tea", 5, "Chamomile");
		herbalTea.displayInfo();
	}
}