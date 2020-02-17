package com.patterns.creational.p1.case1;

public class Person {
    private String name;
    private String lastName;
    private String address1;
    private String address2;
    private String email;
    private String phone;
    private String phone2;
    private String documentID;
    private String birthDay;

    public Person(String name, String lastName, String address1, String address2, String email, String phone, String phone2, String documentID, String birthDay) {
        this.name = name;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.email = email;
        this.phone = phone;
        this.phone2 = phone2;
        this.documentID = documentID;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
