package com.example.employeebook;

import org.apache.commons.lang3.StringUtils;

import javax.naming.Name;
import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.lang3.StringUtils.*;

public class EmployeeServiceImpl implements EmployeeService {
    private Map<String, Employee> storage = new HashMap<>();


    @Override
    public void addEmployee(Employee employee) {
        if(!validateInput("Name", "surName")){
            throw new IllegalArgumentException();
        }
        if (storage.containsKey(employee.getName() + employee.getSurName())) {
            throw new EmployeeAllredyAddException("Такой сотрудник уже есть");
        }
        storage.put(employee.getName() + employee.getSurName(), employee);

    }

    @Override
    public void removeEmployee(String name, String surName) {
        if(!validateInput("Name", "surName")){
            throw new IllegalArgumentException();
        }
        if (!storage.containsKey(name + surName)) {
            throw new IllegalArgumentException("Сотрудник не найден");
        }
        storage.remove(name + surName);

    }

    @Override
    public Employee findEmployee(String name, String surName) {
        if (!storage.containsKey(name + surName)) {
            throw new IllegalArgumentException("Сотрудник не найден");
        }
        return storage.get(name + surName);
    }

    private boolean validateInput(String name, String surName){
        return isAlpha("name") && isAlpha("surMame");
    }
}
