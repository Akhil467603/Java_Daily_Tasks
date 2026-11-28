package com.dailytask.problem_solving;

class Employee {
    int empID;
    String empName;
    double salary;

    double houseRentAllowance;
    double dearnessAllowance;
    double providentFund;
    double grossSalary;
    double netSalary;

    Employee() {
        System.out.println("WELCOME, Pass Employee ID, Name and Salary in Constructor");
    }

    Employee(int empID, String empName, double salary) {
        this.empID = empID;
        this.empName = empName;
        this.salary = salary;

        this.houseRentAllowance = this.salary * 0.20;
        this.dearnessAllowance = this.salary * 0.10;
        this.providentFund = this.salary * 0.12;
        this.grossSalary = this.salary + this.houseRentAllowance + this.dearnessAllowance;
        this.netSalary = this.grossSalary - this.providentFund;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: "+empID);
        System.out.println("Employee Name: "+empName);
        System.out.println("Basic Salary: "+salary);
        System.out.println("HRA: "+houseRentAllowance);
        System.out.println("DA: "+dearnessAllowance);
        System.out.println("PF: "+providentFund);
        System.out.println("Gross Salary: "+grossSalary);
        System.out.println("Net Salary: "+netSalary);
    }

}

public class Employee_Salary_Management_System {
    static void main() {
        Employee emp1 = new Employee(1, "Goutham", 30000);
        emp1.displayEmployeeDetails();
    }
}