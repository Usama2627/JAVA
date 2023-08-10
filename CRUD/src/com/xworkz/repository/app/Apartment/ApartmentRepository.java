package com.xworkz.repository.app.Apartment;

public interface ApartmentRepository {

	int TOTAL_ROOMS = 5;

	void save(String name);

	default void dispaly() {

	}
}
