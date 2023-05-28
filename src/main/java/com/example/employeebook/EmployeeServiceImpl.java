package com.example.employeebook;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private Map<String, Employee> storage = new HashMap<>();


    @Override
    public void addEmployee(Employee employee) {
        if (storage.containsKey(employee.getName() + employee.getSurName())) {
            throw new EmployeeAllredyAddException("Такой сотрудник уже есть");
        }
        storage.put(employee.getName() + employee.getSurName(), employee);

    }

    @Override
    public void removeEmployee(String name, String surName) {
        if (!storage.containsKey(name + surName)) {
            throw new EmployeeNotFindException("Сотрудник не найден");
        }
        storage.remove(name + surName);

    }

    @Override
    public Employee findEmployee(String name, String surName) {
        if (!storage.containsKey(name + surName)) {
            throw new EmployeeNotFindException("Сотрудник не найден");
        }
        return storage.get(name + surName);
    }
}
