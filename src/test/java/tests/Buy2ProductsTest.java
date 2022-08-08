package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.ProductPage;
import pageObjects.ProductsPage;
import pageObjects.YourCartPage;

public class Buy2ProductsTest extends BaseTest{

    @Test(testName = "First Test")
    public void test_01() {

        //Login Page
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        //Products Page
        ProductsPage productsPage = new ProductsPage(driver);
        String productPageTitle = productsPage.getTitle();
        Assert.assertEquals(productPageTitle, "PRODUCTS", "Wrong page title");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.addToCart("Sauce Labs Bike Light");


        //Products Page
        productsPage = new ProductsPage(driver);
        productsPage.openCart();

        //Your Cart Page
        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.performCheckout();
    }
}
