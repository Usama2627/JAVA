package com.xworkz.encapsulation.app;

public class Dosa {
	
	private String name;
	private String color;
	private String taste;
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

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
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
		return( " name: " + this.name + " color: " + this.color + " taste:" + this.taste + " price: " + this.price + " shape: " + this.shape );
	}


}