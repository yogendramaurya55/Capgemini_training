package com;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;


public class EmployeeService {

    private static EmployeeDao dao = new EmployeeDao();

    public static double calcAvgPay() {
        return dao.calcAvgPay();
    }

    public static Map<String, Optional<Employee>> getMaxPayByDept() {
        return dao.getMaxPayByDept();
    }

    public static Map<String, Double> getTotalPayByDept() {
        return dao.getTotalPayByDept();
    }

    public static void displayNameAndPay() {
        dao.displayNameAndPay();
    }

    public static List<Employee> sortByPayDesc() {
        return dao.sortByPayDesc();
    }
}