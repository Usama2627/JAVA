package com.xworkz;

public class Resort {

    String name = "RRRRR";
    String ownerName = "RRR";
    ResortRoomType type;
    boolean breakfast = true;

    Resort(String name, String ownerName, boolean breakfast) {
        System.out.println("Running S, S, B const");
        this.name = name;
        this.ownerName = ownerName;
        this.breakfast = breakfast;
    }

    void display() {
        System.out.println("The name of the resort is: " + name);
        System.out.println("The name of the owner is: " + ownerName);
        System.out.println("Breakfast offering: " + breakfast);
        System.out.println("The type of room is: " + type);
    }

    void setType(ResortRoomType type) {
        this.type = type;
    }

}
