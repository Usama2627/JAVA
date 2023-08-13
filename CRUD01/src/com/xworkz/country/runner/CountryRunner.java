package com.xworkz.country.runner;

import com.xworkz.country.app.CountryRepository;
import com.xworkz.country.app.CountryRepositoryImpl;

public class CountryRunner {

	public static void main(String[] args) {

		System.out.println("Running main in Country Runner.....\n");

		CountryRepository repository = new CountryRepositoryImpl();
		System.out.println("Storing and Displaying names of Countries");
		repository.save("India");
		repository.save("Ireland");
		repository.save("Korea");
		repository.save("China");
		repository.save("Russia");
		repository.save("SriLanka");
		repository.save("Africa");
		repository.save("England");
		repository.save("Australia");
		repository.save("NewZealand");

		System.out.println();
		System.out.println("---Is exist---");
		boolean check = repository.isExist("india");
		System.out.println("Country name existence is: " + check);

		System.out.println();
		System.out.println("---Return to Upper case---");
		String upCase = repository.returnUpperCase("england");
		System.out.println(upCase);

		System.out.println();
		System.out.println("---Find Startswith---");
		String[] store1 = repository.findStartsWith("I");

		System.out.println();
		System.out.println("---Find EndsWith---");
		String[] store2 = repository.findEndsWith("d");

		System.out.println();
		System.out.println("---Saved Count---");
		int count1 = repository.savedCount(store1);
		System.out.println("Count: " + count1);

		int count2 = repository.savedCount(store2);
		System.out.println("Count: " + count2);

		System.out.println();
		System.out.println("---Ascending Order---");
		repository.orderAscending();

		System.out.println();
		System.out.println("---Descending Order---");
		repository.orderDescending();


	}
}

