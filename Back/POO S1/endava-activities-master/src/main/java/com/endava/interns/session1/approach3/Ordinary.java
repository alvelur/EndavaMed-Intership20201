package com.endava.interns.session1.approach3;

public class Ordinary implements ICustomer {

    private final double DISCOUNT = 0d;

    public double applyDiscount(double sales){
        return sales - DISCOUNT;
    }

    public String getInformation(){
        return "I'm a ordinary client, my discount is: " + DISCOUNT;
    }


}