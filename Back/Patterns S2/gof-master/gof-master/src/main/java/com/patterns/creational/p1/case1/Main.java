package com.patterns.creational.p1.case1;
//Builder
public class Main {

    public static void main(String[] arg){
        System.out.println("please create a new Person");
        Person persona = new Person("Deivid", "Quintero", "D@.com", "Q@.com", "dq@.com", "47576", "7328", "123456", "123465");
        System.out.println(persona.getName());

        Person persona2 = new Person("Braulio", "Ortega", "", "", "", "44616", "6789", "12389", "19995");
        System.out.println(persona2.getName());

    }
}
