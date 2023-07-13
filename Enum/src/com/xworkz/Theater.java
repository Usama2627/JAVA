package com.xworkz;

public class Theater {

    String name = "TTTTT";
    String location = "TTT";
    TheaterType type;
    boolean has3D = false;

    Theater(String name, String location, boolean has3D) {
        System.out.println("Running S, S, B const");
        this.name = name;
        this.location = location;
        this.has3D = has3D;
    }

    void display() {
        System.out.println("The name of the theater is: " + name);
        System.out.println("The location of the theater is: " + location);
        System.out.println("Has 3D capability: " + has3D);
        System.out.println("The type of theater is: " + type);
    }

    void setType(TheaterType type) {
        this.type = type;
    }

}
