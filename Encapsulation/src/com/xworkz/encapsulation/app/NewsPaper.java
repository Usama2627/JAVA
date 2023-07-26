package com.xworkz.encapsulation.app;

public class NewsPaper {

	private String name;
	private int noOfPages;
	private double price;
	private String types;
	private String shape;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
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
		return( " name: " + this.name + " noOfPages: " + this.noOfPages + " price: " + this.price + " types: " + this.types + " shape: " + this.shape );
	}

}