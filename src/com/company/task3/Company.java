package com.company.task3;

import java.util.List;

public class Company {
    private String name;
    private List<Building> buildings;
    private List<Employee> employees;

    public Double calculateIncome(){
        double incomeFromBuildings = buildings.stream()
                .mapToDouble(Building::getIncome)
                .sum();
        double totalSalaryOfEmployees = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        double taxes = ((incomeFromBuildings - totalSalaryOfEmployees) / 100) * 20;
        double total = incomeFromBuildings - totalSalaryOfEmployees - taxes;
        return total;

    }

    public Double calculateIncome(List<Building> buildings){
        double incomeFromBuildings = buildings.stream()
                .mapToDouble(Building::getIncome)
                .sum();
        double totalSalaryOfEmployees = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        double taxes = ((incomeFromBuildings - totalSalaryOfEmployees) / 100) * 20;
        double total = incomeFromBuildings - totalSalaryOfEmployees - taxes;
        return total;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
