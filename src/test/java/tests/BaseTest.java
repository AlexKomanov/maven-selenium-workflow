package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestRunner;
import org.testng.annotations.*;

import java.util.Set;

public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void globalSetup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }


    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Finished Test");
    }


}
