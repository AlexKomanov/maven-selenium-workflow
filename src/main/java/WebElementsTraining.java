import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementsTraining {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/sch/ebayadvsearch");

        Thread.sleep(3000);

        //Store element as WebElement //[id='_nkw']
        WebElement inputElement = driver.findElement(By.xpath("//input[@id='_nkw']"));
        //Clear text
        inputElement.clear();
        //Write mixer in text element
        inputElement.sendKeys("mixer");
        //Submit by submit() method
        inputElement.submit();

        //Find all name of items elements by cssSelector
//        driver.findElements(By.cssSelector("h3[class='lvtitle']>a"));
        //Find all name of items elements by xPath

        for (int i = 0; i < 5; i++) {
            System.out.println("=================================");
            System.out.println("page number " + (i+1));
            System.out.println("=================================");
            List<WebElement> results = driver.findElements(By.xpath("//h3[@class='lvtitle']/a"));
            System.out.println("results.size() = " + results.size());

            for (WebElement result : results) {
                System.out.println(result.getText());
            }

            //Click Next button
            System.out.println("=================================");
            driver.findElement(By.cssSelector("[aria-label='Next page of results']")).click();
        }


        Thread.sleep(5000);
        driver.quit();

//        for(int i = 0; i < results.size(); i++){
//            System.out.println(results.get(i).getText());
//        }

        //      results.get(2).click();


        //        inputElement.sendKeys(Keys.CONTROL + "c");
//                inputElement.sendKeys(Keys.ENTER);
//        WebElement upperSearchButton = driver.findElement(By.cssSelector("[class=\"adv-s mb space-top\"]>[type=\"submit\"]"));
//        upperSearchButton.click();


    }
}
