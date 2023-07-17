package com.xworkz.association;

public class Movie {
	
	String title = "MMMMMMM";       
    int releaseYear;    
    String genre;     
    double rating; 
    
    Director director = new Director("John", 30, 20, "USA");
    
    public static void main(String[] args) {
    	System.out.println("Running main.....");
    	
    	Movie movie1 = new Movie("Ironman", 2012, "Action", 8.5);
    	Movie movie2 = new Movie("Spiderman", 2022, "Action", 7.5);
    	movie1.printInfo();
    	movie2.printInfo();
    }
    
    Movie(String title, int releaseYear, String genre, double rating) 
    {
    	this.title = title;
    	this.releaseYear = releaseYear;
    	this.genre = genre;
    	this.rating = rating;
    }
    
    void printInfo() {
    	System.out.println("Title: " + this.title);
    	System.out.println("Release Year: " + this.releaseYear);
    	System.out.println("Genre: " + this.genre);
    	System.out.println("Rating: " + this.rating);
    	director.printInfo();
    }
}
