package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeUpload {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Open upload page
        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);

        // Select file
        WebElement upload = driver.findElement(By.id("file-upload"));
        Thread.sleep(2000);

        upload.sendKeys("C:\\Users\\HP\\Downloads\\Test.docx");
        Thread.sleep(2000);

        // Click upload button
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(2000);

        System.out.println("File uploaded successfully");

        // Close browser
        driver.quit();
    }
}
