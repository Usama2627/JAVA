package com.xworkz.isa;

public class Building {

    String cementBrand;
    double height;
    String color;
    double expenditure;

    public Building(String cementBrand, double height, String color, double expenditure) {
        System.out.println("Running string, double, string, double constructor in Building...");
        this.cementBrand = cementBrand;
        this.height = height;
        this.color = color;
        this.expenditure = expenditure;
    }

    public static void main(String[] args) {
        Home home1 = new Home("ABC residency", "ABC", 21, "JK Super", 56, 50, "Grey");
        home1.printInfo();

        Home home2 = new Home("XYZ residency", "XYZ", 23, "Ambuja", 80, 85, "White");
        home2.printInfo();
    }
}
