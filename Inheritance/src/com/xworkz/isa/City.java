package com.xworkz.isa;

public class City {

	String cityName;
	double sqkm;
	String cityFamousFor;

	public static void main(String[] args) {

		Banglore bengaluru = new Banglore("Banglore", 741 , "IT Tech parks" , 5 , true , "chilled" );
		bengaluru.printInfo();
	}


	public City(String cityName, double sqkm, String cityFamousFor) {
		System.out.println("Running string, double, string constructor in City...");
		this.cityName = cityName;
		this.sqkm = sqkm;
		this.cityFamousFor = cityFamousFor;
	}

}

