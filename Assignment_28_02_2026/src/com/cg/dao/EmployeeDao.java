package com.cg.dao;

import java.sql.*;
import java.util.*;

import com.cg.bean.Employee;
import com.cg.util.DBUtil;

public class EmployeeDao implements IEmployee {

    @Override
    public double calcAvgPay() {
        String sql = "SELECT AVG(salary) FROM Employee";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next())
                return rs.getDouble(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Map<String, Optional<Employee>> getMaxPayByDept() {

        Map<String, Optional<Employee>> map = new HashMap<>();

        String sql = """
                SELECT d.dept_name, e.*
                FROM Employee e
                JOIN Department d ON e.dept_id = d.dept_id
                WHERE (e.dept_id, e.salary) IN (
                    SELECT dept_id, MAX(salary)
                    FROM Employee
                    WHERE dept_id IS NOT NULL
                    GROUP BY dept_id
                )
                """;

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Employee emp = new Employee(
                        rs.getInt("emp_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getDate("hire_date").toLocalDate(),
                        rs.getString("job_title"),
                        rs.getDouble("salary"),
                        (Integer) rs.getObject("manager_id"),
                        rs.getInt("dept_id")
                );

                map.put(rs.getString("dept_name"), Optional.of(emp));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }

    @Override
    public Map<String, Double> getTotalPayByDept() {

        Map<String, Double> map = new HashMap<>();

        String sql = """
                SELECT d.dept_name, SUM(e.salary) as total_salary
                FROM Employee e
                JOIN Department d ON e.dept_id = d.dept_id
                GROUP BY d.dept_name
                """;

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                map.put(
                        rs.getString("dept_name"),
                        rs.getDouble("total_salary")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }

    @Override
    public void displayNameAndPay() {

        String sql = "SELECT first_name, salary FROM Employee";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getString("first_name") + " : " +
                        rs.getDouble("salary"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> sortByPayDesc() {

        List<Employee> list = new ArrayList<>();

        String sql = "SELECT * FROM Employee ORDER BY salary DESC";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Employee emp = new Employee(
                        rs.getInt("emp_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getDate("hire_date").toLocalDate(),
                        rs.getString("job_title"),
                        rs.getDouble("salary"),
                        (Integer) rs.getObject("manager_id"),
                        (Integer) rs.getObject("dept_id")
                );

                list.add(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
