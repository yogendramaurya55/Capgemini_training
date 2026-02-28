package com;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private static final List<Employee> empList;
    private static final List<Department> deptList;

    static {
        deptList = new ArrayList<>();

        deptList.add(new Department(10, "Administration", 100));
        deptList.add(new Department(20, "Production", 201));
        deptList.add(new Department(30, "Sales", 124));
        deptList.add(new Department(40, "Finance", 205));
        deptList.add(new Department(50, "Customer Support", 100));

        empList = new ArrayList<>();

        empList.add(new Employee(100, "Steven", "King",
                "SKING", "515.123.4567", LocalDate.of(1997, Month.JUNE, 17),
                "President", 24000, null, deptList.get(0)));
        empList.add(new Employee(101, "Neena", "Kochhar",
                "NKOCHHAR", "515.123.4568", LocalDate.of(1999, Month.SEPTEMBER, 21),
                "Vice President", 17000, 100, deptList.get(0)));
        empList.add(new Employee(102, "Lex", "De Haan",
                "LDEHAAN", "515.123.4569", LocalDate.of(2003, Month.JUNE, 13),
                "Vice President", 17000, 100, deptList.get(0)));
        empList.add(new Employee(201, "Michael", "Hartstein",
                "MHARTSTE", "515.123.5555", LocalDate.of(1996, Month.FEBRUARY, 17),
                "Manager", 13000, 100, deptList.get(1)));
        empList.add(new Employee(202, "Pat", "Fay",
                "PFAY", "603.123.6666", LocalDate.of(2007, Month.AUGUST, 17),
                "Deputy Manager", 6000, 201, deptList.get(1)));
        empList.add(new Employee(124, "Kevin", "Mourgos",
                "KMOURGOS", "650.123.5234", LocalDate.of(2009, Month.NOVEMBER, 16),
                "Manager", 5800, 100, deptList.get(2)));
        empList.add(new Employee(141, "Trenna", "Rajs",
                "TRAJS", "650.121.8009", LocalDate.of(1995, Month.OCTOBER, 17),
                "Clerk", 3500, 124, deptList.get(2)));
        empList.add(new Employee(205, "Shelley", "Higgins",
                "SHIGGINS", "515.123.8080", LocalDate.of(2004, Month.JUNE, 7),
                "Manager", 12000, 101, deptList.get(3)));
        empList.add(new Employee(206, "William", "Gietz",
                "WGIETZ", "515.123.8181", LocalDate.of(2004, Month.JUNE, 7),
                "Accountant", 8300, 205, deptList.get(3)));
        empList.add(new Employee(199, "Douglas", "Grant",
                "DGRANT", "650.507.9844", LocalDate.of(2000, Month.JANUARY, 13),
                "Clerk", 2600, 205, deptList.get(3)));
        empList.add(new Employee(200, "Jennifer", "Whalen",
                "JWHALEN", "515.123.4444", LocalDate.of(2007, Month.SEPTEMBER, 17),
                "Admin Assistant", 4400, 102, null));
        empList.add(new Employee(198, "Donald", "OConnell",
                "DOCONNEL", "650.507.9833", LocalDate.of(2009, Month.JUNE, 21),
                "Clerk", 2600, null, null));
    }

    public static List<Employee> getEmpList() {
        return empList;
    }

    public static List<Department> getDeptList() {
        return deptList;
    }
}