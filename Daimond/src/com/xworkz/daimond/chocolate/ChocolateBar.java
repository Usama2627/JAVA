package com.xworkz.daimond.chocolate;

public class ChocolateBar implements AwesomeChocolate {

	@Override
	public void eat() {
		System.out.println("Invoking eat in ChocolateBar");
	}

	@Override
	public void richTaste() {
		System.out.println("Invoking richTaste in ChocolateBar");
	}

	@Override
	public void smoothTexture() {
		System.out.println("Invoking smoothTexture in ChocolateBar");
	}
}
