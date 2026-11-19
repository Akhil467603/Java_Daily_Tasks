package com.dailytask.blc_elc.employeesalarycalculation;

public class Payrollsystem_ELC {

	public static void main(String[] args) {
		Employee_BLC e1 = new Employee_BLC();

		e1.setEmployeeId(1);
		e1.setEmployeeName("MUSHKE AKHIL");
		e1.setSalary(2000);
		
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("EmployeeId "+e1.getEmployeeId());
		System.out.println("EmployeeName "+e1.getEmployeeName());
		System.out.println("Employee Salary before update: "+e1.getSalary());
		e1.setSalary(3000);
		System.out.println("Employee Salary after update: "+e1.getSalary());
		
		
		
	}
}
