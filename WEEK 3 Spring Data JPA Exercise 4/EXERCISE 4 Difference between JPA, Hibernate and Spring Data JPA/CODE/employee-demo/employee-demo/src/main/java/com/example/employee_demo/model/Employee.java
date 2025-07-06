package com.example.employee_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ✅ Let Spring auto-generate IDs
    private int id;

    private String name;
    private double salary;

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id; // optional if you're auto-generating
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
