package stepDefinitions;



       // System.setProperty("webdriver.chrome.driver", "D:\\Eduardo\\Selenium\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.get("ENTER WEBB ADRESS!!!");

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions{
    private WebDriver driver;
    @Given("i am on the email regrestration page in {string} https:\\/\\/login.mailchimp.com\\/signup\\/")
    public void i_am_on_the_email_regrestration_page_in_https_login_mailchimp_com_signup(String browser){
        WebDrivers creator = new WebDrivers();
        driver = creator.createBrowser(browser);
        driver.get("https://login.mailchimp.com/signup/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Given("I have entered ")
    public void i_have_entered(){
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I have also entered ")
    public void i_have_also_entered(){
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I press signup")
    public void i_press_signup(){
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the result should be  on the screen")
    public void the_result_should_be_on_the_screen(){
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }}



