package hitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.id("LoginBtn")).click();
        driver.findElement(By.id("username")).sendKeys("Hitha");

        WebElement checkbox = driver.findElement(By.id("remember"));
        WebElement radio = driver.findElement(By.id("remember"));
	        if(!checkbox.isSelected()) {
	        	radio.click();
	        	System.out.println("Title : " + driver.getTitle());

	            driver.quit();
	        }
	       

	}

}
