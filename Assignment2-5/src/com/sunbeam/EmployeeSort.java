package com.sunbeam;

import java.util.Arrays;

public class EmployeeSort {

	static int count;

	public static void selectionSortEmployee(Employee[] employees, int N) {
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (employees[i].getSalary() > employees[j].getSalary()) {
					count++;
					Employee temp = employees[i];
					employees[i] = employees[j];
					employees[j] = temp;
				}
			}
		}
	}


	public static void main(String[] args) {

		Employee[] employees = new Employee[6];
		employees[0] = new Employee(1, "John", 50000.0);
		employees[1] = new Employee(2, "Alice", 60000.0);
		employees[2] = new Employee(3, "Bob", 55000.0);
		employees[3] = new Employee(4, "Eve", 45000.0);
		employees[4] = new Employee(5, "Charlie", 52000.0);
		employees[5] = new Employee(6, "David", 48000.0);

		System.out.println("Employees before sorting:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		selectionSortEmployee(employees, employees.length);

		System.out.println("\nEmployees after sorting by salary:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		System.out.println("No of Comparisons: " + count);

	}
}
