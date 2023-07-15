package com.xworkz.association;

class Franchise {
	
    String name = "FFFFFFF";
    int yearFounded;
    String location;
    String industry;

    Franchise(String name, int yearFounded, String location, String industry) 
    {
        this.name = name;
        this.yearFounded = yearFounded;
        this.location = location;
        this.industry = industry;
    }

    void printInfo() {
        System.out.println("Franchise Name: " + name);
        System.out.println("Year Founded: " + yearFounded);
        System.out.println("Location: " + location);
        System.out.println("Industry: " + industry);
    }
}
