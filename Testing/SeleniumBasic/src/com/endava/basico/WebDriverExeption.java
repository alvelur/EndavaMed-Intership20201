package com.endava.basico;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExeption {
    static WebDriver driver;
    public static void main(String[] args){

        try {
            String baseUrl = "http://live.demoguru99.com/index.php/checkout/cart";
            String actualResult = "";
            String expectedResult = "$615.00";
            String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

            System.setProperty("webdriver.chrome.driver", chromePath);

            driver = new ChromeDriver();
            driver.get(baseUrl);

            // MAXIMIZAR PANTALLA
            driver.manage().window().maximize();

            //Clickear en tv

            WebElement lnkTV = driver.findElement(By.linkText("TV  "));
            lnkTV.click();

            //Click en add to car
            WebElement btnAddToCart = driver.findElement(By.xpath("//*[@id=\"to\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/button/span/span"));
            btnAddToCart.click();


            //Verificar
            WebElement lblSubtoral = driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-total > span > span"));

            actualResult = lblSubtoral.getText();

            if (actualResult.contentEquals(expectedResult)) {
                System.out.println("Prueba pasada el resultado actual es: " + actualResult + "es igual a " + expectedResult);

            } else {
                System.out.println("Prueba fallada el resultado actual es: " + actualResult + " no es igual a " + expectedResult);
            }

        }catch (NoSuchElementException ne){
            System.err.println("No se encontro el elemento" + ne.getMessage());
        }
        catch (WebDriverException we){
            System.err.println("WebDriver fallo" + we.getMessage());
        }
        catch (Exception ex){
            System.err.println("WebDriver fallo" + ex.getMessage());
        }
        finally {
            driver.close();
        }



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
