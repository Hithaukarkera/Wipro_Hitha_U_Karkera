package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AmazonHW {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.manage().window().maximize();

            // Step 1: Log in to the account
            driver.get("https://www.amazon.com/gp/sign-in.html");
            driver.findElement(By.id("ap_email")).sendKeys("hitha@example.com");
            driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("ap_password")).sendKeys("password");
            driver.findElement(By.id("signInSubmit")).click();

            // Step 2: Select the category
            WebElement categoryDropdown = driver.findElement(By.id("searchDropdownBox"));
            categoryDropdown.sendKeys("Electronics");

            // Step 3: Search for Product
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("Sony Headphones");
            searchBox.submit();

            // Step 4: Add the product to the cart
            // Selecting the first result
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-component-type='s-search-result']//h2/a)[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button"))).click();

            // Step 5: Checkout
            wait.until(ExpectedConditions.elementToBeClickable(By.name("proceedToRetailCheckout"))).click();

            // Step 6: Log out
            driver.get("https://www.amazon.com/gp/flex/sign-out.html");

        } catch (Exception e) {
            System.out.println("Flow interrupted: " + e.getMessage());
        } finally {
            // Step 7: Close all the tabs successfully
            driver.quit();
        }
    }
}