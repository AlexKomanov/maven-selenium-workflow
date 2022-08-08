import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseFile {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/alexk/Documents/input.html");

        By inputTypeElement = By.cssSelector("input[type='file']");
        WebElement element = driver.findElement(inputTypeElement);
        element.sendKeys("C:\\test\\webinfra\\pom.xml");
    }
}
