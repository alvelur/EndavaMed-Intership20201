package com.endava.basico;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Forms {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        // Setting environment selenium
        String baseUrl = "http://www.newtours.demoaut.com/";
        String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        try{
            driver.findElement(By.linkText("REGISTER")).click();
            WebElement textFirstName = driver.findElement(By.name("firstName"));
            textFirstName.sendKeys("Alejandro");
            Thread.sleep(1500);
            textFirstName.clear();
            Thread.sleep(1500);
            textFirstName.sendKeys("Alejo");

            driver.findElement(By.name("address1")).sendKeys("Calle falsa123");
            Select dropCountry = new Select(driver.findElement(By.name("country")));
            Thread.sleep(1500);
            dropCountry.selectByVisibleText("COLOMBIA");

            driver.findElement(By.id("email")).sendKeys("hola@hotmail.com");
            driver.findElement(By.name("password")).sendKeys("falsepassword");
            WebElement confirm = driver.findElement(By.name("confirmPassword"));
            confirm.sendKeys("falsepassword");
            confirm.submit();

            System.out.println("Prueba exitosa" + driver.findElement(By.xpath("//*[contains(text(), 'Note')]")).getText());


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
