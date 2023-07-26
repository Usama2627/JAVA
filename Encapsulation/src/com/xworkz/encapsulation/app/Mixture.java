package com.xworkz.encapsulation.app;

public class Mixture {

	private String name;
	private String color;
	private String taste;
	private double price;
	private int quantity;

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return( " name: " + this.name + " color: " + this.color + " taste: " + this.taste + " price: " + this.price + " quantity: " + this.quantity );
	}

}