package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShoppingAccountPage {
    public ShoppingAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[(text()=' Logged in as ')] /b")
    public WebElement loginAs;
    @FindBy(xpath = "//*[@data-product-id='1']")
    public WebElement product1;
    @FindBy(xpath = "//*[(text()='View Cart')]")
    public WebElement viewCart;
    @FindBy(xpath = "//*[(text()='Proceed To Checkout')]")
    public WebElement cartPage;
    @FindBy(xpath = "//*[@id='address_delivery']/li[4]")
    public WebElement deliveryAddress;
    @FindBy(xpath = "//*[@id='address_invoice']/li[4]")
    public WebElement billingAddress;
    @FindBy(xpath = "//*[@href='/logout']")
    public WebElement logoutButton;
}
