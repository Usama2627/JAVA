package com.xworkz;

public class BatteryRunner {

    public static void main(String[] args) {

        System.out.println("Running main.....");

        Battery ref1 = new Battery("Duracell", "A1", true);
        ref1.setType(BatteryType.ALKALINE);
        ref1.display();

        Battery ref2 = new Battery("Energizer", "A2", false);
        ref2.setType(BatteryType.LITHIUM);
        ref2.display();
    }

}
