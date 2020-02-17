package com.patterns.creational.p1.case3;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
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
	public static Object builder() {
		return null;
	}
}
