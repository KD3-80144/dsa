package com.sunbeam;

public class Employee {
	int id;
	String name;
	double salary;
	
	public Employee() {	}//Parameterless

	public Employee(int id, String name, double salary) //Parameterized
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {return id;}

	public String getName() {return name;}

	public double getSalary() {return salary;}

	@Override
	public String toString() {
		return "Employee [Id=" + id + ", Name=" + name + ", Salary=" + salary + "]";
	}
	
}
