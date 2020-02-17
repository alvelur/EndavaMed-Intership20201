package com.endava.interns.session1.approach1;

public class Main {

    public static void main(String[] arg){
        Customer regular = new Customer(1);
        System.out.println(regular.applyDiscount(200));

        Customer premium = new Customer(2);
        System.out.println(premium.applyDiscount(200));

        Customer silver = new Customer(3);
        System.out.println(silver.applyDiscount(200));
    }
}
