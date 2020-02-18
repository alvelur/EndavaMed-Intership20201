package com.endava.medium;

import org.testng.annotations.*;

public class TestNGAnnotations {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Este metodo se ejecuta antes de una suite de pruebas");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Este metodo se ejecuta antes de las pruebas");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Este metodo se ejecuta antes de las clases");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Este metodo se ejecuta antes de los metodos de prueba");
    }
    @Test
    public void TestCase1(){
        System.out.println("Caso de prueba 1");
    }
    @Test
    public void TestCase2(){
        System.out.println("Caso de prueba 2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Este metodo se ejecuta despues de los metodos de prueba");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Este metodo se ejecuta despues de las clases");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Este metodo se ejecuta despues de los test de prueba");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Este metodo se ejecuta despues de una suite de pruebas");
    }

}
