package com.patterns.creational.p1.case3;

public class Main {

    public static void main(String[] arg){
        Person person = Person.builder()
                .name("Lombok")
                .lastName("rules")
                .build();

        System.out.println(person.getName() + " "+person.getLastName());

        /*java.lang.StringBuilder#append()*/
    }
}
