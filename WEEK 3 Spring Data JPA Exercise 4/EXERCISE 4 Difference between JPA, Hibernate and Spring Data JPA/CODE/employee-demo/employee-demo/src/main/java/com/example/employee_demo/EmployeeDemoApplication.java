package com.example.employee_demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.employee_demo.model.Employee;
import com.example.employee_demo.service.EmployeeService;

@SpringBootApplication
public class EmployeeDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EmployeeDemoApplication.class, args);
        
        EmployeeService employeeService = context.getBean(EmployeeService.class);

        Employee employee = new Employee();
        employee.setName("Shriya");
        employee.setSalary(50000);

        employeeService.addEmployee(employee);

        System.out.println("✅ Employee saved to database!");
    }
}
