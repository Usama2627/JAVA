package com.xworkz.daimond.laptop;

public class Asus implements AwesomeLaptop {

	@Override
	public void powerOn() {
		System.out.println("Invoking powerOn in Asus");
	}

	@Override
	public void lightweight() {
		System.out.println("Invoking lightweight in Asus");
	}

	@Override
	public void highPerformance() {
		System.out.println("Invoking highPerformance in Asus");
	}
}
