package com.endava.interns.session1.approach3;

public class Premium implements ICustomer {

    private final double DISCOUNT = 100d;

    public double applyDiscount(double sales){
        return sales - DISCOUNT;
    }

    public String getInformation(){
        return "I'm a premium client, my discount is: " + DISCOUNT;
    }


}
