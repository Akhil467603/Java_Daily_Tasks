package com.dailytask.problem_solving;

public class Employee_Salary_Management_System {

	int employeeId;
	String employeeName;
	double esalary;
	double ehra;
	double eda;
	double pf;
	double grosssalary;
	double netsalary;

	Employee_Salary_Management_System(int employeeId, String employeeName, double esalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.esalary = esalary;

		this.ehra = this.esalary * 0.20;
		this.eda = this.esalary * 0.10;
		this.pf = this.esalary * 0.12;
		this.grosssalary = esalary + ehra + eda;
		this.netsalary = grosssalary - pf;
	}

	public void displayDetails() {
		System.out.println("EMPLOYEE SALARY MANAGEMENT SYSTEM");
		System.out.println("===========================================");
		System.out.println("EMPLOYEE ID= " + employeeId);
		System.out.println("EMPLOYEE NAME= " + employeeName);
		System.out.println("EMPLOYEE SALARY= " + esalary);
		System.out.println("EMPLOYEE HOUSE RENTAL ALLOWENCE= " + ehra);
		System.out.println("EMPLOYEE DAILY ALLOWENCE= " + eda);
		System.out.println("EMPLOYEE PROVIDENT FUND= " + pf);
		System.out.println("EMPLOYEE GROSS SALARY= " + grosssalary);
		System.out.println("EMPLOYEE GROSS SALARY= " + netsalary);

	}

	public static void main(String[] args) {
		Employee_Salary_Management_System e = new Employee_Salary_Management_System(1, "MUSHKE AKHIL", 30000);
		e.displayDetails();

	}

}
