package StepDefinitions;

import Foundations.variables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinitions extends variables {

    WebDriver webDriver;

    @Given("User is on {string} page")
    public void userIsOnPage(String arg0) throws InterruptedException {
        webDriver = new ChromeDriver();
        if (arg0.equalsIgnoreCase("register")){
            webDriver.get(registPage);
            Thread.sleep(1000);
        }
        else if (arg0.equalsIgnoreCase("login")) {
            webDriver.get(loginPage);
            Thread.sleep(1000);
        }
        webDriver.manage().window().maximize();
    }

    @And("User inputs first name {string} and last name {string}")
    public void userInputsFirstNameAndLastName(String arg0, String arg1) throws InterruptedException {
        webDriver.findElement(By.xpath(firstNameElmt)).sendKeys(arg0);
        Thread.sleep(1000);

        webDriver.findElement(By.xpath(lastNameElmt)).sendKeys(arg1);
        Thread.sleep(1000);
    }

    @And("User inputs email {string}")
    public void userInputsEmail(String arg0) throws InterruptedException {
        webDriver.findElement(By.xpath(emailElmt)).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("User selects country code {string}")
    public void userSelectsCountryCode(String arg0) throws InterruptedException {
        webDriver.findElement(By.xpath(phoneDropDown)).click();
        Thread.sleep(1000);

        if (arg0.equalsIgnoreCase("Indonesia")){
            webDriver.findElement(By.xpath(idCode)).click();
            Thread.sleep(1000);
        }
        else if (arg0.equalsIgnoreCase("Singapore")) {
            webDriver.findElement(By.xpath(sgCode)).click();
            Thread.sleep(1000);
        }
    }

    @And("User inputs phone number {string}")
    public void userInputsPhoneNumber(String arg0) throws InterruptedException {
        webDriver.findElement(By.xpath(phoneDropDown)).click();
        webDriver.findElement(By.xpath(idCode)).click();
        webDriver.findElement(By.xpath(phoneNumElmt)).click();
        webDriver.findElement(By.xpath(phoneNumElmt)).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("User inputs address {string}")
    public void userInputsAddress(String arg0) throws InterruptedException {
        webDriver.findElement(By.xpath(addrElmt)).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("User inputs password {string}")
    public void userInputsPassword(String arg0) throws InterruptedException {
        webDriver.findElement(By.xpath(passElmt)).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("User input confirm password {string}")
    public void userInputConfirmPassword(String arg0) throws InterruptedException {
        webDriver.findElement(By.xpath(passConfElmt)).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @When("User clicks {string} button")
    public void userClicksButton(String arg0) throws InterruptedException {
        if (arg0.equalsIgnoreCase("register")){
            webDriver.findElement(By.xpath(registBtn)).click();
            Thread.sleep(1000);
        }
        else if (arg0.equalsIgnoreCase("login")) {
            webDriver.findElement(By.xpath(loginBtn)).click();
            Thread.sleep(1000);
        }
    }

    @Then("User is registered")
    public void userIsRegistered() {
        //fourth method of conditional statement to check if registration is success or not
        String result = webDriver.findElement(By.xpath(regMsg)).getText();
        Assert.assertTrue("Registration failed", result.contains("Check your email to confirm your registration"));

        //first method of conditional statement
//        if (webDriver.findElement(By.xpath(regMsg)).getText().equalsIgnoreCase("Check your email to confirm your registration")) {
//            System.out.println("Registration success");
//        }
//        else {
//            System.out.println("Registration failed");
//
//        }

        // second method of conditional statement
//        try {
//            webDriver.findElements(By.xpath(successMsg));
//            System.out.println("Registration success");
//        }
//        catch (NoSuchElementException e){
//            System.out.println("Registration failed");
//        }

        // third method of conditional statement
//        List<WebElement> successReg = webDriver.findElements(By.xpath(successMsg));
//        if(successReg.size() != 0){
//            //If list size is non-zero, element is present
//            System.out.println("Element present");
//        }
//        else{
//            //Else if size is 0, then element is not present
//            System.out.println("Element not present");
//        }

    }

    @And("User closes the browser")
    public void userCloseTheBrowser() {
        webDriver.close();
    }
}


