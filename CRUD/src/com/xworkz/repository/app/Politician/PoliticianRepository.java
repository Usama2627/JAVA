package com.xworkz.repository.app.Politician;

public interface PoliticianRepository {

	int TOTAL_NAMES = 5;

	void save(String name);

	default void display() {

	}

}
