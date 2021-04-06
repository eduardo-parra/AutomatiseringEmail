package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    @Given("I have input {string}")
    public void i_have_input(String string) {
        WebElement input = driver.findElement(By.id("email"));
    }
    @Given("I have also input {string}")
    public void i_have_also_input(String string) {
        WebElement input = driver.findElement(By.id("new_username"));
    }
    @Given("I have also input pasword {string}")
    public void i_have_input_pasword(String string) {
        WebElement input = driver.findElement(By.id("new_password"));
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



