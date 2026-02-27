package com.labs;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeService {

	public static double getTotalSalary() {

		return EmployeeRepository.getEmployees().stream().map(e -> e.getSalary())
				.collect(Collectors.summingDouble(e -> e));
	}

	public static void getTotalEmpPerDept() {

		Map<String, Long> counts = EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null)
				.map(e -> e.getDepartment().getDepartmentName())
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		System.out.println(counts);
	}

	public static Employee getSenior() {

		return EmployeeRepository.getEmployees().stream().min((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()))
				.get();
	}

	public static void getDuration() {

		EmployeeRepository.getEmployees().stream()
				.forEach(e -> System.out.println("Name" + e.getFirstName() + " " + " Months ->"
						+ Period.between(e.getHireDate(), LocalDate.now()).getYears() * 12
						+ Period.between(e.getHireDate(), LocalDate.now()).getMonths() + " Days ->"
						+ Period.between(e.getHireDate(), LocalDate.now()).getDays()));
	}

	public static void getEmpWithoutDepartment() {
		EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() == null).forEach(System.out::println);
	}

	public static void getDepartmentEmpWithout() {
		List<Employee> emp = EmployeeRepository.getEmployees();

		Set<Integer> set = new HashSet<>();

		for (Employee e : emp) {
			Department d = e.getDepartment();

			if (d != null) {
				set.add(d.getDepartmentId());
			}
		}

		EmployeeRepository.getDepartments().stream().filter(e -> !set.contains(e.getDepartmentId()))
				.forEach(e -> System.out.println(e.getDepartmentName()));

	}

	public static Department getCount() {

		List<Employee> emp = EmployeeRepository.getEmployees();

		return EmployeeRepository.getDepartments().stream().max((e1, e2) -> {

			String d1 = e1.getDepartmentName();
			String d2 = e2.getDepartmentName();

			int c1 = 0;
			int c2 = 0;

			for (Employee e : emp) {
				if (e.getDepartment() != null && d1.equals(e.getDepartment().getDepartmentName())) {
					c1++;
				}
			}

			for (Employee e : emp) {
				if (e.getDepartment() != null && d2.equals(e.getDepartment().getDepartmentName())) {
					c2++;
				}
			}

			return c1 - c2;
		}).orElse(null);

	}

}
