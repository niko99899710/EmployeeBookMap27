package com.example.employeebook;

import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.*;

public class Employee {
    private String name;
    private String surName;

    public Employee(String name, String surName) {
        this.name = capitalize(name.toLowerCase());
        this.surName = capitalize(surName.toLowerCase());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
