package e2e.utils;

import e2e.stepDefinitions.PageInitializer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitializer {

    public static WebDriver driver;


    public static void InitializeAndLunchDriver() {
        switch (ConfigReader.getProperties("browser")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("invalid browser name");
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperties("url"));
        driver.manage().timeouts().implicitlyWait(Constants.Implicit_Wait, TimeUnit.SECONDS);
        initializePAgeObjects();
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public static WebDriverWait getWait() {
        WebDriverWait webDriverWait=new WebDriverWait(driver,Constants.Explicit_Wait);
        return webDriverWait;
    }
    public static void waitForClickable(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void click(WebElement element) {
        waitForClickable(element);
        element.click();
    }

}
