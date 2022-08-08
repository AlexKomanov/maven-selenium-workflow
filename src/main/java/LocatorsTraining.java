import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTraining {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automation.co.il/tutorials/selenium/demo1/indexID.html");
        Thread.sleep(3000);
        
        //Click on Next button
        driver.findElement(By.id("next")).click();

        //Check error message
        String firstNameError = driver.findElement(By.id("firstname-error")).getText();
        if (firstNameError.equals("This field is required.")) {
            System.out.println("First name error message is correct");
        } else {
            System.out.println("First name error message is incorrect");
        }

        //Fill first name
        driver.findElement(By.id("firstname")).sendKeys("Alex");
        //Click on Next button
        driver.findElement(By.id("next")).click();

        //Check last name error
        String lastNameError = driver.findElement(By.id("lastname-error")).getText();
        if (lastNameError.equals("This field is required.")) {
            System.out.println("Last name error message is correct");
        } else {
            System.out.println("Last name error message is incorrect");
        }

        //Fill last name
        driver.findElement(By.id("lastname")).sendKeys("Komanov");

        //Click on the next button
        driver.findElement(By.id("next")).click();

        String emailError = driver.findElement(By.id("email-error")).getText();
        if (emailError.equals("This field is required.")) {
            System.out.println("Error message is correct");
        } else {
            System.out.println("Error message is incorrect");
        }

        //Fill email address
        driver.findElement(By.name("email")).sendKeys("alex@gmail.com");
        //Click on the next button
        driver.findElement(By.id("next")).click();

        Thread.sleep(1000);
        boolean isDisplayed = driver.findElement(By.id("Beginner")).isDisplayed();
        if(isDisplayed) {
            System.out.println("We were redirected");
        }
        else {
            System.out.println("We were not redirected");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
