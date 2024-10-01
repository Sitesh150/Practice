package cucumber;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Steps {

    WebDriver webDriver;

    @Given("Open the Browser and Enter the URL")
    public void open_the_browser_and_enter_the_url() {
        webDriver.get("https://www.google.com/");
    }

    @When("User enters the valid username {string}")
    public void user_enters_the_valid_username(String string) {
        System.out.println(string);
    }

    @When("Enters the valid password {string}")
    public void enters_the_valid_password(String string) {
        System.out.println(string);
    }

    @Then("Verify user has successfully navigated to the home page")
    public void verify_user_has_successfully_navigated_to_the_home_page() {
        String string = "Name";
        Assert.assertEquals(string, "New");
    }
}
