package hitha;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonExample {

    public static void main(String[] args) throws InterruptedException {

        // Setup ChromeDriver
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Open Amazon
        driver.get("https://www.amazon.in");

        // Search product
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");

        driver.findElement(By.id("nav-search-submit-button")).click();

        // Add product to cart by name, using id,xpath it is not working
        driver.findElement(By.name("submit.addToCart")).click();
     
       // driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
        System.out.println("Product added to cart successfully!");
        //go to cart
        driver.findElement(By.id("nav-cart-count")).click();
        
        //proceed to buy
        driver.findElement(By.name("proceedToRetailCheckout")).click();

        // Close browser
        Thread.sleep(3000);
        driver.quit();
    }
}
