package com.xworkz.repository.runner.Hospital;

import com.xworkz.repository.app.Hospital.HospitalRepository;
import com.xworkz.repository.app.Hospital.HospitalRepositoryImpl;

public class HospitalRunner {

	public static void main(String[] args) {

		System.out.println("Running main...\n");

		HospitalRepository repo = new HospitalRepositoryImpl();

		repo.save("Ironman");
		repo.save("Captain America");
		repo.save("Thor");
		repo.save("Hulk");
		repo.save("Spiderman");

		repo.display();
	}

}
