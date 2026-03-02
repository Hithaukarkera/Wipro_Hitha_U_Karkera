package hitha;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");
		
		driver.findElement(By.id("login-container")).click();
		
		driver.findElement(By.id("login-username")).sendKeys("hithaumesh0708@yahoo.com");
		
		driver.findElement(By.id("login-signin")).click();
		
		driver.findElement(By.id("login-passwd")).sendKeys("Hitha");
		
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("ybarAccountMenuOpener"));
		
		driver.get("https://mail.yahoo.com");

        System.out.println("Yahoo Mail opened successfully!");
        
		driver.quit();
	}
}