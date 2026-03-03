package com.main;


import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.cg.bean.Employee;
import com.EmployeeService;

public class Main {

    public static void main(String[] args) {

        System.out.println("Average Salary: " + EmployeeService.calcAvgPay());

        System.out.println("\nMax Salary By Department:");
        Map<String, Optional<Employee>> maxMap =
                EmployeeService.getMaxPayByDept();

        maxMap.forEach((dept, emp) ->
                System.out.println(dept + " -> " +
                        emp.map(e -> e.getFName() + " : " + e.getPay())
                                .orElse("No Employee")));

        System.out.println("\nTotal Salary By Department:");
        Map<String, Double> totalMap =
                EmployeeService.getTotalPayByDept();

        totalMap.forEach((dept, total) ->
                System.out.println(dept + " -> " + total));

        System.out.println("\nName and Salary:");
        EmployeeService.displayNameAndPay();

        System.out.println("\nEmployees Sorted By Salary (Desc):");
        List<Employee> sortedList =
                EmployeeService.sortByPayDesc();

        sortedList.forEach(emp ->
                System.out.println(emp.getFName() + " : " + emp.getPay()));
    }
}