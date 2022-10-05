package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import utilities.Driver;

public class ShoppingPage {
    public ShoppingPage(){
        //PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLoginButton;
    @FindBy(xpath = "//*[@name='name']")
    public WebElement name;
    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement email;
    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signupButton;
    @FindBy(id = "id_gender2")
    public WebElement mrs;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "days")
    public WebElement days;
    @FindBy(id = "months")
    public WebElement months;
    @FindBy(id = "years")
    public WebElement years;
    @FindBy(id = "optin")
    public WebElement optin;
    @FindBy(id = "first_name")
    public WebElement first_name;
    @FindBy(id = "last_name")
    public WebElement last_name;
    @FindBy(id = "address1")
    public WebElement address;
    @FindBy(id = "country")
    public WebElement country;
    @FindBy(xpath = "//*[@id='state']")
    public WebElement state;
    @FindBy(xpath = "//*[@data-qa='city']")
    public WebElement city;
    @FindBy(id = "zipcode")
    public WebElement zipcode;
    @FindBy(id = "mobile_number")
    public WebElement mobile_number;
    @FindBy(xpath = "//*[(text()='Create Account')]")
    public WebElement createAccount;
@FindBy(xpath = "//*[(text()='Account Created!')]")
    public WebElement accountCreated;
    @FindBy(xpath = "//*[(text()='Continue')]")
    public WebElement continueButton;

/*
 @FindBy(xpath = "//input[@type='text']")
    public WebElement nameBox;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailBox;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpButton;
    @FindBy(id = "id_gender1")
    public WebElement radioMr;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(id = "days")
    public WebElement daysDropDown;
    @FindBy(id = "months")
    public WebElement monthsDropDown;
    @FindBy(id = "years")
    public WebElement yearsDropDown;
    @FindBy(id = "first_name")
    public WebElement firstNameBox;
    @FindBy(id = "last_name")
    public WebElement lastNameBox;
    @FindBy(id = "company")
    public WebElement companyBox;
    @FindBy(id = "address1")
    public WebElement address1Box;
    @FindBy(id = "address2")
    public WebElement address2Box;
    @FindBy(id = "country")
    public WebElement countryDropDown;
    @FindBy(id = "state")
    public WebElement stateBox;
    @FindBy(id = "city")
    public WebElement cityBox;
    @FindBy(id = "zipcode")
    public WebElement zipcodeBox;
    @FindBy(id = "mobile_number")
    public WebElement mobileNumberBox;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;
@FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLoginLink;
    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountCreatedText;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;
    @FindBy(xpath = "//b")
    public WebElement loggedInText;
    @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement product1;
    @FindBy(xpath = "(//a[@data-product-id='2'])[1]")
    public WebElement product2;
    @FindBy(xpath = "(//a[@data-product-id='3'])[1]")
    public WebElement product3;
    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShopping;
    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    public WebElement cartButton;
    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logOutButton;
    @FindBy(xpath = "//li[@class='active']")
    public WebElement shoppingCartText;
    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    public WebElement proceedToCheckOutButton;
    @FindBy(xpath = "(//li[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement deliveryAddress;
    @FindBy(xpath = "(//li[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement billingAddress;
 */




















}
