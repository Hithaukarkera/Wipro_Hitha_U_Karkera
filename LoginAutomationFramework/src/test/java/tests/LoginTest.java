package tests;

import base.BaseTest;
import pages.LoginPage;
import utils.ExcelUtils;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        String path = getClass()
                .getClassLoader()
                .getResource("LoginData.xlsx")
                .getPath();

        return ExcelUtils.getExcelData(path, "LoginData");
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String expectedResult) {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        switch (expectedResult.toLowerCase()) {

            case "success":

                Assert.assertTrue(
                        driver.getCurrentUrl().contains("logged-in-successfully"),
                        "Login should be successful"
                );
                break;

            case "error":

                Assert.assertTrue(
                        loginPage.getErrorMessage().toLowerCase().contains("invalid")
                                || loginPage.getErrorMessage().toLowerCase().contains("incorrect"),
                        "Proper error message should appear"
                );
                break;

            case "empty":

                // For this website, empty submission keeps user on same page
                Assert.assertTrue(
                        driver.getCurrentUrl().contains("practice-test-login"),
                        "User should remain on login page when fields are empty"
                );
                break;

            default:
                Assert.fail("Unexpected test data value: " + expectedResult);
        }
    }
}