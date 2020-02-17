package com.endava.basico;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo1 {
     public static void main(String[] args){
         //Instanciar un objeto WebDrver
         WebDriver driver;

         //Declarar variables
         String baseURL = "https://chromedriver.chromium.org/downloads";
         String actualResult = "";
         String expectedResult = "Downloads - ChromeDriver - WebDriver for Chrome";

         //Indicar la localizacion del archivo chromedriver
         //System.getProperty("user.dir")
         System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

         //Abrir chrome
         driver = new ChromeDriver();

         //Navegar en la pagina
         driver.get(baseURL);

         //Extraer el titulo
         actualResult = driver.getTitle();

         //Imprimir resultado usando operador ternario
         System.out.println(actualResult.contentEquals(expectedResult)? "Prueba pasada" +actualResult: "Prueba fallida");

         driver.close();
     }
}
