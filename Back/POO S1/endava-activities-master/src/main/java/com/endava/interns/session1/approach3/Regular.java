package com.endava.interns.session1.approach3;

public class Regular implements ICustomer {

    private final double DISCOUNT = 50d;

    public double applyDiscount(double sales){
        return sales - DISCOUNT;
    }

    public String getInformation(){
        return "I'm a Regular client, my discount is: " + DISCOUNT;
    }


}
