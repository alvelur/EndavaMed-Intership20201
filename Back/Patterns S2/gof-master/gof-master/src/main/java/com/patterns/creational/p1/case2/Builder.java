package com.patterns.creational.p1.case2;

public interface Builder {

    String getName();

    String getLastName();

    String getAddress1();

    String getAddress2();

    String getEmail();

    String getPhone();

    String getPhone2();

    String getDocumentID();

    String getBirthDay();

    Builder setName(String string);

    Builder setLastName(String string);

    Builder setAddress1(String string);

    Builder setAddress2(String string);

    Builder setEmail(String string);

    Builder setPhone(String string);

    Builder setPhone2(String string);

    Builder setDocumentID(String string);

    Builder setBirthDay(String string);

    Person build();
}
