package com.xworkz.encapsulation.app;

public class Grinder {

	private String name;
	private double capacity;
	private String brand;
	private double price;
	private String shape;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
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
		return( " name: " + this.name + " capacity: " + this.capacity + " brand:" + this.brand + " price: " + this.price + " shape: " + this.shape );
	}

}