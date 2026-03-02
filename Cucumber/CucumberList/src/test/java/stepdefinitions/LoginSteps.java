package stepdefinitions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

    WebDriver driver;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        // Setup ChromeDriver automatically
       // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("User enters credentials")
    public void user_enters_credentials(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);

        for (List<String> row : data) {
            String username = row.get(0);
            String password = row.get(1);

            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("submit")).click();

            System.out.println("Tested with: " + username);

            driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        }
    }

    @Then("User should see login result")
    public void user_should_see_login_result() {
        System.out.println("Login test completed");
    }

    @After
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}