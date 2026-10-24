package com.method.task;

public class EmployeeSalary {
	public double calculateSalary(double basic) {
		double HRA=8000.0;
		double DA=4000.0;
		double salary=basic+HRA+DA;
		System.out.print("Salary after HRA & DA :  ");
		return salary;
		
	}

}
