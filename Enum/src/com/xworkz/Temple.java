package com.xworkz;

public class Temple {

    String name = "TTTTT";
    String deity = "TTT";
    TempleType type;
    boolean offering = true;

    Temple(String name, String deity, boolean offering) {
        System.out.println("Running S, S, B const");
        this.name = name;
        this.deity = deity;
        this.offering = offering;
    }

    void display() {
        System.out.println("The name of the temple is: " + name);
        System.out.println("The deity worshipped is: " + deity);
        System.out.println("Offering available: " + offering);
        System.out.println("The type of temple is: " + type);
    }

    void setType(TempleType type) {
        this.type = type;
    }

}

