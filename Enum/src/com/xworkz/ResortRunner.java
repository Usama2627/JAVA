package com.xworkz;

public class ResortRunner {

    public static void main(String[] args) {

        System.out.println("Running main.....");

        Resort ref1 = new Resort("Jai Hind", "Jai", true);
        ref1.setType(ResortRoomType.SINGLE);
        ref1.display();

        Resort ref2 = new Resort("Galaxy", "Galax", false);
        ref2.setType(ResortRoomType.DOUBLE);
        ref2.display();
    }

}
