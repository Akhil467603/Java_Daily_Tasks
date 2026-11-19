package com.dailytask.blc_elc.online_shopping_system;

public class ShoppingCart_ELC {

	public static void main(String[] args) {
		Product_BLC p1 = new Product_BLC();
		Product_BLC p2 = new Product_BLC();

		p1.setProductId(1);
		p1.setProductname("Mobile");
		p1.setPrice(100);
		p1.setQuantity(2);

		p2.setProductId(2);
		p2.setProductname("Laptop");
		p2.setPrice(200);
		p2.setQuantity(1);

		System.out.println("Product Id: " + p1.getProductId());
		System.out.println("Product Name: " + p1.getProductname());
		System.out.println("Product Price: " + p1.getPrice());
		System.out.println("Product Quantity: " + p1.getQuantity());
		System.out.println("=============================================");
		System.out.println("Product Id: " + p2.getProductId());
		System.out.println("Product Name: " + p2.getProductname());
		System.out.println("Product Price: " + p2.getPrice());
		System.out.println("Product Quantity: " + p2.getQuantity());
	}

}
