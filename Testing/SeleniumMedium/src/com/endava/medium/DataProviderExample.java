package com.endava.medium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderExample {

    WebDriver driver;
    String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

    @BeforeTest
    public void setUp(){

        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "SearchProvider", dataProviderClass = DataProviderClass.class)
    public void testMethod(String tester, String search) throws InterruptedException {

        WebElement cajaDeBusqueda = driver.findElement(By.name("q"));
        cajaDeBusqueda.sendKeys(search);
        System.out.println("Welcome " + tester +" Esta es su busqueda "+ search);
        Thread.sleep(3000);

        String testValue = cajaDeBusqueda.getAttribute("value");
        System.out.println("Test Value is " +testValue+ " and is equal to " +search);
        cajaDeBusqueda.clear();

        Assert.assertTrue(testValue.equals(search));
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
