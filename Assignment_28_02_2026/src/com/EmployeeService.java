package com;


import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

    public static double calcAvgPay() {
        return EmployeeRepository.getEmpList().stream()
                .map(emp -> emp.getPay())
                .collect(Collectors.averagingDouble(val -> val));
    }

    public static Map<String, Optional<Employee>> getMaxPayByDept() {
        return EmployeeRepository.getEmpList().stream()
                .filter(emp -> emp.getDept() != null)
                .collect(Collectors.groupingBy(emp -> emp.getDept().getDeptName(),
                        Collectors.maxBy(Comparator.comparing(emp -> emp.getPay()))));
    }

    public static Map<String, Double> getTotalPayByDept() {
        return EmployeeRepository.getEmpList().stream()
                .filter(emp -> emp.getDept() != null)
                .collect(Collectors.groupingBy(emp -> emp.getDept().getDeptName(),
                        Collectors.summingDouble(emp -> emp.getPay())));
    }

    public static void displayNameAndPay() {
        EmployeeRepository.getEmpList()
                .forEach(emp -> System.out.println(emp.getFName() + " : " + emp.getPay()));
    }

    public static List<Employee> sortByPayDesc() {
        return EmployeeRepository.getEmpList().stream()
                .sorted((emp1, emp2) -> Double.compare(emp2.getPay(), emp1.getPay()))
                .collect(Collectors.toList());
    }
}