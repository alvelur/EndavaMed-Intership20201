package com.patterns.creational.p1.case2;

public class Main {
    public static void main(String[] arg){
        Builder personBuilder = new PersonBuilder();
        Person person = personBuilder
                .setName("Name")
                .setEmail("email@something.com")
                .setPhone("51478598")
                .setLastName("LastName")
                .setDocumentID("cc1152")
                .build();
        System.out.println(person.getDocumentID());

        Person person12 = personBuilder
                .setAddress1("addssdasdsad")
                .setName("hola")
                .build();

        System.out.println(person12.getDocumentID());
    






    }
}
