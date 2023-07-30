package com.xworkz.Final.app;

public class Square extends Rectangle {

	public Square(String name, double side) {
		super(name, side, side);
	}

	public void displayInfo() {
		System.out.println("Shape: " + name + ", Side: " + length);
	}
}

