package com.xworkz;

public class JobRunner {

    public static void main(String[] args) {

        System.out.println("Running main.....");

        Job ref1 = new Job("Software Engineer", "Xworkz", 75000.0);
        ref1.setType(JobType.FULL_TIME);
        ref1.display();

        Job ref2 = new Job("Hardware Engineer", "XYZ", 60000.0);
        ref2.setType(JobType.PART_TIME);
        ref2.display();
    }

}
