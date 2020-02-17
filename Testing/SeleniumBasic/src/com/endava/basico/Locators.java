package com.endava.basico;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args){
        WebDriver driver;
        String baseUrl = "http://live.demoguru99.com/index.php/checkout/cart";
        String actualResult = "";
        String expectedResult = "$615.00";
        String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver",chromePath);

        driver = new ChromeDriver();
        driver.get(baseUrl);

        // MAXIMIZAR PANTALLA
        driver.manage().window().maximize();

        //Clickear en tv
        driver.findElement(By.linkText("TV")).click();

        //Click en add to car
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/button/span/span")).click();

        //Verificar
        actualResult = driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-total > span > span")).getText();

        if(actualResult.contentEquals(expectedResult)){
            System.out.println("Prueba pasada el resultado actual es: " + actualResult + "es igual a "+ expectedResult);

        }else{
            System.out.println("Prueba fallada el resultado actual es: " + actualResult + " no es igual a "+ expectedResult);
        }
        driver.close();
        //Xpath absoluto /html/body/div/div[2]/div/div/div/div/div/h1/a/i
        //Xpath relativo //*[@class='lfloat _ohe']
        // //input[@type='password']
        // //input[@name='firstname']
        // //img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yi/r/OBaVg52wtTZ.png']
        // //*[@class='_52lr fsm fwn fcg']
        // //*[contains(@name,'lastname')]
        // //*[contains(text(), 'Abre una cuenta')]
        // //*[starts-with(@id,'birthday')]
        //   //label[text() ='Mujer']

        //Css Selector
        //html>body>div.wrap>div.sign-up>div>div>div>a
        //input#register-email

    }
}
