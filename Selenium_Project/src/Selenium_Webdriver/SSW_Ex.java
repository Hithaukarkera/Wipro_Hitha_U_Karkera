package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSW_Ex {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        
      //driver.findElement(By.name("q")).sendKeys("Official wewbsite ");
		
      //driver.findElement(By.name("q")).submit();

        Thread.sleep(3000);  // handled

        driver.quit();
    }
}
