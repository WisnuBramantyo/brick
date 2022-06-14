package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinitions {

    WebDriver webDriver;
    @Given("User is on {string} page")
    public void userIsOnPage(String arg0) {
        webDriver = new ChromeDriver();
        if (arg0.equalsIgnoreCase("register")){
            webDriver.get("https://brick-qa-assignment.herokuapp.com/");
        }
        else {
            webDriver.get("https://brick-qa-assignment.herokuapp.com/login");
        }
        webDriver.manage().window().maximize();
    }

    @And("User inputs first name {string} and last name {string}")
    public void userInputsFirstNameAndLastName(String arg0, String arg1) {
    }

    @And("User inputs email {string}")
    public void userInputsEmail(String arg0) {
    }

    @And("User selects country code {string}")
    public void userSelectsCountryCode(String arg0) {
    }

    @And("User inputs phone number {string}")
    public void userInputsPhoneNumber(String arg0) {
    }

    @And("User inputs address {string}")
    public void userInputsAddress(String arg0) {
    }

    @And("User inputs password {string}")
    public void userInputsPassword(String arg0) {
    }

    @And("User input confirm password {string}")
    public void userInputConfirmPassword(String arg0) {
    }

    @When("User clicks {string} button")
    public void userClicksButton(String arg0) {
    }

    @Then("User is registered")
    public void userIsRegistered() {
    }

}


