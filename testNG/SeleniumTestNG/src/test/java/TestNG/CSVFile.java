package TestNG;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CSVFile {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login");
    }


    @DataProvider(name = "csvData")
    public Object[][] readCSV() throws Exception {

        File file = new File("/SeleniumTestNG/TestData/Data.csv");
        Scanner scanner = new Scanner(file);

        List<Object[]> dataList = new ArrayList<>();

        scanner.nextLine(); // skip header line

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(",");
            dataList.add(new Object[]{values[0], values[1]});
        }

        scanner.close();

        return dataList.toArray(new Object[0][]);
    }


    @Test(dataProvider = "csvData")
    public void testLogin(String username, String password) throws InterruptedException {

        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(username);

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("submit")).click();

        Thread.sleep(1000);

        try {
            boolean loggedIn = driver.findElement(By.cssSelector(".post-title")).isDisplayed();

            if (loggedIn) {
                System.out.println("Login succeeded for: " + username);
            }

        } catch (Exception e) {
            System.out.println("Login failed for: " + username);
            Assert.fail("Login failed for: " + username);
        }
    }

   
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}