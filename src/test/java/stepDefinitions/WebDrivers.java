package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDrivers {


    WebDriver driver;

    public WebDriver createBrowser(String browser) {

            System.setProperty("webdriver.chrome.driver", "D:\\Eduardo\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();


        return driver;
    }
}

