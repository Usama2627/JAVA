package com.xworkz.repository.app.Hospital;

public interface HospitalRepository {
	
	int TOTAL_NAMES = 5;

	void save(String name);

	default void display() {

	}

}
