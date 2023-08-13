package com.xworkz.country.app;

public class CountryRepositoryImpl implements CountryRepository {

	String[] allNames = new String[MAX_LIMIT];
	private int num = 0;
	private int start = 0;

	@Override
	public void save(String name) {
		if (num < MAX_LIMIT) {
			allNames[num] = name;
			System.out.println("Name at index: " + num + " is: " + allNames[num]);
			num++;
		} else {
			System.err.println("Index Limit exceeded, Cannot store anymore");
		}
	}

	@Override
	public boolean isExist(String name) {
		for (int index = 0; index < allNames.length; index++) {
			String ref = allNames[index];
			if (ref.equalsIgnoreCase(name)) {
				System.out.println("Name checked is: " + name);
				return true;
			}
		}
		return false;
	}

	@Override
	public String returnUpperCase(String name) {
		if (isExist(name)) {
			System.out.println("Name found ");
			String caseChange = name.toUpperCase();
			return "Upper Case of given name " + name + " is: " + caseChange;
		} else {
			System.out.println("Given name: '" + name + "' not found");
			return "Cannot be changed to upper case";
		}
	}

	@Override
	public String[] findStartsWith(String name) {
		String[] values = new String[MAX_LIMIT];
		for (int index = 0; index < MAX_LIMIT; index++) {
			String subString = allNames[index];
			if (subString != null && subString.startsWith(name)) {
				values[start] = subString;
				System.out.println("Country name Starting with " + name + " is " + values[start]);
				start++;
			}
		}
		return values;
	}

	@Override
	public String[] findEndsWith(String name) {
		String[] values = new String[MAX_LIMIT];
		for (int index = 0; index < MAX_LIMIT; index++) {
			String subString = allNames[index];
			if (subString != null && subString.endsWith(name)) {
				values[start] = subString;
				System.out.println("Country name Ending with " + name + " is " + values[start]);
				start++;
			}
		}
		return values;
	}

	@Override
	public int savedCount(String[] arr) {
		int count = 0;
		for (String value : arr) {
			if (value != null) {
				count++;
			}
		}
		System.out.println("Number of elements stored is: " + count);
		return count;
	}

	@Override
	public void orderAscending() {
		for (int first = 0; first < MAX_LIMIT; first++) {
			for (int second = first + 1; second < MAX_LIMIT; second++) {
				if (allNames[first] != null && allNames[second] != null &&
						allNames[first].compareTo(allNames[second]) > 0) {
					String temp = allNames[first];
					allNames[first] = allNames[second];
					allNames[second] = temp;
				}
			}
			if (allNames[first] != null) {
				System.out.println(allNames[first]);
			}
		}
	}

	@Override
	public void orderDescending() {
		for (int first = 0; first < MAX_LIMIT; first++) {
			for (int second = first + 1; second < MAX_LIMIT; second++) {
				if (allNames[first] != null && allNames[second] != null &&
						allNames[first].compareTo(allNames[second]) < 0) {
					String temp = allNames[first];
					allNames[first] = allNames[second];
					allNames[second] = temp;
				}
			}
			if (allNames[first] != null) {
				System.out.println(allNames[first]);
			}
		}
	}


}
