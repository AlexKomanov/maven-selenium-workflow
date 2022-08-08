package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public void clickElement(WebElement element) {
        //HighLight
        element.click();
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
