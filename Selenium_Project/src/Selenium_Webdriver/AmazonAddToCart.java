package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class AmazonAddToCart {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Open Amazon
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);

        // Search product
        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("iphone");
        Thread.sleep(2000);

        driver.findElement(By.id("nav-search-submit-button"))
              .click();
        Thread.sleep(4000);

        // Click first product (robust locator)
        driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"))
              .click();
        Thread.sleep(3000);

        // Switch to new tab
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            driver.switchTo().window(window);
        }
        Thread.sleep(2000);

        // Add to cart
        driver.findElement(By.id("add-to-cart-button"))
              .click();
        Thread.sleep(4000);

        System.out.println("Item added to cart successfully");

        driver.quit();
    }
}
