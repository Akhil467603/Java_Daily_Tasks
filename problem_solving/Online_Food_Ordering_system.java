package com.dailytask.problem_solving;

class FoodOrder {
    String foodName;
    double foodPrice;
    int quantity;
    double totalBill;
    int deliveryCharge = 0;
    double finalBill;


    FoodOrder(String foodName, double foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public void orderFood(int quantity) {
        this.quantity = quantity;
        this.totalBill = this.foodPrice * this.quantity;

        if(totalBill < 500)
            deliveryCharge = 45;

        finalBill = totalBill + this.deliveryCharge;

        System.out.println("Food Name: "+this.foodName);
        System.out.println("Price: "+this.foodPrice);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Total Amount: "+this.totalBill);
        System.out.println("Delivery Charges: "+this.deliveryCharge);
        System.out.println("Final Bill: "+this.finalBill);
        System.out.println("Order Status: Successfully Placed");
    }
}




public class Online_Food_Ordering_system {

	public static void main(String[] args) {
		 FoodOrder foodItem1 = new FoodOrder("Burger", 120);
	        FoodOrder foodItem2 = new FoodOrder("Pizza", 250);
	        FoodOrder foodItem3 = new FoodOrder("Sandwich", 100);
	        FoodOrder foodItem4 = new FoodOrder("Biryani", 180);

	        foodItem4.orderFood(3);
	    }
	

	}


