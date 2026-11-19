package com.dailytask.instancevariables;

public class Mobilestoresystem {

	static String storename="tech";
	String brand;
	double price;
	public void setvalues(String brand,double price) {
		this.brand=brand;
		this.price=price;
	}
		public void showDetails() {
			System.out.println("Store Name: "+ storename);
			System.out.println("Mobile Brand: "+brand);
			System.out.println("Mobile price: "+price);
		}

	public static void main(String[] args) {
		storename="Tech world";
		Mobilestoresystem m=new Mobilestoresystem();
		m.setvalues("Apple", 1200);
		Mobilestoresystem m1=new Mobilestoresystem();
		m1.setvalues("Samsung", 900);
		m.showDetails();
		System.out.println("----------------------------");
		m1.showDetails();

	}

}
