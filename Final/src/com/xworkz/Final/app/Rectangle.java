package com.xworkz.Final.app;

public class Rectangle extends Shape {

	protected double length;
	protected double width;

	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	public void displayInfo() {
		System.out.println("Shape: " + name + ", Length: " + length + ", Width: " + width);
	}
}

