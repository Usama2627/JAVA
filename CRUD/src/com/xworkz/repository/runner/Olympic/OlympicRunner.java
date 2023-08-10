package com.xworkz.repository.runner.Olympic;

import com.xworkz.repository.app.Olympic.OlympicRepository;
import com.xworkz.repository.app.Olympic.OlympicRepositoryImpl;

public class OlympicRunner {

	public static void main(String[] args) {

		System.out.println("Running main...\n");

		OlympicRepository repo = new OlympicRepositoryImpl();

		repo.save(0);
		repo.save(1);
		repo.save(2);
		repo.save(3);
		repo.save(4);

		repo.display();

	}

}
