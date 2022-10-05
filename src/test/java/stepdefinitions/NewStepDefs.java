package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.NewPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class NewStepDefs {
    NewPage newPage=new NewPage();
    @Given("Go to BlueRentalCar website")
    public void go_to_blue_rental_car_website() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @When ("click the login button")
    public void click_the_login_button() {
        ReusableMethods.waitForVisibility(newPage.homeLoginButton,5);
       newPage.homeLoginButton.click();
    }
    @Then("send the username")
    public void send_the_username() {
    newPage.username.sendKeys(ConfigReader.getProperty("customer_username"));
    }
    @Then("send the password")
    public void send_the_password() {
        newPage.password.sendKeys(ConfigReader.getProperty("customer_password"));
    }
    @Then("click the login submit button")
    public void click_the_login_submit_button() {
        newPage.loginButton.click();
    }
    @Then("verify logged in")
    public void verify_logged_in() {
        ReusableMethods.waitForVisibility(newPage.userID,5);
        Assert.assertTrue(newPage.userID.isDisplayed());
    }
    @Then("close driver")
    public void close_driver() {
    Driver.closeDriver();
    }

}
