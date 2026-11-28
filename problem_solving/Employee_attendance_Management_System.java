package com.dailytask.problem_solving;


class Attendance extends Employee {
    int totalWorkingDays = 30;
    int presentDays;
    int absentDays;
    int perDaySalary = 1000;
    double payableSalary;
	private int netSalary;

    Attendance(int empId, String name, double salary, int presentDays) {
        super(empId, name, salary);
        this.presentDays = presentDays;
        this.absentDays = totalWorkingDays - presentDays;

        if(presentDays > absentDays)
            System.out.println("Invalid Data");

        this.payableSalary = this.netSalary - (perDaySalary * absentDays);
    }

    public void displayEmployeeDetails() {

        super.displayEmployeeDetails();
        System.out.println("Payable Salary: "+this.payableSalary);

        if(presentDays < 15)
            System.out.println("Low Attendance");
        else if(presentDays < 25)
            System.out.println("Average Attendance");
        else
            System.out.println("Good Attendance");
    }



}

public class Employee_attendance_Management_System {

	public static void main(String[] args) {
		 Attendance emp1 = new Attendance(101, "AKHIL", 30000, 25);

	        emp1.displayEmployeeDetails();
	    

	}

}
