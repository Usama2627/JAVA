package com.xworkz.isa;

public class Xworkz extends Institute{

	String founderName;
	String branchName;
	int noOfSTudentsInClass;


	Xworkz(String name, String purpose, String teachingMode, String establishedIn,
			String founderName, String branchName, int noOfSTudentsInClass) {

		super(name, purpose, teachingMode, establishedIn);
		this.founderName = founderName;
		this.branchName = branchName;
		this.noOfSTudentsInClass = noOfSTudentsInClass;
	}

	void printInfo() {
		System.out.println("Institute name : " + name);
		System.out.println("Institute purpose : " + purpose);
		System.out.println("Institute Teaching mode : " + teachingMode);
		System.out.println("Institute established in: " + establishedIn);
		System.out.println("Institute Founder name: " + founderName);
		System.out.println("Institute Branch name : " + branchName);
		System.out.println("Number of Students in Class : " + noOfSTudentsInClass);

	}


}
