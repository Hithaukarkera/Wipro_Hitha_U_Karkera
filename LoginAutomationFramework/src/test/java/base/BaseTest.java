package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.ITestResult;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ScreenshotUtil;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUpEnvironment() {
        System.out.println("Environment Setup Before Class");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @AfterMethod
    public void closeBrowser(ITestResult result) {

        // Capture screenshot only if test fails
        if (result.getStatus() == ITestResult.FAILURE) {
            ScreenshotUtil.captureScreenshot(driver, result.getName());
        }

        if (driver != null) {
            driver.quit();
        }
    }

    @AfterClass
    public void tearDownEnvironment() {
        System.out.println("Environment Cleanup After Class");
    }
}