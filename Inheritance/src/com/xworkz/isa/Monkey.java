package com.xworkz.isa;

public class Monkey extends Animal {

	String name;
	String breed;

	public Monkey(String name, String breed, String animalName, String animalType, String foundIn) {
		super(animalName, animalType, foundIn);
		this.name = name;
		this.breed = breed;
		System.out.println("Running string,string,string,string,string constructor in Monkey...");
	}

	void printInfo() {
		System.out.println("Animal name : " + animalName);
		System.out.println("Animal Type : " + animalType);
		System.out.println("Monkey found In : " + foundIn);
		System.out.println("Monkey name : " + name);
		System.out.println("Breed name : " + breed);
	}

}
