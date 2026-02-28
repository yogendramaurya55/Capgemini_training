package com;

public class Main {

    public static void main(String[] args) {

        System.out.println("Average Salary: " + EmployeeService.calcAvgPay());

        System.out.println("Max Salary By Department:");
        System.out.println(EmployeeService.getMaxPayByDept());

        System.out.println("Total Salary By Department:");
        System.out.println(EmployeeService.getTotalPayByDept());

        System.out.println("Employee Name & Salary: ");
        EmployeeService.displayNameAndPay();

        System.out.println("Sorted By Salary Desc:");
        EmployeeService.sortByPayDesc().forEach(System.out::println);
    }
}
