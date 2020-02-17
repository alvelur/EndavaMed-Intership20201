package com.patterns.creational.p1.case2;

public  class PersonBuilder implements  Builder {

    private String name;
    private String lastName;
    private String address1;
    private String address2;
    private String email;
    private String phone;
    private String phone2;
    private String documentID;
    private String birthDay;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Builder setAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public Builder setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Builder setPhone2(String phone2) {
        this.phone2 = phone2;
        return this;
    }

    public Builder setDocumentID(String documentID) {
        this.documentID = documentID;
        return this;
    }

    public Builder setBirthDay(String birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getDocumentID() {
        return documentID;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public Person build(){
        return new Person(this);
    }
}
