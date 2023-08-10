package com.xworkz.repository.runner.Army;

import com.xworkz.repository.app.Army.ArmyRepository;
import com.xworkz.repository.app.Army.ArmyRepositoryImpl;

public class ArmyRunner {

	public static void main(String[] args) {
		
		System.out.println("Running main...\n");

		ArmyRepository repo = new ArmyRepositoryImpl();

		repo.save("Ironman");
		repo.save("Captain America");
		repo.save("Thor");
		repo.save("Hulk");
		repo.save("Spiderman");

		repo.display();

	}

}
