package com.xworkz.encapsulation.app;

public class Tap {

	private String name;
	private String color;
	private String brand;
	private double price;
	private String shape;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return( " name: " + this.name + " color: " + this.color + " brand: " + this.brand + " price: " + this.price + " shape: " + this.shape );
	}

}