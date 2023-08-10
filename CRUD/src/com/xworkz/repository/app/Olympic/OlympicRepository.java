package com.xworkz.repository.app.Olympic;

public interface OlympicRepository {

	int TOTAL_FLAGS = 5;

	void save(int year);

	default void display() {

	}

}
