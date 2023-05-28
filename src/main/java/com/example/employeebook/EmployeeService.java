package com.example.employeebook;

public interface EmployeeService {
    void addEmployee(Employee employee);

    void removeEmployee(String name, String lastName);

    Employee findEmployee(String name, String lastName);
}
