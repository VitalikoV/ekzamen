package com.company.task1;

import java.util.List;
import java.util.Objects;

public class Book {
    private String name;
    private Boolean isTaken;
    private List<Student> listOfStudents;

    public long getNumberOfStudentsByName(String name){
        return listOfStudents.stream()
                .filter(student -> Objects.equals(student.getName(), name))
                .count();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getTaken() {
        return isTaken;
    }

    public void setTaken(Boolean taken) {
        isTaken = taken;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
}
