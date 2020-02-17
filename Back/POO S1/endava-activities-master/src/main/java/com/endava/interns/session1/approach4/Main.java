package com.endava.interns.session1.approach4;

public class Main {
    public static void printInformation(IInformable premium){
        System.out.println(premium.getInformation());
    }
    public static void main(String[] arg){
        Premium premium = new Premium();
        printInformation(premium);
        System.out.println(premium.applyDiscount(300));

        Ordinary ordinary = new Ordinary();
        printInformation(ordinary);
    }
}
