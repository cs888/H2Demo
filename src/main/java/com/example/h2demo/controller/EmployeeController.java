package com.example.h2demo.controller;

import com.example.h2demo.dao.EmployeRepository;
import com.example.h2demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeRepository employeRepository;

    @PostMapping("/save")
    public String save(@RequestBody Employee employee) {
        employeRepository.save(employee);
        return "Saved record..";
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAll() {
        return employeRepository.findAll();
    }

    @GetMapping("/getAllEmployee/{dept}")
    public List<Employee> getAll(@PathVariable String dept) {
        return employeRepository.findByDept(dept);
    }

    @GetMapping("/getEmployeeSalary/{salary}")
    public List<Employee> getAllNames(@PathVariable double salary) {
        return employeRepository.findBySalary(salary);
    }

}
