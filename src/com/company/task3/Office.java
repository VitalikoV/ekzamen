package com.company.task3;

public class Office implements Building{
    private String name;
    private double income;

    @Override
    public double getIncome() {
        return income;
    }
}