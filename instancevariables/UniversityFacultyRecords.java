package com.dailytask.instancevariables;

public class UniversityFacultyRecords {
	static String universityName = "kakathiya";
	String facultyName;
	String Department;

	public void setDetails(String facultyName, String Department) {
		this.facultyName = facultyName;
		this.Department = Department;
	}

	public void showFacultyDetails() {
		System.out.println("University Name: " + universityName);
		System.out.println(" Faculty Name: " + facultyName);
		System.out.println("Department: " + Department);

	}

	public static void main(String[] args) {
		universityName="Standford University";
		 UniversityFacultyRecords u=new  UniversityFacultyRecords();
		 u.setDetails("Dr.Robert Brown","Computer Science");
		 UniversityFacultyRecords u1=new  UniversityFacultyRecords();
		 u1.setDetails("Dr.Lisa Green", "Physics");
		 u.showFacultyDetails();
		 System.out.println("--------------------------------------------------");
		 u1.showFacultyDetails();

	}

}
