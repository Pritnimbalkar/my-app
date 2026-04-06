package stepdefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

import static org.testng.Assert.*;

public class LoginSteps {

    WebDriver driver;

    @Given("user opens the browser")
    public void user_opens_the_browser() {
        driver = DriverFactory.getDriver();
    }

    @When("user navigates to {string}")
    public void user_navigates_to(String url) {
        driver.get(url);
    }

    @Then("page title should contain {string}")
    public void page_title_should_contain(String expectedTitle) {
        if (!driver.getTitle().contains(expectedTitle)) {
            throw new AssertionError("Title does not match");
        }
    }
}
