package com.endava.interns.session1.approach3;

public class Main {

    public static void printInformation(Premium premium){
        System.out.println(premium.getInformation());

    }
    public static void printInformation(Regular regular){
        System.out.println(regular.getInformation());
        
    }
    public static void printInformation(Ordinary ordinary){
        System.out.println(ordinary.getInformation());
        
    }
    
    public static void main(String[] arg){
        Premium premium = new Premium();
        printInformation(premium);
        System.out.println(premium.applyDiscount(300));

        Regular regular = new Regular();
        printInformation(regular);
        System.out.println(regular.applyDiscount(300));

        Ordinary ordinary = new Ordinary();
        printInformation(ordinary);
        System.out.println(ordinary.applyDiscount(300));
    }
}
