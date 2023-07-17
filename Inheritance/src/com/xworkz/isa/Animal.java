package com.xworkz.isa;

public class Animal {

	String animalName;
	String animalType;
	String foundIn;

	public static void main(String[] args) {

		Monkey monkey1 = new Monkey("Monkey1", "Squirrel Monkey","Monkey", "Pygmy Marmoset" , "South America");
		monkey1.printInfo();

		Monkey monkey2 = new Monkey("Monkey2", "Spider Monkey","Monkey", "Proboscis Monkey" , "South America");
		monkey2.printInfo();
	}

	public Animal(String animalName , String animalType , String foundIn) {
		System.out.println("Running string, string, string constructor in Animal...");
		this.animalName = animalName;
		this.animalType = animalType;
		this.foundIn = foundIn;
	}

}

