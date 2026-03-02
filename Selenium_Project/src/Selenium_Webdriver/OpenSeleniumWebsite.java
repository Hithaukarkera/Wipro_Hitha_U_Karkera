package Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSeleniumWebsite {

    public static void main(String[] args) {

        // ChromeDriver will be picked from SYSTEM PATH
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            // Open Google
            driver.get("https://www.google.com");
            Thread.sleep(2000);

            // Open Selenium website
            driver.get("https://www.selenium.dev");
            Thread.sleep(20000);

            System.out.println("Page Title: " + driver.getTitle());

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
