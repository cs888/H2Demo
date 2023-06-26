package com.example.h2demo.dao;

import com.example.h2demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByDept(String dept);

    List<Employee> findBySalary(double salary);
}