package com.endava.medium;

import org.testng.annotations.DataProvider;

public class  DataProviderClass {
    @DataProvider(name = "SearchProvider")
    public Object[][] getDataFromDataProvider(){
        return new Object[][]{
                {"Fernando", "Google"},
                {"Luis", "Yahoo"},
                {"Sara" ,"Gmail"},
                {"Lorena", "Amazon"},
        };
    }
}
