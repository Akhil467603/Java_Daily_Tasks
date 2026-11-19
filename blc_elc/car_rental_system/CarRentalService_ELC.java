package com.dailytask.blc_elc.car_rental_system;

public class CarRentalService_ELC {
    static void main() {
        Car_BLC car1 = new Car_BLC();
        Car_BLC car2 = new Car_BLC();

        car1.setCarID(1);
        car1.setBrand("Red Bull");
        car1.setModel("RB26");
        car1.setRentalPricePerDay(10000.33);

        car2.setCarID(2);
        car2.setBrand("Scuderia Ferrari");
        car2.setModel("SF26");
        car2.setRentalPricePerDay(12000.77);

        System.out.println("Car ID: "+car1.getCarID());
        System.out.println("Car Brand: "+car1.getBrand());
        System.out.println("Car Model: "+car1.getModel());
        System.out.println("Car Rental Price per day: "+car1.getRentalPricePerDay());
        System.out.println("==================================================");
        System.out.println("Car ID: "+car2.getCarID());
        System.out.println("Car Brand: "+car2.getBrand());
        System.out.println("Car Model: "+car2.getModel());
        System.out.println("Car Rental Price per day: "+car2.getRentalPricePerDay());
    }
}