package com.xworkz;

public class TempleRunner {

    public static void main(String[] args) {

        System.out.println("Running main.....");

        Temple ref1 = new Temple("AAA", "A", true);
        ref1.setType(TempleType.ANCIENT);
        ref1.display();

        Temple ref2 = new Temple("BBB", "B", false);
        ref2.setType(TempleType.MODERN);
        ref2.display();
    }

}

