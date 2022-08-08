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

import java.util.concurrent.TimeUnit;

public class BuyProductTest extends BaseTest{



    @Test
    public void test_1() throws InterruptedException {

        Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Login Page
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        //Products Page
        ProductsPage productsPage = new ProductsPage(driver);
        String productPageTitle = productsPage.getTitle();
        Assert.assertEquals(productPageTitle, "PRODUCTS", "Wrong page title");
        productsPage.chooseProduct("Sauce Labs Backpack");

        //Product Page
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();
        productPage.backToProductsPage();

        //Products Page
        productsPage = new ProductsPage(driver);
        productsPage.chooseProduct("Sauce Labs Bike Light");

        //Product Page
        productPage = new ProductPage(driver);
        productPage.addToCart();
        productPage.backToProductsPage();

        //Products Page
        productsPage = new ProductsPage(driver);
        productsPage.openCart();

        //Your Cart Page
        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.performCheckout();
    }

    @Test
    public void test_2() {



        //Login Page
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        //Products Page
        ProductsPage productsPage = new ProductsPage(driver);
        String productPageTitle = productsPage.getTitle();
        Assert.assertEquals(productPageTitle, "Products", "Wrong page title");
        productsPage.chooseProduct("Sauce Labs Backpack");

        //Product Page
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();
        productPage.backToProductsPage();

        //Products Page
        productsPage = new ProductsPage(driver);
        productsPage.chooseProduct("Sauce Labs Bike Light");

        //Product Page
        productPage = new ProductPage(driver);
        productPage.addToCart();
        productPage.backToProductsPage();

        //Products Page
        productsPage = new ProductsPage(driver);
        productsPage.openCart();

        //Your Cart Page
        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.performCheckout();
    }
}
