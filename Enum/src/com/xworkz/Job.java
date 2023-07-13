package com.xworkz;

public class Job {

    String title = "JJJJJ";
    String company = "JJJ";
    JobType type;
    double salary;

    Job(String title, String company, double salary) {
        System.out.println("Running S, S, D const");
        this.title = title;
        this.company = company;
        this.salary = salary;
    }

    void display() {
        System.out.println("Job Title: " + title);
        System.out.println("Company Name: " + company);
        System.out.println("Salary: " + salary);
        System.out.println("Job Type: " + type);
    }

    void setType(JobType type) {
        this.type = type;
    }

}
