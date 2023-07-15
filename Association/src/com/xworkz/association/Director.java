package com.xworkz.association;

public class Director {
	
	String name = "DDDDDDD";
	int age;
	int numMovies;
	String nationality;
	
	Director(String name, int age, int numMovies, String nationality) 
	{
		this.name = name;
		this.age = age;
		this.numMovies = numMovies;
		this.nationality = nationality;
	}
	
	void printInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Number of Movies: " + this.numMovies);
		System.out.println("Nationality: " + this.nationality);
	}
}
