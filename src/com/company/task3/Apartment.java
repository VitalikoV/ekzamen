package com.company.task3;

public class Apartment implements Building{
    private String name;
    private double income;

    @Override
    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}