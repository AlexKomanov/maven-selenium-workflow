package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {


    //Elements
    By addToCartButton = By.cssSelector("[class='btn btn_primary btn_small btn_inventory']");
    By backToProductsButton = By.cssSelector("[id='back-to-products']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void backToProductsPage() {
        driver.findElement(backToProductsButton).click();
    }
}
