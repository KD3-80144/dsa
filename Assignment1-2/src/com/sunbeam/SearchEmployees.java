package com.sunbeam;
//2. Create array of employees and search employee by 
//	i. empid
//	ii. name
//	iii. salary

import java.util.Scanner;

public class SearchEmployees {

	    public static int searchById(Employee arr[], int size, int key) {
	        int left = 0, right = size - 1, mid;
	        while (left <= right) {
	            mid = (left + right) / 2;
	            if (arr[mid].getId() == key)
	                return mid;
	            else if (key < arr[mid].getId())
	                right = mid - 1;
	            else
	                left = mid + 1;
	        }
	        return -1;
	    }

	    public static int searchByName(Employee arr[], int size, String keyName) {
	        for (int i = 0; i < size; i++) {
	            if (arr[i].getName().equals(keyName)) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public static int searchBySalary(Employee arr[], int size, double keySalary) {
	        for (int i = 0; i < size; i++) {
	            if (arr[i].getSalary() == keySalary) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Employee[] employees = new Employee[3];

	        employees[0] = new Employee(1, "Avinash", 50000.0);
	        employees[1] = new Employee(2, "Raju", 52000.0);
	        employees[2] = new Employee(3, "Vijay", 55000.0);

	        // For ID Search
	        System.out.println("Enter the Id to be searched");
	        int keyId = sc.nextInt();
	        int index = searchById(employees, employees.length, keyId);

	        if (index != -1) {
	            System.out.println("Id is found at Index: " + index);
	            System.out.println("Employee Details: " + employees[index].getId() + ", " + employees[index].getName() + ", " + employees[index].getSalary());
	        } else {
	            System.out.println("Id is not found");
	        }

	        // For Name Search
	        System.out.println("Enter the Name to be searched");
	        sc.nextLine(); // Consume the newline character
	        String keyName = sc.nextLine();
	        int index1 = searchByName(employees, employees.length, keyName);

	        if (index1 != -1) {
	            System.out.println("Name is found at Index: " + index1);
	            System.out.println("Employee Details: " + employees[index1].getId() + ", " + employees[index1].getName() + ", " + employees[index1].getSalary());
	        } else {
	            System.out.println("Name is not found");
	        }

	        // For Salary Search
	        System.out.println("Enter the Salary to be searched");
	        double keySalary = sc.nextDouble();
	        int index2 = searchBySalary(employees, employees.length, keySalary);

	        if (index2 != -1) {
	            System.out.println("Salary is found at Index: " + index2);
	            System.out.println("Employee Details: " + employees[index2].getId() + ", " + employees[index2].getName() + ", " + employees[index2].getSalary());
	        } else {
	            System.out.println("Salary is not found");
	        }
	    }
	}
