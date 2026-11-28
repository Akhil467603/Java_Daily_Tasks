package com.dailytask.problem_solving;

class Product {
	int productid;
	String productName;
	double productprice;
	int productquantity;
	double totalAmount;
	double discount;
	double discountamount;
	double finalAmount;
	String discountPercentage;

	public Product(int productid, String productName, double productprice,int productquantity) {
		this.productid = productid;
		this.productName = productName;
		this.productprice = productprice;
		this.productquantity = productquantity;

		this.totalAmount = this.productprice * this.productquantity;
		
		//////Discount
		if(this.totalAmount > 2000 && this.totalAmount < 4000)
            this.discount = 0.04;
        else if(this.totalAmount > 3000 && this.totalAmount < 20000)
            this.discount = 0.20;
        else if(this.totalAmount > 20000)
            this.discount = 0.25;
        else
            this.discount = 0;

        this.discountamount = this.totalAmount * this.discount;
        
        
       //////Percentage
        if(discount == 0.25) discountPercentage = "5%";
        else if(discount == 0.10) discountPercentage = "10%";
        else if(discount == 0.15) discountPercentage = "15%";
        else discountPercentage = "0%";



        //Total Bill or Discount amount
        this.finalAmount = this.totalAmount - this.discount;
	}
	
	
	 public void display() {
	        System.out.println("Product ID: "+productid);
	        System.out.println("Product Name: "+productName);
	        System.out.println("Price: "+productprice);
	        System.out.println("Quantity: "+productquantity);
	        System.out.println("Total Amount: "+totalAmount);
	        System.out.println("Discount: "+discountPercentage);
	        System.out.println("Discount Amount: "+discountamount);
	        System.out.println("Final Amount: "+finalAmount);
	    }

	}

	public class E_Commerce_Product_Billing_System {

		public static void main(String[] args) {
			Product p = new Product(500,"Laptop Bag",1200,5);
			p.display();

		}

	}

