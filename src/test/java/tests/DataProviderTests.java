package tests;

import helpers.LoginErrorMessages;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class DataProviderTests extends BaseTest{

    @Test(dataProvider = "loginData", testName = "Login Failed", suiteName = "Login Tests")
    public void test_01(String username, String password, String errorMessage) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualMessage, errorMessage);
    }


    @DataProvider
    public Object[][] loginData() {
        return new Object[][] {
                {"locked_out_user", "secret_sauce", LoginErrorMessages.LOCKED_OUT_USER},
                {"", "secret_sauce", LoginErrorMessages.MISSING_USER},
                {"standard_user", "", LoginErrorMessages.MISSING_PASSWORD},
                {"", "", LoginErrorMessages.MISSING_ALL},
                {"standard_user", "123123123", LoginErrorMessages.INCORRECT_CREDENTIALS},
        };
    }
}
