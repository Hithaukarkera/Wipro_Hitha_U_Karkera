package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class LoginSteps {

    WebDriver driver;

    @Given("User is on login page")
    public void user_is_on_login_page() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Add wait to avoid blank page issues
        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://practicetestautomation.com/practice-test-login/");

        System.out.println("Opened URL: " + driver.getCurrentUrl());
    }

    @When("User enters credentials")
    public void user_enters_credentials(DataTable dataTable) {

        for (int i = 0; i < dataTable.height(); i++) {

            String username = dataTable.cell(i, 0);
            String password = dataTable.cell(i, 1);

            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("password")).clear();

            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);

            driver.findElement(By.id("submit")).click();

            System.out.println("Testing with: " + username);

            // Go back to login page for next iteration
            driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        }
    }

    @Then("User should see login result")
    public void user_should_see_login_result() {
        System.out.println("Execution completed");
    }

    // This ensures browser always closes (even if test fails)
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}