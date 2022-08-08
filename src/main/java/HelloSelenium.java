import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

        String title = driver.getTitle();
        System.out.println("title = " + title);

        driver.navigate().to("https://yandex.ru/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();

    }
}
