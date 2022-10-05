package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.ShoppingAccountPage;
import pages.ShoppingPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class ShoppingStepDefs {
    ShoppingPage shoppingPage=new ShoppingPage();
    ShoppingAccountPage shoppingAccountPage=new ShoppingAccountPage();
    Select select;
    @Given("user go to the automationexercise")
    public void user_go_to_the_automationexercise(){
        Driver.getDriver().get(ConfigReader.getProperty("shopping_url"));
    }
    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(shoppingPage.signupLoginButton.isDisplayed());
    }
    @Then("Click Signup-Login button")
    public void click_signup_login_button() {
        shoppingPage.signupLoginButton.click();
    }
    @When("Enter {string} and {string} and click on SignUp Button")
    public void enter_and_and_click_on_sign_up_button(String name, String email) {
        shoppingPage.name.sendKeys(name);
        shoppingPage.email.sendKeys(email);
        shoppingPage.signupButton.click();
    }
    @Then("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {
        ReusableMethods.waitForVisibility(shoppingPage.mrs,5);
    shoppingPage.mrs.click();
    shoppingPage.password.sendKeys(Faker.instance().internet().password());
    select=new Select(shoppingPage.days);
    select.selectByVisibleText("14");
    select=new Select(shoppingPage.months);
    select.selectByVisibleText("August");
    select=new Select(shoppingPage.years);
    select.selectByVisibleText("2000");
    shoppingPage.optin.click();
    shoppingPage.first_name.sendKeys(Faker.instance().address().firstName());
    shoppingPage.last_name.sendKeys(Faker.instance().address().lastName());
    shoppingPage.address.sendKeys(Faker.instance().address().streetAddressNumber());
    select=new Select(shoppingPage.country);
    select.selectByVisibleText("Singapore");
    shoppingPage.state.sendKeys(Faker.instance().address().state());
    shoppingPage.city.sendKeys(Faker.instance().address().city());
    shoppingPage.zipcode.sendKeys(Faker.instance().address().zipCode());
    shoppingPage.mobile_number.sendKeys(Faker.instance().phoneNumber().cellPhone());
    shoppingPage.createAccount.click();
  }
    @Then("Verify ACCOUNT CREATED! and click Continue button")
    public void verify_account_created_and_click_continue_button() {
        Assert.assertTrue(shoppingPage.accountCreated.isDisplayed());
        shoppingPage.continueButton.click();
    }
    @Then("Verify  Logged in as {string} at top")
    public void verify_logged_in_as_at_top(String name) {
        Assert.assertEquals(shoppingAccountPage.loginAs.getText(),name);
    }
    @Then("Add products to cart")
    public void add_products_to_cart() {
        JSUtils.clickElementByJS(shoppingAccountPage.product1);
    }
    @Then("Click Cart button")
    public void click_cart_button() {
        shoppingAccountPage.viewCart.click();
    }
    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        Assert.assertTrue(shoppingAccountPage.cartPage.isDisplayed());
    }
    @Then("Click Proceed To Checkout")
    public void click_proceed_to_checkout() {
        shoppingAccountPage.cartPage.click();
    }
    @Then("Verify that the delivery address and billing address are same")
    public void verify_that_the_delivery_address_and_billing_address_are_same() {
       Assert.assertEquals(shoppingAccountPage.deliveryAddress.getText(),shoppingAccountPage.billingAddress.getText());
    }
    @Then("Click logout button")
    public void click_logout_button() {
        shoppingAccountPage.logoutButton.click();
    }
    @Then("Verify that user logged out")
    public void verify_that_user_logged_out() {
        Assert.assertTrue(shoppingPage.signupLoginButton.isDisplayed());
    }
    @Then("Close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }
}
/*

    ShoppingHomePage shoppingHomePage = new ShoppingHomePage();
    SignUpLoginPage signUpLoginPage = new SignUpLoginPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String homePageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise",homePageTitle);
    }
    @When("Click Signup-Login button")
    public void click_signup_login_button() {

        shoppingHomePage.signUpLoginLink.click();

    }
    @When("Enter name as {string} and email as {string} and click on SignUp Button")
    public void enter_name_as_and_email_as_and_click_on_sign_up_button(String name, String email) {

        signUpLoginPage.nameBox.sendKeys(name);
        signUpLoginPage.emailBox.sendKeys(email);
        signUpLoginPage.signUpButton.click();


    }
    @When("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {

        signUpLoginPage.radioMr.click();
        signUpLoginPage.passwordBox.sendKeys("1234");
        Select selectDay = new Select(signUpLoginPage.daysDropDown);
        selectDay.selectByValue("3");
        Select selectMonth = new Select(signUpLoginPage.monthsDropDown);
        selectMonth.selectByValue("5");
        Select selectYear = new Select(signUpLoginPage.yearsDropDown);
        selectYear.selectByValue("1999");
        signUpLoginPage.firstNameBox.sendKeys("John");
        signUpLoginPage.lastNameBox.sendKeys("Doe");
        signUpLoginPage.companyBox.sendKeys("TechPro");
        signUpLoginPage.address1Box.sendKeys("Sesame Street");
        signUpLoginPage.address2Box.sendKeys("215");
        Select selectCountry = new Select(signUpLoginPage.countryDropDown);
        selectCountry.selectByValue("United States");
        signUpLoginPage.stateBox.sendKeys("New York");
        signUpLoginPage.cityBox.sendKeys("Harlem");
        signUpLoginPage.zipcodeBox.sendKeys("18062");
        signUpLoginPage.mobileNumberBox.sendKeys("12345");
        JSUtils.clickElementByJS(signUpLoginPage.createAccountButton);

    }
    @Then("Verify ACCOUNT CREATED! and click Continue button")
    public void verify_account_created_and_click_continue_button() {

         String accountCreatedText = shoppingHomePage.accountCreatedText.getText();
         Assert.assertEquals("ACCOUNT CREATED!",accountCreatedText);
         shoppingHomePage.continueButton.click();


    }
    @Then("Verify  Logged in as username at top")
    public void verify_logged_in_as_username_at_top() {

      String loggedInText = shoppingHomePage.loggedInText.getText();
      Assert.assertTrue(loggedInText.contains("John"));

    }
    @When("Add products to cart")
    public void add_products_to_cart() {

        JSUtils.scrollIntoViewJS(shoppingHomePage.product1);
        JSUtils.clickElementByJS(shoppingHomePage.product1);
        JSUtils.clickElementByJS(shoppingHomePage.product2);
        JSUtils.clickElementByJS(shoppingHomePage.product3);
        JSUtils.clickElementByJS(shoppingHomePage.continueShopping);



    }
    @When("Click Cart button")
    public void click_cart_button() {

        shoppingHomePage.cartButton.click();

    }
    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {

       Assert.assertTrue(shoppingCartPage.shoppingCartText.isDisplayed());
    }
    @When("Click Proceed To Checkout")
    public void click_proceed_to_checkout() {

        shoppingCartPage.proceedToCheckOutButton.click();
    }
    @Then("Verify that the delivery address and billing address are same")
    public void verify_that_the_delivery_address_and_billing_address_are_same() {


        Assert.assertEquals(Driver.waitAndGetText(shoppingCartPage.deliveryAddress,3), Driver.waitAndGetText(shoppingCartPage.billingAddress,3));

    }
    @When("Click logout button")
    public void click_logout_button() {

        shoppingHomePage.logOutButton.click();

    }
    @Then("Verify that user logged out")
    public void verify_that_user_logged_out() {

        Assert.assertTrue(shoppingHomePage.signUpLoginLink.isDisplayed());

    }
 */
