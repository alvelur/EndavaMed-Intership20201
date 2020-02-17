package com.endava.interns.session1.approach2;


public class Main {

    public static void main(String[] arg){
        Regular regular = new Regular();
        System.out.println(regular.applyDiscount(200));

        Premium premium = new Premium();
        System.out.println(premium.applyDiscount(200));

        Silver plata = new Silver();
        System.out.println(plata.applyDiscount(200));
    }
}
