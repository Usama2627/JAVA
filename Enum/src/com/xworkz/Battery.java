package com.xworkz;

public class Battery {

    String brand = "BBBBB";
    String model = "BBB";
    BatteryType type;
    boolean rechargeable = true;

    Battery(String brand, String model, boolean rechargeable) {
        System.out.println("Running S, S, B const");
        this.brand = brand;
        this.model = model;
        this.rechargeable = rechargeable;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rechargeable: " + rechargeable);
        System.out.println("Type: " + type);
    }

    void setType(BatteryType type) {
        this.type = type;
    }

}
