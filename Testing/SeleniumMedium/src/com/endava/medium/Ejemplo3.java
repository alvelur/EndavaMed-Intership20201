package com.endava.medium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ejemplo3 {
    static WebDriver driver;
    public static void main(String[] args){
        //Instanciar un objeto WebDrve
        String baseUrl = "https://es-la.facebook.com/";
        String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        try{

            WebElement txtName = driver.findElement(By.id("email"));
            Actions builder = new Actions(driver);

            Action seriesOfActions = builder
                    .moveToElement(txtName)
                    .click()
                    .keyDown(Keys.SHIFT)
                    .sendKeys("hello")
                    .keyUp(Keys.SHIFT)
                    .doubleClick()
                    .contextClick(txtName)
                    .build();

            seriesOfActions.perform();
            Thread.sleep(2000);


            System.out.println("Test passed");


        } catch (NoSuchElementException ne){
            System.err.println("No se encontro el elemento" + ne.getMessage());
        } catch (WebDriverException we){
            System.err.println("WebDriver fallo" + we.getMessage());
        } catch (Exception ex){
            System.err.println("WebDriver fallo" + ex.getMessage());
        } finally {
            driver.close();
        }



    }
}
