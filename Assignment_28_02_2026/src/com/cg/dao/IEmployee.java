package com.cg.dao;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.cg.bean.Employee;

public interface IEmployee {

    double calcAvgPay();

    Map<String, Optional<Employee>> getMaxPayByDept();

    Map<String, Double> getTotalPayByDept();

    void displayNameAndPay();

    List<Employee> sortByPayDesc();
}