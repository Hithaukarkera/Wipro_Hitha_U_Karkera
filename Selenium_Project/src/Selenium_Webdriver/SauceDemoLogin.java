package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLogin {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            // Open SauceDemo
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            // Login
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            Thread.sleep(2000);

            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            Thread.sleep(2000);

            driver.findElement(By.id("login-button")).click();
            Thread.sleep(4000); // wait for inventory page

            // Add item to cart
            driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
            Thread.sleep(2000);

            // Open cart
            driver.findElement(By.className("shopping_cart_link")).click();
            Thread.sleep(2000);

            // Checkout
            driver.findElement(By.id("checkout")).click();
            Thread.sleep(2000);

            // Enter user details
            driver.findElement(By.id("first-name")).sendKeys("ABC");
            Thread.sleep(2000);

            driver.findElement(By.id("last-name")).sendKeys("XYZ");
            Thread.sleep(2000);

            driver.findElement(By.id("postal-code")).sendKeys("123456");
            Thread.sleep(2000);

            driver.findElement(By.id("continue")).click();
            Thread.sleep(2000);

            // Finish order
            driver.findElement(By.id("finish")).click();
            Thread.sleep(2000);

            System.out.println("Order placed successfully");

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
