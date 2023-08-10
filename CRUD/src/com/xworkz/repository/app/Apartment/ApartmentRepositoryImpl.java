package com.xworkz.repository.app.Apartment;

public class ApartmentRepositoryImpl implements ApartmentRepository {

	private String[] names = new String[TOTAL_ROOMS];

	int index = 0;

	@Override
	public void save(String name) {

		System.out.println("Invoking save in ApartmentRepositoryImpl");

		if (index<TOTAL_ROOMS) {
			this.names[index] = name;
			System.out.println("At the index = "+index+" the name is : "+name);
			index = index + 1;
			System.out.println("The next updated index is = "+index);
		}
		else {
			System.err.println("Index is full, cannot add names");
		}
	}

	@Override
	public void dispaly() {

		System.out.println("\nInvoking display in ApartmentRepositoryImpl");

		for(int stop=0;stop<names.length;stop++) {
			System.out.println("The name at index "+stop+" is : "+names[stop]);
		}
	}

}
