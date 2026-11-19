package com.dailytask.instancevariables;

public class CarShowroomsystem {
	static String showroomName = "Akhil Motors";
	String modelname;
	double carprice;

	public void setCar(String modelname, double carprice) {
		this.modelname = modelname;
		this.carprice = carprice;
	}

	public void displayDetails() {
		System.out.println("Showroom Name: " + showroomName);
		System.out.println("Car Model: " + modelname);
		System.out.println("Car Price: " + carprice);

	}

	public static void main(String[] args) {
		showroomName="Elite Motors";
		CarShowroomsystem c = new CarShowroomsystem();
		CarShowroomsystem c1=new CarShowroomsystem();
		
		c.setCar("Tesla model S", 80000);
		c1.setCar("BMW X5",75000);
		c.displayDetails();
		System.out.println("--------------------------------");
		c1.displayDetails();
		
		
		
	}

}
