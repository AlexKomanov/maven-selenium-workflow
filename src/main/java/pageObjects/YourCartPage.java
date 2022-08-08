package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage extends BasePage{


    //Elements
    By checkoutButton = By.cssSelector("[id='checkout']");

    public YourCartPage(WebDriver driver) {
        super(driver);
    }


    public void performCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
