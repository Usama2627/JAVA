package com.xworkz.association;

class Owner {
	
    String name = "OOOOOOO";
    int age;
    String contactNumber;
    String email;

    Owner(String name, int age, String contactNumber, String email) 
    {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    void printInfo() {
        System.out.println("Owner Name: " + name);
        System.out.println("Owner Age: " + age);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
    }
}