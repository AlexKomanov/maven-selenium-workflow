package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage{


    //Elements
    By productTitle = By.cssSelector("[class='inventory_item_name']");
    By openCartButton = By.cssSelector("[class='shopping_cart_link']");
    By title = By.cssSelector("[class='title']");

    @FindBy(css = "[class='inventory_item']")
    private List<WebElement> listOfProducts;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void chooseProduct(String product) {
        List<WebElement> elementList = driver.findElements(productTitle);
        for (WebElement element : elementList) {
            if (element.getText().equalsIgnoreCase(product)){
                element.click();
                break;
            }
        }
    }

    public void openCart() {
        driver.findElement(openCartButton).click();
    }

    public String getTitle() {
        return driver.findElement(title).getText();
    }

    public void addToCart(String productName) {

        for (WebElement productAreaElement : listOfProducts) {
            String title = productAreaElement.findElement(By.cssSelector("[class='inventory_item_name']")).getText();
            if(title.equals(productName)) {
                WebElement addButton = productAreaElement.findElement(By.cssSelector(".btn"));
                clickElement(addButton);
                break;
            }
        }
    }
}
