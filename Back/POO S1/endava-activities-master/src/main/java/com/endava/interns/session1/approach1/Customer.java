package com.endava.interns.session1.approach1;

public class Customer {
    private int customerType;

    public Customer(int customerType){
        this.customerType = customerType;
    }

    public double applyDiscount(double sales){
        double newBill;
        switch (customerType){
            case 1:{
                newBill = sales - 50;
                break;
            }
            case 2:{
                newBill = sales - 100;
                break;
            }
            case 3:{
                newBill = sales - 75;
                break;
            }
            default:{
                newBill = sales;
            }
        }
        return newBill;
    }
}
