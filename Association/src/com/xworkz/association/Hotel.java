package com.xworkz.association;

class Hotel {
	
    String name = "HHHHHHH";
    int capacity;
    double rating;
    String location;
    
    Owner owner = new Owner("James", 45, "123456789", "james@gmail.com");

    public static void main(String[] args) {
    	System.out.println("Running main.....");
    	
        Hotel hotel1 = new Hotel("Indian Hotel", 500, 8.5, "City Center");
        Hotel hotel2 = new Hotel("Sahara Hotel", 100, 7.5, "Btm Layout");
        hotel1.printInfo();
        hotel2.printInfo();
    }

    Hotel(String name, int capacity, double rating, String location) 
    {
        this.name = name;
        this.capacity = capacity;
        this.rating = rating;
        this.location = location;
        
    }

    void printInfo() {
        System.out.println("Hotel Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Rating: " + rating);
        System.out.println("Location: " + location);
        owner.printInfo();
    }
}
