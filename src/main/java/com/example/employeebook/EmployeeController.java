package com.example.employeebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController (EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
     @GetMapping("/add")
    public void addEmployee(@RequestParam String name, @RequestParam String lastName) {
        employeeService.addEmployee(new Employee(name, lastName));
    }

    @GetMapping("/remove")
    public void removeEmployee(@RequestParam String name, @RequestParam String lastName) {
        employeeService.removeEmployee(name, lastName);
    }

    @GetMapping("find")
    public void findEmployee(@RequestParam String name, @RequestParam String lastName) {
        employeeService.findEmployee(name, lastName);
    }

}


