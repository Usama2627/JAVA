package com.xworkz.repository.app.Army;

public interface ArmyRepository {

	int TOTAL_NAMES = 5;

	void save(String name);

	default void display() {

	}

}
