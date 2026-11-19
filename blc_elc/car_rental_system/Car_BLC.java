package com.dailytask.blc_elc.car_rental_system;

public class Car_BLC {
    private int carID;
    private String brand;
    private String model;
    private double rentalPricePerDay;

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public int getCarID() {
        return carID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }
}