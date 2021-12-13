package com.company.task3;

public class Worker implements Employee{
    private String firstName;
    private String lastName;
    private String email;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
