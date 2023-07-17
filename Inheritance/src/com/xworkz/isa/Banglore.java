package com.xworkz.isa;

public class Banglore extends City{

	int noOfTaluks;
	Boolean traffic;
	String wheather;
	double sqkm;

	public Banglore(String cityName, double sqkm, String cityFamousFor, int noOfTaluks,
			Boolean traffic,String wheather) {
		super(cityName, sqkm, cityFamousFor);
		this.noOfTaluks = noOfTaluks;
		this.traffic = traffic;
		this.wheather = wheather;
		this.sqkm = sqkm;
	}

	void printInfo() {
		System.out.println("City name : " + cityName);
		System.out.println("City in SQkm : " + sqkm);
		System.out.println("City Famous For : " + cityFamousFor);
		System.out.println("Banglore No of Taluks: " + noOfTaluks);
		System.out.println("Banglore Traffic : " + traffic);
		System.out.println("Banglore Wheather : " + wheather);

	}

}