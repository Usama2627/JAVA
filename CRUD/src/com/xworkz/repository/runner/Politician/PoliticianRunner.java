package com.xworkz.repository.runner.Politician;

import com.xworkz.repository.app.Politician.PoliticianRepository;
import com.xworkz.repository.app.Politician.PoliticianRepositoryImpl;

public class PoliticianRunner {

	public static void main(String[] args) {

		System.out.println("Running main...\n");

		PoliticianRepository repo = new PoliticianRepositoryImpl();
		
		repo.save("Ironman");
		repo.save("Captain America");
		repo.save("Thor");
		repo.save("Hulk");
		repo.save("Spiderman");

		repo.display();

	}

}
