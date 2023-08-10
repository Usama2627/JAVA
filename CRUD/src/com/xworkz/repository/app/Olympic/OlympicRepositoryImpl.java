package com.xworkz.repository.app.Olympic;

public class OlympicRepositoryImpl implements OlympicRepository {

	private int[] flags = new int[TOTAL_FLAGS];

	int index = 0;

	@Override
	public void save(int year) {

		System.out.println("Invoking save in OlympicRepositoryImpl");

		if(index<TOTAL_FLAGS) {
			this.flags[year] = year;
			System.out.println("At the index = "+index+" the year is : "+year);
			index = index + 1;
			System.out.println("The next updated index is = "+index);
		}
		else {
			System.err.println("Index is full, cannot add years");
		}

	}

	@Override
	public void display() {

		System.out.println("\nInvoking display in OlympicRepositoryImpl");

		for(int start=0;start<flags.length;start++) {
			System.out.println("The index at "+start+" is : "+flags[start]);
		}
	}

}
