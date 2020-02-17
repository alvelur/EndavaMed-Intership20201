package com.endava.interns.session1.approach2;

public class Premium implements ICustomer {

    public double applyDiscount(double sales){
        return sales - 100;
    }
}
