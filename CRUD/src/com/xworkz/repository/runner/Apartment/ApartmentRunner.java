package com.xworkz.repository.runner.Apartment;

import com.xworkz.repository.app.Apartment.ApartmentRepository;
import com.xworkz.repository.app.Apartment.ApartmentRepositoryImpl;

public class ApartmentRunner {

	public static void main(String[] args) {

		System.out.println("Running main...\n");

		ApartmentRepository repo = new ApartmentRepositoryImpl();

		repo.save("One");
		repo.save("Two");
		repo.save("Three");
		repo.save("Four");
		repo.save("Five");

		repo.dispaly();

	}

}
