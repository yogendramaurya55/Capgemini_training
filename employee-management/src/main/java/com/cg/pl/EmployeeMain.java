package com.cg.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;

public class EmployeeMain {

	//main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        EmployeeService es = new EmployeeService();

        while (isTrue) {
            System.out.println("1. Create Employee");
            System.out.println("2. Find Employee by ID");
            System.out.println("3. Get All Employees");
            System.out.println("4. Update Employee Name");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter DOB (yyyy-mm-dd): ");
                    final String dob = sc.nextLine();

                    final String result = es.createEmployee(
                            new Employee(name, email, dob));
                    System.out.println(result);
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    String id = sc.nextLine();

                    Employee emp = es.findById(id);
                    System.out.println(emp != null ? emp : "Not Found");
                    break;

                case 3:
                    final List<Employee> list = es.getAllEmployee();
                    list.forEach(System.out::println);
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    String uid = sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.println(
                            es.updateEmployeeName(uid, newName));
                    break;

                case 5:
                    System.out.print("Enter Employee ID: ");
                    String did = sc.nextLine();

                    System.out.println(
                            es.removeEmployee(did));
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    isTrue = false;
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}