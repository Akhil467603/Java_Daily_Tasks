package com.dailytask.instancevariables;

public class HospitalpatientManagement {
	static String HospitalName = "care Hospital";
	String patientname;
	int age;

	public void setDetails(String patientname, int age) {
		this.patientname = patientname;
		this.age = age;
	}

	public void printDetails() {
		System.out.println("Hospital Name: " + HospitalName);
		System.out.println("Patient Name: " + patientname);
		System.out.println("Patient Age: " + age);

	}

	public static void main(String[] args) {
		HospitalName = "City Care Hospital";
		HospitalpatientManagement h = new HospitalpatientManagement();
		h.setDetails("John Doe", 45);
		HospitalpatientManagement h1 = new HospitalpatientManagement();
		h1.setDetails("Emma Watson", 30);
		h.printDetails();
		System.out.println("-----------------------------------------------------------------------");
		h1.printDetails();
	}

}
