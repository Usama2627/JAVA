package com.xworkz;

public class TheaterRunner {

    public static void main(String[] args) {

        System.out.println("Running main.....");

        Theater ref1 = new Theater("PVR", "City Center", true);
        ref1.setType(TheaterType.MULTIPLEX);
        ref1.display();

        Theater ref2 = new Theater("INOX", "Mall Road", false);
        ref2.setType(TheaterType.SINGLE_SCREEN);
        ref2.display();
    }

}
